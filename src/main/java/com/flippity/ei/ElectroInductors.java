package com.flippity.ei;

import com.flippity.ei.client.ClientProxy;
import com.flippity.ei.client.armor.ArmorRegistry;
import com.flippity.ei.client.gui.GuiHandler;
import com.flippity.ei.client.recipes.Recipes;
import com.flippity.ei.client.recipes.Smelting;
import com.flippity.ei.client.world.worldgen.ore.AluminumGen;
import com.flippity.ei.client.world.worldgen.ore.CopperGen;
import com.flippity.ei.client.world.worldgen.ore.UraniumGen;
import com.flippity.ei.common.CommonProxy;
import com.flippity.ei.common.blocks.BlockRegistry;
import com.flippity.ei.common.blocks.FluidsRegistry;
import com.flippity.ei.common.items.ItemRegistry;
import com.flippity.ei.common.potion.PotionRegistry;
import com.flippity.ei.common.tiles.TileEntityRegistry;
import com.flippity.ei.reference.Reference;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import efa.api.vanillaoverride.dropoverride.DropOverrides;

@Mod(name = Reference.MOD_NAME, modid = Reference.MOD_ID, version = Reference.MOD_VER, dependencies = "after:ForgeMultipart")

public class ElectroInductors {

	@SidedProxy(clientSide = "com.flippity.ei.client.ClientProxy", serverSide = "com.flippity.ei.server.ServerProxy")
	public static CommonProxy proxy;

	
	public static ElectroInductors instance;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		instance = this;
		NetworkRegistry.INSTANCE.registerGuiHandler(this.instance, new GuiHandler());  
		BlockRegistry.initBlocks();
		PotionRegistry.initPotion();
		ArmorRegistry.initItems();
		ItemRegistry.initItems();
		ClientProxy.registerRenderers();
		Recipes.initRecipes();
		Smelting.initRecipes();
		FluidsRegistry.fluidInit();
		FluidsRegistry.bucketInit();
		//overrides
		DropOverrides.Override();
		
		//Ore
		GameRegistry.registerWorldGenerator(new AluminumGen(), 0);
		GameRegistry.registerWorldGenerator(new CopperGen(), 0);
		GameRegistry.registerWorldGenerator(new UraniumGen(), 0);
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		TileEntityRegistry.registerTE();
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
	}

}
