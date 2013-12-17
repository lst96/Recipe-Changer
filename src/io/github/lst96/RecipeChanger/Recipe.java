package io.github.lst96.RecipeChanger;

import io.github.lst96.RecipeChanger.metrics.Metrics;

import java.io.IOException;
import java.util.logging.Logger;

import net.h31ix.updater.Updater;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class Recipe extends JavaPlugin
{
  public final Logger logger = Logger.getLogger("Minecraft");
  public PluginDescriptionFile pdfFile;
  public String PREFIX;
  public boolean isUpdate = false;
  public boolean messages = false;
  public boolean autoUpdate = false;
  Updater updater;
  private boolean compatible;

  public void onEnable()
  {
    this.pdfFile = getDescription();
    this.PREFIX = ("[" + this.pdfFile.getName() + "]");
    this.logger.info(this.PREFIX + " Recipe Changer version " + this.pdfFile.getVersion() + " has been enabled.");
    this.logger.info(this.PREFIX + " Developed by: " + this.pdfFile.getAuthors());
    new Listeners(this);
    getConfig().options().copyDefaults(true);
    saveConfig();
    Crafting cr = new Crafting(this);
    cr.SetupCrafting();
    getCommand("recipereload").setExecutor(new Recipereload(this));
    getServer().getPluginManager().registerEvents(new Crafting(this), this);
    try {
	      Metrics metrics = new Metrics(this);
	      metrics.start();
	    }
	    catch (IOException localIOException) {
	    }
    messages = this.getConfig().getBoolean("messages");
	autoUpdate = this.getConfig().getBoolean("autoupdate-check");
	if(autoUpdate) {
		setupUpdater();
	String mcVersion = Bukkit.getBukkitVersion();
    this.compatible = mcVersion.startsWith("1.7.2");
    if ((this.getConfig().getBoolean("check_bukkit_compatibility")) && (!this.compatible)) {
      this.logger.info("[Recipe Changer] is not compatible with " + Bukkit.getVersion());
      getServer().getPluginManager().disablePlugin(this);
      return;
	}
  }
}
  public void onDisable() {
    this.logger.info(this.PREFIX + " plugin disabled.");
    Bukkit.getServer().clearRecipes();
  }
  private void setupUpdater() {
		
		updater = new Updater(this, "information", this.getFile(), Updater.UpdateType.NO_DOWNLOAD, false);
      switch(updater.getResult())
      {
          case SUCCESS:
              break;
          case NO_UPDATE:
              break;
          case FAIL_DOWNLOAD:
          case FAIL_DBO:
          case FAIL_NOVERSION:
          case FAIL_BADSLUG:
          	this.logger.warning(PREFIX + " Updater Failed!");
              break;
          case UPDATE_AVAILABLE:
          	this.logger.info(PREFIX + " New version " + updater.getLatestVersionString() + " available!");
          	isUpdate = true;
          	break;
          default:
          	break;
      }
	}	
}