# ActionBar
This is a utility that you can use in versions 1.8 for the actionbar to appear (minecraft only)

# How to use
You will use this in minecraft listeners

    @EventHandler
    public void join(PlayerJoinEvent join) {
        Player player = join.getPlayer();
        ActionBar.sendActionBar(player, "Welcome", "", "", "", "");
    }

# CODE 

    public static void sendActionBar(Player player, String message1, String message, String s, String s1, String s2) {
        CraftPlayer p = (CraftPlayer)player;
        IChatBaseComponent cbc = IChatBaseComponent.ChatSerializer.a("{\"text\": \"" + message1 + "" + message + "" + s + s1 + s2 + "\"}");
        PacketPlayOutChat ppoc = new PacketPlayOutChat(cbc, (byte)2);
        (p.getHandle()).playerConnection.sendPacket((Packet)ppoc);
    }

# If you need to put more strings you must put
 
    public static void sendActionBar(Player player, String message1, String message, String s, String s1, String s2 String s3 String s4 String s5 String s6) {

                                                                                                                           ¡         ¡          ¡         ¡
