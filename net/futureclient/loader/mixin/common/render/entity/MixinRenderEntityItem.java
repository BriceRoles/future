package net.futureclient.loader.mixin.common.render.entity;

import net.futureclient.client.RF;
import net.futureclient.client.kH;
import net.futureclient.client.pD;
import net.minecraft.client.renderer.entity.RenderEntityItem;
import net.minecraft.entity.item.EntityItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({RenderEntityItem.class})
public abstract class MixinRenderEntityItem {
   @Inject(
      method = {"doRender"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void f$E(EntityItem var1, double var2, double var4, double var6, float var8, float var9, CallbackInfo var10) {
      pD var11 = new pD(var1);
      kH.f$E().f$E().f$E((RF)var11);
      if (var11.f$E()) {
         var10.cancel();
      }

   }
}
