package kr.kro.wonmyee;

import kr.kro.wonmyee.commands.CommandRegisterMachine;
import kr.kro.wonmyee.creativetabs.TabJapdahanBlocks;
import kr.kro.wonmyee.creativetabs.TabJapdahanItems;
import kr.kro.wonmyee.handlers.RecipeHandler;
import kr.kro.wonmyee.init.ModBlocks;
import kr.kro.wonmyee.init.ModItems;
import kr.kro.wonmyee.items.OreDict;
import kr.kro.wonmyee.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Japdahan {

    @SidedProxy(serverSide = Reference.SERVER_PROXY_CLASS, clientSide = Reference.CLIENT_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.Instance("japdahan")
    public static Japdahan instance;

    public static CreativeTabs items = new TabJapdahanItems("tabJapdahanItems");
    public static CreativeTabs blocks = new TabJapdahanBlocks("tabJapdahanBlocks");

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent event) {
        System.out.println("Japdahan pre-Init");
        proxy.registerTileEntities();
        ModItems.init();
        ModItems.register();
        ModBlocks.init();
        ModBlocks.register();
        ClientCommandHandler.instance.registerCommand(new CommandRegisterMachine());
    }

    @Mod.EventHandler
    public static void init(FMLInitializationEvent event) {
        System.out.println("Japdahan Init");
        proxy.registerRenders();
        proxy.registerWorldGenerators();
        RecipeHandler.registerCraftingRecipes();
        RecipeHandler.registerFurnaceRecipes();
        OreDict.register();
    }

    @Mod.EventHandler
    public static void postInit(FMLPostInitializationEvent event) {
        System.out.println("Japdahan post-Init");
    }

}
