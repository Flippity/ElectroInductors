package efa.api.vanillaoverride.dropoverride;

import com.flippity.ei.common.items.ItemRegistry;

import net.minecraft.item.ItemStack;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.common.MinecraftForge;

public class DropOverrides {

	public static void Override() {
		MinecraftForge.EVENT_BUS.register(new GrassOverride());
		MinecraftForge.addGrassSeed(new ItemStack(ItemRegistry.guayuleSeeds), 10);
	}
	
}
