package net.futureclient.client;

import java.util.Iterator;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.item.ItemAir;
import net.minecraft.item.ItemStack;
import net.minecraft.network.play.client.CPacketHeldItemChange;
import net.minecraft.network.play.client.CPacketUseEntity;
import net.minecraft.util.EnumHand;

public class GG extends GA {
   // $FF: synthetic method
   public String f$E() {
      return null;
   }

   // $FF: synthetic method
   public GG() {
      String[] var10001 = new String[2];
      boolean var10003 = true;
      var10001[0] = ph.f$E("\\\t{\u001ez");
      var10001[1] = BG.f$E(";E\u0019A");
      super(var10001);
   }

   // $FF: synthetic method
   public String f$E(String[] var1) {
      String[] var7 = 0;
      Iterator var2 = this.f$d.field_71441_e.func_72910_y().iterator();

      while(true) {
         while(true) {
            label39:
            while(true) {
               for(Iterator var10000 = var2; var10000.hasNext(); var10000 = var2) {
                  Entity var3;
                  if (!((var3 = (Entity)var2.next()) instanceof EntityAnimal)) {
                     continue label39;
                  }

                  EntityAnimal var8 = (EntityAnimal)var3;
                  int var4;
                  if (this.f$E(var8)) {
                     for(int var9 = var4 = 36; var9 < 45; var9 = var4) {
                        ItemStack var5;
                        if (!((var5 = this.f$d.field_71439_g.field_71069_bz.func_75139_a(var4).func_75211_c()).func_77973_b() instanceof ItemAir) && var8.func_70877_b(var5)) {
                           this.f$d.field_71439_g.field_71174_a.func_147297_a(new CPacketHeldItemChange(var4 - 36));
                           ++var7;
                           this.f$d.field_71439_g.field_71174_a.func_147297_a(new CPacketUseEntity(var8, EnumHand.MAIN_HAND));
                           if (!this.f$d.field_71439_g.field_71075_bZ.field_75098_d) {
                              int var6 = var5.func_190916_E();
                              --var6;
                              if (var6 <= 0) {
                                 this.f$d.field_71439_g.field_71071_by.func_70299_a(var4, var5);
                              }
                           }
                           continue label39;
                        }

                        ++var4;
                     }
                     continue label39;
                  }
               }

               this.f$d.field_71439_g.field_71174_a.func_147297_a(new CPacketHeldItemChange(this.f$d.field_71439_g.field_71071_by.field_70461_c));
               String var10 = ph.f$E("\\\t{\u001f>^m[\u007f\u0015w\u0016\u007f\u0017;\b0");
               Object[] var10001 = new Object[2];
               boolean var10003 = true;
               var10001[0] = var7;
               var10001[1] = var7 == 1 ? "" : BG.f$E("W");
               return String.format(var10, var10001);
            }
         }
      }
   }

   // $FF: synthetic method
   private boolean f$E(EntityAnimal var1) {
      return !var1.func_70631_g_() && !var1.func_70880_s() && this.f$d.field_71439_g.func_70032_d(var1) < (float)(this.f$d.field_71439_g.func_70685_l(var1) ? 6 : 3);
   }
}
