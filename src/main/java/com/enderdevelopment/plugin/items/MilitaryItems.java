package com.enderdevelopment.plugin.items;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.plugin.Plugin;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;

public class MilitaryItems {

    private final Plugin plugin;

    public MilitaryItems(Plugin plugin) {
        this.plugin = plugin;
    }

    public ItemStack createMilitaryItem(Material material, String name, String key) {
        ItemStack item = new ItemStack(material);
        ItemMeta meta = item.getItemMeta();

        if (meta != null) {
            meta.displayName(Component.text(name).color(NamedTextColor.GOLD));
            PersistentDataContainer data = meta.getPersistentDataContainer();
            data.set(new NamespacedKey(plugin, key), PersistentDataType.STRING, "military_item");
            item.setItemMeta(meta);
        }

        return item;
    }

    public ItemStack createRifle() {
        return createMilitaryItem(Material.CROSSBOW, "Assault Rifle", "assault_rifle");
    }

    public ItemStack createSniperRifle() {
        return createMilitaryItem(Material.BOW, "Sniper Rifle", "sniper_rifle");
    }

    public ItemStack createHelmet() {
        return createMilitaryItem(Material.NETHERITE_HELMET, "Military Helmet", "military_helmet");
    }

    public ItemStack createChestplate() {
        return createMilitaryItem(Material.NETHERITE_CHESTPLATE, "Military Chestplate", "military_chestplate");
    }

    public ItemStack createLeggings() {
        return createMilitaryItem(Material.NETHERITE_LEGGINGS, "Military Leggings", "military_leggings");
    }

    public ItemStack createBoots() {
        return createMilitaryItem(Material.NETHERITE_BOOTS, "Military Boots", "military_boots");
    }
}