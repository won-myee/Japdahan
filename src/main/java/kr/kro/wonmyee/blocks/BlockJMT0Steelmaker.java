package kr.kro.wonmyee.blocks;

import kr.kro.wonmyee.Japdahan;
import kr.kro.wonmyee.init.ModItems;
import kr.kro.wonmyee.variables.CheatCheck;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

import java.util.ArrayList;

public class BlockJMT0Steelmaker extends Block {
    public BlockJMT0Steelmaker(String unlocalizedName, int harvestLevel, float hardness) {
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

    public ArrayList<Item> getList() {
        ArrayList<Item> itemArrayList = new ArrayList<Item>();
        itemArrayList.add(ModItems.copper_wrench);
        itemArrayList.add(ModItems.bronze_wrench);
        itemArrayList.add(ModItems.iron_wrench);
        itemArrayList.add(ModItems.steel_wrench);
        itemArrayList.add(ModItems.copper_hammer);
        itemArrayList.add(ModItems.bronze_hammer);
        itemArrayList.add(ModItems.iron_hammer);
        itemArrayList.add(ModItems.steel_hammer);
        return itemArrayList;
    }

    public static ArrayList<Integer> mixtureCount = new ArrayList<Integer>();

    public static ArrayList<BlockPos> blockPos = new ArrayList<BlockPos>();

    public static void addBlockPos(World worldIn, BlockPos pos) {
        if(!worldIn.isRemote) {
            blockPos.add(pos);
            mixtureCount.add(blockPos.indexOf(pos));
        }
    }

    @Override
    public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state) {
        if(!worldIn.isRemote) {
            blockPos.add(pos);
            mixtureCount.add(blockPos.indexOf(pos));
        }
        super.onBlockAdded(worldIn, pos, state);
    }

    /*@Override
    public IBlockState onBlockPlaced(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
        if(!worldIn.isRemote) {
            blockPos.add(pos);
            mixtureCount.add(blockPos.indexOf(pos));
        }
        return super.onBlockPlaced(worldIn, pos, facing, hitX, hitY, hitZ, meta, placer);
    }*/

    @Override
    public void onBlockHarvested(World worldIn, BlockPos pos, IBlockState state, EntityPlayer player) {
        if (!worldIn.isRemote) {
            blockPos.remove(pos);
            mixtureCount.remove(blockPos.indexOf(pos));
        }
        worldIn.setBlockToAir(pos);
        super.onBlockHarvested(worldIn, pos, state, player);
    }

    @Override
    public boolean onBlockActivated(final World worldIn, final BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ) {
        if(!worldIn.isRemote) {
            final int currentBlock;
            System.out.println("blockPos Size: " + blockPos.size());
            currentBlock = blockPos.indexOf(pos);
            System.out.println("currentBlock: " + currentBlock);
            System.out.println("mixturecount Size: " + mixtureCount.size());
            System.out.println("current mixture: " + mixtureCount.get(currentBlock));
            if(CheatCheck.isCheatAllowed(playerIn)) {
                if(playerIn.getHeldItem() == null) {
                    Minecraft.getMinecraft().thePlayer.sendChatMessage("Hold Mixtures or Flint and Steel in your hand to use");
                } else if(!getList().contains(playerIn.getHeldItem())) {
                    if(playerIn.getHeldItem().getItem() == ModItems.steel_mixture) {
                        if(mixtureCount.get(currentBlock) == 9) {
                            Minecraft.getMinecraft().thePlayer.sendChatMessage("Maximum Mixture Count Reached! (9/9)");
                        } else {
                            Minecraft.getMinecraft().thePlayer.sendChatMessage("/clear " + playerIn.getName() + " japdahan:steel_mixture 0 1");
                            mixtureCount.set(currentBlock, mixtureCount.get(currentBlock) + 1);
                            Minecraft.getMinecraft().thePlayer.sendChatMessage("Mixture Count: (" + mixtureCount.get(currentBlock) + "/9)");
                        }
                    } else if(playerIn.getHeldItem().getItem() == Items.flint_and_steel) {
                        if(mixtureCount.get(currentBlock) != 0) {
                            Minecraft.getMinecraft().thePlayer.sendChatMessage("/setblock " + pos.getX() + " " + pos.getY() + " " + pos.getZ() + " japdahan:jmt0_steelmaker_lit");
                            Minecraft.getMinecraft().thePlayer.sendChatMessage("/playsound item.fireCharge.use " + playerIn.getName() + " " + playerIn.posX + " " + playerIn.posY + " " + playerIn.posZ + " 50 1");
                            new Thread()
                            {
                                @Override
                                public void run()
                                {
                                    //some code here.
                                    try {
                                        Thread.sleep(3000L * mixtureCount.get(currentBlock));
                                    } catch (InterruptedException e) {
                                        throw new RuntimeException(e);
                                    }
                                    worldIn.spawnEntityInWorld(new EntityItem(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ModItems.steel_ingot, mixtureCount.get(currentBlock))));
                                    Minecraft.getMinecraft().thePlayer.sendChatMessage("/setblock " + pos.getX() + " " + pos.getY() + " " + pos.getZ() + " japdahan:jmt0_steelmaker");
                                    mixtureCount.set(currentBlock, 0);
                                }
                            }.start();
                        } else {
                            Minecraft.getMinecraft().thePlayer.sendChatMessage("Put Mixtures first!");
                        }
                    } else {
                        Minecraft.getMinecraft().thePlayer.sendChatMessage("Hold Mixtures or Flint and Steel in your hand to use");
                    }
                } else {
                }
            } else {
                Minecraft.getMinecraft().thePlayer.sendChatMessage("/tellraw @s {\"text\":\"You MUST enable cheats to do this action!\",\"color\":\"red\"}");
            }
        }
        return super.onBlockActivated(worldIn, pos, state, playerIn, side, hitX, hitY, hitZ);
    }
}
