package org.rcos.rcosPlugin.listeners;

import org.bukkit.Material;
import org.bukkit.entity.Fireball;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class TestListener implements Listener {
    @EventHandler
    public void onInteract(PlayerInteractEvent e) {
        if (!(e.getAction().equals(Action.RIGHT_CLICK_BLOCK) || e.getAction().equals(Action.RIGHT_CLICK_AIR))) return;
        if (!e.getPlayer().getInventory().getItemInMainHand().getType().equals(Material.GOLDEN_SHOVEL)) return;

        Fireball f = e.getPlayer().getWorld().spawn(e.getPlayer().getEyeLocation(), Fireball.class);
        f.setShooter(e.getPlayer());
        f.setIsIncendiary(false);
        f.setYield(0);
    }
}
