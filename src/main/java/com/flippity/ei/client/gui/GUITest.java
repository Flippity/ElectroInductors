package com.flippity.ei.client.gui;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

import com.flippity.ei.reference.Reference;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;

public class GUITest extends GuiScreen{

	int guiWidth = 175;
	int guiHeight = 167;
	
	GuiButton button;
	
	@Override
	public void drawScreen(int x, int y, float ticks) {
		int guiX = (width - guiWidth) / 2;
		int guiY = (height - guiHeight) / 2;
		GL11.glColor4f(1, 1, 1, 1);
		drawDefaultBackground();
		mc.renderEngine.bindTexture(new ResourceLocation(Reference.MOD_ID + ":textures/gui/blank2.png"));
		drawTexturedModalRect(guiX, guiY, 0, 0, guiWidth, guiHeight);
	}
	
	@Override
	public void initGui() {
		buttonList.clear();
		buttonList.add(button = new GuiButton(0, 0 + 10, 0 + 10, 20, 100, "Test"));
		
		
		super.initGui();
	}
	
	@Override
	public void actionPerformed(GuiButton button) {
		switch(button.id) {
		case 0:
			button.displayString = "tseT";
		}
		super.actionPerformed(button);
	}
	
	@Override
	public void keyTyped(char c, int key) {
		switch(key) {
		case Keyboard.KEY_E:
			mc.displayGuiScreen(null);
		}
	}
	
	/*@Override
	public void mouseClicked(int x, int y, int button) {
		
	}*/
}