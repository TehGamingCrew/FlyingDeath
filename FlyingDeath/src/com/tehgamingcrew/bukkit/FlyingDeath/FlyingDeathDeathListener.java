package com.tehgamingcrew.bukkit.FlyingDeath;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class FlyingDeathDeathListener implements Listener {
	
	@EventHandler(priority = EventPriority.HIGH)
	public void onPlayerDeath(PlayerDeathEvent event) {
		Player p = event.getEntity();
		Location loc = p.getLocation().clone();
		Inventory inv = p.getInventory();
		for (ItemStack item : inv.getContents()) {
		    if (item != null) {
		        loc.getWorld().dropItemNaturally(loc, item.clone());
		    }
		}
		inv.clear();
		
	}

}
