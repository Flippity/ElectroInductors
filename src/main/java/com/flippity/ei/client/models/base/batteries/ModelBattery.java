package com.flippity.ei.client.models.base.batteries;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * Battery - Flippity
 * Created using Tabula 7.0.0
 */
public class ModelBattery extends ModelBase {
    public ModelRenderer shaft1;
    public ModelRenderer shaft2;
    public ModelRenderer shaft3;
    public ModelRenderer shaft4;
    public ModelRenderer shaft5;
    public ModelRenderer shaft6;
    public ModelRenderer shaft7;
    public ModelRenderer shaft8;
    public ModelRenderer shaft9;
    public ModelRenderer cell1;
    public ModelRenderer cell2;
    public ModelRenderer cell2_1;
    public ModelRenderer cell2_2;
    public ModelRenderer top;
    public ModelRenderer connector;
    public ModelRenderer bottom;
    public ModelRenderer connector2;
    public ModelRenderer connector3;
    public ModelRenderer connector4;

    public ModelBattery() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.cell2_1 = new ModelRenderer(this, 10, 0);
        this.cell2_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.cell2_1.addBox(-7.0F, 9.0F, -7.0F, 7, 14, 7, 0.0F);
        this.shaft9 = new ModelRenderer(this, 0, 0);
        this.shaft9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shaft9.addBox(6.0F, 9.0F, -1.0F, 2, 14, 2, 0.0F);
        this.connector = new ModelRenderer(this, 0, 24);
        this.connector.setRotationPoint(0.5F, -0.5F, 0.5F);
        this.connector.addBox(-3.0F, 14.0F, 6.0F, 5, 5, 2, 0.0F);
        this.cell1 = new ModelRenderer(this, 10, 0);
        this.cell1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.cell1.addBox(0.0F, 9.0F, -7.0F, 7, 14, 7, 0.0F);
        this.connector2 = new ModelRenderer(this, 0, 24);
        this.connector2.setRotationPoint(0.5F, -0.5F, 0.5F);
        this.connector2.addBox(-3.0F, 14.0F, -9.0F, 5, 5, 2, 0.0F);
        this.connector3 = new ModelRenderer(this, 0, 36);
        this.connector3.setRotationPoint(-0.5F, -0.5F, -0.5F);
        this.connector3.addBox(-8.0F, 14.0F, -2.0F, 2, 5, 5, 0.0F);
        this.shaft2 = new ModelRenderer(this, 0, 0);
        this.shaft2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shaft2.addBox(-1.0F, 9.0F, -8.0F, 2, 14, 2, 0.0F);
        this.shaft4 = new ModelRenderer(this, 0, 0);
        this.shaft4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shaft4.addBox(6.0F, 9.0F, 6.0F, 2, 14, 2, 0.0F);
        this.bottom = new ModelRenderer(this, 27, 9);
        this.bottom.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bottom.addBox(-8.0F, 23.0F, -8.0F, 16, 1, 16, 0.0F);
        this.shaft8 = new ModelRenderer(this, 0, 0);
        this.shaft8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shaft8.addBox(-8.0F, 9.0F, -8.0F, 2, 14, 2, 0.0F);
        this.shaft3 = new ModelRenderer(this, 0, 0);
        this.shaft3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shaft3.addBox(6.0F, 9.0F, -8.0F, 2, 14, 2, 0.0F);
        this.shaft5 = new ModelRenderer(this, 0, 0);
        this.shaft5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shaft5.addBox(-8.0F, 9.0F, 6.0F, 2, 14, 2, 0.0F);
        this.connector4 = new ModelRenderer(this, 0, 36);
        this.connector4.setRotationPoint(-0.5F, 0.5F, -0.5F);
        this.connector4.addBox(7.0F, 13.0F, -2.0F, 2, 5, 5, 0.0F);
        this.cell2_2 = new ModelRenderer(this, 10, 0);
        this.cell2_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.cell2_2.addBox(-7.0F, 9.0F, 0.0F, 7, 14, 7, 0.0F);
        this.top = new ModelRenderer(this, 27, 9);
        this.top.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.top.addBox(-8.0F, 8.0F, -8.0F, 16, 1, 16, 0.0F);
        this.shaft1 = new ModelRenderer(this, 0, 0);
        this.shaft1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shaft1.addBox(-1.0F, 9.0F, -1.0F, 2, 14, 2, 0.0F);
        this.shaft6 = new ModelRenderer(this, 0, 0);
        this.shaft6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shaft6.addBox(-1.0F, 9.0F, 6.0F, 2, 14, 2, 0.0F);
        this.shaft7 = new ModelRenderer(this, 0, 0);
        this.shaft7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shaft7.addBox(-8.0F, 9.0F, -1.0F, 2, 14, 2, 0.0F);
        this.cell2 = new ModelRenderer(this, 10, 0);
        this.cell2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.cell2.addBox(0.0F, 9.0F, 0.0F, 7, 14, 7, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.cell2_1.render(f5);
        this.shaft9.render(f5);
        this.connector.render(f5);
        this.cell1.render(f5);
        this.connector2.render(f5);
        this.connector3.render(f5);
        this.shaft2.render(f5);
        this.shaft4.render(f5);
        this.bottom.render(f5);
        this.shaft8.render(f5);
        this.shaft3.render(f5);
        this.shaft5.render(f5);
        this.connector4.render(f5);
        this.cell2_2.render(f5);
        this.top.render(f5);
        this.shaft1.render(f5);
        this.shaft6.render(f5);
        this.shaft7.render(f5);
        this.cell2.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
