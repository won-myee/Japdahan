package kr.kro.wonmyee.worldgen.trees;

import kr.kro.wonmyee.init.ModBlocks;
import kr.kro.wonmyee.worldgen.ModBiomes;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class WorldGenAshTreeSpawner implements IWorldGenerator {

    private static final WorldGenAbstractTree ASH_TREE = new WorldGenCustomTree(
            ModBlocks.ash_log.getDefaultState(),
            Blocks.leaves.getDefaultState(),
            4 // Minimum tree height
    );

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        // Convert chunk coordinates to world coordinates
        int worldX = chunkX * 16;
        int worldZ = chunkZ * 16;

        // Loop through positions to randomly place trees
        for (int i = 0; i < 1; i++) { // Number of trees per chunk
            int x = worldX + random.nextInt(16);
            int z = worldZ + random.nextInt(16);
            int y = world.getHeight(new BlockPos(x, 0, z)).getY(); // Find ground level

            BlockPos pos = new BlockPos(x, y, z);
            BiomeGenBase biome = world.getBiomeGenForCoords(pos);

            if (biome == ModBiomes.biomeAshtreePlains) {
                ASH_TREE.generate(world, random, pos);
            }
        }
    }
}
