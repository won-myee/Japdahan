package kr.kro.wonmyee.worldgen.trees;

import net.minecraft.block.BlockLog;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;

import java.util.Random;

import static kr.kro.wonmyee.blocks.BlockModLog.LOG_AXIS;

public class WorldGenCustomTree extends WorldGenAbstractTree {
    private final IBlockState log;   // Custom log block
    private final IBlockState leaves; // Custom leaves block
    private final int minTreeHeight;

    public WorldGenCustomTree(IBlockState log, IBlockState leaves, int minHeight) {
        super(true);
        this.log = log.withProperty(LOG_AXIS, BlockLog.EnumAxis.Y);
        this.leaves = leaves;
        this.minTreeHeight = minHeight;
    }

    @Override
    public boolean generate(World world, Random rand, BlockPos pos) {
        int height = rand.nextInt(3) + minTreeHeight; // Random height

        // ✅ Check if tree can generate (prevents floating trees)
        BlockPos basePos = pos.down(2); // Check the block directly beneath the base
        if (world.getBlockState(basePos).getBlock() != Blocks.grass && world.getBlockState(basePos).getBlock() != Blocks.dirt) {
            return false; // No solid block to support the tree
        }

        // Check the space above the base to ensure there’s enough room for the tree trunk
        for (int y = 1; y <= height; y++) {
            BlockPos checkPos = pos.up(y);

            if (!world.isAirBlock(checkPos)) {
                return false; // Block in the way of tree generation
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
