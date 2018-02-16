package com.flippity.ei.common.blocks;

import com.flippity.ei.common.blocks.cables.BlockCableCopper;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class BlockRegistry {
	public static Block blockCableCopper;
	public static void initBlocks() {
		blockCableCopper = new BlockCableCopper();
		GameRegistry.registerBlock(blockCableCopper, "BlockCableCopper");
	}
}
