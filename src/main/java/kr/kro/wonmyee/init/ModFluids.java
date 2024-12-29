package kr.kro.wonmyee.init;

import kr.kro.wonmyee.blocks.BlockOil;
import kr.kro.wonmyee.debug.LogHelper;
import kr.kro.wonmyee.fluids.FluidOil;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModFluids {

    // Fluid and Block Instances
    public static final FluidOil OIL_FLUID = new FluidOil();

    public static void register() {
        FluidRegistry.registerFluid(OIL_FLUID);

        final BlockOil OIL_BLOCK = new BlockOil();
        GameRegistry.registerBlock(OIL_BLOCK, "oil");

        LogHelper.info("Registered Mod Fluids! (6/7)");
    }
}
