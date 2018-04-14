package com.flippity.ei.server;

import com.flippity.ei.ElectroInductors;
import com.flippity.ei.client.gui.GuiHandler;
import com.flippity.ei.common.CommonProxy;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;

public class ServerProxy extends CommonProxy{
	
	public void registerNetworkStuff(){
		NetworkRegistry.INSTANCE.registerGuiHandler(ElectroInductors.instance, new GuiHandler());
	}
	
	@Override
	public void preInit(FMLPreInitializationEvent e) {
		super.preInit(e);

	}

	@Override
	public void init(FMLInitializationEvent e) {
		super.init(e);
	}

	@Override
	public void postInit(FMLPostInitializationEvent e) {
		super.postInit(e);

	}
}
