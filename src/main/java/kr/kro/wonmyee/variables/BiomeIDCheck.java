package kr.kro.wonmyee.variables;

import net.minecraft.world.biome.BiomeGenBase;

public class BiomeIDCheck {

    public static int getNextFreeBiomeId()
    {
        int nextBiomeId = 2;
        for (int i = nextBiomeId; i < 256; i++)
        {
            if (BiomeGenBase.getBiomeGenArray()[i] != null) {
                if (i == 255) throw new IllegalArgumentException("There are no more biome ids avaliable!");
                continue;
            } else {
                nextBiomeId = i + 1;
                return i;
            }
        }

        return -1;
    }

}
