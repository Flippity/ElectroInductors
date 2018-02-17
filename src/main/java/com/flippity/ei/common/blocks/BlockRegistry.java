package com.flippity.ei.common.blocks;

import com.flippity.ei.common.blocks.base.cables.copper.BlockCableCopperInsulated;
import com.flippity.ei.common.blocks.base.cables.copper.BlockCableCopperUninsulated;
import com.flippity.ei.common.blocks.base.cables.superconductor.BlockCableSuperconductorInsulated;
import com.flippity.ei.common.blocks.base.cables.superconductor.BlockCableSuperconductorUninsulated;
import com.flippity.ei.common.items.base.cables.copper.ItemBlockCableCopperInsulated;
import com.flippity.ei.common.items.base.cables.copper.ItemBlockCableCopperUninsulated;
import com.flippity.ei.common.items.base.cables.superconductor.ItemBlockCableSuperconductorInsulated;
import com.flippity.ei.common.items.base.cables.superconductor.ItemBlockCableSuperconductorUninsulated;

//import com.flippity.ei.common.blocks.base.cables.superconductor.BlockCableSuperconductorUninsulated;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class BlockRegistry {
	public static Block blockCableCopperUninsulated;
	public static Block blockCableCopperInsulated;
	public static Block blockCableSuperconductorUninsulated;
	public static Block blockCableSuperconductorInsulated;

	public static void initBlocks() {
		blockCableCopperUninsulated = new BlockCableCopperUninsulated();
		GameRegistry.registerBlock(blockCableCopperUninsulated, ItemBlockCableCopperUninsulated.class, "BlockCableCopperUninsulated");
		blockCableCopperInsulated = new BlockCableCopperInsulated();
		GameRegistry.registerBlock(blockCableCopperInsulated, ItemBlockCableCopperInsulated.class, "BlockCableCopperInsulated");
		
		blockCableSuperconductorUninsulated = new BlockCableSuperconductorUninsulated();
		GameRegistry.registerBlock(blockCableSuperconductorUninsulated, ItemBlockCableSuperconductorUninsulated.class, "BlockCableSuperconductorUninsulated");
		blockCableSuperconductorInsulated = new BlockCableSuperconductorInsulated();
		GameRegistry.registerBlock(blockCableSuperconductorInsulated, ItemBlockCableSuperconductorInsulated.class, "BlockCableSuperconductorInsulated");

	}
}
