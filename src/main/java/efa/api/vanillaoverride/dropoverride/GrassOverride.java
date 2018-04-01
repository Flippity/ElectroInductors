package efa.api.vanillaoverride.dropoverride;

import com.flippity.ei.common.items.ItemRegistry;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent;

public class GrassOverride {

	
	
	public static void event(BlockEvent.HarvestDropsEvent events) {
		if(events.block == Blocks.tallgrass) {
			events.drops.add(new ItemStack(ItemRegistry.guayuleSeeds));
		}
	}
}
