package com.flippity.ei.common.blocks;

import com.flippity.ei.common.blocks.atomic.BlockElectromagnet;
import com.flippity.ei.common.blocks.atomic.BlockElectromagnetGlass;
//import com.flippity.ei.common.blocks.base.batteries.BlockBatteryT1;
import com.flippity.ei.common.blocks.base.cables.copper.BlockCableCopperInsulated;
import com.flippity.ei.common.blocks.base.cables.copper.BlockCableCopperUninsulated;
import com.flippity.ei.common.blocks.base.cables.superconductor.BlockCableSuperconductorInsulated;
import com.flippity.ei.common.blocks.base.cables.superconductor.BlockCableSuperconductorUninsulated;
import com.flippity.ei.common.items.atomic.ItemBlockElectromagnet;
import com.flippity.ei.common.items.base.cables.copper.ItemBlockCableCopperInsulated;
import com.flippity.ei.common.items.base.cables.copper.ItemBlockCableCopperUninsulated;
import com.flippity.ei.common.items.base.cables.superconductor.ItemBlockCableSuperconductorInsulated;
import com.flippity.ei.common.items.base.cables.superconductor.ItemBlockCableSuperconductorUninsulated;

//import com.flippity.ei.common.blocks.base.cables.superconductor.BlockCableSuperconductorUninsulated;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class BlockRegistry {
	
	//base
		//copper
	public static Block blockCableCopperUninsulated;
	public static Block blockCableCopperInsulated;
		//superconductor
	public static Block blockCableSuperconductorUninsulated;
	public static Block blockCableSuperconductorInsulated;
		//logs
	public static Block blockLogRubber;
		//batteries
	public static Block blockBatteryT1;

	//atomic
		//electromagnet
	public static Block blockElectromagnet;
	public static Block blockElectromagnetGlass;
	public static void initBlocks() {
		
		//base
			//copper
		blockCableCopperUninsulated = new BlockCableCopperUninsulated();
		GameRegistry.registerBlock(blockCableCopperUninsulated, ItemBlockCableCopperUninsulated.class, "BlockCableCopperUninsulated");
		blockCableCopperInsulated = new BlockCableCopperInsulated();
		GameRegistry.registerBlock(blockCableCopperInsulated, ItemBlockCableCopperInsulated.class, "BlockCableCopperInsulated");
			//superconductor
		blockCableSuperconductorUninsulated = new BlockCableSuperconductorUninsulated();
		GameRegistry.registerBlock(blockCableSuperconductorUninsulated, ItemBlockCableSuperconductorUninsulated.class, "BlockCableSuperconductorUninsulated");
		blockCableSuperconductorInsulated = new BlockCableSuperconductorInsulated();
		GameRegistry.registerBlock(blockCableSuperconductorInsulated, ItemBlockCableSuperconductorInsulated.class, "BlockCableSuperconductorInsulated");
			//logs


			//batteries
		//blockBatteryT1 = new BlockBatteryT1();
		//GameRegistry.registerBlock(blockBatteryT1, "BlockBatteryT1");
		
		
		//atomic
			//electromagnet
		blockElectromagnet = new BlockElectromagnet();
		GameRegistry.registerBlock(blockElectromagnet, ItemBlockElectromagnet.class, "BlockElectromagnet");	
		blockElectromagnetGlass = new BlockElectromagnetGlass();
		GameRegistry.registerBlock(blockElectromagnetGlass, ItemBlockElectromagnet.class, "BlockElectromagnetGlass");	
	}
}
