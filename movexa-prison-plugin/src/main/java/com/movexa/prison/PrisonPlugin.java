package com.movexa.prison;

import org.bukkit.plugin.java.JavaPlugin;

public class PrisonPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Movexa Prison Plugin has been enabled!");
        // Register commands and listeners here
    }

    @Override
    public void onDisable() {
        getLogger().info("Movexa Prison Plugin has been disabled!");
        // Cleanup resources here
    }
}