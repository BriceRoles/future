package net.futureclient.loader.mixin.common.gui;

import net.futureclient.client.WI;
import net.minecraft.client.gui.GuiMultiplayer;
import net.minecraft.client.gui.ServerSelectionList;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({GuiMultiplayer.class})
public abstract class MixinGuiMultiplayer {
   @Shadow
   private ServerSelectionList field_146803_h;

   @Inject(
      method = {"connectToSelected"},
      at = {@At("HEAD")}
   )
   private void f$E(CallbackInfo var1) {
      WI.f$E(this.field_146803_h.func_148193_k() < 0 ? null : this.field_146803_h.func_148180_b(this.field_146803_h.func_148193_k()));
   }
}
