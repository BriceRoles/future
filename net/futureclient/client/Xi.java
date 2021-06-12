package net.futureclient.client;

import java.util.ArrayList;
import java.util.Iterator;
import net.minecraft.network.play.server.SPacketTabComplete;

public class Xi extends Ha<jf> {
   // $FF: synthetic field
   public final wh f$d;

   // $FF: synthetic method
   public Xi(wh var1) {
      this.f$d = var1;
   }

   // $FF: synthetic method
   public void f$E(jf var1) {
      wh.f$E(this.f$d, new ArrayList());
      if (var1.f$E() instanceof SPacketTabComplete) {
         SPacketTabComplete var10000 = (SPacketTabComplete)var1.f$E();
         var1.f$E(true);
         String[] var2;
         int var3 = (var2 = var10000.func_149630_c()).length;

         int var4;
         for(int var9 = var4 = 0; var9 < var3; var9 = var4) {
            String[] var5;
            if ((var5 = var2[var4].split(HH.f$E("Q"))).length > 1 && !wh.f$E(this.f$d).contains(var5[0].substring(1))) {
               wh.f$E(this.f$d).add(var5[0].substring(1));
            }

            ++var4;
         }

         StringBuilder var6;
         StringBuilder var10 = var6 = new StringBuilder();
         String var10001 = r.f$E("R`aap/dcah}ag/<*g&./");
         Object[] var10002 = new Object[1];
         boolean var10004 = true;
         var10002[0] = wh.f$E(this.f$d).size();
         var10.append(String.format(var10001, var10002));
         Iterator var7 = wh.f$E(this.f$d).iterator();
         Iterator var11 = var7;

         while(var11.hasNext()) {
            String var8 = (String)var7.next();
            var11 = var7;
            var6.append(var8);
            var6.append(HH.f$E("%K"));
         }

         La.f$E().f$E((new StringBuilder()).insert(0, var6.substring(0, var6.length() - 2)).append(".").toString());
         kH.f$E().f$E().f$E((Ha)this);
      }

   }
}
