package net.futureclient.client;

import net.minecraft.client.gui.inventory.GuiChest;
import net.minecraft.inventory.ClickType;

public class AB extends Ha<ME> {
   // $FF: synthetic field
   public final Zc f$d;

   // $FF: synthetic method
   public AB(Zc var1) {
      this.f$d = var1;
   }

   // $FF: synthetic method
   public void f$E(ME var1) {
      if (Zc.f$j().field_71462_r instanceof GuiChest) {
         GuiChest var2 = (GuiChest)Zc.f$M().field_71462_r;
         if (!Zc.f$e().contains(((A)var2).getLowerChestInventory().func_145748_c_().func_150260_c())) {
            int var10000;
            int var3;
            if (((HC)Zc.f$E(this.f$d).f$E()).equals(HC.f$M)) {
               for(var10000 = var3 = ((A)var2).getLowerChestInventory().func_70302_i_(); var10000 <= ((A)var2).getLowerChestInventory().func_70302_i_() + 35; var10000 = var3) {
                  if (!Zc.f$C().field_71439_g.field_71069_bz.func_75139_a(var3 - ((A)var2).getLowerChestInventory().func_70302_i_() + 9).func_75211_c().func_190926_b() && Zc.f$E(this.f$d).f$a(Zc.f$E(this.f$d).f$E().floatValue() * 1000.0F)) {
                     Zc.f$h().field_71442_b.func_187098_a(var2.field_147002_h.field_75152_c, var3, 0, ClickType.QUICK_MOVE, Zc.f$H().field_71439_g);
                     Zc.f$E(this.f$d).f$a();
                     return;
                  }

                  ++var3;
               }
            } else {
               for(var10000 = var3 = 0; var10000 < ((A)var2).getLowerChestInventory().func_70302_i_(); var10000 = var3) {
                  if (!((A)var2).getLowerChestInventory().func_70301_a(var3).func_190926_b() && Zc.f$E(this.f$d).f$a(Zc.f$E(this.f$d).f$E().floatValue() * 1000.0F)) {
                     AB var5;
                     switch(rb.f$d[((HC)Zc.f$E(this.f$d).f$E()).ordinal()]) {
                     case 1:
                        while(false) {
                        }

                        Zc.f$K().field_71442_b.func_187098_a(var2.field_147002_h.field_75152_c, var3, 0, ClickType.QUICK_MOVE, Zc.f$A().field_71439_g);
                        var5 = this;
                        break;
                     case 2:
                        Zc.f$e().field_71442_b.func_187098_a(var2.field_147002_h.field_75152_c, var3, 0, ClickType.PICKUP, Zc.f$B().field_71439_g);
                        Zc.f$E().field_71442_b.func_187098_a(var2.field_147002_h.field_75152_c, -999, 0, ClickType.PICKUP, Zc.f$a().field_71439_g);
                     default:
                        var5 = this;
                     }

                     Zc.f$E(var5.f$d).f$a();
                  }

                  ++var3;
               }
            }

         }
      }
   }
}
