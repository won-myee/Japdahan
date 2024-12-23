package kr.kro.wonmyee.items;

import kr.kro.wonmyee.Japdahan;
import net.minecraft.item.Item;

public class ItemModFuel extends Item {
    public ItemModFuel(String unlocalizedName) {
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(Japdahan.items);
    }

}
