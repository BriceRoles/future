package net.futureclient.client;

import java.util.Iterator;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityEnderEye;

public class gH extends Ha<ME> {
   // $FF: synthetic field
   public final ih f$d;

   // $FF: synthetic method
   public gH(ih var1) {
      boolean var10000 = true;
      boolean var10001 = true;
      boolean var10002 = true;
      boolean var10003 = true;
      this.f$d = var1;
      super();
   }

   // $FF: synthetic method
   public void f$E(ME var1) {
      Iterator var2 = ih.f$e(this.f$d).field_71441_e.field_72996_f.iterator();

      while(var2.hasNext()) {
         gH var10000;
         label60: {
            Entity var3;
            if ((var3 = (Entity)var2.next()) instanceof EntityEnderEye) {
               EntityEnderEye var4 = (EntityEnderEye)var3;
               if (ih.f$a(this.f$d) == null && !var4.equals(ih.f$E(this.f$d))) {
                  var10000 = this;
                  ih.f$a(this.f$d, var4);
                  La.f$E().f$E(mI.f$E("_okum&\\\u007f|&v`9Cwb|t9u|r7&X`mck&mn|&\u007fokum&vh|&{t|gru5&mnkin&xhvrqck&vh|&\u007fgkrqck&\u007ftvk9rqc9jxum("));
                  break label60;
               }

               if (ih.f$E(this.f$d) == null && !var4.equals(ih.f$a(this.f$d))) {
                  ih.f$E(this.f$d, var4);
                  La.f$E().f$E(o.f$E("Y*i d+*\ns** loO!n*xoy*~a*\u000e~;o\"z;c!mo~ *,k#i:f.~*$a$"));
               }
            }

            var10000 = this;
         }

         if (ih.f$a(var10000.f$d) != null && !ih.f$a(this.f$d)) {
            if (ih.f$a(this.f$d).field_70173_aa < 10 || ih.f$a(this.f$d).field_70173_aa > 20) {
               return;
            }

            ih.f$K(this.f$d, new Wi(this.f$d, ih.f$a(this.f$d).field_70142_S, ih.f$a(this.f$d).field_70136_U, (gH)null));
            ih.f$B(this.f$d, new Wi(this.f$d, ih.f$a(this.f$d).field_70165_t, ih.f$a(this.f$d).field_70161_v, (gH)null));
            ih.f$a(this.f$d, true);
         }

         if (ih.f$E(this.f$d) != null && !ih.f$E(this.f$d)) {
            if (ih.f$E(this.f$d).field_70173_aa < 10 || ih.f$E(this.f$d).field_70173_aa > 20) {
               return;
            }

            ih.f$e(this.f$d, new Wi(this.f$d, ih.f$E(this.f$d).field_70142_S, ih.f$E(this.f$d).field_70136_U, (gH)null));
            ih.f$a(this.f$d, new Wi(this.f$d, ih.f$E(this.f$d).field_70165_t, ih.f$E(this.f$d).field_70161_v, (gH)null));
            ih.f$E(this.f$d, true);
         }

         if (ih.f$a(this.f$d) && ih.f$E(this.f$d) && ih.f$E(this.f$d).f$E(6000L)) {
            ih.f$E(this.f$d).f$a();
            ih.f$E(this.f$d, ih.f$E(this.f$d, ih.f$K(this.f$d), ih.f$B(this.f$d), ih.f$e(this.f$d), ih.f$a(this.f$d)));
            if (ih.f$E(this.f$d) != null) {
               Wi var10002 = ih.f$E(this.f$d);
               var10002.f$M -= 3.0D;
               Wi var10001 = ih.f$E(this.f$d);
               var10001.f$g -= 3.0D;
               EntityPlayerSP var5 = ih.f$a(this.f$d).field_71439_g;
               String var6 = mI.f$E("<uNg`vvowrjT|kvp|&Jrkiwaqiub");
               Object[] var8 = new Object[1];
               boolean var10004 = true;
               var8[0] = kH.f$E().f$E().f$E();
               var5.func_71165_d(String.format(var6, var8));
               var5 = ih.f$E(this.f$d).field_71439_g;
               var6 = o.f$E("/<].s?e&d;y\u000en+*\u001c~=e!m'e#no/<*~:\u007f*jy");
               var8 = new Object[3];
               var10004 = true;
               var8[0] = kH.f$E().f$E().f$E();
               var8[1] = (int)ih.f$E(this.f$d).f$M;
               var8[2] = (int)ih.f$E(this.f$d).f$g;
               var5.func_71165_d(String.format(var6, var8));
               La var7 = La.f$E();
               var6 = mI.f$E("Iijupduc9umtvh~nvj}&\u007filh}'9^C<9#j*9#j(");
               var8 = new Object[2];
               var10004 = true;
               var8[0] = (int)ih.f$E(this.f$d).f$M;
               var8[1] = (int)ih.f$E(this.f$d).f$g;
               var7.f$E(String.format(var6, var8), false);
            } else {
               La.f$E().f$E(o.f$E("\u001bb**\ns** loO!n*x<*'k+*;b**<k\"ooz.~'$o^=so~'x }&d(*;b*gol.x;b*xok8k6*)x goo.i'* ~'o=$"));
            }

            kH.f$E().f$E().f$E((Ha)this);
            ih.f$E(this.f$d);
         }
      }

      if (ih.f$E(this.f$d).f$E(60000L) || ih.f$E(this.f$d).f$E(5000L) && ih.f$E(this.f$d)) {
         kH.f$E().f$E().f$E((Ha)this);
         ih.f$E(this.f$d);
      }

   }
}
