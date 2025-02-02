package kr.kro.wonmyee.worldgen;

import kr.kro.wonmyee.debug.LogHelper;
import kr.kro.wonmyee.variables.BiomeIDCheck;
import net.minecraftforge.common.BiomeManager;

public class ModBiomes {

    public static BiomeGenPeatland biomePeatland;
    public static BiomeGenStoneyDesert biomeStoneyDesert;
    public static BiomeGenMissingland biomeMissingland;
    public static BiomeGenAshtreePlains biomeAshtreePlains;

    public static void register() {
        biomePeatland = new BiomeGenPeatland(BiomeIDCheck.getNextFreeBiomeId());
        biomeStoneyDesert = new BiomeGenStoneyDesert(BiomeIDCheck.getNextFreeBiomeId());
        biomeMissingland = new BiomeGenMissingland(BiomeIDCheck.getNextFreeBiomeId());
        biomeAshtreePlains = new BiomeGenAshtreePlains(BiomeIDCheck.getNextFreeBiomeId());

        BiomeManager.addBiome(BiomeManager.BiomeType.DESERT, new BiomeManager.BiomeEntry(biomePeatland, 6));
        BiomeManager.addSpawnBiome(biomePeatland);
        BiomeManager.addBiome(BiomeManager.BiomeType.DESERT, new BiomeManager.BiomeEntry(biomeStoneyDesert, 8));
        BiomeManager.addSpawnBiome(biomeStoneyDesert);
        BiomeManager.addBiome(BiomeManager.BiomeType.DESERT, new BiomeManager.BiomeEntry(biomeMissingland, 1));
        BiomeManager.addSpawnBiome(biomeMissingland);
        BiomeManager.addBiome(BiomeManager.BiomeType.WARM, new BiomeManager.BiomeEntry(biomeAshtreePlains, 12));
        BiomeManager.addSpawnBiome(biomeAshtreePlains);

        LogHelper.info("Registered Mod Biomes! (7/7)");
    }
}
