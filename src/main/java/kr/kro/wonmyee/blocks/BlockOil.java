package kr.kro.wonmyee.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.FluidRegistry;

public class BlockOil extends BlockFluidClassic {

    public BlockOil() {
        super(FluidRegistry.getFluid("oil"), Material.lava); // Set the fluid to "oil"
    }

    @Override
    public boolean isBlockSolid(IBlockAccess worldIn, BlockPos pos, EnumFacing side) {
        return false;
    }
}
