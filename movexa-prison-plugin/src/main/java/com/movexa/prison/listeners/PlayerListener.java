package com.movexa.prison.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        // Oyuncu sunucuya katıldığında yapılacak işlemler
        event.getPlayer().sendMessage("Hoş geldin, " + event.getPlayer().getName() + "!");
    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {
        // Oyuncu sunucudan ayrıldığında yapılacak işlemler
        event.getPlayer().sendMessage("Güle güle, " + event.getPlayer().getName() + "!");
    }
}