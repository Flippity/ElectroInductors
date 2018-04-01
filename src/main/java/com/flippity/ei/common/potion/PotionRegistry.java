package com.flippity.ei.common.potion;

import com.flippity.ei.common.potion.radiation.EffectRadiation;
import com.flippity.ei.common.potion.radiation.PotionRadiationEvent;

import net.minecraft.potion.Potion;
import net.minecraftforge.common.MinecraftForge;

public class PotionRegistry {
	public static Potion Radiation;
	public static void initPotion() {
		Radiation = new EffectRadiation(25, true, 0).setIconIndex(0, 0).setPotionName("potion.radiationEffect");
		MinecraftForge.EVENT_BUS.register(new PotionRadiationEvent());
	}
}
