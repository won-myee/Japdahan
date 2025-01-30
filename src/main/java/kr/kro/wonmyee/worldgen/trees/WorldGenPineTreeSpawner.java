package kr.kro.wonmyee.worldgen.trees;

import kr.kro.wonmyee.init.ModBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.ArrayList;
import java.util.Random;

public class WorldGenPineTreeSpawner implements IWorldGenerator {

    private static final WorldGenAbstractTree PINE_TREE = new WorldGenCustomTree(
            ModBlocks.pine_log.getDefaultState(),
            Blocks.leaves.getDefaultState(),
            7 // Minimum tree height
    );

    public ArrayList<BiomeGenBase> getBiomeList() {
        ArrayList<BiomeGenBase> biomeArrayList = new ArrayList<BiomeGenBase>();
        biomeArrayList.add(BiomeGenBase.taiga);
        biomeArrayList.add(BiomeGenBase.taigaHills);
        biomeArrayList.add(BiomeGenBase.coldTaiga);
        biomeArrayList.add(BiomeGenBase.coldTaigaHills);
        biomeArrayList.add(BiomeGenBase.megaTaiga);
        biomeArrayList.add(BiomeGenBase.megaTaigaHills);
        return biomeArrayList;
    }

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        // Convert chunk coordinates to world coordinates
        int worldX = chunkX * 16;
        int worldZ = chunkZ * 16;

        // Loop through positions to randomly place trees
        for (int i = 0; i < 5; i++) { // Number of trees per chunk
            int x = worldX + random.nextInt(16);
            int z = worldZ + random.nextInt(16);
            int y = world.getHeight(new BlockPos(x, 0, z)).getY(); // Find ground level

            BlockPos pos = new BlockPos(x, y, z);
            BiomeGenBase biome = world.getBiomeGenForCoords(pos);

            if (getBiomeList().contains(biome)) {
                PINE_TREE.generate(world, random, pos);
            }
        }
    }
}
