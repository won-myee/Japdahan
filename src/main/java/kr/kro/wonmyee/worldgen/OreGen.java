package kr.kro.wonmyee.worldgen;

import kr.kro.wonmyee.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.state.pattern.BlockHelper;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class OreGen implements IWorldGenerator {

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        switch(world.provider.getDimensionId()) {
            case 0: //Overworld Dimension
                this.runGenerator(copperGenerator, world, random, chunkX, chunkZ, 12, 0, 68);
                this.runGenerator(tinGenerator, world, random, chunkX, chunkZ, 25, 0, 40);
                this.runGenerator(ligniteGenerator, world, random, chunkX, chunkZ, 50, 0, 256);
                this.runGenerator(anthraciteGenerator, world, random, chunkX, chunkZ, 10, 0, 32);
                break;
            case 1: //End Dimension
                this.runGenerator(copperGeneratorEnd, world, random, chunkX, chunkZ, 6, 0, 64);
                this.runGenerator(tinGeneratorEnd, world, random, chunkX, chunkZ, 50, 0, 64);
                this.runGenerator(anthraciteGeneratorEnd, world, random, chunkX, chunkZ, 12, 60, 84);
                break;
            case -1: //Nether Dimension
                this.runGenerator(copperGeneratorNether, world, random, chunkX, chunkZ, 24, 0, 128);
                this.runGenerator(tinGeneratorNether, world, random, chunkX, chunkZ, 12, 0, 96);
                this.runGenerator(ligniteGeneratorNether, world, random, chunkX, chunkZ, 18, 0, 128);
                this.runGenerator(anthraciteGeneratorNether, world, random, chunkX, chunkZ, 12, 124, 128);
                break;
        }
    }

    public WorldGenerator copperGenerator;
    public WorldGenerator tinGenerator;
    public WorldGenerator ligniteGenerator;
    public WorldGenerator anthraciteGenerator;
    public WorldGenerator copperGeneratorNether;
    public WorldGenerator tinGeneratorNether;
    public WorldGenerator ligniteGeneratorNether;
    public WorldGenerator anthraciteGeneratorNether;
    public WorldGenerator copperGeneratorEnd;
    public WorldGenerator tinGeneratorEnd;
    public WorldGenerator anthraciteGeneratorEnd;

    public OreGen() {
        copperGenerator = new WorldGenMinable(ModBlocks.copper_ore.getDefaultState(), 10);
        tinGenerator = new WorldGenMinable(ModBlocks.tin_ore.getDefaultState(), 6);
        ligniteGenerator = new WorldGenMinable(ModBlocks.lignite.getDefaultState(), 32, BlockHelper.forBlock(Block.getBlockFromItem(new ItemStack(Blocks.stone, 1, 2).getItem())));
        anthraciteGenerator = new WorldGenMinable(ModBlocks.anthracite.getDefaultState(), 8, BlockHelper.forBlock(Block.getBlockFromItem(new ItemStack(Blocks.stone, 1, 1).getItem())));
        copperGeneratorNether = new WorldGenMinable(ModBlocks.nether_copper_ore.getDefaultState(), 20, BlockHelper.forBlock(Blocks.netherrack));
        tinGeneratorNether = new WorldGenMinable(ModBlocks.nether_tin_ore.getDefaultState(), 3, BlockHelper.forBlock(Blocks.netherrack));
        ligniteGeneratorNether = new WorldGenMinable(ModBlocks.lignite.getDefaultState(), 16, BlockHelper.forBlock(Blocks.netherrack));
        anthraciteGeneratorNether = new WorldGenMinable(ModBlocks.anthracite.getDefaultState(), 4, BlockHelper.forBlock(Blocks.bedrock));
        copperGeneratorEnd = new WorldGenMinable(ModBlocks.end_copper_ore.getDefaultState(), 5, BlockHelper.forBlock(Blocks.end_stone));
        tinGeneratorEnd = new WorldGenMinable(ModBlocks.end_tin_ore.getDefaultState(), 12, BlockHelper.forBlock(Blocks.end_stone));
        anthraciteGeneratorEnd = new WorldGenMinable(ModBlocks.anthracite.getDefaultState(), 6, BlockHelper.forBlock(Blocks.obsidian));
    }

    private void runGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight) {
        if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
            throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");

        int heightDiff = maxHeight - minHeight + 1;
        for(int i = 0; i < chancesToSpawn; i++) {
            int x = chunk_X * 16 + rand.nextInt(16);
            int y = minHeight + rand.nextInt(heightDiff);
            int z = chunk_Z * 16 + rand.nextInt(16);
            generator.generate(world, rand, new BlockPos(x,y,z));
        }
    }

}
