package com.flippity.ei.client;

import com.flippity.ei.client.renderers.GenericBlockItemRenderer;
import com.flippity.ei.client.renderers.cables.copper.RendererCableCopperInsulated;
import com.flippity.ei.client.renderers.cables.copper.RendererCableCopperUninsulated;
import com.flippity.ei.client.renderers.cables.superconducter.RendererCableSuperconductorInsulated;
import com.flippity.ei.client.renderers.cables.superconducter.RendererCableSuperconductorUninsulated;
import com.flippity.ei.common.CommonProxy;
import com.flippity.ei.common.blocks.BlockRegistry;
import com.flippity.ei.common.tiles.cables.copper.TECableCopperInsulated;
import com.flippity.ei.common.tiles.cables.copper.TECableCopperUninsulated;
import com.flippity.ei.common.tiles.cables.superconductor.TECableSuperconductorInsulated;
import com.flippity.ei.common.tiles.cables.superconductor.TECableSuperconductorUninsulated;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy {

	public static void registerRenderers() {

		registerItemRenderers();
		ClientRegistry.bindTileEntitySpecialRenderer(TECableCopperUninsulated.class, new RendererCableCopperUninsulated());
		ClientRegistry.bindTileEntitySpecialRenderer(TECableCopperInsulated.class, new RendererCableCopperInsulated());
		ClientRegistry.bindTileEntitySpecialRenderer(TECableSuperconductorUninsulated.class, new RendererCableSuperconductorUninsulated());
		ClientRegistry.bindTileEntitySpecialRenderer(TECableSuperconductorInsulated.class, new RendererCableSuperconductorInsulated());

	}
	
	public static void registerItemRenderers() {
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockRegistry.blockCableCopperInsulated), new GenericBlockItemRenderer(new TECableCopperInsulated(), new RendererCableCopperInsulated()));
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockRegistry.blockCableCopperUninsulated), new GenericBlockItemRenderer(new TECableCopperUninsulated(), new RendererCableCopperUninsulated()));
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockRegistry.blockCableSuperconductorUninsulated), new GenericBlockItemRenderer(new TECableSuperconductorUninsulated(), new RendererCableSuperconductorUninsulated()));
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockRegistry.blockCableSuperconductorInsulated), new GenericBlockItemRenderer(new TECableSuperconductorInsulated(), new RendererCableSuperconductorInsulated()));

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