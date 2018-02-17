package com.flippity.ei.common.tiles;

import com.flippity.ei.common.tiles.cables.copper.TECableCopperInsulated;
import com.flippity.ei.common.tiles.cables.copper.TECableCopperUninsulated;
import com.flippity.ei.common.tiles.cables.superconductor.TECableSuperconductorUninsulated;

import cpw.mods.fml.common.registry.GameRegistry;

public class TileEntityRegistry {
	public static void registerTE() {
		GameRegistry.registerTileEntity(TECableCopperUninsulated.class, "CopperCableUninsulated");
		GameRegistry.registerTileEntity(TECableCopperInsulated.class, "CopperCableInsulated");
		GameRegistry.registerTileEntity(TECableSuperconductorUninsulated.class, "SuperconductorCableUninsulated");
	}
}
