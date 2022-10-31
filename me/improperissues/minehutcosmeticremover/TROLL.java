package me.improperissues.minehutcosmeticremover;

import me.improperissues.minehutcosmeticremover.commands.Commands;
import me.improperissues.minehutcosmeticremover.commands.Tabs;
import me.improperissues.minehutcosmeticremover.other.Messages;
import me.improperissues.minehutcosmeticremover.other.MinehutRemover;
import org.bukkit.plugin.java.JavaPlugin;

public final class TROLL extends JavaPlugin {
    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getLogger().warning("MinehutCosmeticRemover has enabled!");

        // Files
        getConfig().options().copyDefaults(true);
        saveDefaultConfig();

        // Commands
        getCommand("anti-mh").setExecutor(new Commands(this));
        getCommand("anti-mh").setTabCompleter(new Tabs());
        getCommand("check-for-mh_cos").setExecutor(new Commands(this));

        // Events
        getServer().getPluginManager().registerEvents(new Messages(this),this);

        // Extra
        getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MinehutRemover.doDatStuff();
            }
        },20);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getServer().getLogger().warning("MinehutCosmeticRemover has disabled!");
    }
}
