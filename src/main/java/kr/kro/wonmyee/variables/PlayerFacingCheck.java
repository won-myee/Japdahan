package kr.kro.wonmyee.variables;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;

public class PlayerFacingCheck {

    public static EnumFacing getFullPlayerFacing(EntityLivingBase playerIn) {
        float pitch = playerIn.rotationPitch;

        // Check if the player is looking up or down
        if (pitch < -45) {
            return EnumFacing.UP; // Looking up
        } else if (pitch > 45) {
            return EnumFacing.DOWN; // Looking down
        }

        // Otherwise, use horizontal facing
        return playerIn.getHorizontalFacing();
    }
}
