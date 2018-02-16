package com.flippity.ei.client;

import com.flippity.ei.client.renderers.GenericItemBlockRenderer;
import com.flippity.ei.client.renderers.cables.RendererCableCopper;
import com.flippity.ei.common.CommonProxy;
import com.flippity.ei.common.blocks.BlockRegistry;
import com.flippity.ei.common.tiles.cables.TECableCopper;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy {

	public static void registerRenderers() {

		registerItemRenderers();
		ClientRegistry.bindTileEntitySpecialRenderer(TECableCopper.class, new RendererCableCopper());
	}
	
	public static void registerItemRenderers() {
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockRegistry.blockCableCopper), new GenericItemBlockRenderer(new TECableCopper(), new RendererCableCopper()));
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