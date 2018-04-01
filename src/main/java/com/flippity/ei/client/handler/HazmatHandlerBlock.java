package com.flippity.ei.client.handler;

import com.flippity.ei.client.armor.hazmat.ArmorHazmat;
import com.flippity.ei.common.potion.PotionRegistry;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class HazmatHandlerBlock {

	
	public static boolean isPotionActive = false;
	public static boolean radiation;
	public static boolean canRemovePotion = true;
	
	public static void handlePotionEffect(Entity e) {
		
		EntityPlayer player = (EntityPlayer) e;

		
		radiation = true;
		isPotionActive = player.isPotionActive(PotionRegistry.Radiation);
		
		if(radiation == true || isPotionActive == true) {
			if(ArmorHazmat.suited == false && radiation == true || isPotionActive == true &! ArmorHazmat.suited == true) {
				player.addPotionEffect(new PotionEffect(PotionRegistry.Radiation.getId(), 1500, 0));
			}
			if(ArmorHazmat.suited == true) {
				if(isPotionActive == true) {}
				if(isPotionActive == false) {
					player.removePotionEffectClient(PotionRegistry.Radiation.getId());
				}
			}
		}
	}
	
}