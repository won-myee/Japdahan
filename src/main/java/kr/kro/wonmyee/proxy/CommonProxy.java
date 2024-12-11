package kr.kro.wonmyee.proxy;

import kr.kro.wonmyee.worldgen.OreGen;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {

    public void registerRenders() {

    }

    public void registerWorldGenerators() {
        GameRegistry.registerWorldGenerator(new OreGen(), 0);
    }

    public void registerTileEntities() {
    }
}
