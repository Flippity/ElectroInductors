package com.flippity.ei.common.tiles;

import com.flippity.ei.common.tiles.base.cables.copper.TECableCopperInsulated;
import com.flippity.ei.common.tiles.base.cables.copper.TECableCopperUninsulated;
import com.flippity.ei.common.tiles.base.cables.superconductor.TECableSuperconductorInsulated;
import com.flippity.ei.common.tiles.base.cables.superconductor.TECableSuperconductorUninsulated;

import cpw.mods.fml.common.registry.GameRegistry;

public class TileEntityRegistry {
	public static void registerTE() {
		GameRegistry.registerTileEntity(TECableCopperUninsulated.class, "CopperCableUninsulated");
		GameRegistry.registerTileEntity(TECableCopperInsulated.class, "CopperCableInsulated");
		GameRegistry.registerTileEntity(TECableSuperconductorUninsulated.class, "SuperconductorCableUninsulated");
		GameRegistry.registerTileEntity(TECableSuperconductorInsulated.class, "SuperconductorCableInsulated");
	}
}
