package com.flippity.ei.common.items;

import com.flippity.ei.common.blocks.base.cables.superconductor.BlockCableSuperconductorInsulated;
import com.flippity.ei.common.items.atomic.metals.ItemPuckUranium235;
import com.flippity.ei.common.items.atomic.tools.Antidote;
import com.flippity.ei.common.items.base.cables.superconductor.ItemBlockCableSuperconductorInsulated;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ItemRegistry {
	public static Item antidote;
	public static Item puckU235;

	public static void initItems() {
		antidote = new Antidote(null, 0, 0, false);
		GameRegistry.registerItem(antidote, "antidote");
		puckU235 = new ItemPuckUranium235();
		GameRegistry.registerItem(puckU235, "puckU235");
		
	}
}
