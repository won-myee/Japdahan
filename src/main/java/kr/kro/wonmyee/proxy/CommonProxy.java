package kr.kro.wonmyee.proxy;

import kr.kro.wonmyee.debug.LogHelper;
import kr.kro.wonmyee.worldgen.OreGen;
import kr.kro.wonmyee.worldgen.trees.WorldGenAshTreeSpawner;
import kr.kro.wonmyee.worldgen.trees.WorldGenMangroveTreeSpawner;
import kr.kro.wonmyee.worldgen.trees.WorldGenPineTreeSpawner;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {

    public void registerRenders() {
        LogHelper.info("Registered Renders! (1/7)");
    }

    public void registerWorldGenerators() {
        GameRegistry.registerWorldGenerator(new OreGen(), 0);
        GameRegistry.registerWorldGenerator(new WorldGenMangroveTreeSpawner(), 0);
        GameRegistry.registerWorldGenerator(new WorldGenPineTreeSpawner(), 0);
        GameRegistry.registerWorldGenerator(new WorldGenAshTreeSpawner(), 0);
        LogHelper.info("Registered World Generators! (2/7)");
    }

    public void registerTileEntities() {
        LogHelper.info("Registered Tile Entities! (1/7)");
    }
}
