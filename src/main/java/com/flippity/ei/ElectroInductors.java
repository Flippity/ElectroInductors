package com.flippity.ei;

import com.flippity.ei.client.ClientProxy;
import com.flippity.ei.common.CommonProxy;
import com.flippity.ei.common.blocks.BlockRegistry;
import com.flippity.ei.reference.Reference;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(name = Reference.MOD_NAME, modid = Reference.MOD_ID, version = Reference.MOD_VER)

public class ElectroInductors {

	@SidedProxy(clientSide = "com.flippity.ei.client.ClientProxy", serverSide = "com.flippity.ei.server.ServerProxy")
	public static CommonProxy proxy;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		BlockRegistry.initBlocks();
		ClientProxy.registerRenderers();
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {

	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
	}

}
