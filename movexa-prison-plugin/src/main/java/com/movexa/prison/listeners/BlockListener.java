package com.movexa.prison.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class BlockListener implements Listener {

    private final JavaPlugin plugin;

    public BlockListener(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        // Blok kırma olayını yönet
        event.getPlayer().sendMessage("Bir blok kırdınız!");
    }

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event) {
        // Blok yerleştirme olayını yönet
        event.getPlayer().sendMessage("Bir blok yerleştirdiniz!");
    }
}