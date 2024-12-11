package kr.kro.wonmyee.items;

import kr.kro.wonmyee.Japdahan;
import net.minecraft.item.ItemArmor;

public class ItemModArmor extends ItemArmor {
    public ItemModArmor(ArmorMaterial material, int renderIndex, int armorType, String unlocalizedName) {
        super(material, renderIndex, armorType);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(Japdahan.items);
    }
}
