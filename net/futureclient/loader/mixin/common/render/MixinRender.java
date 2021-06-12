package net.futureclient.loader.mixin.common.render;

import net.futureclient.client.PF;
import net.futureclient.client.RF;
import net.futureclient.client.kH;
import net.futureclient.client.zA;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({Render.class})
public abstract class MixinRender {
   @Inject(
      method = {"getTeamColor"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void f$E(Entity var1, CallbackInfoReturnable<Integer> var2) {
      PF var3 = new PF(var1);
      kH.f$E().f$E().f$E((RF)var3);
      if (var3.f$E()) {
         var2.setReturnValue(var3.f$E());
      }

   }

   @Inject(
      method = {"doRenderShadowAndFire"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void f$a(CallbackInfo var1) {
      if (!zA.f$b) {
         var1.cancel();
      }

   }

   @Inject(
      method = {"renderLivingLabel"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void f$E(CallbackInfo var1) {
      if (!zA.f$b) {
         var1.cancel();
      }

   }
}
