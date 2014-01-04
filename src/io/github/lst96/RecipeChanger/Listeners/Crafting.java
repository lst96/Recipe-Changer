package io.github.lst96.RecipeChanger.Listeners;

import io.github.lst96.RecipeChanger.Recipe;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

public class Crafting
  implements Listener
{
  private Recipe plugin;
  private static Crafting singleton;

  public Crafting(Recipe instance)
  {
    this.plugin = instance;
    singleton = this;
  }
  public static Crafting getInstance() {
    return singleton;
  }
  public void SetupCrafting() {
    this.plugin.getConfig();

    if (this.plugin.getConfig().getBoolean("Diamond Horse Armor")) {
      ShapedRecipe diamondHorse = new ShapedRecipe(new ItemStack(Material.DIAMOND_BARDING));
      diamondHorse.shape(new String[] { "NND", "DWD", "DDD" });
      diamondHorse.setIngredient('D', Material.DIAMOND);
      diamondHorse.setIngredient('W', Material.WOOL);
      Bukkit.getServer().addRecipe(diamondHorse);
    }

    if (this.plugin.getConfig().getBoolean("Iron Horse Armor")) {
      ShapedRecipe ironHorse = new ShapedRecipe(new ItemStack(Material.IRON_BARDING));
      ironHorse.shape(new String[] { "NNI", "IWI", "III" });
      ironHorse.setIngredient('I', Material.IRON_INGOT);
      ironHorse.setIngredient('W', Material.WOOL);
      Bukkit.getServer().addRecipe(ironHorse);
    }

    if (this.plugin.getConfig().getBoolean("Gold Horse Armor")) {
      ShapedRecipe goldHorse = new ShapedRecipe(new ItemStack(Material.GOLD_BARDING));
      goldHorse.shape(new String[] { "NNG", "GWG", "GGG" });
      goldHorse.setIngredient('G', Material.GOLD_INGOT);
      goldHorse.setIngredient('W', Material.WOOL);
      Bukkit.getServer().addRecipe(goldHorse);
    }

    if (this.plugin.getConfig().getBoolean("Name Tag")) {
      ShapedRecipe nameTag = new ShapedRecipe(new ItemStack(Material.NAME_TAG));
      nameTag.shape(new String[] { "NSN", "PPP", "ICI" });
      nameTag.setIngredient('S', Material.STRING);
      nameTag.setIngredient('P', Material.PAPER);
      nameTag.setIngredient('I', Material.IRON_INGOT);
      nameTag.setIngredient('C', Material.INK_SACK);
      Bukkit.getServer().addRecipe(nameTag);
    }

    if (this.plugin.getConfig().getBoolean("Saddle")) {
      ShapedRecipe saddle = new ShapedRecipe(new ItemStack(Material.SADDLE));
      saddle.shape(new String[] { "LLL", "LLL", "ISI" });
      saddle.setIngredient('L', Material.LEATHER);
      saddle.setIngredient('I', Material.IRON_INGOT);
      saddle.setIngredient('S', Material.STRING);
      Bukkit.getServer().addRecipe(saddle);
    }

    if (this.plugin.getConfig().getBoolean("Grass Block")) {
      ShapedRecipe grassblock = new ShapedRecipe(new ItemStack(Material.GRASS));
      grassblock.shape(new String[] { "NNN", "NSN", "NDN" });
      grassblock.setIngredient('S', Material.SEEDS);
      grassblock.setIngredient('D', Material.DIRT);
      Bukkit.getServer().addRecipe(grassblock);
    }

    if (this.plugin.getConfig().getBoolean("Moss Stone")) {
      ShapedRecipe MossStone = new ShapedRecipe(new ItemStack(Material.MOSSY_COBBLESTONE, 4));
      MossStone.shape(new String[] { "CVC", "VCV", "CVC" });
      MossStone.setIngredient('C', Material.COBBLESTONE);
      MossStone.setIngredient('V', Material.VINE);
      Bukkit.getServer().addRecipe(MossStone);
    }

    if (this.plugin.getConfig().getBoolean("Mossy Stone Bricks")) {
      ShapedRecipe MosseBrick = new ShapedRecipe(new ItemStack(Material.SMOOTH_BRICK, 4, (short)1));
      MosseBrick.shape(new String[] { "SVS", "VSV", "SVS" });
      MosseBrick.setIngredient('S', Material.SMOOTH_BRICK);
      MosseBrick.setIngredient('V', Material.VINE);
      Bukkit.getServer().addRecipe(MosseBrick);
    }
    if (this.plugin.getConfig().getBoolean("Cracked Stone Bricks")) {
      ShapedRecipe CrkedBrick = new ShapedRecipe(new ItemStack(Material.SMOOTH_BRICK, 4, (short)2));
      CrkedBrick.shape(new String[] { "SCS", "CSC", "SCS" });
      CrkedBrick.setIngredient('C', Material.COBBLESTONE);
      CrkedBrick.setIngredient('S', Material.SMOOTH_BRICK);
      Bukkit.getServer().addRecipe(CrkedBrick);
    }

    if (this.plugin.getConfig().getBoolean("Chiseled Stone Bricks")) {
      ShapedRecipe ChiseBrick = new ShapedRecipe(new ItemStack(Material.SMOOTH_BRICK, 4, (short)3));
      ChiseBrick.shape(new String[] { "NNN", "SSN", "SSN" });
      ChiseBrick.setIngredient('S', Material.SMOOTH_BRICK);
      Bukkit.getServer().addRecipe(ChiseBrick);
    }
    if (this.plugin.getConfig().getBoolean("Cobweb")) {
      ShapedRecipe Web = new ShapedRecipe(new ItemStack(Material.WEB, 3));
      Web.shape(new String[] { "SSS", "SSS", "SSS" });
      Web.setIngredient('S', Material.STRING);
      Bukkit.getServer().addRecipe(Web);
    }
    if (this.plugin.getConfig().getBoolean("Obsidian")) {
      ShapedRecipe Obsidian = new ShapedRecipe(new ItemStack(Material.OBSIDIAN));
      Obsidian.shape(new String[] { "NNN", "NLN", "NWN" });
      Obsidian.setIngredient('W', Material.WATER_BUCKET);
      Obsidian.setIngredient('L', Material.LAVA_BUCKET);
      Bukkit.getServer().addRecipe(Obsidian);
    }
    if (this.plugin.getConfig().getBoolean("Grass")) {
      ShapedRecipe TallGrass = new ShapedRecipe(new ItemStack(Material.LONG_GRASS, 1, (short)1));
      TallGrass.shape(new String[] { "NNN", "NSN", "NGN" });
      TallGrass.setIngredient('G', Material.GRASS);
      TallGrass.setIngredient('S', Material.SEEDS);
      Bukkit.getServer().addRecipe(TallGrass);
    }
    if (this.plugin.getConfig().getBoolean("Ice")) {
      ShapedRecipe Ice = new ShapedRecipe(new ItemStack(Material.ICE));
      Ice.shape(new String[] { "SSS", "SWS", "SSS" });
      Ice.setIngredient('W', Material.WATER_BUCKET);
      Ice.setIngredient('S', Material.SNOW_BALL);
      Bukkit.getServer().addRecipe(Ice);
    }
    if (this.plugin.getConfig().getBoolean("Fire")) {
      ShapedRecipe Fire = new ShapedRecipe(new ItemStack(Material.FIRE, 5));
      Fire.shape(new String[] { "NNN", "NFN", "NRN" });
      Fire.setIngredient('F', Material.FLINT_AND_STEEL);
      Fire.setIngredient('R', Material.NETHERRACK);
      Bukkit.getServer().addRecipe(Fire);
    }
    if (this.plugin.getConfig().getBoolean("Chain Helmet")) {
      ShapedRecipe Chelmet = new ShapedRecipe(new ItemStack(Material.CHAINMAIL_HELMET));
      Chelmet.shape(new String[] { "FFF", "FNF", "NNN" });
      Chelmet.setIngredient('F', Material.IRON_FENCE);
      Bukkit.getServer().addRecipe(Chelmet);
    }
    if (this.plugin.getConfig().getBoolean("Chain ChestPiece")) {
      ShapedRecipe Cchestpiece = new ShapedRecipe(new ItemStack(Material.CHAINMAIL_CHESTPLATE));
      Cchestpiece.shape(new String[] { "FNF", "FFF", "FFF" });
      Cchestpiece.setIngredient('F', Material.IRON_FENCE);
      Bukkit.getServer().addRecipe(Cchestpiece);
    }
    if (this.plugin.getConfig().getBoolean("Chain Leggings")) {
      ShapedRecipe Cleggings = new ShapedRecipe(new ItemStack(Material.CHAINMAIL_LEGGINGS));
      Cleggings.shape(new String[] { "FFF", "FNF", "FNF" });
      Cleggings.setIngredient('F', Material.IRON_FENCE);
      Bukkit.getServer().addRecipe(Cleggings);
    }
    if (this.plugin.getConfig().getBoolean("Chain Boots")) {
      ShapedRecipe Cboots = new ShapedRecipe(new ItemStack(Material.CHAINMAIL_BOOTS));
      Cboots.shape(new String[] { "NNN", "FNF", "FNF" });
      Cboots.setIngredient('F', Material.IRON_FENCE);
      Bukkit.getServer().addRecipe(Cboots);
    }
    if (this.plugin.getConfig().getBoolean("Bottle o Enchanting")) {
      ShapedRecipe expbottle = new ShapedRecipe(new ItemStack(Material.EXP_BOTTLE));
      expbottle.shape(new String[] { "GLG", "LEL", "LLL" });
      expbottle.setIngredient('G', Material.GOLD_INGOT);
      expbottle.setIngredient('L', Material.GLASS);
      expbottle.setIngredient('E', Material.EMERALD);
      Bukkit.getServer().addRecipe(expbottle);
    }
    if (this.plugin.getConfig().getBoolean("Sponge")) {
      ShapedRecipe sponge = new ShapedRecipe(new ItemStack(Material.SPONGE));
      sponge.shape(new String[] { "SCS", "CSC", "SCS" });
      sponge.setIngredient('S', Material.SAND);
      sponge.setIngredient('C', Material.CLAY);
      Bukkit.getServer().addRecipe(sponge);
    }
    if (this.plugin.getConfig().getBoolean("Bedrock")) {
      ShapedRecipe bedrock = new ShapedRecipe(new ItemStack(Material.BEDROCK));
      bedrock.shape(new String[] { "COC", "OCO", "COC" });
      bedrock.setIngredient('O', Material.OBSIDIAN);
      bedrock.setIngredient('C', Material.COBBLESTONE);
      Bukkit.getServer().addRecipe(bedrock);
    }
    if (this.plugin.getConfig().getBoolean("Redstone Ore")) {
      ShapedRecipe redstone = new ShapedRecipe(new ItemStack(Material.REDSTONE_ORE));
      redstone.shape(new String[] { "RRR", "RSR", "RRR" });
      redstone.setIngredient('S', Material.STONE);
      redstone.setIngredient('R', Material.REDSTONE);
      Bukkit.getServer().addRecipe(redstone);
    }
    if (this.plugin.getConfig().getBoolean("Dragon Egg")) {
      ShapedRecipe dragonegg = new ShapedRecipe(new ItemStack(Material.DRAGON_EGG));
      dragonegg.shape(new String[] { "NNN", "NON", "OEO" });
      dragonegg.setIngredient('O', Material.OBSIDIAN);
      dragonegg.setIngredient('E', Material.EGG);
      Bukkit.getServer().addRecipe(dragonegg);
    }
    if (this.plugin.getConfig().getBoolean("Gunpowder")) {
      ShapedRecipe gunpowder = new ShapedRecipe(new ItemStack(Material.SULPHUR, 2));
      gunpowder.shape(new String[] { "NNN", "NCN", "NRN" });
      gunpowder.setIngredient('C', Material.COAL_BLOCK);
      gunpowder.setIngredient('R', Material.REDSTONE_BLOCK);
      Bukkit.getServer().addRecipe(gunpowder);
    }
    if (this.plugin.getConfig().getBoolean("Monster Spawner")) {
      ShapedRecipe spawner = new ShapedRecipe(new ItemStack(Material.MOB_SPAWNER));
      spawner.shape(new String[] { "OOO", "OIO", "OOO" });
      spawner.setIngredient('O', Material.OBSIDIAN);
      spawner.setIngredient('I', Material.IRON_INGOT);
      Bukkit.getServer().addRecipe(spawner);
    }
    if (this.plugin.getConfig().getBoolean("Command Block")) {
      ShapedRecipe commandblock = new ShapedRecipe(new ItemStack(Material.COMMAND));
      commandblock.shape(new String[] { "CWC", "WIW", "CWC" });
      commandblock.setIngredient('C', Material.WORKBENCH);
      commandblock.setIngredient('I', Material.IRON_INGOT);
      commandblock.setIngredient('W', Material.WOOD);
      Bukkit.getServer().addRecipe(commandblock);
    }
    if (this.plugin.getConfig().getBoolean("Podzol")) {
      ItemStack Podzol = new ItemStack(Material.DIRT, 1, (short)2);
      ShapedRecipe pod = new ShapedRecipe(Podzol);
      pod.shape(new String[] { "NNN", "NNN", "DDD" });
      pod.setIngredient('D', Material.DIRT);
      Bukkit.getServer().addRecipe(pod);
    }
    if (this.plugin.getConfig().getBoolean("Double Tallgrass")) {    
      ShapedRecipe DTGrass = new ShapedRecipe(new ItemStack(Material.DOUBLE_PLANT, 1, (short)2));
      DTGrass.shape(new String[] { "NSN", "NSN", "NDN" });
      DTGrass.setIngredient('S', Material.SEEDS);
      DTGrass.setIngredient('D', Material.GRASS);
      Bukkit.getServer().addRecipe(DTGrass);
    }
    if (this.plugin.getConfig().getBoolean("Packed Ice")) {
      ShapedRecipe packedice = new ShapedRecipe(new ItemStack(Material.PACKED_ICE));
      packedice.shape(new String[] { "NNN", "NII", "NII" });
      packedice.setIngredient('I', Material.ICE);
      Bukkit.getServer().addRecipe(packedice);
    }
    if (this.plugin.getConfig().getBoolean("Pig Egg")) {
    ShapedRecipe pigegg = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)90));
    pigegg.shape(new String[] { "PPP", "PEP", "PPP" });
    pigegg.setIngredient('P', Material.PORK);
    pigegg.setIngredient('E', Material.EGG);
    Bukkit.getServer().addRecipe(pigegg);
    }
    if (this.plugin.getConfig().getBoolean("Cow Egg")) {
    ShapedRecipe cowegg = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)92));
    cowegg.shape(new String[] { "PPP", "PEP", "PPP" });
    cowegg.setIngredient('P', Material.RAW_BEEF);
    cowegg.setIngredient('E', Material.EGG);
    Bukkit.getServer().addRecipe(cowegg);
    }
    if (this.plugin.getConfig().getBoolean("Chicken Egg")) {
    ShapedRecipe chickenegg = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)93));
    chickenegg.shape(new String[] { "PPP", "PEP", "PPP" });
    chickenegg.setIngredient('P', Material.RAW_CHICKEN);
    chickenegg.setIngredient('E', Material.EGG);
    Bukkit.getServer().addRecipe(chickenegg);
    }
    if (this.plugin.getConfig().getBoolean("Bat Egg")) {
    ShapedRecipe bategg = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)65));
    bategg.shape(new String[] { "PPP", "PEP", "PPP" });
    bategg.setIngredient('P', Material.FEATHER);
    bategg.setIngredient('E', Material.EGG);
    Bukkit.getServer().addRecipe(bategg);
    }
    if (this.plugin.getConfig().getBoolean("Horse Egg")) {
    ShapedRecipe horseegg = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)100));
    horseegg.shape(new String[] { "PPP", "PEP", "PPP" });
    horseegg.setIngredient('P', Material.LEATHER);
    horseegg.setIngredient('E', Material.EGG);
    Bukkit.getServer().addRecipe(horseegg);
    }
    if (this.plugin.getConfig().getBoolean("Ocelot Egg")) {
    ShapedRecipe ocelotegg = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)98));
    ocelotegg.shape(new String[] { "PPP", "PEP", "PPP" });
    ocelotegg.setIngredient('P', Material.RAW_FISH);
    ocelotegg.setIngredient('E', Material.EGG);
    Bukkit.getServer().addRecipe(ocelotegg);
    }
    if (this.plugin.getConfig().getBoolean("Wolf Egg")) {
    ShapedRecipe wolfegg = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)95));
    wolfegg.shape(new String[] { "PPP", "PEP", "PPP" });
    wolfegg.setIngredient('P', Material.BONE);
    wolfegg.setIngredient('E', Material.EGG);
    Bukkit.getServer().addRecipe(wolfegg);
    }
    if (this.plugin.getConfig().getBoolean("Squid Egg")) {
    ShapedRecipe squidegg = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)94));
    squidegg.shape(new String[] { "PPP", "PEP", "PPP" });
    squidegg.setIngredient('P', Material.INK_SACK);
    squidegg.setIngredient('E', Material.EGG);
    Bukkit.getServer().addRecipe(squidegg);
    }
    if (this.plugin.getConfig().getBoolean("Sheep Egg")) {
    ShapedRecipe sheepegg = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)91));
    sheepegg.shape(new String[] { "PPP", "PEP", "PPP" });
    sheepegg.setIngredient('P', Material.STRING);
    sheepegg.setIngredient('E', Material.EGG);
    Bukkit.getServer().addRecipe(sheepegg);
    }
    if (this.plugin.getConfig().getBoolean("Mooshroom Egg")) {
    ShapedRecipe mooshroomegg = new ShapedRecipe(new ItemStack(Material.MONSTER_EGG, 1, (short)96));
    mooshroomegg.shape(new String[] { "PPP", "PEP", "PPP" });
    mooshroomegg.setIngredient('P', Material.RED_MUSHROOM);
    mooshroomegg.setIngredient('E', Material.EGG);
    Bukkit.getServer().addRecipe(mooshroomegg);
    }
  }
}