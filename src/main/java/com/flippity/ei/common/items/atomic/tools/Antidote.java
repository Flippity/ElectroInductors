package com.flippity.ei.common.items.atomic.tools;

import java.util.List;

import com.flippity.ei.client.gui.Tabs;
import com.flippity.ei.common.potion.PotionRegistry;
import com.flippity.ei.reference.Reference;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Antidote extends ItemFood {

	public Antidote(String unlocalizedName, int healAmount, float saturationModifier, boolean wolvesFavorite) {
		super(healAmount, saturationModifier, wolvesFavorite);
		this.setUnlocalizedName("antidote");
		this.setTextureName(Reference.MOD_ID + ":antidote");
		this.setCreativeTab(Tabs.tabItems);
		this.setAlwaysEdible();
	}

	@Override
	public void addInformation(ItemStack itemStack, EntityPlayer player, List list, boolean par3) {
        list.add("Cures radiation poisoning");
	}



	@Override
	protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player) {
		super.onFoodEaten(stack, world, player);
		player.removePotionEffectClient(PotionRegistry.Radiation.getId());
	}

}
