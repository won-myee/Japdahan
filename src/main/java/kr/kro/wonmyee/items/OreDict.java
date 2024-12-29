package kr.kro.wonmyee.items;

import kr.kro.wonmyee.debug.LogHelper;
import kr.kro.wonmyee.init.ModItems;
import net.minecraftforge.oredict.OreDictionary;

public class OreDict {

    public static void register() {
        OreDictionary.registerOre("hammer", ModItems.stone_hammer);
        LogHelper.info("Registered OreDict! (6/7)");
    }

}
