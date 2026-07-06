package com.flutterpoo.fluttershy;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        saveDefaultConfig();
        getServer().getPluginManager().registerEvents(new JoinLeaveListener(this), this);
        getLogger().info("Greetingshy is awake.");
    }

    @Override
    public void onDisable() {
        getLogger().info("Greetingshy has gone to sleep.");
    }
}
