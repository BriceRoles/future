package net.futureclient.loader.mixin.common.render;

import net.futureclient.client.RF;
import net.futureclient.client.VI;
import net.futureclient.client.kH;
import net.futureclient.client.nE;
import net.minecraft.client.renderer.RenderGlobal;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({RenderGlobal.class})
public abstract class MixinRenderGlobal {
   @Inject(
      method = {"makeEntityOutlineShader"},
      at = {@At("HEAD")}
   )
   private void f$E(CallbackInfo var1) {
      VI.f$A();
   }

   @ModifyVariable(
      method = {"setupTerrain"},
      at = @At("HEAD")
   )
   private boolean f$E(boolean var1) {
      nE var2 = new nE();
      kH.f$E().f$E().f$E((RF)var2);
      return var2.f$E() ? true : var1;
   }
}
