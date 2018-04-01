package com.flippity.ei.client.recipes;

import com.flippity.ei.common.blocks.BlockRegistry;
import com.flippity.ei.common.items.ItemRegistry;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;

public class Smelting {
	public static void initRecipes() {
		//ores -> ingots
		GameRegistry.addSmelting(BlockRegistry.oreAluminum, new ItemStack(ItemRegistry.aluminumIngot), 1.0F);
		GameRegistry.addSmelting(BlockRegistry.oreCopper, new ItemStack(ItemRegistry.copperIngot), 1.0F);
		
		//dusts -> ingots
		GameRegistry.addSmelting(ItemRegistry.aluminumDust, new ItemStack(ItemRegistry.aluminumIngot), 1.0F);
		GameRegistry.addSmelting(ItemRegistry.copperDust, new ItemStack(ItemRegistry.copperIngot), 1.0F);
		
		
		//raw rubber -> rubber
		GameRegistry.addSmelting(ItemRegistry.rubberRaw, new ItemStack(ItemRegistry.rubber), 1.0F);
	}
}
