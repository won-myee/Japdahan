package kr.kro.wonmyee.items;

import kr.kro.wonmyee.Japdahan;
import net.minecraft.item.ItemHoe;

public class ItemModHoe extends ItemHoe {
    public ItemModHoe(ToolMaterial material, String unlocalizedName) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(Japdahan.items);
    }
}
