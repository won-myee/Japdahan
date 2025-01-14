package kr.kro.wonmyee;

import kr.kro.wonmyee.commands.CommandDebugMode;
import kr.kro.wonmyee.creativetabs.TabJapdahanBlocks;
import kr.kro.wonmyee.creativetabs.TabJapdahanItems;
import kr.kro.wonmyee.debug.LogHelper;
import kr.kro.wonmyee.handlers.FuelHandler;
import kr.kro.wonmyee.handlers.RecipeHandler;
import kr.kro.wonmyee.init.ModBlocks;
import kr.kro.wonmyee.init.ModFluids;
import kr.kro.wonmyee.init.ModItems;
import kr.kro.wonmyee.items.OreDict;
import kr.kro.wonmyee.proxy.CommonProxy;
import kr.kro.wonmyee.worldgen.ModBiomes;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.apache.logging.log4j.Logger;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Japdahan {

    @SidedProxy(serverSide = Reference.SERVER_PROXY_CLASS, clientSide = Reference.CLIENT_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.Instance("japdahan")
    public static Japdahan instance;

    public static CreativeTabs items = new TabJapdahanItems("tabJapdahanItems");
    public static CreativeTabs blocks = new TabJapdahanBlocks("tabJapdahanBlocks");

    public static Logger logger;

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        LogHelper.info("Japdahan version " + Reference.VERSION + " for Minecraft " + MinecraftForge.MC_VERSION);
        LogHelper.info("Japdahan Pre-Initialization started!");
        proxy.registerTileEntities();
        ModItems.init();
        ModItems.register();
        ModBlocks.init();
        ModBlocks.register();
        ModFluids.register();
        ClientCommandHandler.instance.registerCommand(new CommandDebugMode());
        LogHelper.info("Registered Commands! (7/7)");
        LogHelper.info("Japdahan Pre-Initialization ended!");
    }

    @Mod.EventHandler
    public static void init(FMLInitializationEvent event) {
        LogHelper.info("Japdahan Initialization started!");
        proxy.registerRenders();
        proxy.registerWorldGenerators();
        RecipeHandler.registerCraftingRecipes();
        RecipeHandler.registerFurnaceRecipes();
        GameRegistry.registerFuelHandler(new FuelHandler());
        LogHelper.info("Registered Fuel Handler! (5/7)");
        OreDict.register();
        ModBiomes.register();
        LogHelper.info("Japdahan Initialization ended!");
    }

    @Mod.EventHandler
    public static void postInit(FMLPostInitializationEvent event) {
        LogHelper.info("Japdahan Post-Initialization started!");
        LogHelper.info("Nothing to do (0/0)");
        LogHelper.info("Japdahan Post-Initialization ended!");
    }

}
