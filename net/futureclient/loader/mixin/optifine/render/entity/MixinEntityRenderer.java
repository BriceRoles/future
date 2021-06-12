package net.futureclient.loader.mixin.optifine.render.entity;

import net.futureclient.client.Dg;
import net.futureclient.client.RF;
import net.futureclient.client.kH;
import net.minecraft.client.renderer.EntityRenderer;
import org.spongepowered.asm.mixin.Dynamic;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({EntityRenderer.class})
public abstract class MixinEntityRenderer {
   @Inject(
      method = {"renderHand(FIZZZ)V"},
      at = {@At("HEAD")},
      cancellable = true,
      remap = false
   )
   @Dynamic
   private void f$E(CallbackInfo var1) {
      Dg var2 = new Dg();
      kH.f$E().f$E().f$E((RF)var2);
      if (var2.f$E()) {
         var1.cancel();
      }

   }
}
