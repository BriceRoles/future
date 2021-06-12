package net.futureclient.loader.mixin.common.render.entity;

import net.futureclient.client.zA;
import net.minecraft.client.renderer.entity.RenderMinecart;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({RenderMinecart.class})
public abstract class MixinRenderMinecart {
   @Inject(
      method = {"renderCartContents"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void f$E(CallbackInfo var1) {
      if (!zA.f$b) {
         var1.cancel();
      }

   }
}
