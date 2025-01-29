package kr.kro.wonmyee.blocks;

import kr.kro.wonmyee.Japdahan;
import net.minecraft.block.BlockLog;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.BlockPos;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.world.World;

public class BlockModLog extends BlockLog {

    // PropertyEnum for LOG_AXIS
    public static final PropertyEnum<EnumAxis> LOG_AXIS = PropertyEnum.create("axis", EnumAxis.class);

    public BlockModLog(String unlocalizedName) {
        this.setCreativeTab(Japdahan.blocks);
        this.setUnlocalizedName(unlocalizedName);
        this.setHardness(2.0F);
        this.setResistance(3.0F);
        // Make sure the default state has the LOG_AXIS set
        this.setDefaultState(this.blockState.getBaseState().withProperty(LOG_AXIS, EnumAxis.NONE));
    }

    @Override
    protected BlockState createBlockState() {
        // Correct the block state to include the LOG_AXIS property
        return new BlockState(this, new IProperty[] { LOG_AXIS });
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        // Get the axis from the meta value (use the lower 2 bits to determine the axis)
        EnumAxis axis = EnumAxis.values()[meta & 3]; // Mask to get the axis (0 - 3)
        return this.getDefaultState().withProperty(LOG_AXIS, axis);
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        // Return the ordinal of the axis as the meta value
        EnumAxis axis = state.getValue(LOG_AXIS);
        return axis.ordinal(); // This stores the axis in the lower bits of the meta value
    }

    // Optional: Override this if necessary for world interactions
    @Override
    public IBlockState onBlockPlaced(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
        // Set the axis when the block is placed by the player
        EnumAxis axis = EnumAxis.NONE;  // Default is NONE, but you can change this based on the placement
        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
            axis = EnumAxis.Y;  // Assuming if the block is placed on the Y axis (vertical)
        } else if (facing == EnumFacing.NORTH || facing == EnumFacing.SOUTH) {
            axis = EnumAxis.Z;  // Horizontal axis Z
        } else if (facing == EnumFacing.EAST || facing == EnumFacing.WEST) {
            axis = EnumAxis.X;  // Horizontal axis X
        }
        return this.getDefaultState().withProperty(LOG_AXIS, axis);
    }
}
