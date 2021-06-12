package net.futureclient.loader.mixin.common.render.entity;

import net.futureclient.client.C;
import net.futureclient.client.zA;
import net.minecraft.client.renderer.RenderItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({RenderItem.class})
public abstract class MixinRenderItem implements C {
   @Accessor
   public abstract void setNotRenderingEffectsInGUI(boolean var1);

   @Inject(
      method = {"renderEffect"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void f$E(CallbackInfo var1) {
      if (!zA.f$i) {
         var1.cancel();
      }

   }
}
