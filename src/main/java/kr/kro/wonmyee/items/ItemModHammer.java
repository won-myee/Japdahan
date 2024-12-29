package kr.kro.wonmyee.items;

import com.google.common.collect.Sets;
import kr.kro.wonmyee.Japdahan;
import kr.kro.wonmyee.debug.LogHelper;
import kr.kro.wonmyee.init.ModBlocks;
import kr.kro.wonmyee.variables.BlockCheck;
import kr.kro.wonmyee.variables.CheatCheck;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.Set;

public class ItemModHammer extends ItemTool {

    public ItemModHammer(ToolMaterial material, String unlocalizedName, int maxDamage) {
        super(material.getDamageVsEntity(), material, Sets.newHashSet(new Block[]{ModBlocks.bronze_casing, ModBlocks.iron_casing, ModBlocks.steel_casing}));
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(Japdahan.items);
        this.setMaxStackSize(1);
        this.setMaxDamage(maxDamage);
    }

    public ArrayList<Block> getList() {
        ArrayList<Block> blockArrayList = new ArrayList<Block>();
        blockArrayList.add(ModBlocks.JMT0_steelmaker);
        return blockArrayList;
    }

    @Override
    public boolean hasContainerItem(ItemStack itemStack) {
        return true;
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemStack)
    {
        ItemStack stack = itemStack.copy();

        stack.setItemDamage(stack.getItemDamage() + 1);
        stack.stackSize = 1;

        return stack;
    }

    @Override
    public Set<String> getToolClasses(ItemStack itemStack) {
        return Sets.newHashSet("hammer");
    }

    @Override
    public boolean canHarvestBlock(Block block, ItemStack itemStack) { return true; }

    @Override
    public boolean onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, final BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ) {
        if(playerIn.isSneaking()) {
            if(getList().contains(worldIn.getBlockState(pos).getBlock())) {
                if(!worldIn.isRemote) {
                    if(CheatCheck.isCheatAllowed(playerIn)) {
                        Minecraft.getMinecraft().thePlayer.sendChatMessage("/playsound random.anvil_use " + playerIn.getName() + " " + playerIn.posX + " " + playerIn.posY + " " + playerIn.posZ + " 50 1");
                        final String originalBlock = worldIn.getBlockState(pos).getBlock().getUnlocalizedName().substring(5);
                        Minecraft.getMinecraft().thePlayer.sendChatMessage("/setblock " + pos.getX() + " " + pos.getY() + " " + pos.getZ() + " minecraft:bedrock");
                        Minecraft.getMinecraft().thePlayer.sendChatMessage("/setblock " + pos.getX() + " " + pos.getY() + " " + pos.getZ() + " japdahan:" + originalBlock);
                    } else {
                        LogHelper.debug("Player is not OPed");
                        Minecraft.getMinecraft().thePlayer.sendChatMessage("/tellraw @p {\"text\":\"You MUST enable cheats to do this action!\",\"color\":\"red\"}");
                    }
                }
            } else {
                LogHelper.debug("Hammer shift-right click not applicable for this block");
                worldIn.playSound(pos.getX(), pos.getY(), pos.getZ(), Block.soundTypeAnvil.getPlaceSound(), 30, 1, false);
            }
        }
        return super.onItemUse(stack, playerIn, worldIn, pos, side, hitX, hitY, hitZ);
    }

    @Override
    public boolean onBlockDestroyed(ItemStack stack, World worldIn, Block blockIn, BlockPos pos, EntityLivingBase playerIn) {
        if(worldIn.getBlockState(pos).getBlock().isToolEffective("pickaxe", worldIn.getBlockState(pos))) {
            if(playerIn.isSneaking()) {
                if(!worldIn.isRemote) {
                    if(CheatCheck.isCheatAllowed((EntityPlayer) playerIn)) {
                        if(stack.getMaxDamage() - stack.getItemDamage() >= 7) {
                            if(BlockCheck.is3x3BlockSame(worldIn.getBlockState(pos).getBlock(), worldIn, pos, playerIn.getHorizontalFacing())) {
                                EnumFacing playerFacing = playerIn.getHorizontalFacing();
                                if(playerFacing.equals(EnumFacing.WEST) || playerFacing.equals(EnumFacing.EAST)) {
                                    stack.damageItem(9, playerIn);
                                    for (int i = 0; i < 8; i++) {
                                        worldIn.spawnEntityInWorld(new EntityItem(worldIn, pos.getX(), (pos.getY()+1), pos.getZ(), new ItemStack(worldIn.getBlockState(pos).getBlock())));
                                    }
                                    Minecraft.getMinecraft().thePlayer.sendChatMessage("/setblock " + pos.getX() + " " + pos.getY() + " " + (pos.getZ()+1) + " minecraft:air");
                                    Minecraft.getMinecraft().thePlayer.sendChatMessage("/setblock " + pos.getX() + " " + (pos.getY()-1) + " " + (pos.getZ()+1) + " minecraft:air");
                                    Minecraft.getMinecraft().thePlayer.sendChatMessage("/setblock " + pos.getX() + " " + (pos.getY()-1) + " " + pos.getZ() + " minecraft:air");
                                    Minecraft.getMinecraft().thePlayer.sendChatMessage("/setblock " + pos.getX() + " " + (pos.getY()-1) + " " + (pos.getZ()-1) + " minecraft:air");
                                    Minecraft.getMinecraft().thePlayer.sendChatMessage("/setblock " + pos.getX() + " " + pos.getY() + " " + (pos.getZ()-1) + " minecraft:air");
                                    Minecraft.getMinecraft().thePlayer.sendChatMessage("/setblock " + pos.getX() + " " + (pos.getY()+1) + " " + (pos.getZ()-1) + " minecraft:air");
                                    Minecraft.getMinecraft().thePlayer.sendChatMessage("/setblock " + pos.getX() + " " + (pos.getY()+1) + " " + pos.getZ() + " minecraft:air");
                                    Minecraft.getMinecraft().thePlayer.sendChatMessage("/setblock " + pos.getX() + " " + (pos.getY()+1) + " " + (pos.getZ()+1) + " minecraft:air");
                                } else if(playerFacing.equals(EnumFacing.NORTH) || playerFacing.equals(EnumFacing.SOUTH)) {
                                    stack.damageItem(9, playerIn);
                                    for (int i = 0; i < 8; i++) {
                                        worldIn.spawnEntityInWorld(new EntityItem(worldIn, pos.getX(), (pos.getY()+1), pos.getZ(), new ItemStack(worldIn.getBlockState(pos).getBlock())));
                                    }
                                    Minecraft.getMinecraft().thePlayer.sendChatMessage("/setblock " + (pos.getX()+1) + " " + pos.getY() + " " + pos.getZ() + " minecraft:air");
                                    Minecraft.getMinecraft().thePlayer.sendChatMessage("/setblock " + (pos.getX()+1) + " " + (pos.getY()-1) + " " + pos.getZ() + " minecraft:air");
                                    Minecraft.getMinecraft().thePlayer.sendChatMessage("/setblock " + pos.getX() + " " + (pos.getY()-1) + " " + pos.getZ() + " minecraft:air");
                                    Minecraft.getMinecraft().thePlayer.sendChatMessage("/setblock " + (pos.getX()-1) + " " + (pos.getY()-1) + " " + pos.getZ() + " minecraft:air");
                                    Minecraft.getMinecraft().thePlayer.sendChatMessage("/setblock " + (pos.getX()-1) + " " + pos.getY() + " " + pos.getZ() + " minecraft:air");
                                    Minecraft.getMinecraft().thePlayer.sendChatMessage("/setblock " + (pos.getX()-1) + " " + (pos.getY()+1) + " " + pos.getZ() + " minecraft:air");
                                    Minecraft.getMinecraft().thePlayer.sendChatMessage("/setblock " + pos.getX() + " " + (pos.getY()+1) + " " + pos.getZ() + " minecraft:air");
                                    Minecraft.getMinecraft().thePlayer.sendChatMessage("/setblock " + (pos.getX()+1) + " " + (pos.getY()+1) + " " + pos.getZ() + " minecraft:air");
                                } else {
                                    LogHelper.debug("Invalid player facing");
                                    Minecraft.getMinecraft().thePlayer.sendChatMessage("/tellraw @p {\"text\":\"Vertical 3x3 mining not supported!\",\"color\":\"red\"}");
                                }
                            } else {
                                LogHelper.debug("3x3 range blocks are different");
                                Minecraft.getMinecraft().thePlayer.sendChatMessage("/tellraw @p {\"text\":\"Blocks in this 3x3 range are different!\",\"color\":\"red\"}");
                            }
                        } else {
                            LogHelper.debug("Durability is too low for 3x3 mining");
                            Minecraft.getMinecraft().thePlayer.sendChatMessage("/tellraw @p {\"text\":\"Durability is too low to do 3x3 mining!\",\"color\":\"red\"}");
                        }
                    } else {
                        LogHelper.debug("Player is not OPed");
                        Minecraft.getMinecraft().thePlayer.sendChatMessage("/tellraw @p {\"text\":\"You MUST enable cheats to do this action!\",\"color\":\"red\"}");
                    }
                }
            }
        }
        return super.onBlockDestroyed(stack, worldIn, blockIn, pos, playerIn);
    }
}
