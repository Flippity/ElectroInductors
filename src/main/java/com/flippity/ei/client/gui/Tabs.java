package com.flippity.ei.client.gui;

import com.flippity.ei.common.blocks.BlockRegistry;
import com.flippity.ei.common.items.ItemRegistry;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Tabs {
	
	
	public static CreativeTabs tabItems = new CreativeTabs("ElectroInductors Atomic") {
		@Override
		public Item getTabIconItem() {
			return ItemRegistry.antidote;
		}
	};


	public static CreativeTabs tabBlocks = new CreativeTabs("ElectroInductors Base") {
		@Override
		public Item getTabIconItem() {
			return Item.getItemFromBlock(BlockRegistry.blockCableCopperInsulated);
		}
	};

}
