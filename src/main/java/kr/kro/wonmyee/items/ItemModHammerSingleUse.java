package kr.kro.wonmyee.items;

import com.google.common.collect.Sets;
import kr.kro.wonmyee.Japdahan;
import kr.kro.wonmyee.debug.LogHelper;
import kr.kro.wonmyee.init.ModBlocks;
import kr.kro.wonmyee.variables.CheatCheck;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

import java.util.ArrayList;

public class ItemModHammerSingleUse extends ItemTool {

    public ItemModHammerSingleUse(ToolMaterial material, String unlocalizedName) {
        super(material.getDamageVsEntity(), material, Sets.newHashSet(new Block[]{ModBlocks.bronze_casing, ModBlocks.iron_casing, ModBlocks.steel_casing}));
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(Japdahan.items);
        this.setMaxStackSize(1);
    }

    public ArrayList<Block> getList() {
        ArrayList<Block> blockArrayList = new ArrayList<Block>();
        blockArrayList.add(ModBlocks.JMT0_steelmaker);
        return blockArrayList;
    }

    @Override
    public boolean onItemUse(ItemStack stack, EntityPlayer playerIn, final World worldIn, final BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ) {
        if(playerIn.isSneaking()) {
            if(getList().contains(worldIn.getBlockState(pos).getBlock())) {
                if(!worldIn.isRemote) {
                    if(CheatCheck.isCheatAllowed(playerIn)) {
                        worldIn.playSoundEffect(pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, "random.anvil_use", 1.0F, 1.0F);
                        final IBlockState originalBlock = worldIn.getBlockState(pos);
                        worldIn.setBlockState(pos, Blocks.bedrock.getDefaultState(), 2);
                        new Thread()
                        {
                            @Override
                            public void run()
                            {
                                //some code here.
                                try {
                                    Thread.sleep(500);
                                } catch (InterruptedException e) {
                                    throw new RuntimeException(e);
                                }
                                worldIn.setBlockState(pos, originalBlock, 3);
                            }
                        }.start();
                    } else {
                        LogHelper.debug("Player is not OPed");
                        Minecraft.getMinecraft().thePlayer.sendChatMessage("/tellraw @p {\"text\":\"You MUST enable cheats to do this action!\",\"color\":\"red\"}");
                    }
                }
            } else {
                LogHelper.debug("Hammer shift-right click not applicable for this block");
                worldIn.playSound(pos.getX(), pos.getY(), pos.getZ(), Block.soundTypeAnvil.getPlaceSound(), 30, 1, false);
            }
        }
        return super.onItemUse(stack, playerIn, worldIn, pos, side, hitX, hitY, hitZ);
    }
}
