package kr.kro.wonmyee.fluids;

import net.minecraft.client.resources.I18n;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;

public class FluidOil extends Fluid {

    public FluidOil() {
        super("oil", new ResourceLocation("japdahan:blocks/oil_still"), new ResourceLocation("japdahan:blocks/oil_flowing"));
    }

    @Override
    public ResourceLocation getFlowing() {
        return new ResourceLocation("japdahan:blocks/oil_flowing");
    }

    @Override
    public ResourceLocation getStill() {
        return new ResourceLocation("japdahan:blocks/oil_still");
    }

    @Override
    public String getLocalizedName(FluidStack stack) {
        return I18n.format("fluid.oil.name");
    }
}
