package kr.kro.wonmyee.variables;

import net.minecraft.entity.player.EntityPlayer;

public class CheatCheck {
    public static boolean isCheatAllowed(EntityPlayer player) {
        return player.canCommandSenderUseCommand(2, "");
    }
}
