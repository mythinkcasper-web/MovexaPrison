package com.example;

import org.bukkit.plugin.java.JavaPlugin;

public class ExamplePlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("ExamplePlugin has been enabled!");
        // Additional startup logic can go here
    }

    @Override
    public void onDisable() {
        getLogger().info("ExamplePlugin has been disabled!");
        // Cleanup logic can go here
    }
}