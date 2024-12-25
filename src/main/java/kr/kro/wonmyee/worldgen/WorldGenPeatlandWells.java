//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package kr.kro.wonmyee.worldgen;

import com.google.common.base.Predicates;
import java.util.Random;

import kr.kro.wonmyee.init.ModBlocks;
import net.minecraft.block.BlockSand;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockStoneSlab;
import net.minecraft.block.BlockSlab.EnumBlockHalf;
import net.minecraft.block.BlockStoneSlab.EnumType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockStateHelper;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumFacing.Plane;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenPeatlandWells extends WorldGenerator {
    private static final BlockStateHelper field_175913_a;
    private final IBlockState field_175911_b;
    private final IBlockState field_175912_c;
    private final IBlockState field_175910_d;

    public WorldGenPeatlandWells() {
        this.field_175911_b = Blocks.stone_slab.getDefaultState().withProperty(BlockStoneSlab.VARIANT, EnumType.SAND).withProperty(BlockSlab.HALF, EnumBlockHalf.BOTTOM);
        this.field_175912_c = ModBlocks.sandstone_cobblestone.getDefaultState();
        this.field_175910_d = Blocks.flowing_water.getDefaultState();
    }

    public boolean generate(World worldIn, Random rand, BlockPos position) {
        while(worldIn.isAirBlock(position) && position.getY() > 2) {
            position = position.down();
        }

        if (!field_175913_a.apply(worldIn.getBlockState(position))) {
            return false;
        } else {
            for(int i = -2; i <= 2; ++i) {
                for(int j = -2; j <= 2; ++j) {
                    if (worldIn.isAirBlock(position.add(i, -1, j)) && worldIn.isAirBlock(position.add(i, -2, j))) {
                        return false;
                    }
                }
            }

            for(int l = -1; l <= 0; ++l) {
                for(int l1 = -2; l1 <= 2; ++l1) {
                    for(int k = -2; k <= 2; ++k) {
                        worldIn.setBlockState(position.add(l1, l, k), this.field_175912_c, 2);
                    }
                }
            }

            worldIn.setBlockState(position, this.field_175910_d, 2);

            for(EnumFacing enumfacing : Plane.HORIZONTAL) {
                worldIn.setBlockState(position.offset(enumfacing), this.field_175910_d, 2);
            }

            for(int i1 = -2; i1 <= 2; ++i1) {
                for(int i2 = -2; i2 <= 2; ++i2) {
                    if (i1 == -2 || i1 == 2 || i2 == -2 || i2 == 2) {
                        worldIn.setBlockState(position.add(i1, 1, i2), this.field_175912_c, 2);
                    }
                }
            }

            worldIn.setBlockState(position.add(2, 1, 0), this.field_175911_b, 2);
            worldIn.setBlockState(position.add(-2, 1, 0), this.field_175911_b, 2);
            worldIn.setBlockState(position.add(0, 1, 2), this.field_175911_b, 2);
            worldIn.setBlockState(position.add(0, 1, -2), this.field_175911_b, 2);

            for(int j1 = -1; j1 <= 1; ++j1) {
                for(int j2 = -1; j2 <= 1; ++j2) {
                    if (j1 == 0 && j2 == 0) {
                        worldIn.setBlockState(position.add(j1, 4, j2), this.field_175912_c, 2);
                    } else {
                        worldIn.setBlockState(position.add(j1, 4, j2), this.field_175911_b, 2);
                    }
                }
            }

            for(int k1 = 1; k1 <= 3; ++k1) {
                worldIn.setBlockState(position.add(-1, k1, -1), this.field_175912_c, 2);
                worldIn.setBlockState(position.add(-1, k1, 1), this.field_175912_c, 2);
                worldIn.setBlockState(position.add(1, k1, -1), this.field_175912_c, 2);
                worldIn.setBlockState(position.add(1, k1, 1), this.field_175912_c, 2);
            }

            return true;
        }
    }

    static {
        field_175913_a = BlockStateHelper.forBlock(Blocks.sand).where(BlockSand.VARIANT, Predicates.equalTo(net.minecraft.block.BlockSand.EnumType.SAND));
    }
}