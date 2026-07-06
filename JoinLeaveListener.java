package com.yourname.fluttershy;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import java.util.List;
import java.util.Random;

public class JoinLeaveListener implements Listener {

    private final Main plugin;
    private final Random random = new Random();

    public JoinLeaveListener(Main plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        String template = randomPhrase("join-phrases", "&f{player} &7arrived quietly");
        String border = plugin.getConfig().getString("join-border", "&d~*~*~*~");
        String face = plugin.getConfig().getString("join-face", "(o.o)");

        event.setJoinMessage(buildMessage(border, face, player.getName(), template));
    }

    @EventHandler
    public void onQuit(PlayerQuitEvent event) {
        Player player = event.getPlayer();
        String template = randomPhrase("leave-phrases", "&f{player} &7slipped away quietly");
        String border = plugin.getConfig().getString("leave-border", "&d~*~*~*~");
        String face = plugin.getConfig().getString("leave-face", "(._.)");

        event.setQuitMessage(buildMessage(border, face, player.getName(), template));
    }

    private String randomPhrase(String key, String fallback) {
        List<String> phrases = plugin.getConfig().getStringList(key);
        if (phrases.isEmpty()) {
            return fallback;
        }
        return phrases.get(random.nextInt(phrases.size()));
    }

    private String buildMessage(String border, String face, String playerName, String phraseTemplate) {
        String top = ChatColor.translateAlternateColorCodes('&', border);
        String middle = ChatColor.translateAlternateColorCodes('&', phraseTemplate.replace("{player}", playerName));
        String bottom = ChatColor.translateAlternateColorCodes('&', "&e      " + face);
        return top + "\n" + middle + "\n" + bottom + "\n" + top;
    }
}
