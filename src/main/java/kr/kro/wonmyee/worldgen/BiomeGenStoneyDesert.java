package kr.kro.wonmyee.worldgen;

import kr.kro.wonmyee.init.ModBlocks;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenDesertWells;

import java.util.Random;

public class BiomeGenStoneyDesert extends BiomeGenBase
{
    public BiomeGenStoneyDesert(int id)
    {
        super(id);
        this.setBiomeName("StoneyDesert");
        this.setColor(14480627);
        this.setTemperatureRainfall(2.0F, 0.0F);
        this.spawnableCreatureList.clear();
        this.spawnableMonsterList.clear();
        this.topBlock = ModBlocks.sandstone_cobblestone.getDefaultState();
        this.fillerBlock = Blocks.sandstone.getDefaultState();
        this.theBiomeDecorator.treesPerChunk = -999;
        this.theBiomeDecorator.deadBushPerChunk = 30;
        this.spawnableMonsterList.add(new SpawnListEntry(EntitySkeleton.class, 5, 1, 2));
        this.spawnableMonsterList.add(new SpawnListEntry(EntityZombie.class, 10, 2, 3));
    }

    public void decorate(World worldIn, Random rand, BlockPos pos)
    {
        super.decorate(worldIn, rand, pos);

        if (rand.nextInt(1000) == 0)
        {
            int i = rand.nextInt(16) + 8;
            int j = rand.nextInt(16) + 8;
            BlockPos blockpos = worldIn.getHeight(pos.add(i, 0, j)).up();
            (new WorldGenDesertWells()).generate(worldIn, rand, blockpos);
        }
    }
}