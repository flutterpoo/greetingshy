package com.yourname.fluttershy;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        saveDefaultConfig();
        getServer().getPluginManager().registerEvents(new JoinLeaveListener(this), this);
        getLogger().info("FluttershyGreetings is awake.");
    }

    @Override
    public void onDisable() {
        getLogger().info("FluttershyGreetings has gone to sleep.");
    }
}
