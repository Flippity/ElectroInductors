package com.flippity.ei.client.models.atomic.turbine;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * turbineBlock - Flippity
 * Created using Tabula 7.0.0
 */
public class ModelTurbine extends ModelBase {
    public ModelRenderer shape1;
    public ModelRenderer shape2;
    public ModelRenderer shape3;
    public ModelRenderer shape4;
    public ModelRenderer shape5;
    public ModelRenderer shape6;
    public ModelRenderer shape7;
    public ModelRenderer shape8;
    public ModelRenderer shape9;
    public ModelRenderer shape10;
    public ModelRenderer shape11;
    public ModelRenderer shape12;
    public ModelRenderer shape13;
    public ModelRenderer shape14;
    public ModelRenderer shape15;
    public ModelRenderer shape16;
    public ModelRenderer shape17;

    public ModelTurbine() {
        this.textureWidth = 20;
        this.textureHeight = 20;
        this.shape7 = new ModelRenderer(this, 0, 1);
        this.shape7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape7.addBox(-1.0F, 14.0F, -7.0F, 2, 1, 5, 0.0F);
        this.shape8 = new ModelRenderer(this, -1, 7);
        this.shape8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape8.addBox(2.0F, 14.0F, -1.0F, 5, 1, 2, 0.0F);
        this.shape2 = new ModelRenderer(this, 0, 2);
        this.shape2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape2.addBox(-1.0F, 14.0F, 2.0F, 2, 1, 5, 0.0F);
        this.shape5 = new ModelRenderer(this, -1, 7);
        this.shape5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape5.addBox(2.0F, 11.0F, -1.0F, 5, 1, 2, 0.0F);
        this.shape4 = new ModelRenderer(this, 0, 1);
        this.shape4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape4.addBox(-1.0F, 11.0F, -7.0F, 2, 1, 5, 0.0F);
        this.shape16 = new ModelRenderer(this, 0, 7);
        this.shape16.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape16.addBox(-7.0F, 20.0F, -1.0F, 5, 1, 2, 0.0F);
        this.shape12 = new ModelRenderer(this, 0, 1);
        this.shape12.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape12.addBox(-1.0F, 17.0F, -7.0F, 2, 1, 5, 0.0F);
        this.shape11 = new ModelRenderer(this, 0, 7);
        this.shape11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape11.addBox(-7.0F, 14.0F, -1.0F, 5, 1, 2, 0.0F);
        this.shape3 = new ModelRenderer(this, 0, 7);
        this.shape3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape3.addBox(-7.0F, 11.0F, -1.0F, 5, 1, 2, 0.0F);
        this.shape17 = new ModelRenderer(this, 0, 1);
        this.shape17.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape17.addBox(-1.0F, 20.0F, -7.0F, 2, 1, 5, 0.0F);
        this.shape9 = new ModelRenderer(this, 0, 2);
        this.shape9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape9.addBox(-1.0F, 11.0F, 2.0F, 2, 1, 5, 0.0F);
        this.shape1 = new ModelRenderer(this, 0, 0);
        this.shape1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape1.addBox(-2.0F, 10.0F, -2.0F, 4, 14, 4, 0.0F);
        this.shape14 = new ModelRenderer(this, -1, 7);
        this.shape14.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape14.addBox(2.0F, 20.0F, -1.0F, 5, 1, 2, 0.0F);
        this.shape15 = new ModelRenderer(this, 0, 2);
        this.shape15.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape15.addBox(-1.0F, 17.0F, 2.0F, 2, 1, 5, 0.0F);
        this.shape10 = new ModelRenderer(this, 0, 2);
        this.shape10.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape10.addBox(-1.0F, 20.0F, 2.0F, 2, 1, 5, 0.0F);
        this.shape13 = new ModelRenderer(this, -1, 7);
        this.shape13.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape13.addBox(2.0F, 17.0F, -1.0F, 5, 1, 2, 0.0F);
        this.shape6 = new ModelRenderer(this, 0, 7);
        this.shape6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape6.addBox(-7.0F, 17.0F, -1.0F, 5, 1, 2, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.shape7.render(f5);
        this.shape8.render(f5);
        this.shape2.render(f5);
        this.shape5.render(f5);
        this.shape4.render(f5);
        this.shape16.render(f5);
        this.shape12.render(f5);
        this.shape11.render(f5);
        this.shape3.render(f5);
        this.shape17.render(f5);
        this.shape9.render(f5);
        this.shape1.render(f5);
        this.shape14.render(f5);
        this.shape15.render(f5);
        this.shape10.render(f5);
        this.shape13.render(f5);
        this.shape6.render(f5);
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
