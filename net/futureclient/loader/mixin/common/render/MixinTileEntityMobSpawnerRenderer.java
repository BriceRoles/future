package net.futureclient.loader.mixin.common.render;

import net.futureclient.client.RF;
import net.futureclient.client.kH;
import net.futureclient.client.xF;
import net.minecraft.client.renderer.tileentity.TileEntityMobSpawnerRenderer;
import net.minecraft.tileentity.TileEntityMobSpawner;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({TileEntityMobSpawnerRenderer.class})
public abstract class MixinTileEntityMobSpawnerRenderer {
   @Inject(
      method = {"render"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void f$E(TileEntityMobSpawner var1, double var2, double var4, double var6, float var8, int var9, float var10, CallbackInfo var11) {
      xF var12 = new xF();
      kH.f$E().f$E().f$E((RF)var12);
      if (var12.f$E()) {
         var11.cancel();
      }

   }
}
