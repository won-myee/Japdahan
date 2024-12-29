package kr.kro.wonmyee.init;

import kr.kro.wonmyee.Reference;
import kr.kro.wonmyee.blocks.*;
import kr.kro.wonmyee.debug.LogHelper;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {

    //Storage Blocks
    public static Block copper_block;
    public static Block tin_block;
    public static Block bronze_block;
    public static Block steel_block;

    //Ores
    public static Block copper_ore;
    public static Block tin_ore;
    public static Block nether_copper_ore;
    public static Block nether_tin_ore;
    public static Block end_copper_ore;
    public static Block end_tin_ore;

    //Cobblestones
    public static Block granite_cobblestone;
    public static Block diorite_cobblestone;
    public static Block andesite_cobblestone;
    public static Block sandstone_cobblestone;
    public static Block prismarine_cobblestone;
    public static Block nether_cobblestone;
    public static Block end_cobblestone;

    //Machine Casings
    public static Block bronze_casing;
    public static Block iron_casing;
    public static Block steel_casing;

    //Machines
    public static Block ceramic_crucible;
    public static Block JMT0_steelmaker;
    public static Block JMT0_steelmaker_lit;

    //Fuels
    public static Block peat_block;
    public static Block lignite;
    public static Block anthracite;

    public static void init() {
        //Storage Blocks
        copper_block = new BlockMetalStorage("copper_block", 1, 3.5F);
        tin_block = new BlockMetalStorage("tin_block", 1, 2.5F);
        bronze_block = new BlockMetalStorage("bronze_block", 1, 4.0F);
        steel_block = new BlockMetalStorage("steel_block", 2, 5.0F);

        //Ores
        copper_ore = new BlockMetalOre("copper_ore", 1, 2.5F);
        tin_ore = new BlockMetalOre("tin_ore", 1, 2.0F);
        nether_copper_ore = new BlockMetalOre("nether_copper_ore", 1, 1.2F);
        nether_tin_ore = new BlockMetalOre("nether_tin_ore", 1, 0.9F);
        end_copper_ore = new BlockMetalOre("end_copper_ore", 1, 3.5F);
        end_tin_ore = new BlockMetalOre("end_tin_ore", 1, 3.0F);

        //Cobblestones
        granite_cobblestone = new BlockRock("granite_cobblestone");
        diorite_cobblestone = new BlockRock("diorite_cobblestone");
        andesite_cobblestone = new BlockRock("andesite_cobblestone");
        sandstone_cobblestone = new BlockRock("sandstone_cobblestone");
        prismarine_cobblestone = new BlockRock("prismarine_cobblestone");
        nether_cobblestone = new BlockRock("nether_cobblestone");
        end_cobblestone = new BlockRock("end_cobblestone");

        //Machine Casings
        bronze_casing = new BlockMachineCasing("bronze_casing", 1, 4.0F);
        iron_casing = new BlockMachineCasing("iron_casing", 1, 5.0F);
        steel_casing = new BlockMachineCasing("steel_casing", 2, 5.0F);

        //Machines
        ceramic_crucible = new BlockUnaccessibleMachines("ceramic_crucible", 0, 1.25F);
        JMT0_steelmaker = new BlockJMT0Steelmaker("jmt0_steelmaker", -1, -1);
        JMT0_steelmaker_lit = new BlockUnaccessibleMachines("jmt0_steelmaker_lit", -1, -1);

        //Fuels
        peat_block = new BlockModPeat("peat_block", 0, 1.5F);
        lignite = new BlockModFuel("lignite", 0, 2.5F);
        anthracite = new BlockModFuel("anthracite", 1, 5.0F);

        LogHelper.info("Initialized Mod Blocks! (4/7)");
    }

    public static void register() {
        //Storage Blocks
        registerBlock(copper_block);
        registerBlock(tin_block);
        registerBlock(bronze_block);
        registerBlock(steel_block);

        //Ores
        registerBlock(copper_ore);
        registerBlock(tin_ore);
        registerBlock(nether_copper_ore);
        registerBlock(nether_tin_ore);
        registerBlock(end_copper_ore);
        registerBlock(end_tin_ore);

        //Cobblestones
        registerBlock(granite_cobblestone);
        registerBlock(diorite_cobblestone);
        registerBlock(andesite_cobblestone);
        registerBlock(sandstone_cobblestone);
        registerBlock(prismarine_cobblestone);
        registerBlock(nether_cobblestone);
        registerBlock(end_cobblestone);

        //Machine Casings
        registerBlock(bronze_casing);
        registerBlock(iron_casing);
        registerBlock(steel_casing);

        //Machines
        registerBlock(ceramic_crucible);
        registerBlock(JMT0_steelmaker);
        registerBlock(JMT0_steelmaker_lit);

        //Fuels
        registerBlock(peat_block);
        registerBlock(lignite);
        registerBlock(anthracite);

        LogHelper.info("Registered Mod Blocks! (5/7)");
    }

    public static void registerRenders() {
        //Storage Blocks
        registerRender(copper_block);
        registerRender(tin_block);
        registerRender(bronze_block);
        registerRender(steel_block);

        //Ores
        registerRender(copper_ore);
        registerRender(tin_ore);
        registerRender(nether_copper_ore);
        registerRender(nether_tin_ore);
        registerRender(end_copper_ore);
        registerRender(end_tin_ore);

        //Cobblestones
        registerRender(granite_cobblestone);
        registerRender(diorite_cobblestone);
        registerRender(andesite_cobblestone);
        registerRender(sandstone_cobblestone);
        registerRender(prismarine_cobblestone);
        registerRender(nether_cobblestone);
        registerRender(end_cobblestone);

        //Machine Casings
        registerRender(bronze_casing);
        registerRender(iron_casing);
        registerRender(steel_casing);

        //Machines
        registerRender(ceramic_crucible);
        registerRender(JMT0_steelmaker);
        registerRender(JMT0_steelmaker_lit);

        //Fuels
        registerRender(peat_block);
        registerRender(lignite);
        registerRender(anthracite);
    }

    public static void registerBlock(Block block) {
        GameRegistry.registerBlock(block, block.getUnlocalizedName().substring(5));
        //System.out.println("Registered Block: " + block.getUnlocalizedName().substring(5));
    }

    public static void registerRender(Block block) {
        Item item = Item.getItemFromBlock(block);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }

}
