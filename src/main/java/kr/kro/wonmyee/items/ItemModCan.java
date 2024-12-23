package kr.kro.wonmyee.items;

import kr.kro.wonmyee.Japdahan;
import kr.kro.wonmyee.init.ModItems;
import kr.kro.wonmyee.variables.CheatCheck;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public class ItemModCan extends Item {
    public ItemModCan(String unlocalizedName) {
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(Japdahan.items);
        this.setMaxStackSize(16);
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
                String fluid = "minecraft:air";
                if(stack.getItem() == ModItems.water_tin_can) {
                    Minecraft.getMinecraft().thePlayer.sendChatMessage("/clear " + playerIn.getName() + " japdahan:water_tin_can 0 1");
                    Minecraft.getMinecraft().thePlayer.sendChatMessage("/give " + playerIn.getName() + " japdahan:empty_tin_can");
                    fluid = "minecraft:water";
                } else if(stack.getItem() == ModItems.lava_tin_can) {
                    Minecraft.getMinecraft().thePlayer.sendChatMessage("/clear " + playerIn.getName() + " japdahan:lava_tin_can 0 1");
                    Minecraft.getMinecraft().thePlayer.sendChatMessage("/give " + playerIn.getName() + " japdahan:empty_tin_can");
                    fluid = "minecraft:lava";
                } else if(stack.getItem() == ModItems.oil_tin_can) {
                    Minecraft.getMinecraft().thePlayer.sendChatMessage("/clear " + playerIn.getName() + " japdahan:oil_tin_can 0 1");
                    Minecraft.getMinecraft().thePlayer.sendChatMessage("/give " + playerIn.getName() + " japdahan:empty_tin_can");
                    fluid = "japdahan:oil";
                } else {
                    Minecraft.getMinecraft().thePlayer.sendChatMessage("/tellraw @p {\"text\":\"No fluid in this can!\",\"color\":\"red\"}");
                }
                Minecraft.getMinecraft().thePlayer.sendChatMessage("/setblock " + pos.getX() + " " + (pos.getY()+1) + " " + pos.getZ() + " " + fluid);
            } else {
                Minecraft.getMinecraft().thePlayer.sendChatMessage("/tellraw @p {\"text\":\"You MUST enable cheats to do this action!\",\"color\":\"red\"}");
            }
        }
        return super.onItemUse(stack, playerIn, worldIn, pos, side, hitX, hitY, hitZ);
    }
}
