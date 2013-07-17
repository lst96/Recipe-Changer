package io.github.lst96.RecipeChanger;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class Listeners implements Listener {
	
	Recipe plugin;
	
	public Listeners(Recipe instance) {
		plugin = instance;
	}
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event)
	{
	  if(event.getPlayer().isOp() && plugin.isUpdate)
	  {
		  event.getPlayer().sendMessage(ChatColor.DARK_RED + "[Recipe Changer]" + ChatColor.RESET + ChatColor.RED + " An update is available: " + plugin.updater.getLatestVersionString());
		  event.getPlayer().sendMessage(ChatColor.DARK_RED + "[Recipe Changer]" + ChatColor.RESET + ChatColor.RED + " Download update at http://dev.bukkit.org/bukkit-plugins/recipe-changer/files/7-recipe-changer-v0-5/");
	  }
	}

}