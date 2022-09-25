package io.resignedzzz.com;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinListener implements Listener {
    public final ActionBar plugin;

    public JoinListener(ActionBar plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void join(PlayerJoinEvent join) {
        Player player = join.getPlayer();
        ActionBar.sendActionBar(player, "Welcome", "", "", "", "");
    }
}
