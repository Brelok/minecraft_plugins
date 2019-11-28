package com.github.brelok.croupier;

import org.bukkit.entity.NPC;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Croupier extends JavaPlugin {

    public static Logger logger;

    @Override
    public void onEnable() throws NullPointerException {
        logger = getLogger();
        logger.info("Plugin " + getName() + " został wczytany");
        this.getCommand("randomGift").setExecutor(new CroupierCommandExecutor());

    }

    @Override
    public void onDisable() {
        this.getLogger().log(Level.INFO, "Wyłączanie pluginu");
    }
}
