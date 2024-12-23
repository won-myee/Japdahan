package kr.kro.wonmyee.worldgen;

import java.util.Random;

import kr.kro.wonmyee.init.ModBlocks;
import net.minecraft.entity.monster.EntityMagmaCube;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenPeatland extends BiomeGenBase
{
    public BiomeGenPeatland(int id)
    {
        super(id);
        this.setBiomeName("Peatland");
        this.setColor(7959583);
        this.setTemperatureRainfall(3.0F, 0.0F);
        this.spawnableCreatureList.clear();
        this.spawnableMonsterList.clear();
        this.topBlock = ModBlocks.peat_block.getDefaultState();
        this.fillerBlock = ModBlocks.sandstone_cobblestone.getDefaultState();
        this.theBiomeDecorator.treesPerChunk = -999;
        this.theBiomeDecorator.deadBushPerChunk = 30;
        this.spawnableMonsterList.add(new SpawnListEntry(EntityMagmaCube.class, 5, 2, 5));
    }

    public void decorate(World worldIn, Random rand, BlockPos pos)
    {
        super.decorate(worldIn, rand, pos);

        if (rand.nextInt(1000) == 0)
        {
            int i = rand.nextInt(16) + 8;
            int j = rand.nextInt(16) + 8;
            BlockPos blockpos = worldIn.getHeight(pos.add(i, 0, j)).up();
            (new WorldGenPeatlandWells()).generate(worldIn, rand, blockpos);
        }
    }
}