package kr.kro.wonmyee.items;

import com.google.common.collect.Sets;
import kr.kro.wonmyee.Japdahan;
import kr.kro.wonmyee.debug.LogHelper;
import kr.kro.wonmyee.init.ModBlocks;
import kr.kro.wonmyee.variables.CheatCheck;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.Set;

public class ItemModWrench extends ItemTool {

    public ItemModWrench(ToolMaterial material, String unlocalizedName, int maxDamage) {
        super(material.getDamageVsEntity(), material, Sets.newHashSet(new Block[]{ModBlocks.bronze_casing, ModBlocks.iron_casing, ModBlocks.steel_casing}));
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(Japdahan.items);
        this.setMaxStackSize(1);
        this.setMaxDamage(maxDamage);
    }

    public ArrayList<Block> getList() {
        ArrayList<Block> blockArrayList = new ArrayList<Block>();
        blockArrayList.add(ModBlocks.bronze_casing);
        blockArrayList.add(ModBlocks.iron_casing);
        blockArrayList.add(ModBlocks.steel_casing);
        blockArrayList.add(ModBlocks.JMT0_steelmaker);
        return blockArrayList;
    }

    @Override
    public boolean hasContainerItem(ItemStack itemStack) {
        return true;
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemStack)
    {
        ItemStack stack = itemStack.copy();

        stack.setItemDamage(stack.getItemDamage() + 1);
        stack.stackSize = 1;

        return stack;
    }

    @Override
    public Set<String> getToolClasses(ItemStack itemStack) {
        return Sets.newHashSet("wrench");
    }

    @Override
    public boolean canHarvestBlock(Block block, ItemStack itemStack) { return true; }

    @Override
    public boolean onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ) {
        if(playerIn.isSneaking()) {
            if(getList().contains(worldIn.getBlockState(pos).getBlock())) {
                if(CheatCheck.isCheatAllowed(playerIn)) {
                    if (stack.getMaxDamage() - stack.getItemDamage() > 7) {
                        stack.damageItem(8, playerIn);
                        if (!worldIn.isRemote) {
                            worldIn.spawnEntityInWorld(new EntityItem(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(worldIn.getBlockState(pos).getBlock())));
                        }
                        for (int i = 1; i <= 30; i++) {
                            worldIn.playSound(pos.getX(), pos.getY(), pos.getZ(), worldIn.getBlockState(pos).getBlock().stepSound.getBreakSound(), 50, 1, false);
                        }
                        playerIn.worldObj.setBlockToAir(pos);
                    } else {
                        LogHelper.debug("Durability is too low for safe machine disassembling");
                        Minecraft.getMinecraft().thePlayer.sendChatMessage("/tellraw @p {\"text\":\"Durability is too low to do 3x3 mining!\",\"color\":\"red\"}");
                        worldIn.playSound(pos.getX(), pos.getY(), pos.getZ(), Block.soundTypeAnvil.getPlaceSound(), 30, 1, false);
                    }
                } else {
                    LogHelper.debug("Player is not OPed");
                    Minecraft.getMinecraft().thePlayer.sendChatMessage("/tellraw @p {\"text\":\"You MUST enable cheats to do this action!\",\"color\":\"red\"}");
                }
            } else {
                LogHelper.debug("Wrench shift-right click not applicable for this block");
                worldIn.playSound(pos.getX(), pos.getY(), pos.getZ(), Block.soundTypeAnvil.getPlaceSound(), 30, 1, false);
            }
        }
        return super.onItemUse(stack, playerIn, worldIn, pos, side, hitX, hitY, hitZ);
    }

}
