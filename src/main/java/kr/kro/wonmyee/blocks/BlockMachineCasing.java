package kr.kro.wonmyee.blocks;

import kr.kro.wonmyee.Japdahan;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class BlockMachineCasing extends Block {
    public BlockMachineCasing(String unlocalizedName, int harvestLevel, float hardness) {
        super(Material.iron);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(Japdahan.blocks);
        this.setHarvestLevel("wrench",harvestLevel);
        this.setHardness(hardness);
        this.setStepSound(Block.soundTypeMetal);
    }

    @Override
    public void onBlockDestroyedByPlayer(World worldIn, BlockPos pos, IBlockState state) {
        for (int i=1; i<=30; i++) {
            worldIn.playSound(pos.getX(),pos.getY(),pos.getZ(),this.stepSound.getStepSound(), 50,1,false);
        }
        super.onBlockDestroyedByPlayer(worldIn, pos, state);
    }
}
