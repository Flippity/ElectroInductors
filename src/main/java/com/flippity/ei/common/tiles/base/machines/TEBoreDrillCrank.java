package com.flippity.ei.common.tiles.base.machines;

import com.flippity.ei.client.renderers.machines.RendererBoreDrillCrank;
import com.flippity.ei.common.blocks.base.machines.BlockBoreDrillCrank;
import com.flippity.ei.common.tiles.base.cables.copper.TECableCopperInsulated;
import com.flippity.ei.common.tiles.base.cables.copper.TECableCopperUninsulated;

import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.util.ForgeDirection;

public class TEBoreDrillCrank extends TileEntity {
	
	
	public TEBoreDrillCrank() {}
	public static boolean rotate;
	int i = 0;
	@Override
	public void updateEntity() {
		i++;
		if(BlockBoreDrillCrank.rotate == true) {
			rotate = BlockBoreDrillCrank.rotate;
		}
		
		if(i == 20) {
			BlockBoreDrillCrank.rotate = false;
		}
	}

}
