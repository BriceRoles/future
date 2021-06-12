package net.futureclient.loader.mixin.common.render.entity;

import net.futureclient.client.zA;
import net.minecraft.client.renderer.entity.RenderDragon;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({RenderDragon.class})
public abstract class MixinRenderDragon {
   @Inject(
      method = {"renderCrystalBeams"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private static void f$E(double var0, double var2, double var4, float var6, double var7, double var9, double var11, int var13, double var14, double var16, double var18, CallbackInfo var20) {
      if (!zA.f$b) {
         var20.cancel();
      }

   }
}
