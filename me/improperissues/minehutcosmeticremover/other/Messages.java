package me.improperissues.minehutcosmeticremover.other;

import me.improperissues.minehutcosmeticremover.TROLL;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class Messages implements Listener {

    static TROLL plugin;
    public Messages(TROLL plugin) {
        Messages.plugin = plugin;
    }
    public static String starter = "§8§l>§3§l>§b§l> §";

    public static void bm(String message) {
        for (Player p : Bukkit.getOnlinePlayers()) {
            p.sendMessage(message);
        }
    }

    public static void bmOp(String message) {
        for (Player p : Bukkit.getOnlinePlayers()) {
            if (p.isOp()) {
                p.sendMessage(message);
            }
        }
    }

    public static void bmConditionally(String message) {
        if (plugin.getConfig().getBoolean("server.options.only_show_messages_to_op")) {
            bmOp(message);
        } else {
            bm(message);
        }
    }
}
