package me.earth.headlessmc.mc.commands;

import me.earth.headlessmc.api.HeadlessMc;
import me.earth.headlessmc.api.command.CommandException;
import me.earth.headlessmc.mc.Minecraft;
import me.earth.headlessmc.mc.player.Player;

public class Disconnect extends AbstractMinecraftCommand
    implements ScheduledCommand {
    public Disconnect(HeadlessMc ctx, Minecraft mc) {
        super(ctx, mc, "disconnect", "Disconnect from the server");
    }

    @Override
    public void execute(String... args) throws CommandException {
        if (args.length != 0) {
            throw new CommandException("This command does not accept any arguments.");
        }
        Player player = mc.getPlayer();
        if (player == null) {
            ctx.log("You need to be in a server to disconnect!");
        } else {
            ctx.log("joined");
        }
    }

}
