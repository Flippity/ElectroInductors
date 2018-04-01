package com.flippity.ei.client.models.atomic.centrifuge;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelCentrifuge - Undefined
 * Created using Tabula 7.0.0
 */
public class ModelCentrifuge extends ModelBase {
    public ModelRenderer shaft;
    public ModelRenderer bottom;
    public ModelRenderer base;
    public ModelRenderer tube1;
    public ModelRenderer tube2;
    public ModelRenderer tube3;
    public ModelRenderer tube4;
    public ModelRenderer tubeholder;

    public ModelCentrifuge() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.tube3 = new ModelRenderer(this, 0, 0);
        this.tube3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tube3.addBox(2.0F, 13.0F, 2.0F, 2, 8, 2, 0.0F);
        this.setRotateAngle(tube3, 0.0F, -72.2538385057625F, 0.0F);
        this.tube4 = new ModelRenderer(this, 0, 0);
        this.tube4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tube4.addBox(-4.0F, 13.0F, 2.0F, 2, 8, 2, 0.0F);
        this.setRotateAngle(tube4, 0.0F, -72.2538385057625F, 0.0F);
        this.tube1 = new ModelRenderer(this, 0, 0);
        this.tube1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tube1.addBox(-4.0F, 13.0F, -4.0F, 2, 8, 2, 0.0F);
        this.setRotateAngle(tube1, 0.0F, -72.2538385057625F, 0.0F);
        this.base = new ModelRenderer(this, 0, 21);
        this.base.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.base.addBox(-5.0F, 21.0F, -5.0F, 10, 2, 10, 0.0F);
        this.setRotateAngle(base, 0.0F, -72.2538385057625F, 0.0F);
        this.bottom = new ModelRenderer(this, 65, 16);
        this.bottom.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bottom.addBox(-5.0F, 23.0F, -5.0F, 10, 1, 10, 0.0F);
        this.tubeholder = new ModelRenderer(this, 65, 16);
        this.tubeholder.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tubeholder.addBox(-5.0F, 14.0F, -5.0F, 10, 1, 10, 0.0F);
        this.setRotateAngle(tubeholder, 0.0F, -72.2538385057625F, 0.0F);
        this.shaft = new ModelRenderer(this, 70, 0);
        this.shaft.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shaft.addBox(-1.0F, 11.0F, -1.0F, 2, 10, 2, 0.0F);
        this.tube2 = new ModelRenderer(this, 0, 0);
        this.tube2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tube2.addBox(2.0F, 13.0F, -4.0F, 2, 8, 2, 0.0F);
        this.setRotateAngle(tube2, 0.0F, -72.2538385057625F, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.tube3.render(f5);
        this.tube4.render(f5);
        this.tube1.render(f5);
        this.base.render(f5);
        this.bottom.render(f5);
        this.tubeholder.render(f5);
        this.shaft.render(f5);
        this.tube2.render(f5);
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
