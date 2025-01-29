package kr.kro.wonmyee.worldgen.trees;

import java.util.Random;

import kr.kro.wonmyee.init.ModBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenMangroveTreeSpawner implements IWorldGenerator {

    private static final WorldGenAbstractTree MANGROVE_TREE = new WorldGenCustomTree(
            ModBlocks.mangrove_log.getDefaultState(),
            Blocks.leaves.getDefaultState(),
            7 // Minimum tree height
    );

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

            if (biome == BiomeGenBase.swampland) {
                MANGROVE_TREE.generate(world, random, pos);
            }
        }
    }
}
