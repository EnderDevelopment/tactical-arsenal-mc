package com.enderdevelopment.plugin;

import org.bukkit.plugin.java.JavaPlugin;
import com.enderdevelopment.plugin.commands.MilitaryCommand;
import com.enderdevelopment.plugin.listeners.MilitaryListener;
import com.enderdevelopment.plugin.commands.MilitaryCommand;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
                // Register commands
        this.getCommand("military").setExecutor(new MilitaryCommand(this));

        // Register events
        getServer().getPluginManager().registerEvents(new MilitaryListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}