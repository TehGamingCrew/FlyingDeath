package com.tehgamingcrew.bukkit.FlyingDeath;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;


public class FlyingDeath extends JavaPlugin {
	//jush jush
	
	private Logger log = Logger.getLogger("Minecraft");
	
	public void onEnable() {
		
		this.logMessage("Enabled.");
		PluginManager manager = this.getServer().getPluginManager();
		
		//listeners
		manager.registerEvents(new FlyingDeathDeathListener(), this);
	}

	public void onDisable() {
		this.logMessage("Disabled.");
	}
	
	public void logMessage(String msg) {
		PluginDescriptionFile pdFile = this.getDescription();
		this.log.info(pdFile.getName() + " " + pdFile.getVersion() + ": " + msg);
	}
}
