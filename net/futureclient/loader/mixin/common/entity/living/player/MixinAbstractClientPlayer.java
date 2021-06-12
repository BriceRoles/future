package net.futureclient.loader.mixin.common.entity.living.player;

import net.futureclient.client.P;
import net.futureclient.client.bj;
import net.futureclient.client.gF;
import net.futureclient.client.kH;
import net.futureclient.client.lG;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.util.ResourceLocation;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({AbstractClientPlayer.class})
public abstract class MixinAbstractClientPlayer extends MixinEntityPlayer {
   @Inject(
      method = {"getLocationCape"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void f$E(CallbackInfoReturnable<ResourceLocation> var1) {
      if (!lG.f$E().f$E()) {
         gF var2 = (gF)kH.f$E().f$E().f$E(gF.class);
         if (var2 != null && (Boolean)var2.f$F.f$E()) {
            P var3 = bj.f$E((AbstractClientPlayer)this);
            if (var3 != null) {
               var1.setReturnValue(new ResourceLocation(var3.f$E()));
            }
         }

      }
   }
}
