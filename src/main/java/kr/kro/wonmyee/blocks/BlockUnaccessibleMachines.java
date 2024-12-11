package kr.kro.wonmyee.blocks;

import kr.kro.wonmyee.Japdahan;
import kr.kro.wonmyee.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

import java.util.ArrayList;

public class BlockUnaccessibleMachines extends Block {
    public BlockUnaccessibleMachines(String unlocalizedName, int harvestLevel, float hardness) {
        super(Material.rock);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(Japdahan.blocks);
        this.setHarvestLevel("wrench",harvestLevel);
        this.setHardness(hardness);
        this.setStepSound(Block.soundTypeStone);
    }

    @Override
    public void onBlockDestroyedByPlayer(World worldIn, BlockPos pos, IBlockState state) {
        for (int i=1; i<=30; i++) {
            worldIn.playSound(pos.getX(),pos.getY(),pos.getZ(),this.stepSound.getStepSound(), 50,1,false);
        }
        super.onBlockDestroyedByPlayer(worldIn, pos, state);
    }
}
