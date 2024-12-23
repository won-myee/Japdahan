package kr.kro.wonmyee.worldgen;

import kr.kro.wonmyee.variables.BiomeIDCheck;
import net.minecraftforge.common.BiomeManager;

public class ModBiomes {

    public static BiomeGenPeatland biomePeatland;
    public static BiomeGenStoneyDesert biomeStoneyDesert;
    public static BiomeGenMissingland biomeMissingland;

    public static void register() {
        biomePeatland = new BiomeGenPeatland(BiomeIDCheck.getNextFreeBiomeId());
        biomeStoneyDesert = new BiomeGenStoneyDesert(BiomeIDCheck.getNextFreeBiomeId());
        biomeMissingland = new BiomeGenMissingland(BiomeIDCheck.getNextFreeBiomeId());

        BiomeManager.addBiome(BiomeManager.BiomeType.DESERT, new BiomeManager.BiomeEntry(biomePeatland, 6));
        BiomeManager.addSpawnBiome(biomePeatland);
        BiomeManager.addBiome(BiomeManager.BiomeType.DESERT, new BiomeManager.BiomeEntry(biomeStoneyDesert, 8));
        BiomeManager.addSpawnBiome(biomeStoneyDesert);
        BiomeManager.addBiome(BiomeManager.BiomeType.DESERT, new BiomeManager.BiomeEntry(biomeMissingland, 1));
        BiomeManager.addSpawnBiome(biomeMissingland);
    }
}
