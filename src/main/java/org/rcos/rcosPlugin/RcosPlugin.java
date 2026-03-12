package org.rcos.rcosPlugin;

import org.bukkit.plugin.java.JavaPlugin;
import org.rcos.rcosPlugin.commands.helloworld;
import org.rcos.rcosPlugin.commands.ping;
import org.rcos.rcosPlugin.commands.start;
import org.rcos.rcosPlugin.listeners.TestListener;

public final class RcosPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup login
        getCommand("helloworld").setExecutor(new helloworld());

        getServer().getPluginManager().registerEvents(new TestListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
