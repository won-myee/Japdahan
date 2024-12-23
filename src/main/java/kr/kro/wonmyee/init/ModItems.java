package kr.kro.wonmyee.init;

import kr.kro.wonmyee.Reference;
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

    //Plates
    public static Item iron_plate;
    public static Item gold_plate;
    public static Item copper_plate;
    public static Item tin_plate;
    public static Item bronze_plate;
    public static Item steel_plate;

    //Dusts
    public static Item iron_dust;
    public static Item gold_dust;
    public static Item copper_dust;
    public static Item tin_dust;
    public static Item bronze_dust;
    public static Item steel_dust;

    //Rods
    public static Item iron_rod;
    public static Item gold_rod;
    public static Item copper_rod;
    public static Item tin_rod;
    public static Item bronze_rod;
    public static Item steel_rod;

    //Long Rods
    public static Item iron_rodlong;
    public static Item gold_rodlong;
    public static Item copper_rodlong;
    public static Item tin_rodlong;
    public static Item bronze_rodlong;
    public static Item steel_rodlong;

    //Gears
    public static Item iron_gear;
    public static Item gold_gear;
    public static Item copper_gear;
    public static Item tin_gear;
    public static Item bronze_gear;
    public static Item steel_gear;

    //Rings
    public static Item iron_ring;
    public static Item gold_ring;
    public static Item copper_ring;
    public static Item tin_ring;
    public static Item bronze_ring;
    public static Item steel_ring;

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
        copper_hammer = new ItemModHammer(copperMaterial, "copper_hammer", 64);
        bronze_hammer = new ItemModHammer(bronzeMaterial, "bronze_hammer", 96);
        iron_hammer = new ItemModHammer(Item.ToolMaterial.IRON, "iron_hammer", 128);
        steel_hammer = new ItemModHammer(steelMaterial, "steel_hammer", 192);
        copper_wrench = new ItemModWrench(copperMaterial, "copper_wrench", 64);
        bronze_wrench = new ItemModWrench(bronzeMaterial, "bronze_wrench", 96);
        iron_wrench = new ItemModWrench(Item.ToolMaterial.IRON, "iron_wrench", 128);
        steel_wrench = new ItemModWrench(steelMaterial, "steel_wrench", 192);
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

        //Plates
        iron_plate = new ItemMod("iron_plate");
        gold_plate = new ItemMod("gold_plate");
        copper_plate = new ItemMod("copper_plate");
        tin_plate = new ItemMod("tin_plate");
        bronze_plate = new ItemMod("bronze_plate");
        steel_plate = new ItemMod("steel_plate");

        //Dusts
        iron_dust = new ItemMod("iron_dust");
        gold_dust = new ItemMod("gold_dust");
        copper_dust = new ItemMod("copper_dust");
        tin_dust = new ItemMod("tin_dust");
        bronze_dust = new ItemMod("bronze_dust");
        steel_dust = new ItemMod("steel_dust");

        //Rods
        iron_rod = new ItemMod("iron_rod");
        gold_rod = new ItemMod("gold_rod");
        copper_rod = new ItemMod("copper_rod");
        tin_rod = new ItemMod("tin_rod");
        bronze_rod = new ItemMod("bronze_rod");
        steel_rod = new ItemMod("steel_rod");

        //Long Rods
        iron_rodlong = new ItemMod("iron_rodlong");
        gold_rodlong = new ItemMod("gold_rodlong");
        copper_rodlong = new ItemMod("copper_rodlong");
        tin_rodlong = new ItemMod("tin_rodlong");
        bronze_rodlong = new ItemMod("bronze_rodlong");
        steel_rodlong = new ItemMod("steel_rodlong");

        //Gears
        iron_gear = new ItemMod("iron_gear");
        gold_gear = new ItemMod("gold_gear");
        copper_gear = new ItemMod("copper_gear");
        tin_gear = new ItemMod("tin_gear");
        bronze_gear = new ItemMod("bronze_gear");
        steel_gear = new ItemMod("steel_gear");

        //Rings
        iron_ring = new ItemMod("iron_ring");
        gold_ring = new ItemMod("gold_ring");
        copper_ring = new ItemMod("copper_ring");
        tin_ring = new ItemMod("tin_ring");
        bronze_ring = new ItemMod("bronze_ring");
        steel_ring = new ItemMod("steel_ring");

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

        //Plates
        registerItem(iron_plate);
        registerItem(gold_plate);
        registerItem(copper_plate);
        registerItem(tin_plate);
        registerItem(bronze_plate);
        registerItem(steel_plate);

        //Dusts
        registerItem(iron_dust);
        registerItem(gold_dust);
        registerItem(copper_dust);
        registerItem(tin_dust);
        registerItem(bronze_dust);
        registerItem(steel_dust);

        //Rods
        registerItem(iron_rod);
        registerItem(gold_rod);
        registerItem(copper_rod);
        registerItem(tin_rod);
        registerItem(bronze_rod);
        registerItem(steel_rod);

        //Long Rods
        registerItem(iron_rodlong);
        registerItem(gold_rodlong);
        registerItem(copper_rodlong);
        registerItem(tin_rodlong);
        registerItem(bronze_rodlong);
        registerItem(steel_rodlong);

        //Gears
        registerItem(iron_gear);
        registerItem(gold_gear);
        registerItem(copper_gear);
        registerItem(tin_gear);
        registerItem(bronze_gear);
        registerItem(steel_gear);

        //Rings
        registerItem(iron_ring);
        registerItem(gold_ring);
        registerItem(copper_ring);
        registerItem(tin_ring);
        registerItem(bronze_ring);
        registerItem(steel_ring);

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

        //Plates
        registerRender(iron_plate);
        registerRender(gold_plate);
        registerRender(copper_plate);
        registerRender(tin_plate);
        registerRender(bronze_plate);
        registerRender(steel_plate);

        //Dusts
        registerRender(iron_dust);
        registerRender(gold_dust);
        registerRender(copper_dust);
        registerRender(tin_dust);
        registerRender(bronze_dust);
        registerRender(steel_dust);

        //Rods
        registerRender(iron_rod);
        registerRender(gold_rod);
        registerRender(copper_rod);
        registerRender(tin_rod);
        registerRender(bronze_rod);
        registerRender(steel_rod);

        //Long Rods
        registerRender(iron_rodlong);
        registerRender(gold_rodlong);
        registerRender(copper_rodlong);
        registerRender(tin_rodlong);
        registerRender(bronze_rodlong);
        registerRender(steel_rodlong);

        //Gears
        registerRender(iron_gear);
        registerRender(gold_gear);
        registerRender(copper_gear);
        registerRender(tin_gear);
        registerRender(bronze_gear);
        registerRender(steel_gear);

        //Rings
        registerRender(iron_ring);
        registerRender(gold_ring);
        registerRender(copper_ring);
        registerRender(tin_ring);
        registerRender(bronze_ring);
        registerRender(steel_ring);

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
        //System.out.println("Registered Item: " + item.getUnlocalizedName().substring(5));
    }

    public static void registerRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }

}
