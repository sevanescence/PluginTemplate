package io.github.makotomiyamoto.PluginTemplate;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {

        this.getConfig().options().copyDefaults(true);

        this.saveConfig();

    }

}
