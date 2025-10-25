package com.movexa.prison.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class JailCommand extends Command {

    private final JavaPlugin plugin;

    public JailCommand(JavaPlugin plugin) {
        super("jail");
        this.plugin = plugin;
    }

    @Override
    public boolean execute(CommandSender sender, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "Bu komutu yalnızca oyuncular kullanabilir.");
            return true;
        }

        if (args.length < 1) {
            sender.sendMessage(ChatColor.RED + "Kullanım: /jail <oyuncu>");
            return true;
        }

        Player target = Bukkit.getPlayer(args[0]);
        if (target == null) {
            sender.sendMessage(ChatColor.RED + "Belirtilen oyuncu çevrimiçi değil.");
            return true;
        }

        // Hapse atma işlemi burada gerçekleştirilecek
        // Örneğin, oyuncunun konumunu hapishane hücresine ayarlamak gibi

        sender.sendMessage(ChatColor.GREEN + target.getName() + " hapse atıldı.");
        target.sendMessage(ChatColor.RED + "Hapse atıldınız!");

        return true;
    }
}