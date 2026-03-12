package org.rcos.rcosPlugin;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemStack;

public class Spleef implements Listener {
    @EventHandler
    public void onBlockBreak(BlockBreakEvent e) {
        if (e.getBlock().getType() == Material.SNOW_BLOCK) {
            e.getPlayer().getInventory().addItem(new ItemStack(Material.SNOWBALL, 1));
        }
    }

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent e) {
        if (e.getBlock().getType() == Material.SNOW_BLOCK)
            e.setCancelled(true);
    }
}
