package net.futureclient.loader.mixin.common.render.entity;

import net.futureclient.client.kH;
import net.futureclient.client.rA;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.renderer.entity.RenderPlayer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin({RenderPlayer.class})
public abstract class MixinRenderPlayer {
   @Redirect(
      method = {"doRender"},
      at = @At(
   value = "INVOKE",
   target = "net/minecraft/client/entity/AbstractClientPlayer.isUser()Z"
)
   )
   private boolean f$E(AbstractClientPlayer var1) {
      Minecraft var2 = Minecraft.func_71410_x();
      if (var1.equals(var2.field_71439_g)) {
         rA var3 = (rA)kH.f$E().f$E().f$E(rA.class);
         if (var3 != null && var3.f$E()) {
            return false;
         }
      }

      return var1.func_175144_cb();
   }
}
