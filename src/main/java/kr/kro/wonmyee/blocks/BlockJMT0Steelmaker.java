package kr.kro.wonmyee.blocks;

import kr.kro.wonmyee.Japdahan;
import kr.kro.wonmyee.debug.LogHelper;
import kr.kro.wonmyee.init.ModBlocks;
import kr.kro.wonmyee.init.ModItems;
import kr.kro.wonmyee.variables.CheatCheck;
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

    public ArrayList<String> getColor() {
        ArrayList<String> colorArrayList = new ArrayList<String>();
        colorArrayList.add("black");
        colorArrayList.add("dark_blue");
        colorArrayList.add("blue");
        colorArrayList.add("dark_aqua");
        colorArrayList.add("dark_green");
        colorArrayList.add("green");
        colorArrayList.add("yellow");
        colorArrayList.add("gold");
        colorArrayList.add("dark_red");
        colorArrayList.add("red");
        return colorArrayList;
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
            LogHelper.debug("blockPos Size: " + blockPos.size());
            currentBlock = blockPos.indexOf(pos);
            LogHelper.debug("currentBlock: " + currentBlock);
            LogHelper.debug("mixturecount Size: " + mixtureCount.size());
            LogHelper.debug("current mixture: " + mixtureCount.get(currentBlock));
            if(CheatCheck.isCheatAllowed(playerIn)) {
                if(playerIn.getHeldItem() == null) {
                    Minecraft.getMinecraft().thePlayer.sendChatMessage("/tellraw @p {\"text\":\"Hold Mixtures or Flint and Steel in your hand to use\",\"color\":\"yellow\"}");
                } else if(!getList().contains(playerIn.getHeldItem())) {
                    if(playerIn.getHeldItem().getItem() == ModItems.steel_mixture) {
                        if(mixtureCount.get(currentBlock) == 9) {
                            Minecraft.getMinecraft().thePlayer.sendChatMessage("/tellraw @p {\"text\":\"Maximum Mixture Count Reached! (9/9)\",\"color\":\"red\"}");
                        } else {
                            Minecraft.getMinecraft().thePlayer.sendChatMessage("/clear " + playerIn.getName() + " japdahan:steel_mixture 0 1");
                            mixtureCount.set(currentBlock, mixtureCount.get(currentBlock) + 1);
                            Minecraft.getMinecraft().thePlayer.sendChatMessage("/tellraw @p {\"text\":\"" + "Mixture Count: (" + mixtureCount.get(currentBlock) + "/9)" + "\",\"color\":\"" + getColor().get(mixtureCount.get(currentBlock)) + "\"}");
                        }
                    } else if(playerIn.getHeldItem().getItem() == Items.flint_and_steel) {
                        if(mixtureCount.get(currentBlock) != 0) {
                            worldIn.setBlockState(pos, ModBlocks.JMT0_steelmaker_lit.getDefaultState(), 3);
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
                                    worldIn.setBlockState(pos, ModBlocks.JMT0_steelmaker.getDefaultState(), 3);
                                    mixtureCount.set(currentBlock, 0);
                                }
                            }.start();
                        } else {
                            Minecraft.getMinecraft().thePlayer.sendChatMessage("/tellraw @p {\"text\":\"Put Mixtures first!\",\"color\":\"red\"}");
                        }
                    } else {
                        Minecraft.getMinecraft().thePlayer.sendChatMessage("/tellraw @p {\"text\":\"Hold Mixtures or Flint and Steel in your hand to use\",\"color\":\"yellow\"}");
                    }
                } else {
                }
            } else {
                Minecraft.getMinecraft().thePlayer.sendChatMessage("/tellraw @p {\"text\":\"You MUST enable cheats to do this action!\",\"color\":\"red\"}");
            }
        }
        return super.onBlockActivated(worldIn, pos, state, playerIn, side, hitX, hitY, hitZ);
    }
}
