package kr.kro.wonmyee.creativetabs;

import kr.kro.wonmyee.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TabJapdahanItems extends CreativeTabs {

    public TabJapdahanItems(String label) {
        super(label);
        this.setBackgroundImageName("japdahan.png");
    }

    @Override
    public Item getTabIconItem() {
        return ModItems.copper_ingot;
    }

}
