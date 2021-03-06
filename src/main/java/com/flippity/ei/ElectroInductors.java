package com.flippity.ei;

import com.flippity.ei.client.ClientProxy;
import com.flippity.ei.client.armor.ArmorRegistry;
import com.flippity.ei.common.CommonProxy;
import com.flippity.ei.common.blocks.BlockRegistry;
import com.flippity.ei.common.items.ItemRegistry;
import com.flippity.ei.common.potion.PotionRegistry;
import com.flippity.ei.common.tiles.TileEntityRegistry;
import com.flippity.ei.reference.Reference;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(name = Reference.MOD_NAME, modid = Reference.MOD_ID, version = Reference.MOD_VER, dependencies = "after:ForgeMultipart")

public class ElectroInductors {

	@SidedProxy(clientSide = "com.flippity.ei.client.ClientProxy", serverSide = "com.flippity.ei.server.ServerProxy")
	public static CommonProxy proxy;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		BlockRegistry.initBlocks();
		PotionRegistry.initPotion();
		ArmorRegistry.initItems();
		ItemRegistry.initItems();
		
		ClientProxy.registerRenderers();
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		TileEntityRegistry.registerTE();
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
	}

}
