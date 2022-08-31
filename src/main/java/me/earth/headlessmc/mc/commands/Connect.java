package me.earth.headlessmc.mc.commands;

import me.earth.headlessmc.api.HeadlessMc;
import me.earth.headlessmc.api.command.CommandException;
import me.earth.headlessmc.mc.Minecraft;
import me.earth.headlessmc.mc.player.Player;

public class Connect extends AbstractMinecraftCommand
    implements ScheduledCommand {
    public Connect(HeadlessMc ctx, Minecraft mc) {
        super(ctx, mc, "connect", "connects to a server.");
    }

    @Override
    public void execute(String... args) throws CommandException {
        if (args.length == 1) {
            ctx.log("address");
        }else if (args.length == 2) {
            ctx.log("address+port");
        }else {
            ctx.log("none of the above");
        }

        Player player = mc.getPlayer();
        if (player != null) {
            ctx.log("you need to disconnect from the current server first.");
        } else {
            ctx.log("joined");
        }
    }

}
