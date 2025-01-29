package kr.kro.wonmyee.variables;

import net.minecraft.block.Block;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

import java.util.ArrayList;

public class BlockCheck {

    public static boolean is3x3BlockSame(Block origBlock, World worldIn, BlockPos pos, EnumFacing facing) {
        if(facing.equals(EnumFacing.UP) || facing.equals(EnumFacing.DOWN)){
            //facing vertically
            ArrayList<Boolean> boolList = new ArrayList<Boolean>();
            boolList.add(isAdjacentBlockSame(origBlock, worldIn, pos, 1, 0, 0));
            boolList.add(isAdjacentBlockSame(origBlock, worldIn, pos, 1, 0, 1));
            boolList.add(isAdjacentBlockSame(origBlock, worldIn, pos, 0, 0, 1));
            boolList.add(isAdjacentBlockSame(origBlock, worldIn, pos, -1, 0, 1));
            boolList.add(isAdjacentBlockSame(origBlock, worldIn, pos, -1, 0, 0));
            boolList.add(isAdjacentBlockSame(origBlock, worldIn, pos, -1, 0, -1));
            boolList.add(isAdjacentBlockSame(origBlock, worldIn, pos, 0, 0, -1));
            boolList.add(isAdjacentBlockSame(origBlock, worldIn, pos, 1, 0, -1));
            return verifyAllEqual(boolList);
        } else if(facing.equals(EnumFacing.WEST) || facing.equals(EnumFacing.EAST)) {
            //facing X coordinate
            ArrayList<Boolean> boolList = new ArrayList<Boolean>();
            boolList.add(isAdjacentBlockSame(origBlock, worldIn, pos, 0, 0, 1));
            boolList.add(isAdjacentBlockSame(origBlock, worldIn, pos, 0, -1, 1));
            boolList.add(isAdjacentBlockSame(origBlock, worldIn, pos, 0, -1, 0));
            boolList.add(isAdjacentBlockSame(origBlock, worldIn, pos, 0, -1, -1));
            boolList.add(isAdjacentBlockSame(origBlock, worldIn, pos, 0, 0, -1));
            boolList.add(isAdjacentBlockSame(origBlock, worldIn, pos, 0, 1, -1));
            boolList.add(isAdjacentBlockSame(origBlock, worldIn, pos, 0, 1, 0));
            boolList.add(isAdjacentBlockSame(origBlock, worldIn, pos, 0, 1, 1));
            return verifyAllEqual(boolList);
        } else if(facing.equals(EnumFacing.NORTH) || facing.equals(EnumFacing.SOUTH)) {
            //facing Z coordinate
            ArrayList<Boolean> boolList = new ArrayList<Boolean>();
            boolList.add(isAdjacentBlockSame(origBlock, worldIn, pos, 1, 0, 0));
            boolList.add(isAdjacentBlockSame(origBlock, worldIn, pos, 1, -1, 0));
            boolList.add(isAdjacentBlockSame(origBlock, worldIn, pos, 0, -1, 0));
            boolList.add(isAdjacentBlockSame(origBlock, worldIn, pos, -1, -1, 0));
            boolList.add(isAdjacentBlockSame(origBlock, worldIn, pos, -1, 0, 0));
            boolList.add(isAdjacentBlockSame(origBlock, worldIn, pos, -1, 1, 0));
            boolList.add(isAdjacentBlockSame(origBlock, worldIn, pos, 0, 1, 0));
            boolList.add(isAdjacentBlockSame(origBlock, worldIn, pos, 1, 1, 0));
            return verifyAllEqual(boolList);
        } else {
            return true;
        }
    }

    public static boolean isAdjacentBlockSame(Block origBlock, World worldIn, BlockPos pos, int xAdditive, int yAdditive, int zAdditive) {
        return origBlock == worldIn.getBlockState(new BlockPos((pos.getX()+xAdditive), (pos.getY()+yAdditive), (pos.getZ()+zAdditive))).getBlock();
    }

    public static boolean verifyAllEqual(ArrayList<Boolean> list) {
        for (Boolean bool : list) {
            //System.out.println(bool);
            if (!bool)
                return false;
        }
        return true;
    }
}
