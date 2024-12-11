package kr.kro.wonmyee.handlers;

import kr.kro.wonmyee.init.ModBlocks;
import kr.kro.wonmyee.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class RecipeHandler {

    public static void registerCraftingRecipes() {
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.stone_hammer), new Object[]{"RRR","RRR"," S ",'R',"rock",'S',Items.stick}));
        registerCraftingToolRecipe(ModItems.copper_ingot, ModItems.copper_plate, ModItems.copper_hammer, ModItems.copper_wrench, ModItems.copper_file);
        registerCraftingToolRecipe(ModItems.bronze_ingot, ModItems.bronze_plate, ModItems.bronze_hammer, ModItems.bronze_wrench, ModItems.bronze_file);
        registerCraftingToolRecipe(Items.iron_ingot, ModItems.iron_plate, ModItems.iron_hammer, ModItems.iron_wrench, ModItems.iron_file);
        registerCraftingToolRecipe(ModItems.steel_ingot, ModItems.steel_plate, ModItems.steel_hammer, ModItems.steel_wrench, ModItems.steel_file);

        registerRockRecipe(ModItems.rock, new ItemStack(Blocks.stone, 1, 0), Blocks.cobblestone);
        registerRockRecipe(ModItems.granite_rock, new ItemStack(Blocks.stone, 1, 1), ModBlocks.granite_cobblestone);
        registerRockRecipe(ModItems.diorite_rock, new ItemStack(Blocks.stone, 1, 3), ModBlocks.diorite_cobblestone);
        registerRockRecipe(ModItems.andesite_rock, new ItemStack(Blocks.stone, 1, 5), ModBlocks.andesite_cobblestone);
        registerRockRecipe(ModItems.sandstone_rock, new ItemStack(Blocks.sandstone), ModBlocks.sandstone_cobblestone);
        registerRockRecipe(ModItems.prismarine_rock, new ItemStack(Blocks.prismarine), ModBlocks.prismarine_cobblestone);
        registerRockRecipe(ModItems.nether_rock, new ItemStack(Blocks.netherrack), ModBlocks.nether_cobblestone);
        registerRockRecipe(ModItems.end_rock, new ItemStack(Blocks.end_stone), ModBlocks.end_cobblestone);

        GameRegistry.addRecipe(new ItemStack(ModItems.bronze_mixture, 4), new Object[]{"CC","CT",'C',ModItems.copper_dust,'T',ModItems.tin_dust});
        GameRegistry.addRecipe(new ItemStack(ModItems.steel_mixture, 4), new Object[]{"III","ICI","III",'I',ModItems.iron_dust,'C',Items.coal});

        registerMaterialRecipe("Iron", Items.iron_ingot, Blocks.iron_block, ModItems.iron_plate, ModItems.iron_dust, ModItems.iron_rod, ModItems.iron_rodlong, ModItems.iron_gear, ModItems.iron_ring);
        registerMaterialRecipe("Gold", Items.gold_ingot, Blocks.gold_block, ModItems.gold_plate, ModItems.gold_dust, ModItems.gold_rod, ModItems.gold_rodlong, ModItems.gold_gear, ModItems.gold_ring);
        registerMaterialRecipe("Copper", ModItems.copper_ingot, ModBlocks.copper_block, ModItems.copper_plate, ModItems.copper_dust, ModItems.copper_rod, ModItems.copper_rodlong, ModItems.copper_gear, ModItems.copper_ring);
        registerMaterialRecipe("Tin", ModItems.tin_ingot, ModBlocks.tin_block, ModItems.tin_plate, ModItems.tin_dust, ModItems.tin_rod, ModItems.tin_rodlong, ModItems.tin_gear, ModItems.tin_ring);
        registerMaterialRecipe("Bronze", ModItems.bronze_ingot, ModBlocks.bronze_block, ModItems.bronze_plate, ModItems.bronze_dust, ModItems.bronze_rod, ModItems.bronze_rodlong, ModItems.bronze_gear, ModItems.bronze_ring);
        registerMaterialRecipe("Steel", ModItems.steel_ingot, ModBlocks.steel_block, ModItems.steel_plate, ModItems.steel_dust, ModItems.steel_rod, ModItems.steel_rodlong, ModItems.steel_gear, ModItems.steel_ring);

        registerToolRecipe(ModItems.copper_pickaxe, ModItems.copper_hoe, ModItems.copper_axe, ModItems.copper_shovel, ModItems.copper_sword, ModItems.copper_ingot);
        registerToolRecipe(ModItems.bronze_pickaxe, ModItems.bronze_hoe, ModItems.bronze_axe, ModItems.bronze_shovel, ModItems.bronze_sword, ModItems.bronze_ingot);
        registerToolRecipe(ModItems.steel_pickaxe, ModItems.steel_hoe, ModItems.steel_axe, ModItems.steel_shovel, ModItems.steel_sword, ModItems.steel_ingot);

        GameRegistry.addRecipe(new ItemStack(ModItems.copper_apple), new Object[]{"III","IAI","III",'I',ModItems.copper_ingot,'A',Items.apple});

        registerMachineRecipe();
        System.out.println("Registered Crafting Recipes!");
    }

    public static void registerFurnaceRecipes() {
        registerOreRecipe("Copper", ModBlocks.copper_ore, ModBlocks.nether_copper_ore, ModBlocks.end_copper_ore, ModItems.copper_ingot);
        registerOreRecipe("Tin", ModBlocks.tin_ore, ModBlocks.nether_tin_ore, ModBlocks.end_tin_ore, ModItems.tin_ingot);
        GameRegistry.addSmelting(ModItems.bronze_mixture, new ItemStack(ModItems.bronze_ingot), 0);
        GameRegistry.addSmelting(ModItems.steel_mixture, new ItemStack(ModItems.steel_ingot), 0);
        System.out.println("Registered Furnace Recipes!");
    }

    public static void registerCraftingToolRecipe(Item ingot, Item plate, Item hammer, Item wrench, Item file) {
        OreDictionary.registerOre("hammer", new ItemStack(hammer, 1, OreDictionary.WILDCARD_VALUE));
        OreDictionary.registerOre("wrench", new ItemStack(wrench, 1, OreDictionary.WILDCARD_VALUE));
        OreDictionary.registerOre("file", new ItemStack(file, 1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addRecipe(new ItemStack(hammer), new Object[]{"III","III"," S ",'I',ingot,'S',Items.stick});
        GameRegistry.addRecipe(new ItemStack(wrench), new Object[]{"I I","III"," I ",'I',ingot});
        GameRegistry.addRecipe(new ItemStack(file), new Object[]{"P  ","S  ","S  ",'P',plate,'S',Items.stick});
        GameRegistry.addRecipe(new ItemStack(file), new Object[]{" P "," S "," S ",'P',plate,'S',Items.stick});
        GameRegistry.addRecipe(new ItemStack(file), new Object[]{"  P","  S","  S",'P',plate,'S',Items.stick});

    }

    public static void registerRockRecipe(Item rock, ItemStack stone, Block cobblestone) {
        OreDictionary.registerOre("rock", rock);
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(rock, 4), new Object[]{"hammer",stone}));
        GameRegistry.addShapelessRecipe(new ItemStack(rock, 4), new Object[]{cobblestone});
        GameRegistry.addRecipe(new ItemStack(cobblestone), new Object[]{"RR","RR",'R',rock});
    }

    public static void registerMaterialRecipe(String materialName, Item ingot, Block storageBlock, Item plate, Item dust, Item rod, Item rodLong, Item gear, Item ring) {
        OreDictionary.registerOre("ingot"+materialName, ingot);
        OreDictionary.registerOre("block"+materialName, storageBlock);
        OreDictionary.registerOre("plate"+materialName, plate);
        OreDictionary.registerOre("dust"+materialName, dust);
        OreDictionary.registerOre("stick"+materialName, rod);
        OreDictionary.registerOre("stickLong"+materialName, rodLong);
        OreDictionary.registerOre("gear"+materialName, gear);
        //Generifying
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ingot), new Object[]{"ingot"+materialName}));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(storageBlock), new Object[]{"block"+materialName}));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(plate), new Object[]{"plate"+materialName}));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(dust), new Object[]{"dust"+materialName}));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(rod), new Object[]{"rod"+materialName}));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(rodLong), new Object[]{"rodLong"+materialName}));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(gear), new Object[]{"gear"+materialName}));

        GameRegistry.addRecipe(new ItemStack(storageBlock), new Object[]{"III", "III", "III", 'I', ingot});
        GameRegistry.addShapelessRecipe(new ItemStack(ingot, 9, 0), new Object[]{Item.getItemFromBlock(storageBlock)});
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(plate), new Object[]{" H "," I "," I ",'H',"hammer",'I',ingot}));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(dust), new Object[]{"hammer",ingot}));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(rod), new Object[]{"file",ingot}));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(rodLong), new Object[]{" H "," R "," R ",'H',"hammer",'R',rod}));
        GameRegistry.addRecipe(new ItemStack(gear), new Object[]{"RLR","LCL","RLR",'R',rod,'L',rodLong,'C',ring});
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ring), new Object[]{"hammer",rod}));

        GameRegistry.addSmelting(dust, new ItemStack(ingot), 0);
    }

    public static void registerToolRecipe(Item pickaxe, Item hoe, Item axe, Item shovel, Item sword, Item ingot) {
        GameRegistry.addRecipe(new ItemStack(pickaxe), new Object[]{"III"," S "," S ",'I',ingot,'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(axe), new Object[]{" II"," SI"," S ",'I',ingot,'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(axe), new Object[]{"II ","IS "," S ",'I',ingot,'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(hoe), new Object[]{" II"," S "," S ",'I',ingot,'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(hoe), new Object[]{"II "," S "," S ",'I',ingot,'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(shovel), new Object[]{"I  ","S  ","S  ",'I',ingot,'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(shovel), new Object[]{" I "," S "," S ",'I',ingot,'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(shovel), new Object[]{"  I","  S","  S",'I',ingot,'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(sword), new Object[]{"I  ","I  ","S  ",'I',ingot,'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(sword), new Object[]{" I "," I "," S ",'I',ingot,'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(sword), new Object[]{"  I","  I","  S",'I',ingot,'S', Items.stick});
    }

    public static void registerOreRecipe(String materialName, Block oreStone, Block oreNether, Block oreEnd, Item ingot) {
        OreDictionary.registerOre("ore"+materialName, oreStone);
        OreDictionary.registerOre("ore"+materialName, oreNether);
        OreDictionary.registerOre("ore"+materialName, oreEnd);
        GameRegistry.addSmelting(oreStone, new ItemStack(ingot), 0.7F);
        GameRegistry.addSmelting(oreNether, new ItemStack(ingot), 0.7F);
        GameRegistry.addSmelting(oreEnd, new ItemStack(ingot), 0.7F);
    }

    public static void registerMachineRecipe() {
        registerMachineCasingRecipe(ModBlocks.bronze_casing, ModItems.bronze_plate, ModItems.bronze_rodlong);
        registerMachineCasingRecipe(ModBlocks.iron_casing, ModItems.iron_plate, ModItems.iron_rodlong);
        registerMachineCasingRecipe(ModBlocks.steel_casing, ModItems.steel_plate, ModItems.steel_rodlong);

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.ceramic_crucible), new Object[]{"CHC","CFC","CCC",'C',Blocks.hardened_clay,'H',"hammer",'F',"file"}));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.JMT0_steelmaker), new Object[]{"B B","BCB","BPB",'B',Blocks.brick_block,'C',ModBlocks.ceramic_crucible,'P',ModItems.copper_plate});
    }

    public static void registerMachineCasingRecipe(Block machineCasing, Item plate, Item rodLong) {
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(machineCasing), new Object[]{"LPP","PWP","PPL",'L',rodLong,'P',plate,'W',"wrench"}));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(machineCasing), new Object[]{"PPL","PWP","LPP",'L',rodLong,'P',plate,'W',"wrench"}));
    }

}
