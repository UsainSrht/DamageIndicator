package me.usainsrht.damageindicator;

import org.bukkit.plugin.java.JavaPlugin;

public final class DamageIndicator extends JavaPlugin {

    private static DamageIndicator instance;

    @Override
    public void onEnable() {
        instance = this;
    }

    @Override
    public void onDisable() {

    }

    public static DamageIndicator getInstance() {
        return instance;
    }
}
