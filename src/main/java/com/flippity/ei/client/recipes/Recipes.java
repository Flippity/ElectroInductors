package com.flippity.ei.client.recipes;

import com.flippity.ei.client.armor.ArmorRegistry;
import com.flippity.ei.common.blocks.BlockRegistry;
import com.flippity.ei.common.items.ItemRegistry;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class Recipes {
	public static void initRecipes() {
		//ingots -> blocks
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.blockAluminum), new Object[] { "bbb", "bbb", "bbb", 'b', ItemRegistry.aluminumIngot });
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.blockCopper), new Object[] { "bbb", "bbb", "bbb", 'b', ItemRegistry.copperIngot });
	
	
		//blocks -> ingots
		GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.aluminumIngot, 9), new ItemStack(BlockRegistry.blockAluminum, 1)); 
		
		//ingots -> cables
		GameRegistry.addRecipe(new ItemStack(BlockRegistry.blockCableCopperUninsulated, 3), new Object[] { "   ", "bbb", "   ", 'b', ItemRegistry.copperIngot});
		GameRegistry.addShapelessRecipe(new ItemStack(BlockRegistry.blockCableCopperInsulated), new ItemStack(BlockRegistry.blockCableCopperUninsulated), new ItemStack(ItemRegistry.rubber));
		
		//hazmat
		GameRegistry.addRecipe(new ItemStack(ArmorRegistry.hazmatHelmet), new Object[] { "blb", "b b", "   ", 'b', ItemRegistry.rubber, 'l', ItemRegistry.leadIngot});
		GameRegistry.addRecipe(new ItemStack(ArmorRegistry.hazmatChest), new Object[] { "b b", "blb", "bbb", 'b', ItemRegistry.rubber, 'l', ItemRegistry.leadIngot});
		GameRegistry.addRecipe(new ItemStack(ArmorRegistry.hazmatPants), new Object[] { "blb", "b b", "b b", 'b', ItemRegistry.rubber, 'l', ItemRegistry.leadIngot});
		GameRegistry.addRecipe(new ItemStack(ArmorRegistry.hazmatBoots), new Object[] { "   ", "b b", "b b", 'b', ItemRegistry.rubber});


	}
}