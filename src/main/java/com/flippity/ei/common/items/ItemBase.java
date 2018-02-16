package com.flippity.ei.common.items;

import com.flippity.ei.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ItemBase extends Item{
	public ItemBase(String name) {
		this.setUnlocalizedName(name);
		this.setTextureName(Reference.MOD_ID + ":" + name);
	}
}
