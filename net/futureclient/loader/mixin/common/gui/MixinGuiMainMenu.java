package net.futureclient.loader.mixin.common.gui;

import java.util.Iterator;
import net.futureclient.client.DG;
import net.futureclient.client.lG;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.client.gui.GuiScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({GuiMainMenu.class})
public abstract class MixinGuiMainMenu extends GuiScreen {
   @Inject(
      method = {"initGui"},
      at = {@At("RETURN")}
   )
   private void f$E(CallbackInfo var1) {
      if (!lG.f$E().f$E()) {
         this.field_146292_n.add(new GuiButton(167, this.field_146294_l / 2 - 100, this.field_146295_m / 4 + 48 + 72, "Account Manager"));
         Iterator var2 = this.field_146292_n.iterator();

         while(true) {
            GuiButton var3;
            do {
               if (!var2.hasNext()) {
                  return;
               }

               var3 = (GuiButton)var2.next();
            } while(var3.field_146127_k != 0 && var3.field_146127_k != 4 && var3.field_146127_k != 5);

            var3.field_146129_i += 12;
         }
      }
   }

   @Inject(
      method = {"actionPerformed"},
      at = {@At("RETURN")}
   )
   private void f$E(GuiButton var1, CallbackInfo var2) {
      GuiMainMenu var3 = (GuiMainMenu)this;
      if (var1.field_146127_k == 167) {
         this.field_146297_k.func_147108_a(new DG(var3));
      }

   }
}
