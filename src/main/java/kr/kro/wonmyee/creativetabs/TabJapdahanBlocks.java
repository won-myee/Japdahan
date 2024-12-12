package kr.kro.wonmyee.creativetabs;

import kr.kro.wonmyee.init.ModBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TabJapdahanBlocks extends CreativeTabs {

    public TabJapdahanBlocks(String label) {
        super(label);
        //this.setBackgroundImageName("japdahan.png");
    }

    @Override
    public Item getTabIconItem() {
        return Item.getItemFromBlock(ModBlocks.copper_block);
    }

}
