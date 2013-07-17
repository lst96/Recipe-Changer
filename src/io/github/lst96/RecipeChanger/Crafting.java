package io.github.lst96.RecipeChanger;

import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

public class Crafting
  implements Listener
{
  static Recipe re;

  public Crafting(Recipe r)
  {
    re = r;
  }

  public void SetupCrafting() {
    re.getConfig();

    if (re.getConfig().getBoolean("Diamond Horse")) {
      ShapedRecipe diamondHorse = new ShapedRecipe(new ItemStack(Material.DIAMOND_BARDING));
      diamondHorse.shape(new String[] { "NND", "DWD", "DDD" });
      diamondHorse.setIngredient('D', Material.DIAMOND);
      diamondHorse.setIngredient('W', Material.WOOL);
      Bukkit.getServer().addRecipe(diamondHorse);
    }

    if (re.getConfig().getBoolean("Iron Horse")) {
      ShapedRecipe ironHorse = new ShapedRecipe(new ItemStack(Material.IRON_BARDING));
      ironHorse.shape(new String[] { "NNI", "IWI", "III" });
      ironHorse.setIngredient('I', Material.IRON_INGOT);
      ironHorse.setIngredient('W', Material.WOOL);
      Bukkit.getServer().addRecipe(ironHorse);
    }

    if (re.getConfig().getBoolean("Gold Horse")) {
      ShapedRecipe goldHorse = new ShapedRecipe(new ItemStack(Material.GOLD_BARDING));
      goldHorse.shape(new String[] { "NNG", "GWG", "GGG" });
      goldHorse.setIngredient('G', Material.GOLD_INGOT);
      goldHorse.setIngredient('W', Material.WOOL);
      Bukkit.getServer().addRecipe(goldHorse);
    }

    if (re.getConfig().getBoolean("Name Tag")) {
      ShapedRecipe nameTag = new ShapedRecipe(new ItemStack(Material.NAME_TAG));
      nameTag.shape(new String[] { "NSN", "PPP", "ICI" });
      nameTag.setIngredient('S', Material.STRING);
      nameTag.setIngredient('P', Material.PAPER);
      nameTag.setIngredient('I', Material.IRON_INGOT);
      nameTag.setIngredient('C', Material.INK_SACK);
      Bukkit.getServer().addRecipe(nameTag);
    }

    if (re.getConfig().getBoolean("Saddle")) {
      ShapedRecipe saddle = new ShapedRecipe(new ItemStack(Material.SADDLE));
      saddle.shape(new String[] { "LLL", "LLL", "ISI" });
      saddle.setIngredient('L', Material.LEATHER);
      saddle.setIngredient('I', Material.IRON_INGOT);
      saddle.setIngredient('S', Material.STRING);
      Bukkit.getServer().addRecipe(saddle);
    }

    if (re.getConfig().getBoolean("Grass Block")) {
      ShapedRecipe grassblock = new ShapedRecipe(new ItemStack(Material.GRASS, 2));
      grassblock.shape(new String[] { "NNN", "NSN", "NDN" });
      grassblock.setIngredient('S', Material.SEEDS);
      grassblock.setIngredient('D', Material.DIRT);
      Bukkit.getServer().addRecipe(grassblock);
    }

    if (re.getConfig().getBoolean("Moss Stone")) {
      ShapedRecipe MossStone = new ShapedRecipe(new ItemStack(Material.MOSSY_COBBLESTONE));
      MossStone.shape(new String[] { "CVC", "VCV", "CVC" });
      MossStone.setIngredient('C', Material.COBBLESTONE);
      MossStone.setIngredient('V', Material.VINE);
      Bukkit.getServer().addRecipe(MossStone);
    }

    if (re.getConfig().getBoolean("Moss Brick")) {
      ItemStack MossBrick = new ItemStack(Material.SMOOTH_BRICK, 4);
      MossBrick.setDurability((short)1);
      ShapedRecipe MosseBrick = new ShapedRecipe(MossBrick);
      MosseBrick.shape(new String[] { "SVS", "VSV", "SVS" });
      MosseBrick.setIngredient('S', Material.SMOOTH_BRICK);
      MosseBrick.setIngredient('V', Material.VINE);
      Bukkit.getServer().addRecipe(MosseBrick);
    }
    if (re.getConfig().getBoolean("Cracked Brick")) {
      ItemStack CrackedBrick = new ItemStack(Material.SMOOTH_BRICK, 4);
      CrackedBrick.setDurability((short)2);
      ShapedRecipe CrkedBrick = new ShapedRecipe(CrackedBrick);
      CrkedBrick.shape(new String[] { "SCS", "CSC", "SCS" });
      CrkedBrick.setIngredient('C', Material.COBBLESTONE);
      CrkedBrick.setIngredient('S', Material.SMOOTH_BRICK);
      Bukkit.getServer().addRecipe(CrkedBrick);
    }

    if (re.getConfig().getBoolean("Chiseled Brick")) {
      ItemStack ChisBrick = new ItemStack(Material.SMOOTH_BRICK, 4);
      ChisBrick.setDurability((short)3);
      ShapedRecipe ChiseBrick = new ShapedRecipe(ChisBrick);
      ChiseBrick.shape(new String[] { "NNN", "SSN", "SSN" });
      ChiseBrick.setIngredient('S', Material.SMOOTH_BRICK);
      Bukkit.getServer().addRecipe(ChiseBrick);
    }
    if (re.getConfig().getBoolean("Web")) {
      ShapedRecipe Web = new ShapedRecipe(new ItemStack(Material.WEB, 3));
      Web.shape(new String[] { "SSS", "SSS", "SSS" });
      Web.setIngredient('S', Material.STRING);
      Bukkit.getServer().addRecipe(Web);
    }
    if (re.getConfig().getBoolean("Obsidian")) {
      ShapedRecipe Obsidian = new ShapedRecipe(new ItemStack(Material.OBSIDIAN));
      Obsidian.shape(new String[] { "NNN", "NNN", "NLW" });
      Obsidian.setIngredient('W', Material.WATER_BUCKET);
      Obsidian.setIngredient('L', Material.LAVA_BUCKET);
      Bukkit.getServer().addRecipe(Obsidian);
    }
    if (re.getConfig().getBoolean("Grass")) {
      ItemStack TallGrass = new ItemStack(Material.getMaterial(31), 1);
      TallGrass.setDurability((short)1);
      ShapedRecipe TGrass = new ShapedRecipe(TallGrass);
      TGrass.shape(new String[] { "NNN", "NSN", "NGN" });
      TGrass.setIngredient('G', Material.GRASS);
      TGrass.setIngredient('S', Material.SEEDS);
      Bukkit.getServer().addRecipe(TGrass);
    }
    if (re.getConfig().getBoolean("Ice")) {
      ShapedRecipe Ice = new ShapedRecipe(new ItemStack(Material.ICE));
      Ice.shape(new String[] { "SSS", "SWS", "SSS" });
      Ice.setIngredient('W', Material.WATER_BUCKET);
      Ice.setIngredient('S', Material.SNOW_BALL);
      Bukkit.getServer().addRecipe(Ice);
    }
    if (re.getConfig().getBoolean("Fire")) {
      ShapedRecipe Fire = new ShapedRecipe(new ItemStack(Material.FIRE, 5));
      Fire.shape(new String[] { "NNN", "NFN", "NRN" });
      Fire.setIngredient('F', Material.FLINT_AND_STEEL);
      Fire.setIngredient('R', Material.NETHERRACK);
      Bukkit.getServer().addRecipe(Fire);
    }
    if (re.getConfig().getBoolean("Chain Helmet")) {
      ShapedRecipe Chelmet = new ShapedRecipe(new ItemStack(Material.CHAINMAIL_HELMET));
      Chelmet.shape(new String[] { "FFF", "FNF", "NNN" });
      Chelmet.setIngredient('F', Material.IRON_FENCE);
      Bukkit.getServer().addRecipe(Chelmet);
    }
    if (re.getConfig().getBoolean("Chain ChestPiece")) {
      ShapedRecipe Cchestpiece = new ShapedRecipe(new ItemStack(Material.CHAINMAIL_CHESTPLATE));
      Cchestpiece.shape(new String[] { "FNF", "FFF", "FFF" });
      Cchestpiece.setIngredient('F', Material.IRON_FENCE);
      Bukkit.getServer().addRecipe(Cchestpiece);
    }
    if (re.getConfig().getBoolean("Chain Leggings")) {
      ShapedRecipe Cleggings = new ShapedRecipe(new ItemStack(Material.CHAINMAIL_LEGGINGS));
      Cleggings.shape(new String[] { "FFF", "FNF", "FNF" });
      Cleggings.setIngredient('F', Material.IRON_FENCE);
      Bukkit.getServer().addRecipe(Cleggings);
    }
    if (re.getConfig().getBoolean("Chain Boots")) {
      ShapedRecipe Cboots = new ShapedRecipe(new ItemStack(Material.CHAINMAIL_BOOTS));
      Cboots.shape(new String[] { "NNN", "FNF", "FNF" });
      Cboots.setIngredient('F', Material.IRON_FENCE);
      Bukkit.getServer().addRecipe(Cboots);
    }
    if (re.getConfig().getBoolean("Exp Bottle")) {
      ShapedRecipe expbottle = new ShapedRecipe(new ItemStack(Material.EXP_BOTTLE));
      expbottle.shape(new String[] { "GLG", "LEL", "LLL" });
      expbottle.setIngredient('G', Material.GOLD_INGOT);
      expbottle.setIngredient('L', Material.GLASS);
      expbottle.setIngredient('E', Material.EMERALD);
      Bukkit.getServer().addRecipe(expbottle);
    }
    if (re.getConfig().getBoolean("Sponge")) {
      ShapedRecipe sponge = new ShapedRecipe(new ItemStack(Material.SPONGE));
      sponge.shape(new String[] { "SCS", "CSC", "SCS" });
      sponge.setIngredient('S', Material.SAND);
      sponge.setIngredient('C', Material.CLAY);
      Bukkit.getServer().addRecipe(sponge);
    }
    if (re.getConfig().getBoolean("Bedrock")) {
      ShapedRecipe bedrock = new ShapedRecipe(new ItemStack(Material.BEDROCK));
      bedrock.shape(new String[] { "COC", "OCO", "COC" });
      bedrock.setIngredient('O', Material.OBSIDIAN);
      bedrock.setIngredient('C', Material.COBBLESTONE);
      Bukkit.getServer().addRecipe(bedrock);
    }
    if (re.getConfig().getBoolean("Redstone Ore")) {
      ShapedRecipe redstone = new ShapedRecipe(new ItemStack(Material.REDSTONE_ORE));
      redstone.shape(new String[] { "RRR", "RSR", "RRR" });
      redstone.setIngredient('S', Material.STONE);
      redstone.setIngredient('R', Material.REDSTONE);
      Bukkit.getServer().addRecipe(redstone);
    }
    if (re.getConfig().getBoolean("Dragon Egg")) {
      ShapedRecipe dragonegg = new ShapedRecipe(new ItemStack(Material.DRAGON_EGG));
      dragonegg.shape(new String[] { "NNN", "NON", "OEO" });
      dragonegg.setIngredient('O', Material.OBSIDIAN);
      dragonegg.setIngredient('E', Material.EGG);
      Bukkit.getServer().addRecipe(dragonegg);
    }
    if (re.getConfig().getBoolean("Gun Powder")) {
      ShapedRecipe gunpowder = new ShapedRecipe(new ItemStack(Material.SULPHUR, 2));
      gunpowder.shape(new String[] { "NNN", "NCN", "NRN" });
      gunpowder.setIngredient('C', Material.COAL_BLOCK);
      gunpowder.setIngredient('R', Material.REDSTONE_BLOCK);
      Bukkit.getServer().addRecipe(gunpowder);
    }
    if (re.getConfig().getBoolean("Mob Spawner")) {
      ShapedRecipe spawner = new ShapedRecipe(new ItemStack(Material.MOB_SPAWNER));
      spawner.shape(new String[] { "OOO", "OIO", "OOO" });
      spawner.setIngredient('O', Material.OBSIDIAN);
      spawner.setIngredient('I', Material.IRON_INGOT);
      Bukkit.getServer().addRecipe(spawner);
    }
    if (re.getConfig().getBoolean("Command Block")) {
      ShapedRecipe commandblock = new ShapedRecipe(new ItemStack(Material.COMMAND));
      commandblock.shape(new String[] { "CWC", "WIW", "CWC" });
      commandblock.setIngredient('C', Material.WORKBENCH);
      commandblock.setIngredient('I', Material.IRON_INGOT);
      commandblock.setIngredient('W', Material.WOOD);
      Bukkit.getServer().addRecipe(commandblock);
     }
  }

  @EventHandler
  public void PrepareItemCraftEvent(CraftItemEvent e) { int item = e.getRecipe().getResult().getTypeId();
    HumanEntity p = (HumanEntity)e.getViewers().get(0);
    if ((p instanceof Player)) {
      Player player = (Player)p;
      switch (item) {
      case 329:
        if (!player.hasPermission("recipe.saddle")) {
          e.setCancelled(true);
          if (re.getConfig().getBoolean("closeinventory")) {
            player.closeInventory();
          }
          player.sendMessage(ChatColor.RED + "You don't have permission to craft this item.");
        }
        break;
      case 419:
        if (!player.hasPermission("recipe.diamondhorse")) {
          e.setCancelled(true);
          if (re.getConfig().getBoolean("closeinventory")) {
            player.closeInventory();
          }
          player.sendMessage(ChatColor.RED + "You don't have permission to craft this item.");
        }
        break;
      case 418:
        if (!player.hasPermission("recipe.goldhorse")) {
          e.setCancelled(true);
          if (re.getConfig().getBoolean("closeinventory")) {
            player.closeInventory();
          }
          player.sendMessage(ChatColor.RED + "You don't have permission to craft this item.");
        }
        break;
      case 417:
        if (!player.hasPermission("recipe.ironhorse")) {
          e.setCancelled(true);
          if (re.getConfig().getBoolean("closeinventory")) {
            player.closeInventory();
          }
          player.sendMessage(ChatColor.RED + "You don't have permission to craft this item.");
        }
        break;
      case 421:
        if (!player.hasPermission("recipe.nametag")) {
          e.setCancelled(true);
          if (re.getConfig().getBoolean("closeinventory")) {
            player.closeInventory();
          }
          player.sendMessage(ChatColor.RED + "You don't have permission to craft this item.");
        }
        break;
      case 289:
        if (!player.hasPermission("recipe.gunpowder")) {
          e.setCancelled(true);
          if (re.getConfig().getBoolean("closeinventory")) {
            player.closeInventory();
          }
          player.sendMessage(ChatColor.RED + "You don't have permission to craft this item.");
        }
        break;
      case 122:
        if (!player.hasPermission("recipe.dragonegg")) {
          e.setCancelled(true);
          if (re.getConfig().getBoolean("closeinventory")) {
            player.closeInventory();
          }
          player.sendMessage(ChatColor.RED + "You don't have permission to craft this item.");
        }
        break;
      case 73:
        if (!player.hasPermission("recipe.redstoneore")) {
          e.setCancelled(true);
          if (re.getConfig().getBoolean("closeinventory")) {
            player.closeInventory();
          }
          player.sendMessage(ChatColor.RED + "You don't have permission to craft this item.");
        }
        break;
      case 19:
        if (!player.hasPermission("recipe.sponge")) {
          e.setCancelled(true);
          if (re.getConfig().getBoolean("closeinventory")) {
            player.closeInventory();
          }
          player.sendMessage(ChatColor.RED + "You don't have permission to craft this item.");
        }
        break;
      case 384:
        if (!player.hasPermission("recipe.enchanting")) {
          e.setCancelled(true);
          if (re.getConfig().getBoolean("closeinventory")) {
            player.closeInventory();
          }
          player.sendMessage(ChatColor.RED + "You don't have permission to craft this item.");
        }
        break;
      case 304:
        if (!player.hasPermission("recipe.chainleggings")) {
          e.setCancelled(true);
          if (re.getConfig().getBoolean("closeinventory")) {
            player.closeInventory();
          }
          player.sendMessage(ChatColor.RED + "You don't have permission to craft this item.");
        }
        break;
      case 305:
        if (!player.hasPermission("recipe.chainboots")) {
          e.setCancelled(true);
          if (re.getConfig().getBoolean("closeinventory")) {
            player.closeInventory();
          }
          player.sendMessage(ChatColor.RED + "You don't have permission to craft this item.");
        }
        break;
      case 302:
        if (!player.hasPermission("recipe.chainhelmet")) {
          e.setCancelled(true);
          if (re.getConfig().getBoolean("closeinventory")) {
            player.closeInventory();
          }
          player.sendMessage(ChatColor.RED + "You don't have permission to craft this item.");
        }
        break;
      case 303:
        if (!player.hasPermission("recipe.chainchest")) {
          e.setCancelled(true);
          if (re.getConfig().getBoolean("closeinventory")) {
            player.closeInventory();
          }
          player.sendMessage(ChatColor.RED + "You don't have permission to craft this item.");
        }
        break;
      case 31:
        ItemStack TallGrass = new ItemStack(Material.getMaterial(31), 1);
        TallGrass.setDurability((short)1);
        if (!player.hasPermission("recipe.tallgrass")) {
          e.setCancelled(true);
          if (re.getConfig().getBoolean("closeinventory")) {
            player.closeInventory();
          }
          player.sendMessage(ChatColor.RED + "You don't have permission to craft this item.");
        }
        break;
      case 51:
        if (!player.hasPermission("recipe.fire")) {
          e.setCancelled(true);
          if (re.getConfig().getBoolean("closeinventory")) {
            player.closeInventory();
          }
          player.sendMessage(ChatColor.RED + "You don't have permission to craft this item.");
        }
        break;
      case 98:
        ItemStack ChisBrick = new ItemStack(Material.SMOOTH_BRICK);
        ChisBrick.setDurability((short)3);
        if (!player.hasPermission("recipe.chiseled")) {
          e.setCancelled(true);
          if (re.getConfig().getBoolean("closeinventory")) {
            player.closeInventory();
          }
          player.sendMessage(ChatColor.RED + "You don't have permission to craft this item.");
        }
        break;
      case 79:
        if (!player.hasPermission("recipe.ice")) {
          e.setCancelled(true);
          if (re.getConfig().getBoolean("closeinventory")) {
            player.closeInventory();
          }
          player.sendMessage(ChatColor.RED + "You don't have permission to craft this item.");
        }
        break;
      case 2:
        if (!player.hasPermission("recipe.grassblock")) {
          e.setCancelled(true);
          if (re.getConfig().getBoolean("closeinventory")) {
            player.closeInventory();
          }
          player.sendMessage(ChatColor.RED + "You don't have permission to craft this item.");
        }
        break;
      case 500:
        ItemStack MossBrick = new ItemStack(Material.SMOOTH_BRICK);
        MossBrick.setDurability((short)1);
        if (!player.hasPermission("recipe.mossbrick")) {
          e.setCancelled(true);
          if (re.getConfig().getBoolean("closeinventory")) {
            player.closeInventory();
          }
          player.sendMessage(ChatColor.RED + "You don't have permission to craft this item.");
        }
        break;
      case 48:
        if (!player.hasPermission("recipe.mossstone")) {
          e.setCancelled(true);
          if (re.getConfig().getBoolean("closeinventory")) {
            player.closeInventory();
          }
          player.sendMessage(ChatColor.RED + "You don't have permission to craft this item.");
        }
        break;
      case 30:
        if (!player.hasPermission("recipe.cobweb")) {
          e.setCancelled(true);
          if (re.getConfig().getBoolean("closeinventory")) {
            player.closeInventory();
          }
          player.sendMessage(ChatColor.RED + "You don't have permission to craft this item.");
        }
        break;
      case 501:
        ItemStack CrackedBrick = new ItemStack(Material.SMOOTH_BRICK, 4);
        CrackedBrick.setDurability((short)2);
        if (!player.hasPermission("recipe.crackedblock")) {
          e.setCancelled(true);
          if (re.getConfig().getBoolean("closeinventory")) {
            player.closeInventory();
          }
          player.sendMessage(ChatColor.RED + "You don't have permission to craft this item.");
        }
        break;
      case 52:
        if (!player.hasPermission("recipe.mobspawner")) {
          e.setCancelled(true);
          if (re.getConfig().getBoolean("closeinventory")) {
            player.closeInventory();
          }
          player.sendMessage(ChatColor.RED + "You don't have permission to craft this item.");
        }
        break;
      case 137:
        if (!player.hasPermission("recipe.command")) {
          e.setCancelled(true);
          if (re.getConfig().getBoolean("closeinventory")) {
            player.closeInventory();
          }
          player.sendMessage(ChatColor.RED + "You don't have permission to craft this item.");
        }
        break;
      }
    }
  }
}