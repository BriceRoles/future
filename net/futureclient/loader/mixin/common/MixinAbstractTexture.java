package net.futureclient.loader.mixin.common;

import net.futureclient.client.xH;
import net.minecraft.client.renderer.texture.AbstractTexture;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({AbstractTexture.class})
public abstract class MixinAbstractTexture {
   @Inject(
      method = {"setBlurMipmapDirect"},
      at = {@At("HEAD")}
   )
   private void f$E(boolean var1, boolean var2, CallbackInfo var3) {
      xH.f$A();
   }
}
