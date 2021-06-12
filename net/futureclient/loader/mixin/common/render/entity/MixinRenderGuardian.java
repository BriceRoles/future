package net.futureclient.loader.mixin.common.render.entity;

import net.futureclient.client.zA;
import net.minecraft.client.renderer.entity.RenderGuardian;
import net.minecraft.entity.monster.EntityGuardian;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({RenderGuardian.class})
public abstract class MixinRenderGuardian {
   @Inject(
      method = {"doRender"},
      at = {@At(
   value = "INVOKE",
   target = "net/minecraft/entity/monster/EntityGuardian.getAttackAnimationScale(F)F"
)},
      cancellable = true
   )
   private void f$E(EntityGuardian var1, double var2, double var4, double var6, float var8, float var9, CallbackInfo var10) {
      if (!zA.f$b) {
         var10.cancel();
      }

   }
}
