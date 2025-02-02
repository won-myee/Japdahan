package kr.kro.wonmyee.blocks;

import kr.kro.wonmyee.Japdahan;
import kr.kro.wonmyee.debug.LogHelper;
import kr.kro.wonmyee.init.ModBlocks;
import kr.kro.wonmyee.worldgen.trees.WorldGenCustomTree;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.IGrowable;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.Random;

public class BlockModSapling extends BlockBush implements IGrowable {

    public static final PropertyInteger STAGE = PropertyInteger.create("stage", 0, 1);

    public BlockModSapling(String unlocalizedName) {
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(Japdahan.blocks);
        this.setStepSound(soundTypeGrass);
        float f = 0.4F;
        this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
        this.setDefaultState(this.blockState.getBaseState().withProperty(STAGE, 0));
    }

    @Override
    public boolean canGrow(World world, BlockPos pos, IBlockState state, boolean isClient) {
        return true; // Always allow bonemeal growth
    }

    @Override
    public boolean canUseBonemeal(World world, Random rand, BlockPos pos, IBlockState state) {
        return rand.nextFloat() < 0.45; // 45% chance to grow
    }

    @Override
    protected BlockState createBlockState() {
        return new BlockState(this, new IProperty[] { STAGE });
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(STAGE, (meta & 8) >> 3);
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        int i = 0;
        i = i | ((Integer)state.getValue(STAGE)).intValue() << 3;
        return i;
    }

    public ArrayList<Block> getSaplingList() {
        ArrayList<Block> blockArrayList = new ArrayList<Block>();
        blockArrayList.add(ModBlocks.mangrove_sapling);
        blockArrayList.add(ModBlocks.cherry_sapling);
        blockArrayList.add(ModBlocks.pale_oak_sapling);
        blockArrayList.add(ModBlocks.bamboo_sapling);
        blockArrayList.add(ModBlocks.crimson_sapling);
        blockArrayList.add(ModBlocks.warped_sapling);
        blockArrayList.add(ModBlocks.ash_sapling);
        blockArrayList.add(ModBlocks.aspen_sapling);
        blockArrayList.add(ModBlocks.chestnut_sapling);
        blockArrayList.add(ModBlocks.douglas_fir_sapling);
        blockArrayList.add(ModBlocks.hickory_sapling);
        blockArrayList.add(ModBlocks.kapok_sapling);
        blockArrayList.add(ModBlocks.maple_sapling);
        blockArrayList.add(ModBlocks.pine_sapling);
        blockArrayList.add(ModBlocks.sequoia_sapling);
        blockArrayList.add(ModBlocks.sycamore_sapling);
        blockArrayList.add(ModBlocks.white_cedar_sapling);
        blockArrayList.add(ModBlocks.white_elm_sapling);
        blockArrayList.add(ModBlocks.willow_sapling);
        return blockArrayList;
    }

    public ArrayList<Block> getLogList() {
        ArrayList<Block> blockArrayList = new ArrayList<Block>();
        blockArrayList.add(ModBlocks.mangrove_log);
        blockArrayList.add(ModBlocks.cherry_log);
        blockArrayList.add(ModBlocks.pale_oak_log);
        blockArrayList.add(ModBlocks.bamboo_log);
        blockArrayList.add(ModBlocks.crimson_log);
        blockArrayList.add(ModBlocks.warped_log);
        blockArrayList.add(ModBlocks.ash_log);
        blockArrayList.add(ModBlocks.aspen_log);
        blockArrayList.add(ModBlocks.chestnut_log);
        blockArrayList.add(ModBlocks.douglas_fir_log);
        blockArrayList.add(ModBlocks.hickory_log);
        blockArrayList.add(ModBlocks.kapok_log);
        blockArrayList.add(ModBlocks.maple_log);
        blockArrayList.add(ModBlocks.pine_log);
        blockArrayList.add(ModBlocks.sequoia_log);
        blockArrayList.add(ModBlocks.sycamore_log);
        blockArrayList.add(ModBlocks.white_cedar_log);
        blockArrayList.add(ModBlocks.white_elm_log);
        blockArrayList.add(ModBlocks.willow_log);
        return blockArrayList;
    }

    public ArrayList<Integer> getHeight() {
        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        integerArrayList.add(7);
        integerArrayList.add(5);
        integerArrayList.add(6);
        integerArrayList.add(7);
        integerArrayList.add(4);
        integerArrayList.add(4);
        integerArrayList.add(4);
        integerArrayList.add(5);
        integerArrayList.add(5);
        integerArrayList.add(7);
        integerArrayList.add(3);
        integerArrayList.add(5);
        integerArrayList.add(5);
        integerArrayList.add(6);
        integerArrayList.add(9);
        integerArrayList.add(5);
        integerArrayList.add(6);
        integerArrayList.add(4);
        integerArrayList.add(7);
        return integerArrayList;
    }

    @Override
    public void grow(World world, Random rand, BlockPos pos, IBlockState state) {
        if (!world.isRemote) {
            int type = -1;
            // Get the index of the sapling in the list
            type = getSaplingList().indexOf(this);
            if (type != -1) {
                // Generate the tree with the corresponding log type
                generateTree(world, pos, rand, type);
            } else {
                // If sapling is not found in the list, print a debug message
                LogHelper.debug("Error: Sapling not found in list!");
            }
        }
    }

    public void generateTree(World world, BlockPos pos, Random rand, int type) {
        // Replace sapling with tree
        world.setBlockToAir(pos);
        new WorldGenCustomTree(
                getLogList().get(type).getDefaultState(),
                Blocks.leaves.getDefaultState(),
                getHeight().get(type) // Min height
        ).generate(world, rand, pos);
    }
}
