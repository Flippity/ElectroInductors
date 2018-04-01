package com.flippity.ei.client.models.atomic.centrifuge;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelCentrifuge - Undefined
 * Created using Tabula 7.0.0
 */
public class ModelCentrifugeShell extends ModelBase {
    public ModelRenderer bottom;
    public ModelRenderer rightwall1;
    public ModelRenderer leftwall1;
    public ModelRenderer leftwall2;
    public ModelRenderer rightwall2;
    public ModelRenderer leftwall3;
    public ModelRenderer rightwall3;
    public ModelRenderer backwall;

    public ModelCentrifugeShell() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.bottom = new ModelRenderer(this, 0, 0);
        this.bottom.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bottom.addBox(-8.0F, 23.0F, -7.0F, 16, 1, 15, 0.0F);
        this.backwall = new ModelRenderer(this, 50, 45);
        this.backwall.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.backwall.addBox(-8.0F, 8.0F, 7.0F, 16, 15, 1, 0.0F);
        this.rightwall1 = new ModelRenderer(this, 0, 35);
        this.rightwall1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightwall1.addBox(7.0F, 15.0F, -5.0F, 1, 8, 12, 0.0F);
        this.rightwall3 = new ModelRenderer(this, 50, 18);
        this.rightwall3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightwall3.addBox(7.0F, 8.0F, -3.0F, 1, 7, 10, 0.0F);
        this.leftwall3 = new ModelRenderer(this, 50, 18);
        this.leftwall3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftwall3.addBox(-8.0F, 8.0F, -3.0F, 1, 7, 10, 0.0F);
        this.leftwall1 = new ModelRenderer(this, 0, 35);
        this.leftwall1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftwall1.addBox(-8.0F, 15.0F, -5.0F, 1, 8, 12, 0.0F);
        this.rightwall2 = new ModelRenderer(this, 50, 0);
        this.rightwall2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightwall2.addBox(7.0F, 18.0F, -7.0F, 1, 5, 2, 0.0F);
        this.leftwall2 = new ModelRenderer(this, 50, 0);
        this.leftwall2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftwall2.addBox(-8.0F, 18.0F, -7.0F, 1, 5, 2, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.bottom.render(f5);
        this.backwall.render(f5);
        this.rightwall1.render(f5);
        this.rightwall3.render(f5);
        this.leftwall3.render(f5);
        this.leftwall1.render(f5);
        this.rightwall2.render(f5);
        this.leftwall2.render(f5);
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
