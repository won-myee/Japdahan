package kr.kro.wonmyee.items;

import kr.kro.wonmyee.Japdahan;
import kr.kro.wonmyee.init.ModFluids;
import kr.kro.wonmyee.init.ModItems;
import kr.kro.wonmyee.variables.CheatCheck;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public class ItemModCanEmpty extends Item {
    public ItemModCanEmpty(String unlocalizedName) {
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(Japdahan.items);
    }

    @Override
    public boolean hasContainerItem(ItemStack itemStack) {
        return true;
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemStack)
    {
        return new ItemStack(ModItems.empty_tin_can);
    }

    @Override
    public boolean onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ) {
        if(!worldIn.isRemote) {
            if(CheatCheck.isCheatAllowed(playerIn)) {
                Block fluid = worldIn.getBlockState(new BlockPos(pos.getX(), pos.getY()+1, pos.getZ())).getBlock();
                if(fluid == Blocks.water) {
                    Minecraft.getMinecraft().thePlayer.sendChatMessage("/setblock " + pos.getX() + " " + (pos.getY()+1) + " " + pos.getZ() + " minecraft:air");
                    Minecraft.getMinecraft().thePlayer.sendChatMessage("/clear " + playerIn.getName() + " japdahan:empty_tin_can 0 1");
                    Minecraft.getMinecraft().thePlayer.sendChatMessage("/give " + playerIn.getName() + " japdahan:water_tin_can");
                } else if(fluid == Blocks.lava) {
                    Minecraft.getMinecraft().thePlayer.sendChatMessage("/setblock " + pos.getX() + " " + (pos.getY()+1) + " " + pos.getZ() + " minecraft:air");
                    Minecraft.getMinecraft().thePlayer.sendChatMessage("/clear " + playerIn.getName() + " japdahan:empty_tin_can 0 1");
                    Minecraft.getMinecraft().thePlayer.sendChatMessage("/give " + playerIn.getName() + " japdahan:lava_tin_can");
                } else if(fluid == ModFluids.OIL_FLUID.getBlock()) {
                    Minecraft.getMinecraft().thePlayer.sendChatMessage("/setblock " + pos.getX() + " " + (pos.getY()+1) + " " + pos.getZ() + " minecraft:air");
                    Minecraft.getMinecraft().thePlayer.sendChatMessage("/clear " + playerIn.getName() + " japdahan:empty_tin_can 0 1");
                    Minecraft.getMinecraft().thePlayer.sendChatMessage("/give " + playerIn.getName() + " japdahan:oil_tin_can");
                } else {
                    Minecraft.getMinecraft().thePlayer.sendChatMessage("/tellraw @p {\"text\":\"No fluid here!\",\"color\":\"red\"}");
                }
            } else {
                Minecraft.getMinecraft().thePlayer.sendChatMessage("/tellraw @p {\"text\":\"You MUST enable cheats to do this action!\",\"color\":\"red\"}");
            }
        }
        return super.onItemUse(stack, playerIn, worldIn, pos, side, hitX, hitY, hitZ);
    }
}
