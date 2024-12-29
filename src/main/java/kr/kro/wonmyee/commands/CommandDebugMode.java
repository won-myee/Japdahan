package kr.kro.wonmyee.commands;

import kr.kro.wonmyee.debug.DebugMode;
import kr.kro.wonmyee.debug.LogHelper;
import kr.kro.wonmyee.variables.CheatCheck;
import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;

public class CommandDebugMode extends CommandBase {

    @Override
    public String getCommandName() {
        return "debugmode";
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return "Toggles debug mode";
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args) throws CommandException {
        DebugMode.debug();
        if(DebugMode.isDebugMode) {
            LogHelper.warn("Debug Mode Enabled");
            Minecraft.getMinecraft().thePlayer.sendChatMessage("/tellraw @p {\"text\":\"Debug Mode Enabled!\",\"color\":\"blue\"}");
        } else {
            LogHelper.warn("Debug Mode Disabled");
            Minecraft.getMinecraft().thePlayer.sendChatMessage("/tellraw @p {\"text\":\"Debug Mode Disabled!\",\"color\":\"red\"}");
        }
    }

    @Override
    public boolean canCommandSenderUseCommand(ICommandSender sender) {
        return true;
    }
}
