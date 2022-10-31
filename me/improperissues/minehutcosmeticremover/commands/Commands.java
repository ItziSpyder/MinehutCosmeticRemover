package me.improperissues.minehutcosmeticremover.commands;

import me.improperissues.minehutcosmeticremover.TROLL;
import me.improperissues.minehutcosmeticremover.other.Messages;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;

import java.util.ArrayList;
import java.util.List;

import static org.bukkit.Bukkit.getServer;

public class Commands implements CommandExecutor {

    static TROLL plugin;
    public Commands(TROLL plugin) {
        Commands.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        switch (command.getName().toLowerCase().trim()) {
            case "anti-mh":
                switch (args.length) {
                    case 2:
                        boolean bool = Boolean.parseBoolean(args[1]);
                        if (getConfigOptions().contains(args[0])) {
                            plugin.getConfig().set("server.options." + args[0],bool);
                            plugin.saveConfig();
                            sender.sendMessage(Messages.starter + "7Set §f" + args[0] + " §7to §f" + bool);
                            return true;
                        }
                        break;
                }
                break;
            case "check-for-mh_cos":
                PluginManager pm = getServer().getPluginManager();
                Plugin plugin = pm.getPlugin("MinehutCosmetics");
                if (plugin != null) {
                    sender.sendMessage(Messages.starter + "bMinehutCosmetics.jar was found in the plugins folder! Make sure " +
                            "§e/anti-mh remove_jar_on_enable true §bis true and do §e/reload confirm!");
                } else {
                    sender.sendMessage(Messages.starter + "bMinehutCosmetics.jar was not found! You are safe from cringe!");
                }
                return true;
        }

        return false;
    }

    // Methods
    public static List<String> getConfigOptions() {
        return new ArrayList<>(plugin.getConfig().getConfigurationSection("server.options").getKeys(false));
    }
}
