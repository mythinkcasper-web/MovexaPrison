package com.movexa.prison.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PrisonCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Bu komutu yalnızca oyuncular kullanabilir.");
            return true;
        }

        Player player = (Player) sender;

        if (args.length == 0) {
            player.sendMessage("Hapishane komutları için yardım: /prison <komut>");
            return true;
        }

        switch (args[0].toLowerCase()) {
            case "info":
                player.sendMessage("Hapishane bilgileri burada.");
                break;
            case "enter":
                // Hapishaneye girme işlemi
                player.sendMessage("Hapishaneye girdiniz.");
                break;
            case "exit":
                // Hapishaneden çıkma işlemi
                player.sendMessage("Hapishaneden çıktınız.");
                break;
            default:
                player.sendMessage("Geçersiz komut. /prison <komut>");
                break;
        }

        return true;
    }
}