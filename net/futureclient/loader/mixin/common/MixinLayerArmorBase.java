package net.futureclient.loader.mixin.common;

import net.futureclient.client.zA;
import net.minecraft.client.renderer.entity.layers.LayerArmorBase;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({LayerArmorBase.class})
public abstract class MixinLayerArmorBase {
   @Inject(
      method = {"renderEnchantedGlint"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private static void f$E(CallbackInfo var0) {
      if (!zA.f$j) {
         var0.cancel();
      }

   }
}
