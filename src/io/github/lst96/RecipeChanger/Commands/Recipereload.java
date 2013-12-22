package io.github.lst96.RecipeChanger.Commands;

import io.github.lst96.RecipeChanger.Recipe;
import io.github.lst96.RecipeChanger.Listeners.Crafting;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Recipereload implements CommandExecutor {
	private Recipe plugin;
	
	public Recipereload(Recipe instance){
		this.plugin = instance;
	}
	

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args)
	  {
	    if (commandLabel.equalsIgnoreCase("recipereload")) {
	      if ((sender.isOp()) || (sender.hasPermission("recipe.reload"))) {
	        plugin.reloadConfig();
	        Crafting craft = Crafting.getInstance();
	        craft.SetupCrafting();
	        sender.sendMessage(ChatColor.DARK_RED + "[Recipe Changer]" + " " + ChatColor.RED + "Configuration Reloaded!");
	        return true;
	      }
	      sender.sendMessage(ChatColor.DARK_RED + "[Recipe Changer]" + ChatColor.RED + " I'm sorry, but you do not have permission to perform this command. Please contact the server administrators if you believe that this is in error.");
	      return true;
	    }
	    return false;
	  }
}