package kr.kro.wonmyee.handlers;

import kr.kro.wonmyee.init.ModBlocks;
import kr.kro.wonmyee.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

public class FuelHandler implements IFuelHandler {

    @Override
    public int getBurnTime(ItemStack fuel) {
        Item item = fuel.getItem();
        if(item instanceof ItemBlock && Block.getBlockFromItem(item) != Blocks.air) {
            Block block = Block.getBlockFromItem(item);
            if (block == ModBlocks.peat_block) {
                return 3200;
            } else if (block == ModBlocks.lignite) {
                return 6400;
            } else if (block == ModBlocks.anthracite) {
                return 25600;
            } else if (block == Blocks.coal_block) {
                return 12800;
            } else {
                return 0;
            }
        } else {
            if (fuel.getItem() == ModItems.peat) {
                return 400;
            } else if (fuel.getItem() == ModItems.lignite_coal) {
                return 800;
            } else if (fuel.getItem() == ModItems.anthracite_coal) {
                return 3200;
            } else if (fuel.getItem() == ModItems.oil_tin_can) {
                return 3200;
            } else if (fuel.getItem() == ModItems.lava_tin_can) {
                return 1600;
            } else {
                return 0;
            }
        }
    }

}
