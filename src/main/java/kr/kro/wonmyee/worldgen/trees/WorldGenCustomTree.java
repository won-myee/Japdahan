package kr.kro.wonmyee.worldgen.trees;

import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;

import java.util.Random;

public class WorldGenCustomTree extends WorldGenAbstractTree {
    private final IBlockState log;   // Custom log block
    private final IBlockState leaves; // Custom leaves block
    private final int minTreeHeight;

    public WorldGenCustomTree(IBlockState log, IBlockState leaves, int minHeight) {
        super(true);
        this.log = log;
        this.leaves = leaves;
        this.minTreeHeight = minHeight;
    }

    @Override
    public boolean generate(World world, Random rand, BlockPos pos) {
        int height = rand.nextInt(3) + minTreeHeight; // Random height

        // ✅ Check if tree can generate (prevents floating trees)
        for (int y = 0; y <= height + 1; y++) {
            BlockPos checkPos = pos.up(y);
            if (!world.isAirBlock(checkPos) && world.getBlockState(checkPos).getBlock() != Blocks.grass) {
                return false;
            }
        }

        // ✅ Generate the tree trunk
        for (int y = 0; y < height; y++) {
            world.setBlockState(pos.up(y), log, 2);
        }

        // ✅ Generate leaves in a cube pattern
        for (int x = -2; x <= 2; x++) {
            for (int z = -2; z <= 2; z++) {
                for (int y = height - 1; y <= height + 1; y++) {
                    if (Math.abs(x) < 2 || Math.abs(z) < 2) {
                        world.setBlockState(pos.add(x, y, z), leaves, 2);
                    }
                }
            }
        }

        return true;
    }
}
