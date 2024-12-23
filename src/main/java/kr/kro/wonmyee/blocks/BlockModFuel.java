package kr.kro.wonmyee.blocks;

import kr.kro.wonmyee.Japdahan;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.IBlockAccess;

public class BlockModFuel extends Block {
    public BlockModFuel(String unlocalizedName, int harvestLevel, float hardness) {
        super(Material.rock);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(Japdahan.blocks);
        this.setHarvestLevel("pickaxe",harvestLevel);
        this.setHardness(hardness);
        this.setStepSound(Block.soundTypeStone);
    }

    @Override
    public boolean isFlammable(IBlockAccess world, BlockPos pos, EnumFacing face) {
        return true;
    }
}
