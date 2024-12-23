package kr.kro.wonmyee.worldgen;

import kr.kro.wonmyee.init.ModFluids;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;

import java.util.Random;

public class BiomeGenMissingland extends BiomeGenBase
{
    public BiomeGenMissingland(int id)
    {
        super(id);
        this.setBiomeName("The Missingland");
        this.setColor(0);
        this.setTemperatureRainfall(100.0F, 0.0F);
        this.spawnableCreatureList.clear();
        this.spawnableMonsterList.clear();
        this.topBlock = ModFluids.OIL_FLUID.getBlock().getDefaultState();
        this.fillerBlock = ModFluids.OIL_FLUID.getBlock().getDefaultState();
        this.theBiomeDecorator.treesPerChunk = 0;
        this.theBiomeDecorator.deadBushPerChunk = 0;
        this.theBiomeDecorator.generateLakes = false;
    }

    public void decorate(World worldIn, Random rand, BlockPos pos)
    {
        super.decorate(worldIn, rand, pos);
    }
}