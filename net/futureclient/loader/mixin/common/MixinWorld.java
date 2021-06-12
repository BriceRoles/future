package net.futureclient.loader.mixin.common;

import net.futureclient.client.RF;
import net.futureclient.client.kH;
import net.futureclient.client.qe;
import net.futureclient.client.t;
import net.futureclient.client.xd;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.EnumSkyBlock;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({World.class})
public abstract class MixinWorld implements t {
   @Accessor
   public abstract float getRainingStrength();

   @Accessor
   public abstract float getThunderingStrength();

   @Inject(
      method = {"checkLightFor"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void f$E(EnumSkyBlock var1, BlockPos var2, CallbackInfoReturnable<Boolean> var3) {
      qe var4 = new qe(var1);
      kH.f$E().f$E().f$E((RF)var4);
      if (var4.f$E()) {
         var3.setReturnValue(false);
      }

   }

   @Inject(
      method = {"getRainStrength"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void f$E(CallbackInfoReturnable<Float> var1) {
      xd var2 = new xd();
      if (kH.f$E() != null) {
         kH.f$E().f$E().f$E((RF)var2);
      }

      if (var2.f$E()) {
         var1.setReturnValue(0.0F);
      }

   }
}
