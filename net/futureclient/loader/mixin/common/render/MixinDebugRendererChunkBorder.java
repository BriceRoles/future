package net.futureclient.loader.mixin.common.render;

import net.futureclient.client.kH;
import net.futureclient.client.rA;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.debug.DebugRendererChunkBorder;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin({DebugRendererChunkBorder.class})
public abstract class MixinDebugRendererChunkBorder {
   @Redirect(
      method = {"render"},
      at = @At(
   value = "FIELD",
   target = "net/minecraft/client/Minecraft.player:Lnet/minecraft/client/entity/EntityPlayerSP;"
)
   )
   private EntityPlayerSP f$E(Minecraft var1) {
      rA var2 = (rA)kH.f$E().f$E().f$E(rA.class);
      return (EntityPlayerSP)(var2 != null && var2.f$E() ? var2.f$E() : var1.field_71439_g);
   }
}
