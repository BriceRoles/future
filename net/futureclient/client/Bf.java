package net.futureclient.client;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLivingBase;
import net.minecraft.entity.EntityLivingBase;

public class Bf extends Kf {
   // $FF: synthetic field
   private ModelBase f$d;

   // $FF: synthetic method
   public ModelBase f$E() {
      return this.f$d;
   }

   // $FF: synthetic method
   public Bf(RenderLivingBase<?> var1, EntityLivingBase var2, ModelBase var3) {
      super(var1, var2, var3);
      this.f$d = var3;
   }
}
