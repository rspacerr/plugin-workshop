package org.rcos.rcosPlugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jspecify.annotations.NonNull;

public class start implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NonNull @NotNull String[] strings) {
        for (Player p : Bukkit.getOnlinePlayers()) {
            ItemStack shovel = new ItemStack(Material.GOLDEN_SHOVEL);
            shovel.addEnchantment(Enchantment.EFFICIENCY, 2);
            p.getInventory().addItem(shovel);
            p.setGameMode(GameMode.SURVIVAL);
        }
        return false;
    }
}
