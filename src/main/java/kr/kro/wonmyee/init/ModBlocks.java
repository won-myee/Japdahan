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
    public static Block lithium_block;
    public static Block beryllium_block;
    public static Block boron_block;
    public static Block carbon_block;
    public static Block sodium_block;
    public static Block magnesium_block;
    public static Block aluminum_block;
    public static Block silicon_block;
    public static Block phosphorus_block;
    public static Block sulfur_block;
    public static Block potassium_block;
    public static Block calcium_block;
    public static Block titanium_block;
    public static Block chromium_block;
    public static Block manganese_block;
    public static Block cobalt_block;
    public static Block nickel_block;
    public static Block zinc_block;
    public static Block silver_block;
    public static Block tungsten_block;
    public static Block platinum_block;
    public static Block lead_block;

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

    //Logs
    //From future MC versions
    public static Block mangrove_log;
    public static Block cherry_log;
    public static Block pale_oak_log;
    public static Block bamboo_log;
    public static Block crimson_log;
    public static Block warped_log;
    //From TFC
    public static Block ash_log;
    public static Block aspen_log;
    public static Block chestnut_log;
    public static Block douglas_fir_log;
    public static Block hickory_log;
    public static Block kapok_log;
    public static Block maple_log;
    public static Block pine_log;
    public static Block sequoia_log;
    public static Block sycamore_log;
    public static Block white_cedar_log;
    public static Block white_elm_log;
    public static Block willow_log;

    //Planks
    //From future MC versions
    public static Block mangrove_planks;
    public static Block cherry_planks;
    public static Block pale_oak_planks;
    public static Block bamboo_planks;
    public static Block crimson_planks;
    public static Block warped_planks;
    //From TFC
    public static Block ash_planks;
    public static Block aspen_planks;
    public static Block chestnut_planks;
    public static Block douglas_fir_planks;
    public static Block hickory_planks;
    public static Block kapok_planks;
    public static Block maple_planks;
    public static Block pine_planks;
    public static Block sequoia_planks;
    public static Block sycamore_planks;
    public static Block white_cedar_planks;
    public static Block white_elm_planks;
    public static Block willow_planks;

    //Stairs
    //From future MC versions
    public static Block mangrove_stairs;
    public static Block cherry_stairs;
    public static Block pale_oak_stairs;
    public static Block bamboo_stairs;
    public static Block crimson_stairs;
    public static Block warped_stairs;
    //From TFC
    public static Block ash_stairs;
    public static Block aspen_stairs;
    public static Block chestnut_stairs;
    public static Block douglas_fir_stairs;
    public static Block hickory_stairs;
    public static Block kapok_stairs;
    public static Block maple_stairs;
    public static Block pine_stairs;
    public static Block sequoia_stairs;
    public static Block sycamore_stairs;
    public static Block white_cedar_stairs;
    public static Block white_elm_stairs;
    public static Block willow_stairs;

    //Slabs
    //From future MC versions
    public static Block mangrove_slab;
    public static Block cherry_slab;
    public static Block pale_oak_slab;
    public static Block bamboo_slab;
    public static Block crimson_slab;
    public static Block warped_slab;
    //From TFC
    public static Block ash_slab;
    public static Block aspen_slab;
    public static Block chestnut_slab;
    public static Block douglas_fir_slab;
    public static Block hickory_slab;
    public static Block kapok_slab;
    public static Block maple_slab;
    public static Block pine_slab;
    public static Block sequoia_slab;
    public static Block sycamore_slab;
    public static Block white_cedar_slab;
    public static Block white_elm_slab;
    public static Block willow_slab;

    //Saplings
    //From future MC versions
    public static Block mangrove_sapling;
    public static Block cherry_sapling;
    public static Block pale_oak_sapling;
    public static Block bamboo_sapling;
    public static Block crimson_sapling;
    public static Block warped_sapling;
    //From TFC
    public static Block ash_sapling;
    public static Block aspen_sapling;
    public static Block chestnut_sapling;
    public static Block douglas_fir_sapling;
    public static Block hickory_sapling;
    public static Block kapok_sapling;
    public static Block maple_sapling;
    public static Block pine_sapling;
    public static Block sequoia_sapling;
    public static Block sycamore_sapling;
    public static Block white_cedar_sapling;
    public static Block white_elm_sapling;
    public static Block willow_sapling;

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

    //Colorblocks: Red
    public static Block cb_indianred;
    public static Block cb_lightcoral;
    public static Block cb_salmon;
    public static Block cb_darksalmon;
    public static Block cb_lightsalmon;
    public static Block cb_crimson;
    public static Block cb_red;
    public static Block cb_firebrick;
    public static Block cb_darkred;

    //Colorblocks: Pink
    public static Block cb_pink;
    public static Block cb_lightpink;
    public static Block cb_hotpink;
    public static Block cb_deeppink;
    public static Block cb_mediumvioletred;
    public static Block cb_palevioletred;

    //Colorblocks: Orange
    //LightSalmon on Red section
    public static Block cb_coral;
    public static Block cb_tomato;
    public static Block cb_orangered;
    public static Block cb_darkorange;
    public static Block cb_orange;

    //Colorblocks: Yellow
    public static Block cb_gold;
    public static Block cb_yellow;
    public static Block cb_lightyellow;
    public static Block cb_lemonchiffon;
    public static Block cb_lightgoldenrodyellow;
    public static Block cb_papayawhip;
    public static Block cb_moccasin;
    public static Block cb_peachpuff;
    public static Block cb_palegoldenrod;
    public static Block cb_khaki;
    public static Block cb_darkkhaki;

    //Colorblocks: Purple
    public static Block cb_lavender;
    public static Block cb_thistle;
    public static Block cb_plum;
    public static Block cb_violet;
    public static Block cb_orchid;
    public static Block cb_fuchsia;
    public static Block cb_magenta;
    public static Block cb_mediumorchid;
    public static Block cb_mediumpurple;
    public static Block cb_rebeccapurple;
    public static Block cb_blueviolet;
    public static Block cb_darkviolet;
    public static Block cb_darkorchid;
    public static Block cb_darkmagenta;
    public static Block cb_purple;
    public static Block cb_indigo;
    public static Block cb_slateblue;
    public static Block cb_darkslateblue;
    public static Block cb_mediumslateblue;

    //Colorblocks: Green
    public static Block cb_greenyellow;
    public static Block cb_chartreuse;
    public static Block cb_lawngreen;
    public static Block cb_limegreen;
    public static Block cb_palegreen;
    public static Block cb_lightgreen;
    public static Block cb_mediumspringgreen;
    public static Block cb_springgreen;
    public static Block cb_mediumseagreen;
    public static Block cb_seagreen;
    public static Block cb_forestgreen;
    public static Block cb_green;
    public static Block cb_darkgreen;
    public static Block cb_yellowgreen;
    public static Block cb_olivedrab;
    public static Block cb_olive;
    public static Block cb_darkolivegreen;
    public static Block cb_mediumaquamarine;
    public static Block cb_darkseagreen;
    public static Block cb_lightseagreen;
    public static Block cb_darkcyan;
    public static Block cb_teal;

    //Colorblocks: Blue
    public static Block cb_aqua;
    public static Block cb_cyan;
    public static Block cb_lightcyan;
    public static Block cb_paleturquoise;
    public static Block cb_aquamarine;
    public static Block cb_turquoise;
    public static Block cb_mediumturquoise;
    public static Block cb_darkturquoise;
    public static Block cb_cadetblue;
    public static Block cb_steelblue;
    public static Block cb_lightsteelblue;
    public static Block cb_powderblue;
    public static Block cb_lightblue;
    public static Block cb_skyblue;
    public static Block cb_lightskyblue;
    public static Block cb_deepskyblue;
    public static Block cb_dodgerblue;
    public static Block cb_cornflowerblue;
    //MediumSlateBlue on Purple section
    public static Block cb_royalblue;
    public static Block cb_blue;
    public static Block cb_mediumblue;
    public static Block cb_darkblue;
    public static Block cb_navy;
    public static Block cb_midnightblue;

    //Colorblocks: Brown
    public static Block cb_cornsilk;
    public static Block cb_blanchedalmond;
    public static Block cb_bisque;
    public static Block cb_navajowhite;
    public static Block cb_wheat;
    public static Block cb_burlywood;
    public static Block cb_tan;
    public static Block cb_rosybrown;
    public static Block cb_sandybrown;
    public static Block cb_goldenrod;
    public static Block cb_darkgoldenrod;
    public static Block cb_peru;
    public static Block cb_chocolate;
    public static Block cb_saddlebrown;
    public static Block cb_sienna;
    public static Block cb_brown;
    public static Block cb_maroon;

    //Colorblocks: White
    public static Block cb_white;
    public static Block cb_snow;
    public static Block cb_honeydew;
    public static Block cb_mintcream;
    public static Block cb_azure;
    public static Block cb_aliceblue;
    public static Block cb_ghostwhite;
    public static Block cb_whitesmoke;
    public static Block cb_seashell;
    public static Block cb_beige;
    public static Block cb_oldlace;
    public static Block cb_floralwhite;
    public static Block cb_ivory;
    public static Block cb_antiquewhite;
    public static Block cb_linen;
    public static Block cb_lavenderblush;
    public static Block cb_mistyrose;

    //Colorblocks: Gray
    public static Block cb_gainsboro;
    public static Block cb_lightgray;
    public static Block cb_silver;
    public static Block cb_darkgray;
    public static Block cb_gray;
    public static Block cb_dimgray;
    public static Block cb_lightslategray;
    public static Block cb_slategray;
    public static Block cb_darkslategray;
    public static Block cb_black;

    public static void init() {
        //Storage Blocks
        copper_block = new BlockMetalStorage("copper_block", 1, 3.5F);
        tin_block = new BlockMetalStorage("tin_block", 1, 2.5F);
        bronze_block = new BlockMetalStorage("bronze_block", 1, 4.0F);
        steel_block = new BlockMetalStorage("steel_block", 2, 5.0F);
        lithium_block = new BlockMetalStorage("lithium_block", 0, 1.0F);
        beryllium_block = new BlockMetalStorage("beryllium_block", 3, 7.0F);
        boron_block = new BlockMetalStorage("boron_block", 1, 2.0F);
        carbon_block = new BlockMetalStorage("carbon_block", 4, 15.0F);
        sodium_block = new BlockMetalStorage("sodium_block", 0, 1.5F);
        magnesium_block = new BlockMetalStorage("magnesium_block", 1, 1.5F);
        aluminum_block = new BlockMetalStorage("aluminum_block", 2, 4.0F);
        silicon_block = new BlockNonMetalStorage("silicon_block", 0, 2.5F);
        phosphorus_block = new BlockNonMetalStorage("phosphorus_block", 0, 1.5F);
        sulfur_block = new BlockNonMetalStorage("sulfur_block", 0, 1.5F);
        potassium_block = new BlockMetalStorage("potassium_block", 0, 1.75F);
        calcium_block = new BlockMetalStorage("calcium_block", 1, 3.5F);
        titanium_block = new BlockMetalStorage("titanium_block", 3, 7.0F);
        chromium_block = new BlockMetalStorage("chromium_block", 3, 6.0F);
        manganese_block = new BlockMetalStorage("manganese_block", 1, 2.5F);
        cobalt_block = new BlockMetalStorage("cobalt_block", 2, 5.0F);
        nickel_block = new BlockMetalStorage("nickel_block", 1, 4.0F);
        zinc_block = new BlockMetalStorage("zinc_block", 1, 3.5F);
        silver_block = new BlockMetalStorage("silver_block", 2, 4.5F);
        tungsten_block = new BlockMetalStorage("tungsten_block", 4, 10.0F);
        platinum_block = new BlockMetalStorage("platinum_block", 3, 6.0F);
        lead_block = new BlockMetalStorage("lead_block", 1, 2.5F);

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

        //Logs
        //From future MC versions
        mangrove_log = new BlockModLog("mangrove_log");
        cherry_log = new BlockModLog("cherry_log");
        pale_oak_log = new BlockModLog("pale_oak_log");
        bamboo_log = new BlockModLog("bamboo_log");
        crimson_log = new BlockModLog("crimson_log");
        warped_log = new BlockModLog("warped_log");
        //From TFC
        ash_log = new BlockModLog("ash_log");
        aspen_log = new BlockModLog("aspen_log");
        chestnut_log = new BlockModLog("chestnut_log");
        douglas_fir_log = new BlockModLog("douglas_fir_log");
        hickory_log = new BlockModLog("hickory_log");
        kapok_log = new BlockModLog("kapok_log");
        maple_log = new BlockModLog("maple_log");
        pine_log = new BlockModLog("pine_log");
        sequoia_log = new BlockModLog("sequoia_log");
        sycamore_log = new BlockModLog("sycamore_log");
        white_cedar_log = new BlockModLog("white_cedar_log");
        white_elm_log = new BlockModLog("white_elm_log");
        willow_log = new BlockModLog("willow_log");

        //Planks
        //From future MC versions
        mangrove_planks = new BlockModPlanks("mangrove_planks");
        cherry_planks = new BlockModPlanks("cherry_planks");
        pale_oak_planks = new BlockModPlanks("pale_oak_planks");
        bamboo_planks = new BlockModPlanks("bamboo_planks");
        crimson_planks = new BlockModPlanks("crimson_planks");
        warped_planks = new BlockModPlanks("warped_planks");
        //From TFC
        ash_planks = new BlockModPlanks("ash_planks");
        aspen_planks = new BlockModPlanks("aspen_planks");
        chestnut_planks = new BlockModPlanks("chestnut_planks");
        douglas_fir_planks = new BlockModPlanks("douglas_fir_planks");
        hickory_planks = new BlockModPlanks("hickory_planks");
        kapok_planks = new BlockModPlanks("kapok_planks");
        maple_planks = new BlockModPlanks("maple_planks");
        pine_planks = new BlockModPlanks("pine_planks");
        sequoia_planks = new BlockModPlanks("sequoia_planks");
        sycamore_planks = new BlockModPlanks("sycamore_planks");
        white_cedar_planks = new BlockModPlanks("white_cedar_planks");
        white_elm_planks = new BlockModPlanks("white_elm_planks");
        willow_planks = new BlockModPlanks("willow_planks");

        //Stairs
        //From future MC versions
        mangrove_stairs = new BlockModStairs("mangrove_stairs", mangrove_planks.getDefaultState());
        cherry_stairs = new BlockModStairs("cherry_stairs", cherry_planks.getDefaultState());
        pale_oak_stairs = new BlockModStairs("pale_oak_stairs", pale_oak_planks.getDefaultState());
        bamboo_stairs = new BlockModStairs("bamboo_stairs", bamboo_planks.getDefaultState());
        crimson_stairs = new BlockModStairs("crimson_stairs", crimson_planks.getDefaultState());
        warped_stairs = new BlockModStairs("warped_stairs", warped_planks.getDefaultState());
        //From TFC
        ash_stairs = new BlockModStairs("ash_stairs", ash_planks.getDefaultState());
        aspen_stairs = new BlockModStairs("aspen_stairs", aspen_planks.getDefaultState());
        chestnut_stairs = new BlockModStairs("chestnut_stairs", chestnut_planks.getDefaultState());
        douglas_fir_stairs = new BlockModStairs("douglas_fir_stairs", douglas_fir_planks.getDefaultState());
        hickory_stairs = new BlockModStairs("hickory_stairs", hickory_planks.getDefaultState());
        kapok_stairs = new BlockModStairs("kapok_stairs", kapok_planks.getDefaultState());
        maple_stairs = new BlockModStairs("maple_stairs", maple_planks.getDefaultState());
        pine_stairs = new BlockModStairs("pine_stairs", pine_planks.getDefaultState());
        sequoia_stairs = new BlockModStairs("sequoia_stairs", sequoia_planks.getDefaultState());
        sycamore_stairs = new BlockModStairs("sycamore_stairs", sycamore_planks.getDefaultState());
        white_cedar_stairs = new BlockModStairs("white_cedar_stairs", white_cedar_planks.getDefaultState());
        white_elm_stairs = new BlockModStairs("white_elm_stairs", white_elm_planks.getDefaultState());
        willow_stairs = new BlockModStairs("willow_stairs", willow_planks.getDefaultState());

        //Slabs
        //From future MC versions
        mangrove_slab = new BlockModSlab("mangrove_slab");
        cherry_slab = new BlockModSlab("cherry_slab");
        pale_oak_slab = new BlockModSlab("pale_oak_slab");
        bamboo_slab = new BlockModSlab("bamboo_slab");
        crimson_slab = new BlockModSlab("crimson_slab");
        warped_slab = new BlockModSlab("warped_slab");
        //From TFC
        ash_slab = new BlockModSlab("ash_slab");
        aspen_slab = new BlockModSlab("aspen_slab");
        chestnut_slab = new BlockModSlab("chestnut_slab");
        douglas_fir_slab = new BlockModSlab("douglas_fir_slab");
        hickory_slab = new BlockModSlab("hickory_slab");
        kapok_slab = new BlockModSlab("kapok_slab");
        maple_slab = new BlockModSlab("maple_slab");
        pine_slab = new BlockModSlab("pine_slab");
        sequoia_slab = new BlockModSlab("sequoia_slab");
        sycamore_slab = new BlockModSlab("sycamore_slab");
        white_cedar_slab = new BlockModSlab("white_cedar_slab");
        white_elm_slab = new BlockModSlab("white_elm_slab");
        willow_slab = new BlockModSlab("willow_slab");

        //Saplings
        //From future MC versions
        mangrove_sapling = new BlockModSapling("mangrove_sapling");
        cherry_sapling = new BlockModSapling("cherry_sapling");
        pale_oak_sapling = new BlockModSapling("pale_oak_sapling");
        bamboo_sapling = new BlockModSapling("bamboo_sapling");
        crimson_sapling = new BlockModSapling("crimson_sapling");
        warped_sapling = new BlockModSapling("warped_sapling");
        //From TFC
        ash_sapling = new BlockModSapling("ash_sapling");
        aspen_sapling = new BlockModSapling("aspen_sapling");
        chestnut_sapling = new BlockModSapling("chestnut_sapling");
        douglas_fir_sapling = new BlockModSapling("douglas_fir_sapling");
        hickory_sapling = new BlockModSapling("hickory_sapling");
        kapok_sapling = new BlockModSapling("kapok_sapling");
        maple_sapling = new BlockModSapling("maple_sapling");
        pine_sapling = new BlockModSapling("pine_sapling");
        sequoia_sapling = new BlockModSapling("sequoia_sapling");
        sycamore_sapling = new BlockModSapling("sycamore_sapling");
        white_cedar_sapling = new BlockModSapling("white_cedar_sapling");
        white_elm_sapling = new BlockModSapling("white_elm_sapling");
        willow_sapling = new BlockModSapling("willow_sapling");

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

        // Colorblocks: Red
        cb_indianred = new BlockRock("cb_indianred");
        cb_lightcoral = new BlockRock("cb_lightcoral");
        cb_salmon = new BlockRock("cb_salmon");
        cb_darksalmon = new BlockRock("cb_darksalmon");
        cb_lightsalmon = new BlockRock("cb_lightsalmon");
        cb_crimson = new BlockRock("cb_crimson");
        cb_red = new BlockRock("cb_red");
        cb_firebrick = new BlockRock("cb_firebrick");
        cb_darkred = new BlockRock("cb_darkred");

        // Colorblocks: Pink
        cb_pink = new BlockRock("cb_pink");
        cb_lightpink = new BlockRock("cb_lightpink");
        cb_hotpink = new BlockRock("cb_hotpink");
        cb_deeppink = new BlockRock("cb_deeppink");
        cb_mediumvioletred = new BlockRock("cb_mediumvioletred");
        cb_palevioletred = new BlockRock("cb_palevioletred");

        // Colorblocks: Orange
        cb_coral = new BlockRock("cb_coral");
        cb_tomato = new BlockRock("cb_tomato");
        cb_orangered = new BlockRock("cb_orangered");
        cb_darkorange = new BlockRock("cb_darkorange");
        cb_orange = new BlockRock("cb_orange");

        // Colorblocks: Yellow
        cb_gold = new BlockRock("cb_gold");
        cb_yellow = new BlockRock("cb_yellow");
        cb_lightyellow = new BlockRock("cb_lightyellow");
        cb_lemonchiffon = new BlockRock("cb_lemonchiffon");
        cb_lightgoldenrodyellow = new BlockRock("cb_lightgoldenrodyellow");
        cb_papayawhip = new BlockRock("cb_papayawhip");
        cb_moccasin = new BlockRock("cb_moccasin");
        cb_peachpuff = new BlockRock("cb_peachpuff");
        cb_palegoldenrod = new BlockRock("cb_palegoldenrod");
        cb_khaki = new BlockRock("cb_khaki");
        cb_darkkhaki = new BlockRock("cb_darkkhaki");

        // Colorblocks: Purple
        cb_lavender = new BlockRock("cb_lavender");
        cb_thistle = new BlockRock("cb_thistle");
        cb_plum = new BlockRock("cb_plum");
        cb_violet = new BlockRock("cb_violet");
        cb_orchid = new BlockRock("cb_orchid");
        cb_fuchsia = new BlockRock("cb_fuchsia");
        cb_magenta = new BlockRock("cb_magenta");
        cb_mediumorchid = new BlockRock("cb_mediumorchid");
        cb_mediumpurple = new BlockRock("cb_mediumpurple");
        cb_rebeccapurple = new BlockRock("cb_rebeccapurple");
        cb_blueviolet = new BlockRock("cb_blueviolet");
        cb_darkviolet = new BlockRock("cb_darkviolet");
        cb_darkorchid = new BlockRock("cb_darkorchid");
        cb_darkmagenta = new BlockRock("cb_darkmagenta");
        cb_purple = new BlockRock("cb_purple");
        cb_indigo = new BlockRock("cb_indigo");
        cb_slateblue = new BlockRock("cb_slateblue");
        cb_darkslateblue = new BlockRock("cb_darkslateblue");
        cb_mediumslateblue = new BlockRock("cb_mediumslateblue");

        // Colorblocks: Green
        cb_greenyellow = new BlockRock("cb_greenyellow");
        cb_chartreuse = new BlockRock("cb_chartreuse");
        cb_lawngreen = new BlockRock("cb_lawngreen");
        cb_limegreen = new BlockRock("cb_limegreen");
        cb_palegreen = new BlockRock("cb_palegreen");
        cb_lightgreen = new BlockRock("cb_lightgreen");
        cb_mediumspringgreen = new BlockRock("cb_mediumspringgreen");
        cb_springgreen = new BlockRock("cb_springgreen");
        cb_mediumseagreen = new BlockRock("cb_mediumseagreen");
        cb_seagreen = new BlockRock("cb_seagreen");
        cb_forestgreen = new BlockRock("cb_forestgreen");
        cb_green = new BlockRock("cb_green");
        cb_darkgreen = new BlockRock("cb_darkgreen");
        cb_yellowgreen = new BlockRock("cb_yellowgreen");
        cb_olivedrab = new BlockRock("cb_olivedrab");
        cb_olive = new BlockRock("cb_olive");
        cb_darkolivegreen = new BlockRock("cb_darkolivegreen");
        cb_mediumaquamarine = new BlockRock("cb_mediumaquamarine");
        cb_darkseagreen = new BlockRock("cb_darkseagreen");
        cb_lightseagreen = new BlockRock("cb_lightseagreen");
        cb_darkcyan = new BlockRock("cb_darkcyan");
        cb_teal = new BlockRock("cb_teal");

        // Colorblocks: Blue
        cb_aqua = new BlockRock("cb_aqua");
        cb_cyan = new BlockRock("cb_cyan");
        cb_lightcyan = new BlockRock("cb_lightcyan");
        cb_paleturquoise = new BlockRock("cb_paleturquoise");
        cb_aquamarine = new BlockRock("cb_aquamarine");
        cb_turquoise = new BlockRock("cb_turquoise");
        cb_mediumturquoise = new BlockRock("cb_mediumturquoise");
        cb_darkturquoise = new BlockRock("cb_darkturquoise");
        cb_cadetblue = new BlockRock("cb_cadetblue");
        cb_steelblue = new BlockRock("cb_steelblue");
        cb_lightsteelblue = new BlockRock("cb_lightsteelblue");
        cb_powderblue = new BlockRock("cb_powderblue");
        cb_lightblue = new BlockRock("cb_lightblue");
        cb_skyblue = new BlockRock("cb_skyblue");
        cb_lightskyblue = new BlockRock("cb_lightskyblue");
        cb_deepskyblue = new BlockRock("cb_deepskyblue");
        cb_dodgerblue = new BlockRock("cb_dodgerblue");
        cb_cornflowerblue = new BlockRock("cb_cornflowerblue");
        cb_royalblue = new BlockRock("cb_royalblue");
        cb_blue = new BlockRock("cb_blue");
        cb_mediumblue = new BlockRock("cb_mediumblue");
        cb_darkblue = new BlockRock("cb_darkblue");
        cb_navy = new BlockRock("cb_navy");
        cb_midnightblue = new BlockRock("cb_midnightblue");

        // Colorblocks: Brown
        cb_cornsilk = new BlockRock("cb_cornsilk");
        cb_blanchedalmond = new BlockRock("cb_blanchedalmond");
        cb_bisque = new BlockRock("cb_bisque");
        cb_navajowhite = new BlockRock("cb_navajowhite");
        cb_wheat = new BlockRock("cb_wheat");
        cb_burlywood = new BlockRock("cb_burlywood");
        cb_tan = new BlockRock("cb_tan");
        cb_rosybrown = new BlockRock("cb_rosybrown");
        cb_sandybrown = new BlockRock("cb_sandybrown");
        cb_goldenrod = new BlockRock("cb_goldenrod");
        cb_darkgoldenrod = new BlockRock("cb_darkgoldenrod");
        cb_peru = new BlockRock("cb_peru");
        cb_chocolate = new BlockRock("cb_chocolate");
        cb_saddlebrown = new BlockRock("cb_saddlebrown");
        cb_sienna = new BlockRock("cb_sienna");
        cb_brown = new BlockRock("cb_brown");
        cb_maroon = new BlockRock("cb_maroon");

        // Colorblocks: White
        cb_white = new BlockRock("cb_white");
        cb_snow = new BlockRock("cb_snow");
        cb_honeydew = new BlockRock("cb_honeydew");
        cb_mintcream = new BlockRock("cb_mintcream");
        cb_azure = new BlockRock("cb_azure");
        cb_aliceblue = new BlockRock("cb_aliceblue");
        cb_ghostwhite = new BlockRock("cb_ghostwhite");
        cb_whitesmoke = new BlockRock("cb_whitesmoke");
        cb_seashell = new BlockRock("cb_seashell");
        cb_beige = new BlockRock("cb_beige");
        cb_oldlace = new BlockRock("cb_oldlace");
        cb_floralwhite = new BlockRock("cb_floralwhite");
        cb_ivory = new BlockRock("cb_ivory");
        cb_antiquewhite = new BlockRock("cb_antiquewhite");
        cb_linen = new BlockRock("cb_linen");
        cb_lavenderblush = new BlockRock("cb_lavenderblush");
        cb_mistyrose = new BlockRock("cb_mistyrose");

        // Colorblocks: Gray
        cb_gainsboro = new BlockRock("cb_gainsboro");
        cb_lightgray = new BlockRock("cb_lightgray");
        cb_silver = new BlockRock("cb_silver");
        cb_darkgray = new BlockRock("cb_darkgray");
        cb_gray = new BlockRock("cb_gray");
        cb_dimgray = new BlockRock("cb_dimgray");
        cb_lightslategray = new BlockRock("cb_lightslategray");
        cb_slategray = new BlockRock("cb_slategray");
        cb_darkslategray = new BlockRock("cb_darkslategray");
        cb_black = new BlockRock("cb_black");

        LogHelper.info("Initialized Mod Blocks! (4/7)");
    }

    public static void register() {
        //Storage Blocks
        registerBlock(copper_block);
        registerBlock(tin_block);
        registerBlock(bronze_block);
        registerBlock(steel_block);
        registerBlock(lithium_block);
        registerBlock(beryllium_block);
        registerBlock(boron_block);
        registerBlock(carbon_block);
        registerBlock(sodium_block);
        registerBlock(magnesium_block);
        registerBlock(aluminum_block);
        registerBlock(silicon_block);
        registerBlock(phosphorus_block);
        registerBlock(sulfur_block);
        registerBlock(potassium_block);
        registerBlock(calcium_block);
        registerBlock(titanium_block);
        registerBlock(chromium_block);
        registerBlock(manganese_block);
        registerBlock(cobalt_block);
        registerBlock(nickel_block);
        registerBlock(zinc_block);
        registerBlock(silver_block);
        registerBlock(tungsten_block);
        registerBlock(platinum_block);
        registerBlock(lead_block);

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

        //Logs
        //From future MC versions
        registerBlock(mangrove_log);
        registerBlock(cherry_log);
        registerBlock(pale_oak_log);
        registerBlock(bamboo_log);
        registerBlock(crimson_log);
        registerBlock(warped_log);
        //From TFC
        registerBlock(ash_log);
        registerBlock(aspen_log);
        registerBlock(chestnut_log);
        registerBlock(douglas_fir_log);
        registerBlock(hickory_log);
        registerBlock(kapok_log);
        registerBlock(maple_log);
        registerBlock(pine_log);
        registerBlock(sequoia_log);
        registerBlock(sycamore_log);
        registerBlock(white_cedar_log);
        registerBlock(white_elm_log);
        registerBlock(willow_log);

        //Planks
        //From future MC versions
        registerBlock(mangrove_planks);
        registerBlock(cherry_planks);
        registerBlock(pale_oak_planks);
        registerBlock(bamboo_planks);
        registerBlock(crimson_planks);
        registerBlock(warped_planks);
        //From TFC
        registerBlock(ash_planks);
        registerBlock(aspen_planks);
        registerBlock(chestnut_planks);
        registerBlock(douglas_fir_planks);
        registerBlock(hickory_planks);
        registerBlock(kapok_planks);
        registerBlock(maple_planks);
        registerBlock(pine_planks);
        registerBlock(sequoia_planks);
        registerBlock(sycamore_planks);
        registerBlock(white_cedar_planks);
        registerBlock(white_elm_planks);
        registerBlock(willow_planks);

        //Stairs
        //From future MC versions
        registerBlock(mangrove_stairs);
        registerBlock(cherry_stairs);
        registerBlock(pale_oak_stairs);
        registerBlock(bamboo_stairs);
        registerBlock(crimson_stairs);
        registerBlock(warped_stairs);
        //From TFC
        registerBlock(ash_stairs);
        registerBlock(aspen_stairs);
        registerBlock(chestnut_stairs);
        registerBlock(douglas_fir_stairs);
        registerBlock(hickory_stairs);
        registerBlock(kapok_stairs);
        registerBlock(maple_stairs);
        registerBlock(pine_stairs);
        registerBlock(sequoia_stairs);
        registerBlock(sycamore_stairs);
        registerBlock(white_cedar_stairs);
        registerBlock(white_elm_stairs);
        registerBlock(willow_stairs);

        //Slabs
        //From future MC versions
        registerBlock(mangrove_slab);
        registerBlock(cherry_slab);
        registerBlock(pale_oak_slab);
        registerBlock(bamboo_slab);
        registerBlock(crimson_slab);
        registerBlock(warped_slab);
        //From TFC
        registerBlock(ash_slab);
        registerBlock(aspen_slab);
        registerBlock(chestnut_slab);
        registerBlock(douglas_fir_slab);
        registerBlock(hickory_slab);
        registerBlock(kapok_slab);
        registerBlock(maple_slab);
        registerBlock(pine_slab);
        registerBlock(sequoia_slab);
        registerBlock(sycamore_slab);
        registerBlock(white_cedar_slab);
        registerBlock(white_elm_slab);
        registerBlock(willow_slab);

        //Saplings
        //From future MC versions
        registerBlock(mangrove_sapling);
        registerBlock(cherry_sapling);
        registerBlock(pale_oak_sapling);
        registerBlock(bamboo_sapling);
        registerBlock(crimson_sapling);
        registerBlock(warped_sapling);
        //From TFC
        registerBlock(ash_sapling);
        registerBlock(aspen_sapling);
        registerBlock(chestnut_sapling);
        registerBlock(douglas_fir_sapling);
        registerBlock(hickory_sapling);
        registerBlock(kapok_sapling);
        registerBlock(maple_sapling);
        registerBlock(pine_sapling);
        registerBlock(sequoia_sapling);
        registerBlock(sycamore_sapling);
        registerBlock(white_cedar_sapling);
        registerBlock(white_elm_sapling);
        registerBlock(willow_sapling);

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

        // Colorblocks: Red
        registerBlock(cb_indianred);
        registerBlock(cb_lightcoral);
        registerBlock(cb_salmon);
        registerBlock(cb_darksalmon);
        registerBlock(cb_lightsalmon);
        registerBlock(cb_crimson);
        registerBlock(cb_red);
        registerBlock(cb_firebrick);
        registerBlock(cb_darkred);

        // Colorblocks: Pink
        registerBlock(cb_pink);
        registerBlock(cb_lightpink);
        registerBlock(cb_hotpink);
        registerBlock(cb_deeppink);
        registerBlock(cb_mediumvioletred);
        registerBlock(cb_palevioletred);

        // Colorblocks: Orange
        registerBlock(cb_coral);
        registerBlock(cb_tomato);
        registerBlock(cb_orangered);
        registerBlock(cb_darkorange);
        registerBlock(cb_orange);

        // Colorblocks: Yellow
        registerBlock(cb_gold);
        registerBlock(cb_yellow);
        registerBlock(cb_lightyellow);
        registerBlock(cb_lemonchiffon);
        registerBlock(cb_lightgoldenrodyellow);
        registerBlock(cb_papayawhip);
        registerBlock(cb_moccasin);
        registerBlock(cb_peachpuff);
        registerBlock(cb_palegoldenrod);
        registerBlock(cb_khaki);
        registerBlock(cb_darkkhaki);

        // Colorblocks: Purple
        registerBlock(cb_lavender);
        registerBlock(cb_thistle);
        registerBlock(cb_plum);
        registerBlock(cb_violet);
        registerBlock(cb_orchid);
        registerBlock(cb_fuchsia);
        registerBlock(cb_magenta);
        registerBlock(cb_mediumorchid);
        registerBlock(cb_mediumpurple);
        registerBlock(cb_rebeccapurple);
        registerBlock(cb_blueviolet);
        registerBlock(cb_darkviolet);
        registerBlock(cb_darkorchid);
        registerBlock(cb_darkmagenta);
        registerBlock(cb_purple);
        registerBlock(cb_indigo);
        registerBlock(cb_slateblue);
        registerBlock(cb_darkslateblue);
        registerBlock(cb_mediumslateblue);

        // Colorblocks: Green
        registerBlock(cb_greenyellow);
        registerBlock(cb_chartreuse);
        registerBlock(cb_lawngreen);
        registerBlock(cb_limegreen);
        registerBlock(cb_palegreen);
        registerBlock(cb_lightgreen);
        registerBlock(cb_mediumspringgreen);
        registerBlock(cb_springgreen);
        registerBlock(cb_mediumseagreen);
        registerBlock(cb_seagreen);
        registerBlock(cb_forestgreen);
        registerBlock(cb_green);
        registerBlock(cb_darkgreen);
        registerBlock(cb_yellowgreen);
        registerBlock(cb_olivedrab);
        registerBlock(cb_olive);
        registerBlock(cb_darkolivegreen);
        registerBlock(cb_mediumaquamarine);
        registerBlock(cb_darkseagreen);
        registerBlock(cb_lightseagreen);
        registerBlock(cb_darkcyan);
        registerBlock(cb_teal);

        // Colorblocks: Blue
        registerBlock(cb_aqua);
        registerBlock(cb_cyan);
        registerBlock(cb_lightcyan);
        registerBlock(cb_paleturquoise);
        registerBlock(cb_aquamarine);
        registerBlock(cb_turquoise);
        registerBlock(cb_mediumturquoise);
        registerBlock(cb_darkturquoise);
        registerBlock(cb_cadetblue);
        registerBlock(cb_steelblue);
        registerBlock(cb_lightsteelblue);
        registerBlock(cb_powderblue);
        registerBlock(cb_lightblue);
        registerBlock(cb_skyblue);
        registerBlock(cb_lightskyblue);
        registerBlock(cb_deepskyblue);
        registerBlock(cb_dodgerblue);
        registerBlock(cb_cornflowerblue);
        registerBlock(cb_royalblue);
        registerBlock(cb_blue);
        registerBlock(cb_mediumblue);
        registerBlock(cb_darkblue);
        registerBlock(cb_navy);
        registerBlock(cb_midnightblue);

        // Colorblocks: Brown
        registerBlock(cb_cornsilk);
        registerBlock(cb_blanchedalmond);
        registerBlock(cb_bisque);
        registerBlock(cb_navajowhite);
        registerBlock(cb_wheat);
        registerBlock(cb_burlywood);
        registerBlock(cb_tan);
        registerBlock(cb_rosybrown);
        registerBlock(cb_sandybrown);
        registerBlock(cb_goldenrod);
        registerBlock(cb_darkgoldenrod);
        registerBlock(cb_peru);
        registerBlock(cb_chocolate);
        registerBlock(cb_saddlebrown);
        registerBlock(cb_sienna);
        registerBlock(cb_brown);
        registerBlock(cb_maroon);

        // Colorblocks: White
        registerBlock(cb_white);
        registerBlock(cb_snow);
        registerBlock(cb_honeydew);
        registerBlock(cb_mintcream);
        registerBlock(cb_azure);
        registerBlock(cb_aliceblue);
        registerBlock(cb_ghostwhite);
        registerBlock(cb_whitesmoke);
        registerBlock(cb_seashell);
        registerBlock(cb_beige);
        registerBlock(cb_oldlace);
        registerBlock(cb_floralwhite);
        registerBlock(cb_ivory);
        registerBlock(cb_antiquewhite);
        registerBlock(cb_linen);
        registerBlock(cb_lavenderblush);
        registerBlock(cb_mistyrose);

        // Colorblocks: Gray
        registerBlock(cb_gainsboro);
        registerBlock(cb_lightgray);
        registerBlock(cb_silver);
        registerBlock(cb_darkgray);
        registerBlock(cb_gray);
        registerBlock(cb_dimgray);
        registerBlock(cb_lightslategray);
        registerBlock(cb_slategray);
        registerBlock(cb_darkslategray);
        registerBlock(cb_black);

        LogHelper.info("Registered Mod Blocks! (5/7)");
    }

    public static void registerRenders() {
        //Storage Blocks
        registerRender(copper_block);
        registerRender(tin_block);
        registerRender(bronze_block);
        registerRender(steel_block);
        registerRender(lithium_block);
        registerRender(beryllium_block);
        registerRender(boron_block);
        registerRender(carbon_block);
        registerRender(sodium_block);
        registerRender(magnesium_block);
        registerRender(aluminum_block);
        registerRender(silicon_block);
        registerRender(phosphorus_block);
        registerRender(sulfur_block);
        registerRender(potassium_block);
        registerRender(calcium_block);
        registerRender(titanium_block);
        registerRender(chromium_block);
        registerRender(manganese_block);
        registerRender(cobalt_block);
        registerRender(nickel_block);
        registerRender(zinc_block);
        registerRender(silver_block);
        registerRender(tungsten_block);
        registerRender(platinum_block);
        registerRender(lead_block);

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

        //Logs
        //From future MC versions
        registerRender(mangrove_log);
        registerRender(cherry_log);
        registerRender(pale_oak_log);
        registerRender(bamboo_log);
        registerRender(crimson_log);
        registerRender(warped_log);
        //From TFC
        registerRender(ash_log);
        registerRender(aspen_log);
        registerRender(chestnut_log);
        registerRender(douglas_fir_log);
        registerRender(hickory_log);
        registerRender(kapok_log);
        registerRender(maple_log);
        registerRender(pine_log);
        registerRender(sequoia_log);
        registerRender(sycamore_log);
        registerRender(white_cedar_log);
        registerRender(white_elm_log);
        registerRender(willow_log);

        //Planks
        //From future MC versions
        registerRender(mangrove_planks);
        registerRender(cherry_planks);
        registerRender(pale_oak_planks);
        registerRender(bamboo_planks);
        registerRender(crimson_planks);
        registerRender(warped_planks);
        //From TFC
        registerRender(ash_planks);
        registerRender(aspen_planks);
        registerRender(chestnut_planks);
        registerRender(douglas_fir_planks);
        registerRender(hickory_planks);
        registerRender(kapok_planks);
        registerRender(maple_planks);
        registerRender(pine_planks);
        registerRender(sequoia_planks);
        registerRender(sycamore_planks);
        registerRender(white_cedar_planks);
        registerRender(white_elm_planks);
        registerRender(willow_planks);

        //Stairs
        //From future MC versions
        registerRender(mangrove_stairs);
        registerRender(cherry_stairs);
        registerRender(pale_oak_stairs);
        registerRender(bamboo_stairs);
        registerRender(crimson_stairs);
        registerRender(warped_stairs);
        //From TFC
        registerRender(ash_stairs);
        registerRender(aspen_stairs);
        registerRender(chestnut_stairs);
        registerRender(douglas_fir_stairs);
        registerRender(hickory_stairs);
        registerRender(kapok_stairs);
        registerRender(maple_stairs);
        registerRender(pine_stairs);
        registerRender(sequoia_stairs);
        registerRender(sycamore_stairs);
        registerRender(white_cedar_stairs);
        registerRender(white_elm_stairs);
        registerRender(willow_stairs);

        //Slabs
        //From future MC versions
        registerRender(mangrove_slab);
        registerRender(cherry_slab);
        registerRender(pale_oak_slab);
        registerRender(bamboo_slab);
        registerRender(crimson_slab);
        registerRender(warped_slab);
        //From TFC
        registerRender(ash_slab);
        registerRender(aspen_slab);
        registerRender(chestnut_slab);
        registerRender(douglas_fir_slab);
        registerRender(hickory_slab);
        registerRender(kapok_slab);
        registerRender(maple_slab);
        registerRender(pine_slab);
        registerRender(sequoia_slab);
        registerRender(sycamore_slab);
        registerRender(white_cedar_slab);
        registerRender(white_elm_slab);
        registerRender(willow_slab);

        //Saplings
        //From future MC versions
        registerRender(mangrove_sapling);
        registerRender(cherry_sapling);
        registerRender(pale_oak_sapling);
        registerRender(bamboo_sapling);
        registerRender(crimson_sapling);
        registerRender(warped_sapling);
        //From TFC
        registerRender(ash_sapling);
        registerRender(aspen_sapling);
        registerRender(chestnut_sapling);
        registerRender(douglas_fir_sapling);
        registerRender(hickory_sapling);
        registerRender(kapok_sapling);
        registerRender(maple_sapling);
        registerRender(pine_sapling);
        registerRender(sequoia_sapling);
        registerRender(sycamore_sapling);
        registerRender(white_cedar_sapling);
        registerRender(white_elm_sapling);
        registerRender(willow_sapling);

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

        // Colorblocks: Red
        registerRender(cb_indianred);
        registerRender(cb_lightcoral);
        registerRender(cb_salmon);
        registerRender(cb_darksalmon);
        registerRender(cb_lightsalmon);
        registerRender(cb_crimson);
        registerRender(cb_red);
        registerRender(cb_firebrick);
        registerRender(cb_darkred);

        // Colorblocks: Pink
        registerRender(cb_pink);
        registerRender(cb_lightpink);
        registerRender(cb_hotpink);
        registerRender(cb_deeppink);
        registerRender(cb_mediumvioletred);
        registerRender(cb_palevioletred);

        // Colorblocks: Orange
        registerRender(cb_coral);
        registerRender(cb_tomato);
        registerRender(cb_orangered);
        registerRender(cb_darkorange);
        registerRender(cb_orange);

        // Colorblocks: Yellow
        registerRender(cb_gold);
        registerRender(cb_yellow);
        registerRender(cb_lightyellow);
        registerRender(cb_lemonchiffon);
        registerRender(cb_lightgoldenrodyellow);
        registerRender(cb_papayawhip);
        registerRender(cb_moccasin);
        registerRender(cb_peachpuff);
        registerRender(cb_palegoldenrod);
        registerRender(cb_khaki);
        registerRender(cb_darkkhaki);

        // Colorblocks: Purple
        registerRender(cb_lavender);
        registerRender(cb_thistle);
        registerRender(cb_plum);
        registerRender(cb_violet);
        registerRender(cb_orchid);
        registerRender(cb_fuchsia);
        registerRender(cb_magenta);
        registerRender(cb_mediumorchid);
        registerRender(cb_mediumpurple);
        registerRender(cb_rebeccapurple);
        registerRender(cb_blueviolet);
        registerRender(cb_darkviolet);
        registerRender(cb_darkorchid);
        registerRender(cb_darkmagenta);
        registerRender(cb_purple);
        registerRender(cb_indigo);
        registerRender(cb_slateblue);
        registerRender(cb_darkslateblue);
        registerRender(cb_mediumslateblue);

        // Colorblocks: Green
        registerRender(cb_greenyellow);
        registerRender(cb_chartreuse);
        registerRender(cb_lawngreen);
        registerRender(cb_limegreen);
        registerRender(cb_palegreen);
        registerRender(cb_lightgreen);
        registerRender(cb_mediumspringgreen);
        registerRender(cb_springgreen);
        registerRender(cb_mediumseagreen);
        registerRender(cb_seagreen);
        registerRender(cb_forestgreen);
        registerRender(cb_green);
        registerRender(cb_darkgreen);
        registerRender(cb_yellowgreen);
        registerRender(cb_olivedrab);
        registerRender(cb_olive);
        registerRender(cb_darkolivegreen);
        registerRender(cb_mediumaquamarine);
        registerRender(cb_darkseagreen);
        registerRender(cb_lightseagreen);
        registerRender(cb_darkcyan);
        registerRender(cb_teal);

        // Colorblocks: Blue
        registerRender(cb_aqua);
        registerRender(cb_cyan);
        registerRender(cb_lightcyan);
        registerRender(cb_paleturquoise);
        registerRender(cb_aquamarine);
        registerRender(cb_turquoise);
        registerRender(cb_mediumturquoise);
        registerRender(cb_darkturquoise);
        registerRender(cb_cadetblue);
        registerRender(cb_steelblue);
        registerRender(cb_lightsteelblue);
        registerRender(cb_powderblue);
        registerRender(cb_lightblue);
        registerRender(cb_skyblue);
        registerRender(cb_lightskyblue);
        registerRender(cb_deepskyblue);
        registerRender(cb_dodgerblue);
        registerRender(cb_cornflowerblue);
        registerRender(cb_royalblue);
        registerRender(cb_blue);
        registerRender(cb_mediumblue);
        registerRender(cb_darkblue);
        registerRender(cb_navy);
        registerRender(cb_midnightblue);

        // Colorblocks: Brown
        registerRender(cb_cornsilk);
        registerRender(cb_blanchedalmond);
        registerRender(cb_bisque);
        registerRender(cb_navajowhite);
        registerRender(cb_wheat);
        registerRender(cb_burlywood);
        registerRender(cb_tan);
        registerRender(cb_rosybrown);
        registerRender(cb_sandybrown);
        registerRender(cb_goldenrod);
        registerRender(cb_darkgoldenrod);
        registerRender(cb_peru);
        registerRender(cb_chocolate);
        registerRender(cb_saddlebrown);
        registerRender(cb_sienna);
        registerRender(cb_brown);
        registerRender(cb_maroon);

        // Colorblocks: White
        registerRender(cb_white);
        registerRender(cb_snow);
        registerRender(cb_honeydew);
        registerRender(cb_mintcream);
        registerRender(cb_azure);
        registerRender(cb_aliceblue);
        registerRender(cb_ghostwhite);
        registerRender(cb_whitesmoke);
        registerRender(cb_seashell);
        registerRender(cb_beige);
        registerRender(cb_oldlace);
        registerRender(cb_floralwhite);
        registerRender(cb_ivory);
        registerRender(cb_antiquewhite);
        registerRender(cb_linen);
        registerRender(cb_lavenderblush);
        registerRender(cb_mistyrose);

        // Colorblocks: Gray
        registerRender(cb_gainsboro);
        registerRender(cb_lightgray);
        registerRender(cb_silver);
        registerRender(cb_darkgray);
        registerRender(cb_gray);
        registerRender(cb_dimgray);
        registerRender(cb_lightslategray);
        registerRender(cb_slategray);
        registerRender(cb_darkslategray);
        registerRender(cb_black);
    }

    public static void registerBlock(Block block) {
        GameRegistry.registerBlock(block, block.getUnlocalizedName().substring(5));
        LogHelper.debug("Registered Block: " + block.getUnlocalizedName().substring(5));
    }

    public static void registerRender(Block block) {
        Item item = Item.getItemFromBlock(block);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
        LogHelper.debug("Registered Render: " + block.getUnlocalizedName().substring(5));
    }

}
