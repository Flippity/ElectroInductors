package com.flippity.ei.client.armor.hazmat;

import java.util.List;

import org.lwjgl.util.Timer;

import com.flippity.ei.client.armor.ArmorRegistry;
import com.flippity.ei.client.gui.Tabs;
import com.flippity.ei.common.items.atomic.metals.ItemPuckUranium235;
import com.flippity.ei.common.potion.PotionRegistry;
import com.flippity.ei.reference.Reference;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class ArmorHazmat extends ItemArmor {
	public String textureName;

	public ArmorHazmat(String unlocalizedName, ArmorMaterial material, String textureName, int type) {
		super(material, 0, type);
		this.textureName = textureName;
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName(Reference.MOD_ID + ":" + unlocalizedName);
		this.setCreativeTab(Tabs.tabItems);
		this.setMaxStackSize(1);
		this.setNoRepair();
		this.setMaxDamage(100000);
	}
	
	@Override
	public void addInformation(ItemStack itemStack, EntityPlayer player, List list, boolean par3) {
        if(GuiScreen.isShiftKeyDown()){
        	list.add("Protects against radiation");
        }else{
            list.add("Press shift for info");
        }
    }

	public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, String layer) {
		if ((itemstack.getItem() == ArmorRegistry.hazmatHelmet)
				|| (itemstack.getItem() == ArmorRegistry.hazmatChest)
				|| (itemstack.getItem() == ArmorRegistry.hazmatBoots)) {
			return "ei:textures/armor/textureName_1.png";
		}
		if (itemstack.getItem() == ArmorRegistry.hazmatPants) {
			return "ei:textures/armor/textureName_2.png";
		}
		return null;
	}

	{
	}
	int duration;

	public static boolean suited = false;
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		if (player.getCurrentArmor(3) != null && player.getCurrentArmor(3).getItem().equals(ArmorRegistry.hazmatHelmet)
			&& player.getCurrentArmor(2) != null
			&& player.getCurrentArmor(2).getItem().equals(ArmorRegistry.hazmatChest)
			&& player.getCurrentArmor(1) != null
			&& player.getCurrentArmor(1).getItem().equals(ArmorRegistry.hazmatPants)
			&& player.getCurrentArmor(0) != null
			&& player.getCurrentArmor(0).getItem().equals(ArmorRegistry.hazmatBoots)) {
				suited = true;
				if(player.isPotionActive(PotionRegistry.Radiation) == true) {
					if(duration > 0) {
						player.getCurrentArmor(3).damageItem(10, player);
						player.getCurrentArmor(2).damageItem(10, player);
						player.getCurrentArmor(1).damageItem(10, player);
						player.getCurrentArmor(0).damageItem(10, player);
					}
					if(player.getActivePotionEffect(PotionRegistry.Radiation).getDuration() <= 0) {
						player.removePotionEffectClient(PotionRegistry.Radiation.getId());
					}
			}
		}else {
			suited = false;
		}
	}
}
