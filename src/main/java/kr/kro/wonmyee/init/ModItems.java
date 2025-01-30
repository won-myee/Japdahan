package kr.kro.wonmyee.init;

import kr.kro.wonmyee.Reference;
import kr.kro.wonmyee.debug.LogHelper;
import kr.kro.wonmyee.items.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.*;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

    //Crafting Tools
    public static Item stone_hammer;
    public static ItemModHammer copper_hammer;
    public static ItemModHammer bronze_hammer;
    public static ItemModHammer iron_hammer;
    public static ItemModHammer steel_hammer;
    public static ItemModWrench copper_wrench;
    public static ItemModWrench bronze_wrench;
    public static ItemModWrench iron_wrench;
    public static ItemModWrench steel_wrench;
    public static Item copper_file;
    public static Item bronze_file;
    public static Item iron_file;
    public static Item steel_file;

    //Rocks
    public static Item rock;
    public static Item granite_rock;
    public static Item diorite_rock;
    public static Item andesite_rock;
    public static Item sandstone_rock;
    public static Item prismarine_rock;
    public static Item nether_rock;
    public static Item end_rock;

    //Ingots
    public static Item copper_ingot;
    public static Item tin_ingot;
    public static Item bronze_ingot;
    public static Item steel_ingot;
    public static Item lithium_ingot;
    public static Item beryllium_ingot;
    public static Item boron_ingot;
    public static Item carbon_ingot;
    public static Item sodium_ingot;
    public static Item magnesium_ingot;
    public static Item aluminum_ingot;
    public static Item silicon_ingot;
    public static Item phosphorus_ingot;
    public static Item sulfur_ingot;
    public static Item potassium_ingot;
    public static Item calcium_ingot;
    public static Item titanium_ingot;
    public static Item chromium_ingot;
    public static Item manganese_ingot;
    public static Item cobalt_ingot;
    public static Item nickel_ingot;
    public static Item zinc_ingot;
    public static Item silver_ingot;
    public static Item tungsten_ingot;
    public static Item platinum_ingot;
    public static Item lead_ingot;

    //Plates
    public static Item iron_plate;
    public static Item gold_plate;
    public static Item copper_plate;
    public static Item tin_plate;
    public static Item bronze_plate;
    public static Item steel_plate;
    public static Item lithium_plate;
    public static Item beryllium_plate;
    public static Item boron_plate;
    public static Item carbon_plate;
    public static Item sodium_plate;
    public static Item magnesium_plate;
    public static Item aluminum_plate;
    public static Item silicon_plate;
    public static Item phosphorus_plate;
    public static Item sulfur_plate;
    public static Item potassium_plate;
    public static Item calcium_plate;
    public static Item titanium_plate;
    public static Item chromium_plate;
    public static Item manganese_plate;
    public static Item cobalt_plate;
    public static Item nickel_plate;
    public static Item zinc_plate;
    public static Item silver_plate;
    public static Item tungsten_plate;
    public static Item platinum_plate;
    public static Item lead_plate;

    //Dusts
    public static Item iron_dust;
    public static Item gold_dust;
    public static Item copper_dust;
    public static Item tin_dust;
    public static Item bronze_dust;
    public static Item steel_dust;
    public static Item lithium_dust;
    public static Item beryllium_dust;
    public static Item boron_dust;
    public static Item carbon_dust;
    public static Item sodium_dust;
    public static Item magnesium_dust;
    public static Item aluminum_dust;
    public static Item silicon_dust;
    public static Item phosphorus_dust;
    public static Item sulfur_dust;
    public static Item potassium_dust;
    public static Item calcium_dust;
    public static Item titanium_dust;
    public static Item chromium_dust;
    public static Item manganese_dust;
    public static Item cobalt_dust;
    public static Item nickel_dust;
    public static Item zinc_dust;
    public static Item silver_dust;
    public static Item tungsten_dust;
    public static Item platinum_dust;
    public static Item lead_dust;

    //Rods
    public static Item iron_rod;
    public static Item gold_rod;
    public static Item copper_rod;
    public static Item tin_rod;
    public static Item bronze_rod;
    public static Item steel_rod;
    public static Item lithium_rod;
    public static Item beryllium_rod;
    public static Item boron_rod;
    public static Item carbon_rod;
    public static Item sodium_rod;
    public static Item magnesium_rod;
    public static Item aluminum_rod;
    public static Item silicon_rod;
    public static Item phosphorus_rod;
    public static Item sulfur_rod;
    public static Item potassium_rod;
    public static Item calcium_rod;
    public static Item titanium_rod;
    public static Item chromium_rod;
    public static Item manganese_rod;
    public static Item cobalt_rod;
    public static Item nickel_rod;
    public static Item zinc_rod;
    public static Item silver_rod;
    public static Item tungsten_rod;
    public static Item platinum_rod;
    public static Item lead_rod;

    //Long Rods
    public static Item iron_rodlong;
    public static Item gold_rodlong;
    public static Item copper_rodlong;
    public static Item tin_rodlong;
    public static Item bronze_rodlong;
    public static Item steel_rodlong;
    public static Item lithium_rodlong;
    public static Item beryllium_rodlong;
    public static Item boron_rodlong;
    public static Item carbon_rodlong;
    public static Item sodium_rodlong;
    public static Item magnesium_rodlong;
    public static Item aluminum_rodlong;
    public static Item silicon_rodlong;
    public static Item phosphorus_rodlong;
    public static Item sulfur_rodlong;
    public static Item potassium_rodlong;
    public static Item calcium_rodlong;
    public static Item titanium_rodlong;
    public static Item chromium_rodlong;
    public static Item manganese_rodlong;
    public static Item cobalt_rodlong;
    public static Item nickel_rodlong;
    public static Item zinc_rodlong;
    public static Item silver_rodlong;
    public static Item tungsten_rodlong;
    public static Item platinum_rodlong;
    public static Item lead_rodlong;

    //Gears
    public static Item iron_gear;
    public static Item gold_gear;
    public static Item copper_gear;
    public static Item tin_gear;
    public static Item bronze_gear;
    public static Item steel_gear;
    public static Item lithium_gear;
    public static Item beryllium_gear;
    public static Item boron_gear;
    public static Item carbon_gear;
    public static Item sodium_gear;
    public static Item magnesium_gear;
    public static Item aluminum_gear;
    public static Item silicon_gear;
    public static Item phosphorus_gear;
    public static Item sulfur_gear;
    public static Item potassium_gear;
    public static Item calcium_gear;
    public static Item titanium_gear;
    public static Item chromium_gear;
    public static Item manganese_gear;
    public static Item cobalt_gear;
    public static Item nickel_gear;
    public static Item zinc_gear;
    public static Item silver_gear;
    public static Item tungsten_gear;
    public static Item platinum_gear;
    public static Item lead_gear;

    //Rings
    public static Item iron_ring;
    public static Item gold_ring;
    public static Item copper_ring;
    public static Item tin_ring;
    public static Item bronze_ring;
    public static Item steel_ring;
    public static Item lithium_ring;
    public static Item beryllium_ring;
    public static Item boron_ring;
    public static Item carbon_ring;
    public static Item sodium_ring;
    public static Item magnesium_ring;
    public static Item aluminum_ring;
    public static Item silicon_ring;
    public static Item phosphorus_ring;
    public static Item sulfur_ring;
    public static Item potassium_ring;
    public static Item calcium_ring;
    public static Item titanium_ring;
    public static Item chromium_ring;
    public static Item manganese_ring;
    public static Item cobalt_ring;
    public static Item nickel_ring;
    public static Item zinc_ring;
    public static Item silver_ring;
    public static Item tungsten_ring;
    public static Item platinum_ring;
    public static Item lead_ring;

    //Mixtures
    public static Item bronze_mixture;
    public static Item steel_mixture;

    //Tool Materials
    public static Item.ToolMaterial copperMaterial = EnumHelper.addToolMaterial("copper", 2, 196, 4.5F, 1.3F, 9);
    public static Item.ToolMaterial bronzeMaterial = EnumHelper.addToolMaterial("bronze", 2, 225, 5.5F, 1.8F, 11);
    public static Item.ToolMaterial steelMaterial = EnumHelper.addToolMaterial("steel", 2, 384, 7.0F, 2.5F, 12);

    //Tools
    public static ItemPickaxe copper_pickaxe;
    public static ItemHoe copper_hoe;
    public static ItemAxe copper_axe;
    public static ItemSpade copper_shovel;
    public static ItemSword copper_sword;
    public static ItemPickaxe bronze_pickaxe;
    public static ItemHoe bronze_hoe;
    public static ItemAxe bronze_axe;
    public static ItemSpade bronze_shovel;
    public static ItemSword bronze_sword;
    public static ItemPickaxe steel_pickaxe;
    public static ItemHoe steel_hoe;
    public static ItemAxe steel_axe;
    public static ItemSpade steel_shovel;
    public static ItemSword steel_sword;

    //Foods
    public static Item copper_apple;

    //Fuels
    public static Item peat;
    public static Item lignite_coal;
    public static Item anthracite_coal;

    //Tin Cans
    public static Item empty_tin_can;
    public static Item water_tin_can;
    public static Item lava_tin_can;
    public static Item oil_tin_can;

    public static void init() {
        //Hammer and Wrench
        stone_hammer = new ItemModHammerSingleUse(Item.ToolMaterial.STONE, "stone_hammer");
        copper_hammer = new ItemModHammer(copperMaterial, "copper_hammer", 64, 1.3F);
        bronze_hammer = new ItemModHammer(bronzeMaterial, "bronze_hammer", 96, 1.8F);
        iron_hammer = new ItemModHammer(Item.ToolMaterial.IRON, "iron_hammer", 128, 2.0F);
        steel_hammer = new ItemModHammer(steelMaterial, "steel_hammer", 192, 2.5F);
        copper_wrench = new ItemModWrench(copperMaterial, "copper_wrench", 64, 1.3F);
        bronze_wrench = new ItemModWrench(bronzeMaterial, "bronze_wrench", 96, 1.8F);
        iron_wrench = new ItemModWrench(Item.ToolMaterial.IRON, "iron_wrench", 128, 2.0F);
        steel_wrench = new ItemModWrench(steelMaterial, "steel_wrench", 192, 2.5F);
        copper_file = new ItemModCraftingTools("copper_file", 64);
        bronze_file = new ItemModCraftingTools("bronze_file", 96);
        iron_file = new ItemModCraftingTools("iron_file", 128);
        steel_file = new ItemModCraftingTools("steel_file", 192);

        //Rocks
        rock = new ItemMod("rock");
        granite_rock = new ItemMod("granite_rock");
        diorite_rock = new ItemMod("diorite_rock");
        andesite_rock = new ItemMod("andesite_rock");
        sandstone_rock = new ItemMod("sandstone_rock");
        prismarine_rock = new ItemMod("prismarine_rock");
        nether_rock = new ItemMod("nether_rock");
        end_rock = new ItemMod("end_rock");

        //Ingots
        copper_ingot = new ItemMod("copper_ingot");
        tin_ingot = new ItemMod("tin_ingot");
        bronze_ingot = new ItemMod("bronze_ingot");
        steel_ingot = new ItemMod("steel_ingot");
        lithium_ingot = new ItemMod("lithium_ingot");
        beryllium_ingot = new ItemMod("beryllium_ingot");
        boron_ingot = new ItemMod("boron_ingot");
        carbon_ingot = new ItemMod("carbon_ingot");
        sodium_ingot = new ItemMod("sodium_ingot");
        magnesium_ingot = new ItemMod("magnesium_ingot");
        aluminum_ingot = new ItemMod("aluminum_ingot");
        silicon_ingot = new ItemMod("silicon_ingot");
        phosphorus_ingot = new ItemMod("phosphorus_ingot");
        sulfur_ingot = new ItemMod("sulfur_ingot");
        potassium_ingot = new ItemMod("potassium_ingot");
        calcium_ingot = new ItemMod("calcium_ingot");
        titanium_ingot = new ItemMod("titanium_ingot");
        chromium_ingot = new ItemMod("chromium_ingot");
        manganese_ingot = new ItemMod("manganese_ingot");
        cobalt_ingot = new ItemMod("cobalt_ingot");
        nickel_ingot = new ItemMod("nickel_ingot");
        zinc_ingot = new ItemMod("zinc_ingot");
        silver_ingot = new ItemMod("silver_ingot");
        tungsten_ingot = new ItemMod("tungsten_ingot");
        platinum_ingot = new ItemMod("platinum_ingot");
        lead_ingot = new ItemMod("lead_ingot");

        //Plates
        iron_plate = new ItemMod("iron_plate");
        gold_plate = new ItemMod("gold_plate");
        copper_plate = new ItemMod("copper_plate");
        tin_plate = new ItemMod("tin_plate");
        bronze_plate = new ItemMod("bronze_plate");
        steel_plate = new ItemMod("steel_plate");
        lithium_plate = new ItemMod("lithium_plate");
        beryllium_plate = new ItemMod("beryllium_plate");
        boron_plate = new ItemMod("boron_plate");
        carbon_plate = new ItemMod("carbon_plate");
        sodium_plate = new ItemMod("sodium_plate");
        magnesium_plate = new ItemMod("magnesium_plate");
        aluminum_plate = new ItemMod("aluminum_plate");
        silicon_plate = new ItemMod("silicon_plate");
        phosphorus_plate = new ItemMod("phosphorus_plate");
        sulfur_plate = new ItemMod("sulfur_plate");
        potassium_plate = new ItemMod("potassium_plate");
        calcium_plate = new ItemMod("calcium_plate");
        titanium_plate = new ItemMod("titanium_plate");
        chromium_plate = new ItemMod("chromium_plate");
        manganese_plate = new ItemMod("manganese_plate");
        cobalt_plate = new ItemMod("cobalt_plate");
        nickel_plate = new ItemMod("nickel_plate");
        zinc_plate = new ItemMod("zinc_plate");
        silver_plate = new ItemMod("silver_plate");
        tungsten_plate = new ItemMod("tungsten_plate");
        platinum_plate = new ItemMod("platinum_plate");
        lead_plate = new ItemMod("lead_plate");

        //Dusts
        iron_dust = new ItemMod("iron_dust");
        gold_dust = new ItemMod("gold_dust");
        copper_dust = new ItemMod("copper_dust");
        tin_dust = new ItemMod("tin_dust");
        bronze_dust = new ItemMod("bronze_dust");
        steel_dust = new ItemMod("steel_dust");
        lithium_dust = new ItemMod("lithium_dust");
        beryllium_dust = new ItemMod("beryllium_dust");
        boron_dust = new ItemMod("boron_dust");
        carbon_dust = new ItemMod("carbon_dust");
        sodium_dust = new ItemMod("sodium_dust");
        magnesium_dust = new ItemMod("magnesium_dust");
        aluminum_dust = new ItemMod("aluminum_dust");
        silicon_dust = new ItemMod("silicon_dust");
        phosphorus_dust = new ItemMod("phosphorus_dust");
        sulfur_dust = new ItemMod("sulfur_dust");
        potassium_dust = new ItemMod("potassium_dust");
        calcium_dust = new ItemMod("calcium_dust");
        titanium_dust = new ItemMod("titanium_dust");
        chromium_dust = new ItemMod("chromium_dust");
        manganese_dust = new ItemMod("manganese_dust");
        cobalt_dust = new ItemMod("cobalt_dust");
        nickel_dust = new ItemMod("nickel_dust");
        zinc_dust = new ItemMod("zinc_dust");
        silver_dust = new ItemMod("silver_dust");
        tungsten_dust = new ItemMod("tungsten_dust");
        platinum_dust = new ItemMod("platinum_dust");
        lead_dust = new ItemMod("lead_dust");

        //Rods
        iron_rod = new ItemMod("iron_rod");
        gold_rod = new ItemMod("gold_rod");
        copper_rod = new ItemMod("copper_rod");
        tin_rod = new ItemMod("tin_rod");
        bronze_rod = new ItemMod("bronze_rod");
        steel_rod = new ItemMod("steel_rod");
        lithium_rod = new ItemMod("lithium_rod");
        beryllium_rod = new ItemMod("beryllium_rod");
        boron_rod = new ItemMod("boron_rod");
        carbon_rod = new ItemMod("carbon_rod");
        sodium_rod = new ItemMod("sodium_rod");
        magnesium_rod = new ItemMod("magnesium_rod");
        aluminum_rod = new ItemMod("aluminum_rod");
        silicon_rod = new ItemMod("silicon_rod");
        phosphorus_rod = new ItemMod("phosphorus_rod");
        sulfur_rod = new ItemMod("sulfur_rod");
        potassium_rod = new ItemMod("potassium_rod");
        calcium_rod = new ItemMod("calcium_rod");
        titanium_rod = new ItemMod("titanium_rod");
        chromium_rod = new ItemMod("chromium_rod");
        manganese_rod = new ItemMod("manganese_rod");
        cobalt_rod = new ItemMod("cobalt_rod");
        nickel_rod = new ItemMod("nickel_rod");
        zinc_rod = new ItemMod("zinc_rod");
        silver_rod = new ItemMod("silver_rod");
        tungsten_rod = new ItemMod("tungsten_rod");
        platinum_rod = new ItemMod("platinum_rod");
        lead_rod = new ItemMod("lead_rod");

        //Long Rods
        iron_rodlong = new ItemMod("iron_rodlong");
        gold_rodlong = new ItemMod("gold_rodlong");
        copper_rodlong = new ItemMod("copper_rodlong");
        tin_rodlong = new ItemMod("tin_rodlong");
        bronze_rodlong = new ItemMod("bronze_rodlong");
        steel_rodlong = new ItemMod("steel_rodlong");
        lithium_rodlong = new ItemMod("lithium_rodlong");
        beryllium_rodlong = new ItemMod("beryllium_rodlong");
        boron_rodlong = new ItemMod("boron_rodlong");
        carbon_rodlong = new ItemMod("carbon_rodlong");
        sodium_rodlong = new ItemMod("sodium_rodlong");
        magnesium_rodlong = new ItemMod("magnesium_rodlong");
        aluminum_rodlong = new ItemMod("aluminum_rodlong");
        silicon_rodlong = new ItemMod("silicon_rodlong");
        phosphorus_rodlong = new ItemMod("phosphorus_rodlong");
        sulfur_rodlong = new ItemMod("sulfur_rodlong");
        potassium_rodlong = new ItemMod("potassium_rodlong");
        calcium_rodlong = new ItemMod("calcium_rodlong");
        titanium_rodlong = new ItemMod("titanium_rodlong");
        chromium_rodlong = new ItemMod("chromium_rodlong");
        manganese_rodlong = new ItemMod("manganese_rodlong");
        cobalt_rodlong = new ItemMod("cobalt_rodlong");
        nickel_rodlong = new ItemMod("nickel_rodlong");
        zinc_rodlong = new ItemMod("zinc_rodlong");
        silver_rodlong = new ItemMod("silver_rodlong");
        tungsten_rodlong = new ItemMod("tungsten_rodlong");
        platinum_rodlong = new ItemMod("platinum_rodlong");
        lead_rodlong = new ItemMod("lead_rodlong");

        //Gears
        iron_gear = new ItemMod("iron_gear");
        gold_gear = new ItemMod("gold_gear");
        copper_gear = new ItemMod("copper_gear");
        tin_gear = new ItemMod("tin_gear");
        bronze_gear = new ItemMod("bronze_gear");
        steel_gear = new ItemMod("steel_gear");
        lithium_gear = new ItemMod("lithium_gear");
        beryllium_gear = new ItemMod("beryllium_gear");
        boron_gear = new ItemMod("boron_gear");
        carbon_gear = new ItemMod("carbon_gear");
        sodium_gear = new ItemMod("sodium_gear");
        magnesium_gear = new ItemMod("magnesium_gear");
        aluminum_gear = new ItemMod("aluminum_gear");
        silicon_gear = new ItemMod("silicon_gear");
        phosphorus_gear = new ItemMod("phosphorus_gear");
        sulfur_gear = new ItemMod("sulfur_gear");
        potassium_gear = new ItemMod("potassium_gear");
        calcium_gear = new ItemMod("calcium_gear");
        titanium_gear = new ItemMod("titanium_gear");
        chromium_gear = new ItemMod("chromium_gear");
        manganese_gear = new ItemMod("manganese_gear");
        cobalt_gear = new ItemMod("cobalt_gear");
        nickel_gear = new ItemMod("nickel_gear");
        zinc_gear = new ItemMod("zinc_gear");
        silver_gear = new ItemMod("silver_gear");
        tungsten_gear = new ItemMod("tungsten_gear");
        platinum_gear = new ItemMod("platinum_gear");
        lead_gear = new ItemMod("lead_gear");

        //Rings
        iron_ring = new ItemMod("iron_ring");
        gold_ring = new ItemMod("gold_ring");
        copper_ring = new ItemMod("copper_ring");
        tin_ring = new ItemMod("tin_ring");
        bronze_ring = new ItemMod("bronze_ring");
        steel_ring = new ItemMod("steel_ring");
        lithium_ring = new ItemMod("lithium_ring");
        beryllium_ring = new ItemMod("beryllium_ring");
        boron_ring = new ItemMod("boron_ring");
        carbon_ring = new ItemMod("carbon_ring");
        sodium_ring = new ItemMod("sodium_ring");
        magnesium_ring = new ItemMod("magnesium_ring");
        aluminum_ring = new ItemMod("aluminum_ring");
        silicon_ring = new ItemMod("silicon_ring");
        phosphorus_ring = new ItemMod("phosphorus_ring");
        sulfur_ring = new ItemMod("sulfur_ring");
        potassium_ring = new ItemMod("potassium_ring");
        calcium_ring = new ItemMod("calcium_ring");
        titanium_ring = new ItemMod("titanium_ring");
        chromium_ring = new ItemMod("chromium_ring");
        manganese_ring = new ItemMod("manganese_ring");
        cobalt_ring = new ItemMod("cobalt_ring");
        nickel_ring = new ItemMod("nickel_ring");
        zinc_ring = new ItemMod("zinc_ring");
        silver_ring = new ItemMod("silver_ring");
        tungsten_ring = new ItemMod("tungsten_ring");
        platinum_ring = new ItemMod("platinum_ring");
        lead_ring = new ItemMod("lead_ring");

        //Mixtures
        bronze_mixture = new ItemMod("bronze_mixture");
        steel_mixture = new ItemMod("steel_mixture");

        //Tools
        copper_pickaxe = new ItemModPickaxe(copperMaterial, "copper_pickaxe");
        copper_hoe = new ItemModHoe(copperMaterial, "copper_hoe");
        copper_axe = new ItemModAxe(copperMaterial, "copper_axe");
        copper_shovel = new ItemModShovel(copperMaterial, "copper_shovel");
        copper_sword = new ItemModSword(copperMaterial, "copper_sword");
        bronze_pickaxe = new ItemModPickaxe(bronzeMaterial, "bronze_pickaxe");
        bronze_hoe = new ItemModHoe(bronzeMaterial, "bronze_hoe");
        bronze_axe = new ItemModAxe(bronzeMaterial, "bronze_axe");
        bronze_shovel = new ItemModShovel(bronzeMaterial, "bronze_shovel");
        bronze_sword = new ItemModSword(bronzeMaterial, "bronze_sword");
        steel_pickaxe = new ItemModPickaxe(steelMaterial, "steel_pickaxe");
        steel_hoe = new ItemModHoe(steelMaterial, "steel_hoe");
        steel_axe = new ItemModAxe(steelMaterial, "steel_axe");
        steel_shovel = new ItemModShovel(steelMaterial, "steel_shovel");
        steel_sword = new ItemModSword(steelMaterial, "steel_sword");

        //Foods
        copper_apple = new ItemModFood("copper_apple", 4, 0.8F, false, new PotionEffect(Potion.moveSpeed.id, 1200, 2), new PotionEffect(Potion.healthBoost.id, 100, 0));

        //Fuels
        peat = new ItemModFuel("peat");
        lignite_coal = new ItemModFuel("lignite_coal");
        anthracite_coal = new ItemModFuel("anthracite_coal");

        //Tin Cans
        empty_tin_can = new ItemModCanEmpty("empty_tin_can");
        water_tin_can = new ItemModCan("water_tin_can");
        lava_tin_can = new ItemModCan("lava_tin_can");
        oil_tin_can = new ItemModCan("oil_tin_can");

        LogHelper.info("Initialized Mod Items! (2/7)");
    }

    public static void register() {
        //Crafting Tools
        registerItem(stone_hammer);
        registerItem(copper_hammer);
        registerItem(bronze_hammer);
        registerItem(iron_hammer);
        registerItem(steel_hammer);
        registerItem(copper_wrench);
        registerItem(bronze_wrench);
        registerItem(iron_wrench);
        registerItem(steel_wrench);
        registerItem(copper_file);
        registerItem(bronze_file);
        registerItem(iron_file);
        registerItem(steel_file);

        //Rocks
        registerItem(rock);
        registerItem(granite_rock);
        registerItem(diorite_rock);
        registerItem(andesite_rock);
        registerItem(sandstone_rock);
        registerItem(prismarine_rock);
        registerItem(nether_rock);
        registerItem(end_rock);

        //Ingots
        registerItem(copper_ingot);
        registerItem(tin_ingot);
        registerItem(bronze_ingot);
        registerItem(steel_ingot);
        registerItem(lithium_ingot);
        registerItem(beryllium_ingot);
        registerItem(boron_ingot);
        registerItem(carbon_ingot);
        registerItem(sodium_ingot);
        registerItem(magnesium_ingot);
        registerItem(aluminum_ingot);
        registerItem(silicon_ingot);
        registerItem(phosphorus_ingot);
        registerItem(sulfur_ingot);
        registerItem(potassium_ingot);
        registerItem(calcium_ingot);
        registerItem(titanium_ingot);
        registerItem(chromium_ingot);
        registerItem(manganese_ingot);
        registerItem(cobalt_ingot);
        registerItem(nickel_ingot);
        registerItem(zinc_ingot);
        registerItem(silver_ingot);
        registerItem(tungsten_ingot);
        registerItem(platinum_ingot);
        registerItem(lead_ingot);

        //Plates
        registerItem(iron_plate);
        registerItem(gold_plate);
        registerItem(copper_plate);
        registerItem(tin_plate);
        registerItem(bronze_plate);
        registerItem(steel_plate);
        registerItem(lithium_plate);
        registerItem(beryllium_plate);
        registerItem(boron_plate);
        registerItem(carbon_plate);
        registerItem(sodium_plate);
        registerItem(magnesium_plate);
        registerItem(aluminum_plate);
        registerItem(silicon_plate);
        registerItem(phosphorus_plate);
        registerItem(sulfur_plate);
        registerItem(potassium_plate);
        registerItem(calcium_plate);
        registerItem(titanium_plate);
        registerItem(chromium_plate);
        registerItem(manganese_plate);
        registerItem(cobalt_plate);
        registerItem(nickel_plate);
        registerItem(zinc_plate);
        registerItem(silver_plate);
        registerItem(tungsten_plate);
        registerItem(platinum_plate);
        registerItem(lead_plate);

        //Dusts
        registerItem(iron_dust);
        registerItem(gold_dust);
        registerItem(copper_dust);
        registerItem(tin_dust);
        registerItem(bronze_dust);
        registerItem(steel_dust);
        registerItem(lithium_dust);
        registerItem(beryllium_dust);
        registerItem(boron_dust);
        registerItem(carbon_dust);
        registerItem(sodium_dust);
        registerItem(magnesium_dust);
        registerItem(aluminum_dust);
        registerItem(silicon_dust);
        registerItem(phosphorus_dust);
        registerItem(sulfur_dust);
        registerItem(potassium_dust);
        registerItem(calcium_dust);
        registerItem(titanium_dust);
        registerItem(chromium_dust);
        registerItem(manganese_dust);
        registerItem(cobalt_dust);
        registerItem(nickel_dust);
        registerItem(zinc_dust);
        registerItem(silver_dust);
        registerItem(tungsten_dust);
        registerItem(platinum_dust);
        registerItem(lead_dust);

        //Rods
        registerItem(iron_rod);
        registerItem(gold_rod);
        registerItem(copper_rod);
        registerItem(tin_rod);
        registerItem(bronze_rod);
        registerItem(steel_rod);
        registerItem(lithium_rod);
        registerItem(beryllium_rod);
        registerItem(boron_rod);
        registerItem(carbon_rod);
        registerItem(sodium_rod);
        registerItem(magnesium_rod);
        registerItem(aluminum_rod);
        registerItem(silicon_rod);
        registerItem(phosphorus_rod);
        registerItem(sulfur_rod);
        registerItem(potassium_rod);
        registerItem(calcium_rod);
        registerItem(titanium_rod);
        registerItem(chromium_rod);
        registerItem(manganese_rod);
        registerItem(cobalt_rod);
        registerItem(nickel_rod);
        registerItem(zinc_rod);
        registerItem(silver_rod);
        registerItem(tungsten_rod);
        registerItem(platinum_rod);
        registerItem(lead_rod);

        //Long Rods
        registerItem(iron_rodlong);
        registerItem(gold_rodlong);
        registerItem(copper_rodlong);
        registerItem(tin_rodlong);
        registerItem(bronze_rodlong);
        registerItem(steel_rodlong);
        registerItem(lithium_rodlong);
        registerItem(beryllium_rodlong);
        registerItem(boron_rodlong);
        registerItem(carbon_rodlong);
        registerItem(sodium_rodlong);
        registerItem(magnesium_rodlong);
        registerItem(aluminum_rodlong);
        registerItem(silicon_rodlong);
        registerItem(phosphorus_rodlong);
        registerItem(sulfur_rodlong);
        registerItem(potassium_rodlong);
        registerItem(calcium_rodlong);
        registerItem(titanium_rodlong);
        registerItem(chromium_rodlong);
        registerItem(manganese_rodlong);
        registerItem(cobalt_rodlong);
        registerItem(nickel_rodlong);
        registerItem(zinc_rodlong);
        registerItem(silver_rodlong);
        registerItem(tungsten_rodlong);
        registerItem(platinum_rodlong);
        registerItem(lead_rodlong);

        //Gears
        registerItem(iron_gear);
        registerItem(gold_gear);
        registerItem(copper_gear);
        registerItem(tin_gear);
        registerItem(bronze_gear);
        registerItem(steel_gear);
        registerItem(lithium_gear);
        registerItem(beryllium_gear);
        registerItem(boron_gear);
        registerItem(carbon_gear);
        registerItem(sodium_gear);
        registerItem(magnesium_gear);
        registerItem(aluminum_gear);
        registerItem(silicon_gear);
        registerItem(phosphorus_gear);
        registerItem(sulfur_gear);
        registerItem(potassium_gear);
        registerItem(calcium_gear);
        registerItem(titanium_gear);
        registerItem(chromium_gear);
        registerItem(manganese_gear);
        registerItem(cobalt_gear);
        registerItem(nickel_gear);
        registerItem(zinc_gear);
        registerItem(silver_gear);
        registerItem(tungsten_gear);
        registerItem(platinum_gear);
        registerItem(lead_gear);

        //Rings
        registerItem(iron_ring);
        registerItem(gold_ring);
        registerItem(copper_ring);
        registerItem(tin_ring);
        registerItem(bronze_ring);
        registerItem(steel_ring);
        registerItem(lithium_ring);
        registerItem(beryllium_ring);
        registerItem(boron_ring);
        registerItem(carbon_ring);
        registerItem(sodium_ring);
        registerItem(magnesium_ring);
        registerItem(aluminum_ring);
        registerItem(silicon_ring);
        registerItem(phosphorus_ring);
        registerItem(sulfur_ring);
        registerItem(potassium_ring);
        registerItem(calcium_ring);
        registerItem(titanium_ring);
        registerItem(chromium_ring);
        registerItem(manganese_ring);
        registerItem(cobalt_ring);
        registerItem(nickel_ring);
        registerItem(zinc_ring);
        registerItem(silver_ring);
        registerItem(tungsten_ring);
        registerItem(platinum_ring);
        registerItem(lead_ring);

        //Mixtures
        registerItem(bronze_mixture);
        registerItem(steel_mixture);

        //Tools
        registerItem(copper_pickaxe);
        registerItem(copper_hoe);
        registerItem(copper_axe);
        registerItem(copper_shovel);
        registerItem(copper_sword);
        registerItem(bronze_pickaxe);
        registerItem(bronze_hoe);
        registerItem(bronze_axe);
        registerItem(bronze_shovel);
        registerItem(bronze_sword);
        registerItem(steel_pickaxe);
        registerItem(steel_hoe);
        registerItem(steel_axe);
        registerItem(steel_shovel);
        registerItem(steel_sword);

        //Foods
        registerItem(copper_apple);

        //Fuels
        registerItem(peat);
        registerItem(lignite_coal);
        registerItem(anthracite_coal);

        //Tin Cans
        registerItem(empty_tin_can);
        registerItem(water_tin_can);
        registerItem(lava_tin_can);
        registerItem(oil_tin_can);

        LogHelper.info("Registered Mod Items! (3/7)");
    }

    public static void registerRenders() {
        //Crafting Tools
        registerRender(stone_hammer);
        registerRender(copper_hammer);
        registerRender(bronze_hammer);
        registerRender(iron_hammer);
        registerRender(steel_hammer);
        registerRender(copper_wrench);
        registerRender(bronze_wrench);
        registerRender(iron_wrench);
        registerRender(steel_wrench);
        registerRender(copper_file);
        registerRender(bronze_file);
        registerRender(iron_file);
        registerRender(steel_file);

        //Rocks
        registerRender(rock);
        registerRender(granite_rock);
        registerRender(diorite_rock);
        registerRender(andesite_rock);
        registerRender(sandstone_rock);
        registerRender(prismarine_rock);
        registerRender(nether_rock);
        registerRender(end_rock);

        //Ingots
        registerRender(copper_ingot);
        registerRender(tin_ingot);
        registerRender(bronze_ingot);
        registerRender(steel_ingot);
        registerRender(lithium_ingot);
        registerRender(beryllium_ingot);
        registerRender(boron_ingot);
        registerRender(carbon_ingot);
        registerRender(sodium_ingot);
        registerRender(magnesium_ingot);
        registerRender(aluminum_ingot);
        registerRender(silicon_ingot);
        registerRender(phosphorus_ingot);
        registerRender(sulfur_ingot);
        registerRender(potassium_ingot);
        registerRender(calcium_ingot);
        registerRender(titanium_ingot);
        registerRender(chromium_ingot);
        registerRender(manganese_ingot);
        registerRender(cobalt_ingot);
        registerRender(nickel_ingot);
        registerRender(zinc_ingot);
        registerRender(silver_ingot);
        registerRender(tungsten_ingot);
        registerRender(platinum_ingot);
        registerRender(lead_ingot);

        //Plates
        registerRender(iron_plate);
        registerRender(gold_plate);
        registerRender(copper_plate);
        registerRender(tin_plate);
        registerRender(bronze_plate);
        registerRender(steel_plate);
        registerRender(lithium_plate);
        registerRender(beryllium_plate);
        registerRender(boron_plate);
        registerRender(carbon_plate);
        registerRender(sodium_plate);
        registerRender(magnesium_plate);
        registerRender(aluminum_plate);
        registerRender(silicon_plate);
        registerRender(phosphorus_plate);
        registerRender(sulfur_plate);
        registerRender(potassium_plate);
        registerRender(calcium_plate);
        registerRender(titanium_plate);
        registerRender(chromium_plate);
        registerRender(manganese_plate);
        registerRender(cobalt_plate);
        registerRender(nickel_plate);
        registerRender(zinc_plate);
        registerRender(silver_plate);
        registerRender(tungsten_plate);
        registerRender(platinum_plate);
        registerRender(lead_plate);

        //Dusts
        registerRender(iron_dust);
        registerRender(gold_dust);
        registerRender(copper_dust);
        registerRender(tin_dust);
        registerRender(bronze_dust);
        registerRender(steel_dust);
        registerRender(lithium_dust);
        registerRender(beryllium_dust);
        registerRender(boron_dust);
        registerRender(carbon_dust);
        registerRender(sodium_dust);
        registerRender(magnesium_dust);
        registerRender(aluminum_dust);
        registerRender(silicon_dust);
        registerRender(phosphorus_dust);
        registerRender(sulfur_dust);
        registerRender(potassium_dust);
        registerRender(calcium_dust);
        registerRender(titanium_dust);
        registerRender(chromium_dust);
        registerRender(manganese_dust);
        registerRender(cobalt_dust);
        registerRender(nickel_dust);
        registerRender(zinc_dust);
        registerRender(silver_dust);
        registerRender(tungsten_dust);
        registerRender(platinum_dust);
        registerRender(lead_dust);

        //Rods
        registerRender(iron_rod);
        registerRender(gold_rod);
        registerRender(copper_rod);
        registerRender(tin_rod);
        registerRender(bronze_rod);
        registerRender(steel_rod);
        registerRender(lithium_rod);
        registerRender(beryllium_rod);
        registerRender(boron_rod);
        registerRender(carbon_rod);
        registerRender(sodium_rod);
        registerRender(magnesium_rod);
        registerRender(aluminum_rod);
        registerRender(silicon_rod);
        registerRender(phosphorus_rod);
        registerRender(sulfur_rod);
        registerRender(potassium_rod);
        registerRender(calcium_rod);
        registerRender(titanium_rod);
        registerRender(chromium_rod);
        registerRender(manganese_rod);
        registerRender(cobalt_rod);
        registerRender(nickel_rod);
        registerRender(zinc_rod);
        registerRender(silver_rod);
        registerRender(tungsten_rod);
        registerRender(platinum_rod);
        registerRender(lead_rod);

        //Long Rods
        registerRender(iron_rodlong);
        registerRender(gold_rodlong);
        registerRender(copper_rodlong);
        registerRender(tin_rodlong);
        registerRender(bronze_rodlong);
        registerRender(steel_rodlong);
        registerRender(lithium_rodlong);
        registerRender(beryllium_rodlong);
        registerRender(boron_rodlong);
        registerRender(carbon_rodlong);
        registerRender(sodium_rodlong);
        registerRender(magnesium_rodlong);
        registerRender(aluminum_rodlong);
        registerRender(silicon_rodlong);
        registerRender(phosphorus_rodlong);
        registerRender(sulfur_rodlong);
        registerRender(potassium_rodlong);
        registerRender(calcium_rodlong);
        registerRender(titanium_rodlong);
        registerRender(chromium_rodlong);
        registerRender(manganese_rodlong);
        registerRender(cobalt_rodlong);
        registerRender(nickel_rodlong);
        registerRender(zinc_rodlong);
        registerRender(silver_rodlong);
        registerRender(tungsten_rodlong);
        registerRender(platinum_rodlong);
        registerRender(lead_rodlong);

        //Gears
        registerRender(iron_gear);
        registerRender(gold_gear);
        registerRender(copper_gear);
        registerRender(tin_gear);
        registerRender(bronze_gear);
        registerRender(steel_gear);
        registerRender(lithium_gear);
        registerRender(beryllium_gear);
        registerRender(boron_gear);
        registerRender(carbon_gear);
        registerRender(sodium_gear);
        registerRender(magnesium_gear);
        registerRender(aluminum_gear);
        registerRender(silicon_gear);
        registerRender(phosphorus_gear);
        registerRender(sulfur_gear);
        registerRender(potassium_gear);
        registerRender(calcium_gear);
        registerRender(titanium_gear);
        registerRender(chromium_gear);
        registerRender(manganese_gear);
        registerRender(cobalt_gear);
        registerRender(nickel_gear);
        registerRender(zinc_gear);
        registerRender(silver_gear);
        registerRender(tungsten_gear);
        registerRender(platinum_gear);
        registerRender(lead_gear);

        //Rings
        registerRender(iron_ring);
        registerRender(gold_ring);
        registerRender(copper_ring);
        registerRender(tin_ring);
        registerRender(bronze_ring);
        registerRender(steel_ring);
        registerRender(lithium_ring);
        registerRender(beryllium_ring);
        registerRender(boron_ring);
        registerRender(carbon_ring);
        registerRender(sodium_ring);
        registerRender(magnesium_ring);
        registerRender(aluminum_ring);
        registerRender(silicon_ring);
        registerRender(phosphorus_ring);
        registerRender(sulfur_ring);
        registerRender(potassium_ring);
        registerRender(calcium_ring);
        registerRender(titanium_ring);
        registerRender(chromium_ring);
        registerRender(manganese_ring);
        registerRender(cobalt_ring);
        registerRender(nickel_ring);
        registerRender(zinc_ring);
        registerRender(silver_ring);
        registerRender(tungsten_ring);
        registerRender(platinum_ring);
        registerRender(lead_ring);

        //Mixtures
        registerRender(bronze_mixture);
        registerRender(steel_mixture);

        //Tools
        registerRender(copper_pickaxe);
        registerRender(copper_hoe);
        registerRender(copper_axe);
        registerRender(copper_shovel);
        registerRender(copper_sword);
        registerRender(bronze_pickaxe);
        registerRender(bronze_hoe);
        registerRender(bronze_axe);
        registerRender(bronze_shovel);
        registerRender(bronze_sword);
        registerRender(steel_pickaxe);
        registerRender(steel_hoe);
        registerRender(steel_axe);
        registerRender(steel_shovel);
        registerRender(steel_sword);

        //Foods
        registerRender(copper_apple);

        //Fuels
        registerRender(peat);
        registerRender(lignite_coal);
        registerRender(anthracite_coal);

        //Tin Cans
        registerRender(empty_tin_can);
        registerRender(water_tin_can);
        registerRender(lava_tin_can);
        registerRender(oil_tin_can);
    }

    public static void registerItem(Item item) {
        GameRegistry.registerItem(item, item.getUnlocalizedName().substring(5));
        LogHelper.debug("Registered Item: " + item.getUnlocalizedName().substring(5));
    }

    public static void registerRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
        LogHelper.debug("Registered Render: " + item.getUnlocalizedName().substring(5));
    }

}
