package kr.kro.wonmyee.items;

import kr.kro.wonmyee.Japdahan;
import net.minecraft.item.Item;

public class ItemModCraftingToolsSingleUse extends Item {

    public ItemModCraftingToolsSingleUse(String unlocalizedName) {
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(Japdahan.items);
        this.setMaxStackSize(1);
    }

}
