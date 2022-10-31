package me.improperissues.minehutcosmeticremover.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

import java.util.ArrayList;
import java.util.List;

public class Tabs implements TabCompleter {
    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        List<String> list = new ArrayList<>();

        switch (command.getName().toLowerCase().trim()) {
            case "anti-mh":
                switch (args.length) {
                    case 1:
                        return Commands.getConfigOptions();
                    case 2:
                        list.add("true");
                        list.add("false");
                        break;
                }
                break;
        }

        return list;
    }
}
