package io.resignedzzz.com;


import net.minecraft.server.v1_8_R3.IChatBaseComponent;
import net.minecraft.server.v1_8_R3.Packet;
import net.minecraft.server.v1_8_R3.PacketPlayOutChat;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class ActionBar extends JavaPlugin implements Listener {
    public static ActionBar instance;

    public void onEnable(){
        instance = this;
        loadListeners();
    }
    public static void sendActionBar(Player player, String message1, String message, String s, String s1, String s2) {
        CraftPlayer p = (CraftPlayer)player;
        IChatBaseComponent cbc = IChatBaseComponent.ChatSerializer.a("{\"text\": \"" + message1 + "" + message + "" + s + s1 + s2 + "\"}");
        PacketPlayOutChat ppoc = new PacketPlayOutChat(cbc, (byte)2);
        (p.getHandle()).playerConnection.sendPacket((Packet)ppoc);
    }

    public void loadListeners(){
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(new JoinListener(this), this);
    }

}

