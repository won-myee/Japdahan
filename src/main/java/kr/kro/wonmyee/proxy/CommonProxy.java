package kr.kro.wonmyee.proxy;

import kr.kro.wonmyee.debug.LogHelper;
import kr.kro.wonmyee.worldgen.OreGen;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {

    public void registerRenders() {
        LogHelper.info("Registered Renders! (1/7)");
    }

    public void registerWorldGenerators() {
        GameRegistry.registerWorldGenerator(new OreGen(), 0);
        LogHelper.info("Registered World Generators! (2/7)");
    }

    public void registerTileEntities() {
        LogHelper.info("Registered Tile Entities! (1/7)");
    }
}
