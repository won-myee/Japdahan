package kr.kro.wonmyee.items;

import kr.kro.wonmyee.Japdahan;
import net.minecraft.item.Item;

public class ItemMod extends Item {
    public ItemMod(String unlocalizedName) {
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(Japdahan.items);
    }
}
