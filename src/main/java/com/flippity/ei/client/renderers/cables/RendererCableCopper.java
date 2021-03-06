package com.flippity.ei.client.renderers.cables;

import org.lwjgl.opengl.GL11;

import com.flippity.ei.common.blocks.cables.BlockCableCopper;
import com.flippity.ei.reference.Reference;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class RendererCableCopper extends TileEntitySpecialRenderer {
    private static final ResourceLocation resourceloc = new ResourceLocation(com.flippity.ei.reference.Reference.MOD_ID + ":" + "textures/blocks/BlockCableCopper.png");
    float pixel = 1F/16F;
    float texPixel = 1F/32F;
    
    public void renderTileEntityAt(TileEntity te, double x, double y, double z, float scale) {    	
    	GL11.glPushMatrix();
    	GL11.glTranslated(x, y, z);
    	GL11.glDisable(GL11.GL_LIGHTING);
        ( Minecraft.getMinecraft().renderEngine).bindTexture(resourceloc);
        this.bindTexture(resourceloc);
        drawCore(te);
    	GL11.glEnable(GL11.GL_LIGHTING);
    	GL11.glPopMatrix();
    	GL11.glTranslated(-x, -y, -z);
		}
    
    public void drawCore(TileEntity te) {
    	Tessellator tes = Tessellator.instance;
    	tes.startDrawingQuads();{
    		tes.addVertexWithUV(1-11*pixel/2, 11*pixel/2, 1-11*pixel/2, 5*texPixel, 5*texPixel);
    		tes.addVertexWithUV(1-11*pixel/2, 1-11*pixel/2, 1-11*pixel/2, 5*texPixel, 0*texPixel);
    		tes.addVertexWithUV(11*pixel/2, 1-11*pixel/2, 1-11*pixel/2, 0*texPixel, 0*texPixel);
    		tes.addVertexWithUV(11*pixel/2, 11*pixel/2, 1-11*pixel/2, 0*texPixel, 5*texPixel);
    	}
    	tes.draw();
    }

}
