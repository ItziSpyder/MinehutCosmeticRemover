package me.improperissues.minehutcosmeticremover.other;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;

import java.io.File;

import static org.bukkit.Bukkit.getServer;

public class MinehutRemover {
    public static void doDatStuff() {
        PluginManager pm = getServer().getPluginManager();
        Plugin plugin = pm.getPlugin("MinehutCosmetics");

        if (Messages.plugin.getConfig().getBoolean("server.options.show_remove_message")) {
            if (plugin != null) {
                Messages.bmConditionally("\n" + Messages.starter + "bFound MinehutCosmetics.jar in plugins folder!");
            } else {
                Messages.bmConditionally("\n" + Messages.starter + "bServer does not have MinehutCosmetics!");
                if (Messages.plugin.getConfig().getBoolean("server.options.show_troll_face")) {
                    Messages.bmConditionally("" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣄⣀⣀⣀⣀⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣴⡿⠟⠉⠉⠉⠉⠉⠉⠉⠀⢀⣀⣠⠤⠶⠶⠶⠶⠦⠤⠤⠄⠈⣉⡉⠉⠉⠉⠛⠛⠻⠿⢿⣿⣿⣶⣶⣶⣤⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣼⡿⠋⠀⠀⠀⠀⠀⠀⢀⣤⠖⠛⠉⣁⣠⣤⠤⠴⠶⠶⠶⠤⢤⣤⣀⡀⠀⠀⠀⠀⠉⠉⠉⠉⠉⣀⣀⣀⣤⣍⡙⠻⢿⣶⣤⡀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣾⠟⠀⠀⠀⠀⠀⣀⠴⠚⢉⡤⠔⢚⣉⡩⠤⠤⠤⠤⠤⠤⣤⠄⠀⠀⠀⠈⠉⠉⠀⠀⠀⠉⠉⣉⣉⣀⣀⣀⠀⠈⠙⠀⠀⠈⠻⢿⣶⣄⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⠏⠀⠀⠀⢀⡴⠊⠁⣠⠞⣉⡤⠞⠋⠀⠀⠀⠀⠀⠀⠀⠀⠈⢳⡀⠀⠀⠀⠀⠀⠀⠀⠾⢛⡍⠉⠀⠀⠀⠉⠛⠦⣄⠀⠀⠀⠀⠀⠙⣿⡇⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⢠⣿⠏⠀⠀⠀⠀⠈⠀⠠⠞⢁⡞⠉⠀⠀⠀⣀⣀⣀⣀⣀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⢰⠋⠀⠀⠀⠀⠀⠀⠀⠀⠘⢇⠀⠀⠀⠀⠀⣿⡇⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⢀⣴⣿⠟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠀⣠⣶⣿⣿⣿⣿⣿⣿⠿⠿⠿⣶⣦⣄⠀⠀⠀⠀⠀⠀⠀⠀⢸⠀⠀⣀⣀⣤⣤⣤⣤⣄⠀⠈⠀⠀⠀⠀⠀⠸⣿⣆⠀⠀⠀\n" +
                            "⠀⠀⠀⢀⣴⣿⣿⣿⣖⠒⠦⢄⡀⠀⠀⣤⣤⡖⢀⣾⣿⣭⣿⣿⣿⣿⣿⣿⣤⣄⡀⠈⠙⣿⣷⠀⠀⠀⠀⢀⣀⡀⣠⣴⣿⣿⣿⣿⣯⣭⣿⣿⣷⠄⢤⣄⣀⣀⣀⣀⠈⠻⣷⣤⡀\n" +
                            "⠀⠀⣴⣿⢟⡿⠁⠀⣀⣤⣶⣶⣾⣶⣤⣈⠀⠚⠉⠉⠉⠉⠁⠀⣀⣴⡆⠉⠉⠛⠿⣿⣶⣿⠿⠀⠀⠀⠀⠘⠿⢿⣿⡿⠿⠛⠋⠉⠉⠉⠉⠁⠀⠀⠀⠀⠀⠀⢰⣌⠛⢦⡈⢿⣿\n" +
                            "⠀⣼⡟⢡⡞⠀⢠⣾⡿⠋⠁⠀⣰⡈⠛⠿⣿⣷⣦⣤⣤⣤⣴⣾⠿⠋⠀⠀⠀⠀⠀⠀⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⣿⡇⠀⠀⠀⠀⠀⣀⡀⠀⠀⣠⣶⣶⣶⣶⣶⣄⢹⡇⠙⡆⣿\n" +
                            "⢸⣿⠁⢸⡇⠀⣿⡏⠀⠀⠀⢰⣿⣧⣄⡀⠀⠈⠉⠉⠉⠉⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⢀⢀⠀⠀⠀⠀⠀⠀⠀⠀⢿⣷⣄⡀⠀⠀⠀⠻⢿⣶⣿⣿⠋⣰⡄⠀⠙⠛⠈⡇⠀⡇⣿\n" +
                            "⢸⣿⠀⢸⡇⠀⣿⡄⢠⣤⣶⣿⣿⠛⠻⢿⣷⣤⣄⡀⠀⠀⠀⠀⣀⡤⠤⢤⣤⠾⣴⡿⠿⠿⠇⠀⠀⠀⠀⠀⠀⠀⠀⠉⠻⣿⣦⣄⠀⠀⠀⠀⠀⠀⠀⣿⣇⡀⠀⢀⣠⠇⢀⢧⣿\n" +
                            "⠘⣿⣇⠈⢇⠀⢿⣷⡈⠉⠁⢹⣿⣄⠀⠀⠀⠙⠻⣿⣿⣶⣤⣀⡀⠀⠀⠀⠀⠀⢿⣧⡀⢶⣶⣾⣶⣶⡄⠀⠀⠀⠀⠀⣴⣿⢿⠿⠳⠦⣀⡀⠀⠀⣠⣿⣿⣧⠀⠈⣁⡤⢾⣿⡿\n" +
                            "⠀⠙⣿⣆⠘⠦⣌⣙⠃⠀⠀⠘⢿⣿⣷⣤⣀⡀⠀⣿⣇⠉⠙⠛⠻⠿⢷⣶⣤⣤⣌⣻⠗⠈⠁⠀⠀⠀⠀⠀⣶⣦⣴⣾⠟⠁⠀⠀⠀⠀⠀⢉⣠⣾⣿⣿⣿⣿⠀⠉⠀⢀⣾⡟⠀\n" +
                            "⠀⠀⠈⢻⣷⣦⣤⠉⠁⠀⠀⠀⠀⠹⣿⣟⠻⢿⣷⣿⣿⣦⣀⠀⠀⠀⠀⠈⢙⣿⠿⠿⠿⣷⣶⣶⣤⣤⣤⣀⣈⣉⣉⣁⣀⣀⣀⣀⣤⣤⣶⠿⠻⣿⡏⢻⣿⣿⡆⠀⠀⣾⡟⠀⠀\n" +
                            "⠀⠀⠀⠀⠙⢿⣷⣄⠀⠀⠀⠀⠀⠀⠙⣿⣦⠀⠀⣿⣿⣿⣿⣿⣶⣶⣤⣀⣾⡿⠀⠀⠀⠀⠀⠈⠉⣿⡏⠉⠛⠛⢻⣿⡟⠛⠋⠉⠉⣿⣧⠀⠀⣿⣇⣸⣿⣿⡇⠀⢸⣿⠁⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠹⣿⣇⠀⠀⠀⠀⠀⠀⠈⠻⣷⣤⣼⡿⠀⠈⠙⠛⠿⣿⣿⣿⣷⣶⣶⣤⣤⣀⣀⣀⣿⣇⣀⣀⣀⣀⣿⣇⣀⣀⣤⣤⣼⣿⣶⣾⣿⣿⣿⣿⣿⠇⠀⢸⣿⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⢻⣿⣄⠀⠀⠀⠀⠀⠀⠀⠈⠻⣿⣅⡀⠀⠀⠀⠀⠀⢸⣿⠛⠛⠿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⢸⣿⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠙⣿⣦⡀⠀⠀⠀⠀⠀⠀⠀⠈⠻⢿⣦⣀⠀⠀⢠⣿⠏⠀⠀⠀⠀⠀⠈⢹⣿⠛⠿⠿⠿⠿⣿⣿⣿⡿⣿⣿⣿⣿⢿⣿⡿⢿⣿⢟⣿⡟⠀⠀⢸⣿⡆⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠻⣷⣦⡀⢀⣄⡀⠀⣀⣀⠀⠀⠉⠻⢿⣶⣿⡏⠀⠀⠀⠀⠀⠀⠀⢸⣿⠀⠀⠀⠀⠀⣾⡟⠀⠀⢀⣿⡟⠀⣼⣿⠁⢼⣿⣾⡿⠁⠀⠀⠈⣿⡇⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠻⣿⣦⣈⠙⠲⢤⣈⠙⠲⢤⣀⠀⠈⠙⠛⠿⢷⣶⣦⣤⣤⣄⣼⣿⣀⣀⣀⣀⣀⣿⣄⣀⣠⣾⣟⣠⣴⣿⣷⣶⠿⠟⠋⠀⠀⠀⠀⠀⢿⡇⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠛⠿⣿⣦⣄⡉⠓⠦⢤⣈⠑⠲⢤⣄⡀⠀⠈⠉⠉⠉⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠋⠉⠉⠉⠀⠀⢀⡆⠀⠀⡀⠀⠀⢸⡇⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠻⢿⣶⣤⣀⡈⠉⠓⠶⢤⣉⡛⠶⢤⣀⣀⠀⠀⠀⠈⠉⠉⠉⠘⠒⠒⠒⠀⠀⠀⠀⠀⠀⢀⣠⠴⠋⠀⠀⠀⡇⠀⠀⢸⣿⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠛⠻⣿⣶⣦⣀⠀⠈⠉⠓⠒⠢⠭⣭⣀⣀⠀⠉⠉⠉⠉⠉⠉⠀⠒⠒⠒⠋⠉⠉⠀⠀⠀⣠⡴⠚⠁⠀⠀⢸⣿⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⠿⣿⣶⣄⡀⠀⠀⠀⠀⠀⠀⠉⠉⠉⠉⠑⠒⠒⠒⠒⠒⠒⠒⠒⠒⠒⠒⠋⠁⠀⠀⠀⠀⢀⣾⡿⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠛⠿⣷⣦⣤⣤⣤⣄⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣿⡟⠁⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠉⠛⠿⠿⣿⣶⣶⣤⣀⣀⡀⠀⠀⠀⠀⠀⠀⠀⣀⣠⣤⣶⡿⠟⠁⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠛⠛⠛⠻⠿⠿⠿⠿⠟⠛⢛⢋⠉⡁⠀⠀⠀⠀⠀⠀⠀\n\n  ");
                }
            }
        }
        if (Messages.plugin.getConfig().getBoolean("server.options.remove_jar_on_enable")) {
            if (plugin != null) {
                Messages.bmConditionally(Messages.starter + "bMinehutCosmetics.jar was detected, deleting file ...");
                pm.disablePlugin(plugin);
                File file = new File(new File("plugins"),plugin.getName() + ".jar");
                while (file.exists()) {
                    file.delete();
                    if (Messages.plugin.getConfig().getBoolean("server.options.auto_restart_on_remove")) {
                        getServer().dispatchCommand(getServer().getConsoleSender(),"reload confirm");
                    } else {
                        String message = "bSuccessfully attempted to delete MinehutCostmetics.jar! " +
                                "Please restart server! Don't want to keep doing this manually? " +
                                "Try §e/anti-mh auto_restart_on_remove true";
                        Messages.bmConditionally(Messages.starter + message);
                    }
                }
            }
        }
    }
}
