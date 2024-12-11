package kr.kro.wonmyee.commands;

import kr.kro.wonmyee.blocks.BlockJMT0Steelmaker;
import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.BlockPos;

public class CommandRegisterMachine extends CommandBase {

    @Override
    public String getCommandName() {
        return "registermachine";
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return "Registers Japdahan Machines: /registermachine <machine position (x, y, z)> <machine type>";
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args) throws CommandException {

        BlockPos blockPos = new BlockPos(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]));
        if(args[3] == null ? "jmt0_steelmaker" == null : args[3].equals("jmt0_steelmaker")) {
            BlockJMT0Steelmaker.addBlockPos(sender.getEntityWorld(), blockPos);
        }
        Minecraft.getMinecraft().thePlayer.sendChatMessage("Registered Block at " + args[0] + ", " + args[1] + ", " + args[2] + "as " + args[3]);

    }

    @Override
    public boolean canCommandSenderUseCommand(ICommandSender sender) {
        return true;
    }
}
