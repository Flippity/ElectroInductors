package com.flippity.ei.client.renderers.batteries;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import com.flippity.ei.client.models.atomic.turbine.ModelTurbine;
import com.flippity.ei.client.models.base.batteries.ModelBattery;
import com.flippity.ei.common.tiles.atomic.TEElectromagnet;
import com.flippity.ei.common.tiles.base.batteries.TET1Battery;
import com.flippity.ei.reference.Reference;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class RendererBattery extends TileEntitySpecialRenderer{

    //The model of your block
    public final ModelBattery model;
    private static ResourceLocation resourceloc = new ResourceLocation(com.flippity.ei.reference.Reference.MOD_ID + ":" + "textures/blocks/battery/Battery.png");
    private static ResourceLocation resourceloc1 = new ResourceLocation(com.flippity.ei.reference.Reference.MOD_ID + ":" + "textures/blocks/battery/Battery1.png");
    private static ResourceLocation resourceloc2 = new ResourceLocation(com.flippity.ei.reference.Reference.MOD_ID + ":" + "textures/blocks/battery/Battery2.png");
    private static ResourceLocation resourceloc3 = new ResourceLocation(com.flippity.ei.reference.Reference.MOD_ID + ":" + "textures/blocks/battery/Battery3.png");
    private static ResourceLocation resourceloc4 = new ResourceLocation(com.flippity.ei.reference.Reference.MOD_ID + ":" + "textures/blocks/battery/Battery4.png");
    private static ResourceLocation resourceloc5 = new ResourceLocation(com.flippity.ei.reference.Reference.MOD_ID + ":" + "textures/blocks/battery/Battery5.png");
    private static ResourceLocation resourceloc6 = new ResourceLocation(com.flippity.ei.reference.Reference.MOD_ID + ":" + "textures/blocks/battery/Battery6.png");
    private static ResourceLocation resourceloc7 = new ResourceLocation(com.flippity.ei.reference.Reference.MOD_ID + ":" + "textures/blocks/battery/Battery7.png");
    private static ResourceLocation resourceloc8 = new ResourceLocation(com.flippity.ei.reference.Reference.MOD_ID + ":" + "textures/blocks/battery/Battery8.png");

    public int energy;
    public RendererBattery() {
        this.model = new ModelBattery();
    }
    int i = 0;
    @Override
    public void renderTileEntityAt(TileEntity te, double x, double y, double z, float scale) {
        ( Minecraft.getMinecraft().renderEngine).bindTexture(resourceloc);
    	i++;
        //The PushMatrix tells the renderer to "start" doing something.
        GL11.glPushMatrix();
        //This is setting the initial location.
        GL11.glTranslatef((float) x + 0.5F, (float) y + 1.5F, (float) z + 0.5F);
        //This is the texture of your block. It's pathed to be the same place as your other blocks here.
        //This rotation part is very important! Without it, your model will render upside-down! And for some reason you DO need PushMatrix again!
        GL11.glPushMatrix();
        GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
    	energy = TET1Battery.energy;
        //System.out.println("rendering");
        //System.out.println(energy);
    	if(i == 20) {
	        /*if(energy < 2048) {
	            ( Minecraft.getMinecraft().renderEngine).bindTexture(resourceloc);
	        }else if(energy >= 2048) {
	            ( Minecraft.getMinecraft().renderEngine).bindTexture(resourceloc1);
	        }else if(energy >= 4096) {
	            ( Minecraft.getMinecraft().renderEngine).bindTexture(resourceloc2);
	        }else if(energy >= 6144) {
	            ( Minecraft.getMinecraft().renderEngine).bindTexture(resourceloc3);
	        }else if(energy >= 8192) {
	            ( Minecraft.getMinecraft().renderEngine).bindTexture(resourceloc4);
	        }else if(energy >= 10240) {
	            ( Minecraft.getMinecraft().renderEngine).bindTexture(resourceloc5);
	        }else if(energy >= 12288) {
	            ( Minecraft.getMinecraft().renderEngine).bindTexture(resourceloc6);
	        }else if(energy >= 14336) {
	            ( Minecraft.getMinecraft().renderEngine).bindTexture(resourceloc7);
	        }else if(energy >= 16384) {
	            ( Minecraft.getMinecraft().renderEngine).bindTexture(resourceloc8);
	        }*/
        i = 0;
    }
        adjustLightFixture(te.getWorldObj(), te.xCoord, te.yCoord, te.zCoord, te.blockType);

        //A reference to your Model file. Again, very important.
        //Tell it to stop rendering for both the PushMatrix's
        GL11.glPopMatrix();
        GL11.glPopMatrix();
		}

    //Set the lighting stuff, so it changes it's brightness properly.       
    private void adjustLightFixture(World world, int i, int j, int k, Block block) {
        //  the if statement checking for if the world is null or not if not renders the block if null renders the item model
        // != means not equal
        if (world != null) {
            int dir = world.getBlockMetadata(i, j, k);

            GL11.glPushMatrix();
            //This line actually rotates the renderer.
            GL11.glRotatef(dir * (90F), 0F, 1F, 0F);

            this.model.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
            /*
             * Place your rendering code here.
             */

            GL11.glPopMatrix();
        }
        /*if(energy < 2048) {
            ( Minecraft.getMinecraft().renderEngine).bindTexture(resourceloc);
        }else if(energy >= 2048) {
            ( Minecraft.getMinecraft().renderEngine).bindTexture(resourceloc1);
        }else if(energy >= 4096) {
            ( Minecraft.getMinecraft().renderEngine).bindTexture(resourceloc2);
        }else if(energy >= 6144) {
            ( Minecraft.getMinecraft().renderEngine).bindTexture(resourceloc3);
        }else if(energy >= 8192) {
            ( Minecraft.getMinecraft().renderEngine).bindTexture(resourceloc4);
        }else if(energy >= 10240) {
            ( Minecraft.getMinecraft().renderEngine).bindTexture(resourceloc5);
        }else if(energy >= 12288) {
            ( Minecraft.getMinecraft().renderEngine).bindTexture(resourceloc6);
        }else if(energy >= 14336) {
            ( Minecraft.getMinecraft().renderEngine).bindTexture(resourceloc7);
        }else if(energy >= 16384) {
            ( Minecraft.getMinecraft().renderEngine).bindTexture(resourceloc8);
        }*/
        
    }

}