package com.flippity.ei.client.armor;

import com.flippity.ei.client.armor.hazmat.ArmorHazmat;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ArmorRegistry {
	
	public static Item hazmatHelmet;
	public static Item hazmatChest;
	public static Item hazmatPants;
	public static Item hazmatBoots;
	public static ArmorMaterial HAZMAT = EnumHelper.addArmorMaterial("HAZMAT", 99, new int[] { 0, 0, 0, 0 }, 0);

	
	public static void initItems() {
		GameRegistry.registerItem(hazmatHelmet = new ArmorHazmat("hazmatHelmet", HAZMAT, "hazmat", 0), "hazmatHelmet"); // 0
		// for
		// helmet
GameRegistry.registerItem(hazmatChest = new ArmorHazmat("hazmatChest", HAZMAT, "hazmat", 1), "hazmatChest"); // 1
		// for
		// chestplate
GameRegistry.registerItem(hazmatPants = new ArmorHazmat("hazmatPants", HAZMAT, "hazmat", 2), "hazmatPants"); // 2
		// for
		// leggings
GameRegistry.registerItem(hazmatBoots = new ArmorHazmat("hazmatBoots", HAZMAT, "hazmat", 3), "hazmatBoots"); // 3


	}
}
