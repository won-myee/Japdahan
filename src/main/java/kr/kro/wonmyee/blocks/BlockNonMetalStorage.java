package kr.kro.wonmyee.blocks;

import kr.kro.wonmyee.Japdahan;
import kr.kro.wonmyee.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.IBlockAccess;

import java.util.ArrayList;

public class BlockNonMetalStorage extends Block {
    public BlockNonMetalStorage(String unlocalizedName, int harvestLevel, float hardness) {
        super(Material.clay);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(Japdahan.blocks);
        this.setHarvestLevel("shovel",harvestLevel);
        this.setHardness(hardness);
        this.setStepSound(Block.soundTypeGravel);
    }

    public ArrayList<Block> getList() {
        ArrayList<Block> blockArrayList = new ArrayList<Block>();
        blockArrayList.add(ModBlocks.phosphorus_block);
        blockArrayList.add(ModBlocks.sulfur_block);
        return blockArrayList;
    }

    @Override
    public boolean isFlammable(IBlockAccess world, BlockPos pos, EnumFacing face) {
        return getList().contains(world.getBlockState(pos).getBlock());
    }
}
