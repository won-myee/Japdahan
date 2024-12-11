package kr.kro.wonmyee.items;

import com.google.common.collect.Sets;
import kr.kro.wonmyee.Japdahan;
import kr.kro.wonmyee.init.ModBlocks;
import kr.kro.wonmyee.init.ModItems;
import kr.kro.wonmyee.variables.CheatCheck;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.Set;

public class ItemModHammer extends ItemTool {

    public ItemModHammer(ToolMaterial material, String unlocalizedName, int maxDamage) {
        super(material.getDamageVsEntity(), material, Sets.newHashSet(new Block[]{ModBlocks.bronze_casing, ModBlocks.iron_casing, ModBlocks.steel_casing}));
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(Japdahan.items);
        this.setMaxStackSize(1);
        this.setMaxDamage(maxDamage);
    }

    public ArrayList<Block> getList() {
        ArrayList<Block> blockArrayList = new ArrayList<Block>();
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
    public boolean onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, final BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ) {
        if(playerIn.isSneaking()) {
            if(getList().contains(worldIn.getBlockState(pos).getBlock())) {
                if(!worldIn.isRemote) {
                    if(CheatCheck.isCheatAllowed(playerIn)) {
                        Minecraft.getMinecraft().thePlayer.sendChatMessage("/playsound random.anvil_use " + playerIn.getName() + " " + playerIn.posX + " " + playerIn.posY + " " + playerIn.posZ + " 50 1");
                        final String originalBlock = worldIn.getBlockState(pos).getBlock().getUnlocalizedName().substring(5);
                        Minecraft.getMinecraft().thePlayer.sendChatMessage("/setblock " + pos.getX() + " " + pos.getY() + " " + pos.getZ() + " minecraft:bedrock");
                        Minecraft.getMinecraft().thePlayer.sendChatMessage("/setblock " + pos.getX() + " " + pos.getY() + " " + pos.getZ() + " japdahan:" + originalBlock);
                    } else {
                        Minecraft.getMinecraft().thePlayer.sendChatMessage("/tellraw @s {\"text\":\"You MUST enable cheats to do this action!\",\"color\":\"red\"}");
                    }
                }
            } else {
                worldIn.playSound(pos.getX(), pos.getY(), pos.getZ(), Block.soundTypeAnvil.getPlaceSound(), 30, 1, false);
            }
        }
        return super.onItemUse(stack, playerIn, worldIn, pos, side, hitX, hitY, hitZ);
    }
}
