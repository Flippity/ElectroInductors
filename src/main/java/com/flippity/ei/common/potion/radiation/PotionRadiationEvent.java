package com.flippity.ei.common.potion.radiation;

import com.flippity.ei.client.armor.hazmat.ArmorHazmat;
import com.flippity.ei.common.potion.PotionRegistry;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;

public class PotionRadiationEvent {
	public static int dur;
	@SubscribeEvent
	public void onEntityUpdate(LivingUpdateEvent e) {		
			if (e.entityLiving.isPotionActive(PotionRegistry.Radiation)) {
				if (e.entityLiving.getActivePotionEffect(PotionRegistry.Radiation).getDuration() == 0) {
					e.entityLiving.removePotionEffect(PotionRegistry.Radiation.id);
					return;
				}else if (e.entityLiving.worldObj.rand.nextInt(10) == 0) {
					e.entityLiving.attackEntityFrom(DamageSource.generic, 2);
			}
		}
	}
}
