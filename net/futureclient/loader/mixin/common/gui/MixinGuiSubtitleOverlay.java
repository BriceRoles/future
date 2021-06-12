package net.futureclient.loader.mixin.common.gui;

import net.futureclient.client.RF;
import net.futureclient.client.Zd;
import net.futureclient.client.kH;
import net.minecraft.client.gui.GuiSubtitleOverlay;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({GuiSubtitleOverlay.class})
public abstract class MixinGuiSubtitleOverlay {
   @Inject(
      method = {"renderSubtitles"},
      at = {@At("HEAD")}
   )
   private void f$E(CallbackInfo var1) {
      kH.f$E().f$E().f$E((RF)(new Zd()));
   }
}
