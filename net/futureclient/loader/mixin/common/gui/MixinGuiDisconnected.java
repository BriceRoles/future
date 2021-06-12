package net.futureclient.loader.mixin.common.gui;

import java.io.IOException;
import net.futureclient.client.WI;
import net.futureclient.client.kH;
import net.futureclient.client.lG;
import net.futureclient.client.nB;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiDisconnected;
import net.minecraft.client.gui.GuiMultiplayer;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.multiplayer.GuiConnecting;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({GuiDisconnected.class})
public abstract class MixinGuiDisconnected extends GuiScreen {
   @Shadow
   private int field_175353_i;

   @Inject(
      method = {"initGui"},
      at = {@At("RETURN")}
   )
   private void f$E(CallbackInfo var1) {
      if (!lG.f$E().f$E()) {
         this.field_146292_n.add(new GuiButton(1, this.field_146294_l / 2 - 100, this.field_146295_m / 2 + this.field_175353_i / 2 + this.field_146289_q.field_78288_b + 24, "Reconnect"));
         this.field_146292_n.add(new GuiButton(2, this.field_146294_l / 2 - 100, this.field_146295_m / 2 + this.field_175353_i / 2 + this.field_146289_q.field_78288_b + 48, "AutoReconnect"));
         nB var2 = (nB)kH.f$E().f$E().f$E(nB.class);
         if (var2 != null && var2.f$E()) {
            WI.f$g = Math.round(var2.f$d.f$E().floatValue() * 20.0F);
         }

      }
   }

   @Redirect(
      method = {"actionPerformed"},
      at = @At(
   value = "INVOKE",
   ordinal = 0,
   target = "net/minecraft/client/Minecraft.displayGuiScreen(Lnet/minecraft/client/gui/GuiScreen;)V"
)
   )
   private void f$E(Minecraft var1, GuiScreen var2) {
      if (!lG.f$E().f$E()) {
         var1.func_147108_a(new GuiMultiplayer((GuiScreen)null));
      } else {
         var1.func_147108_a(var2);
      }

   }

   @Inject(
      method = {"actionPerformed"},
      at = {@At("RETURN")}
   )
   private void f$E(GuiButton var1, CallbackInfo var2) {
      if (!lG.f$E().f$E()) {
         GuiDisconnected var3 = (GuiDisconnected)this;
         if (var1.field_146127_k == 1) {
            if (WI.f$d != null) {
               Minecraft.func_71410_x().func_147108_a(new GuiConnecting(var3, Minecraft.func_71410_x(), WI.f$d));
            }
         } else if (var1.field_146127_k == 2) {
            nB var4 = (nB)kH.f$E().f$E().f$E(nB.class);
            if (var4 != null) {
               var4.f$E();
               if (var4.f$E()) {
                  WI.f$g = Math.round(var4.f$d.f$E().floatValue() * 20.0F);
               }
            }
         }

      }
   }

   public void func_73876_c() {
      super.func_73876_c();
      if (!lG.f$E().f$E()) {
         if (this.field_146292_n.size() > 1) {
            nB var1 = (nB)kH.f$E().f$E().f$E(nB.class);
            if (var1 != null && var1.f$E()) {
               ((GuiButton)this.field_146292_n.get(2)).field_146126_j = "AutoReconnect (" + (WI.f$g / 20 + 1) + ")";
               if (WI.f$g > 0) {
                  --WI.f$g;
               } else {
                  try {
                     this.func_146284_a((GuiButton)this.field_146292_n.get(1));
                  } catch (IOException var3) {
                  }
               }
            } else {
               ((GuiButton)this.field_146292_n.get(2)).field_146126_j = "AutoReconnect";
            }
         }

      }
   }
}
