package org.rcos.rcosPlugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jspecify.annotations.NonNull;

public class ping implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NonNull @NotNull String[] strings) {
        if (!(commandSender instanceof Player)) return false;

        Player p = (Player) commandSender;
        p.sendMessage("Your ping is: " + p.getPing());
        return true;
    }
}
