package net.futureclient.loader.mixin.common.gui;

import net.futureclient.client.Mg;
import net.futureclient.client.RF;
import net.futureclient.client.Yf;
import net.futureclient.client.gF;
import net.futureclient.client.kH;
import net.minecraft.client.gui.GuiIngame;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({GuiIngame.class})
public abstract class MixinGuiIngame {
   @Inject(
      method = {"renderPotionEffects"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void f$a(CallbackInfo var1) {
      gF var2 = (gF)kH.f$E().f$E().f$E(gF.class);
      if (var2 != null && ((Mg)var2.f$D.f$E()).equals(Mg.f$M)) {
         var1.cancel();
      }

   }

   @Inject(
      method = {"renderPumpkinOverlay"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void f$E(CallbackInfo var1) {
      Yf var2 = new Yf();
      kH.f$E().f$E().f$E((RF)var2);
      if (var2.f$E()) {
         var1.cancel();
      }

   }
}
