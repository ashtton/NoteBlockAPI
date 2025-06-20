package com.xxmicloxx.NoteBlockAPI;

import org.bukkit.event.EventHandler;
import org.bukkit.plugin.java.JavaPlugin;

public class NoteBlockPlugin extends JavaPlugin {

    private static NoteBlockAPI api;
    public static NoteBlockAPI getAPI() {
        return api;
    }

    @EventHandler
    public void onEnable() {
        api = new NoteBlockAPI();
        api.initAPI(this);
    }

    @EventHandler
    public void onDisable() {
        api.onDisable(this);
    }


}
