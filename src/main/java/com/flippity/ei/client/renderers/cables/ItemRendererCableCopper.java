package com.flippity.ei.client.renderers.cables;

import com.flippity.ei.client.models.cables.ModelCable;
import com.flippity.ei.common.tiles.cables.TECableCopper;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.IItemRenderer.ItemRenderType;
import net.minecraftforge.client.IItemRenderer.ItemRendererHelper;

public class ItemRendererCableCopper implements IItemRenderer {

    private ModelCable ModelCableCube;

    public ItemRendererCableCopper() {
    	ModelCableCube = new ModelCable();
    }

    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type) {
        return true;
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
        return true;
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
        TileEntityRendererDispatcher.instance.renderTileEntityAt(new TECableCopper(), 0.0D, 0.0D, 0.0D, 1.0f);
    }

}
