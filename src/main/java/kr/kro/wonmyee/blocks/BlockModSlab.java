package kr.kro.wonmyee.blocks;

import kr.kro.wonmyee.Japdahan;
import kr.kro.wonmyee.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.ArrayList;

public class BlockModSlab extends Block {

    public static final PropertyEnum<BlockSlab.EnumBlockHalf> HALF = PropertyEnum.create("half", BlockSlab.EnumBlockHalf.class);

    public BlockModSlab(String unlocalizedName) {
        super(Material.wood);
        this.setStepSound(soundTypeWood);
        this.setCreativeTab(Japdahan.blocks);
        this.setUnlocalizedName(unlocalizedName);
        this.setHardness(2.0F);
        this.setResistance(3.0F);
        this.setDefaultState(this.blockState.getBaseState().withProperty(HALF, BlockSlab.EnumBlockHalf.BOTTOM));
    }

    @Override
    protected BlockState createBlockState() {
        return new BlockState(this, new IProperty[] { HALF });
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        // Get the half from the meta value (use the lower 2 bits to determine the half)
        BlockSlab.EnumBlockHalf half = BlockSlab.EnumBlockHalf.values()[meta & 1]; // Mask to get the half (0 - 1)
        return this.getDefaultState().withProperty(HALF, half);
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        // Return the ordinal of the half as the meta value
        BlockSlab.EnumBlockHalf half = state.getValue(HALF);
        return half.ordinal(); // This stores the half in the lower bits of the meta value
    }

    public ArrayList<Block> getSlabList() {
        ArrayList<Block> blockArrayList = new ArrayList<Block>();
        blockArrayList.add(ModBlocks.mangrove_slab);
        blockArrayList.add(ModBlocks.cherry_slab);
        blockArrayList.add(ModBlocks.pale_oak_slab);
        blockArrayList.add(ModBlocks.bamboo_slab);
        blockArrayList.add(ModBlocks.crimson_slab);
        blockArrayList.add(ModBlocks.warped_slab);
        blockArrayList.add(ModBlocks.ash_slab);
        blockArrayList.add(ModBlocks.aspen_slab);
        blockArrayList.add(ModBlocks.chestnut_slab);
        blockArrayList.add(ModBlocks.douglas_fir_slab);
        blockArrayList.add(ModBlocks.hickory_slab);
        blockArrayList.add(ModBlocks.kapok_slab);
        blockArrayList.add(ModBlocks.maple_slab);
        blockArrayList.add(ModBlocks.pine_slab);
        blockArrayList.add(ModBlocks.sequoia_slab);
        blockArrayList.add(ModBlocks.sycamore_slab);
        blockArrayList.add(ModBlocks.white_cedar_slab);
        blockArrayList.add(ModBlocks.white_elm_slab);
        blockArrayList.add(ModBlocks.willow_slab);
        return blockArrayList;
    }

    public ArrayList<Block> getPlanksList() {
        ArrayList<Block> blockArrayList = new ArrayList<Block>();
        blockArrayList.add(ModBlocks.mangrove_planks);
        blockArrayList.add(ModBlocks.cherry_planks);
        blockArrayList.add(ModBlocks.pale_oak_planks);
        blockArrayList.add(ModBlocks.bamboo_planks);
        blockArrayList.add(ModBlocks.crimson_planks);
        blockArrayList.add(ModBlocks.warped_planks);
        blockArrayList.add(ModBlocks.ash_planks);
        blockArrayList.add(ModBlocks.aspen_planks);
        blockArrayList.add(ModBlocks.chestnut_planks);
        blockArrayList.add(ModBlocks.douglas_fir_planks);
        blockArrayList.add(ModBlocks.hickory_planks);
        blockArrayList.add(ModBlocks.kapok_planks);
        blockArrayList.add(ModBlocks.maple_planks);
        blockArrayList.add(ModBlocks.pine_planks);
        blockArrayList.add(ModBlocks.sequoia_planks);
        blockArrayList.add(ModBlocks.sycamore_planks);
        blockArrayList.add(ModBlocks.white_cedar_planks);
        blockArrayList.add(ModBlocks.white_elm_planks);
        blockArrayList.add(ModBlocks.willow_planks);
        return blockArrayList;
    }

    @Override
    public IBlockState onBlockPlaced(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
        BlockSlab.EnumBlockHalf half = BlockSlab.EnumBlockHalf.BOTTOM;
        if((hitY - Math.floor(hitY)) >= 0.5) {
            half = BlockSlab.EnumBlockHalf.TOP;
        }
        return this.getDefaultState().withProperty(HALF, half);
    }

    /*@Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ) {
        if (!worldIn.isRemote) { // Only process on server side
            ItemStack heldItem = playerIn.getHeldItem();

            // Check if player is holding the same slab
            if (heldItem != null && Block.getBlockFromItem(heldItem.getItem()) == this) {
                // Get current slab type
                Block currentSlab = worldIn.getBlockState(pos).getBlock();

                // Check if the slab is a bottom slab and player is not clicking from the bottom
                if (state.getValue(HALF) == BlockSlab.EnumBlockHalf.BOTTOM && side == EnumFacing.UP) {
                    // Get the corresponding plank block
                    int index = getSlabList().indexOf(currentSlab);
                    if (index != -1) {
                        Block fullBlock = getPlanksList().get(index);

                        // Replace slab with full block
                        worldIn.setBlockState(pos, fullBlock.getDefaultState());

                        // Consume one slab from the player's hand
                        if (!playerIn.capabilities.isCreativeMode) {
                            heldItem.stackSize--;
                        }

                        // Play placement sound
                        worldIn.playSoundEffect(pos.getX(), pos.getY(), pos.getZ(), fullBlock.stepSound.getPlaceSound(), 1.0F, 1.0F);
                    }
                    return true; // Interaction successful
                }
            }
        }
        return false; // Default interaction
    }*/

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ) {
        if (!worldIn.isRemote) { // Only process on the server side
            ItemStack heldItem = playerIn.getHeldItem();

            // Check if the player is holding the same slab
            if (heldItem != null && Block.getBlockFromItem(heldItem.getItem()) == this) {
                Block currentSlab = worldIn.getBlockState(pos).getBlock();
                int index = getSlabList().indexOf(currentSlab);

                if (index != -1) {
                    Block fullBlock = getPlanksList().get(index);

                    // ✅ If it's a bottom slab and clicked from the top, replace it
                    if (state.getValue(HALF) == BlockSlab.EnumBlockHalf.BOTTOM && side == EnumFacing.UP) {
                        worldIn.setBlockState(pos, fullBlock.getDefaultState());
                    }
                    // ✅ If it's a top slab and clicked on the lower empty part, replace it
                    else if (state.getValue(HALF) == BlockSlab.EnumBlockHalf.TOP && side == EnumFacing.DOWN) {
                        worldIn.setBlockState(pos, fullBlock.getDefaultState());
                    } else {
                        return false; // Do nothing if clicked elsewhere
                    }

                    // Consume the item if in survival mode
                    if (!playerIn.capabilities.isCreativeMode) {
                        heldItem.stackSize--;
                    }

                    // Play sound effect
                    worldIn.playSoundEffect(pos.getX(), pos.getY(), pos.getZ(), fullBlock.stepSound.getPlaceSound(), 1.0F, 1.0F);

                    return true; // Successful interaction
                }
            }
        }
        return false; // Default interaction
    }

    @Override
    public void setBlockBoundsBasedOnState(IBlockAccess worldIn, BlockPos pos) {
        IBlockState iblockstate = worldIn.getBlockState(pos);

        if (iblockstate.getBlock() == this)
        {
            if (iblockstate.getValue(HALF) == BlockSlab.EnumBlockHalf.TOP)
            {
                this.setBlockBounds(0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F);
            }
            else
            {
                this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
            }
        }
    }

    @Override
    public boolean isOpaqueCube() {
        return false; // Slabs should not be fully opaque
    }

    @Override
    public boolean isFullBlock() {
        return false; // Prevents incorrect face culling
    }

}
