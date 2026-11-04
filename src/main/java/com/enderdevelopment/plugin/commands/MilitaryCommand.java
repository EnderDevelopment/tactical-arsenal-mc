package com.enderdevelopment.plugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.Plugin;
import com.enderdevelopment.plugin.items.MilitaryItems;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;

public class MilitaryCommand implements CommandExecutor {

    private final MilitaryItems militaryItems;

    public MilitaryCommand(Plugin plugin) {
        this.militaryItems = new MilitaryItems(plugin);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("This command can only be executed by a player.");
            return true;
        }

        Player player = (Player) sender;
        player.sendMessage(Component.text("Military Addon Commands:").color(NamedTextColor.GOLD));
                    player.sendMessage(Component.text("/military give <item> - Give yourself a military item.").color(NamedTextColor.YELLOW));
            player.sendMessage(Component.text("Available items: rifle, sniper_rifle, helmet, chestplate, leggings, boots").color(NamedTextColor.YELLOW));
            player.sendMessage(Component.text("Available items: rifle, sniper_rifle, helmet, chestplate, leggings, boots").color(NamedTextColor.YELLOW));
        player.sendMessage(Component.text("/military list - List all available military items.").color(NamedTextColor.YELLOW));
        return true;
    }
}