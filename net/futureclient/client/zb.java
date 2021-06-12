package net.futureclient.client;

import net.minecraft.network.play.client.CPacketPlayer.Position;

public class zb extends Ha<sf> {
   // $FF: synthetic field
   public final lc f$d;

   // $FF: synthetic method
   public zb(lc var1) {
      this.f$d = var1;
   }

   // $FF: synthetic method
   public void f$E(sf var1) {
      if (!((Bd)this.f$d.f$b.f$E()).equals(Bd.f$g)) {
         double var2 = var1.f$E().field_72338_b - lc.f$E(this.f$d);
         if (lc.f$E(this.f$d) && var2 > (double)var1.f$E()) {
            double[] var10000 = new double[6];
            boolean var10002 = true;
            var10000[0] = 0.42D;
            var10000[1] = var2 < 1.0D && var2 > 0.8D ? 0.753D : 0.75D;
            var10000[2] = 1.0D;
            var10000[3] = 1.16D;
            var10000[4] = 1.23D;
            var10000[5] = 1.2D;
            double[] var4 = var10000;
            if (!((Bd)this.f$d.f$b.f$E()).equals(Bd.f$M) && var2 >= 2.0D) {
               var10000 = new double[8];
               var10002 = true;
               var10000[0] = 0.42D;
               var10000[1] = 0.78D;
               var10000[2] = 0.63D;
               var10000[3] = 0.51D;
               var10000[4] = 0.9D;
               var10000[5] = 1.21D;
               var10000[6] = 1.45D;
               var10000[7] = 1.43D;
               var4 = var10000;
            }

            lc.f$E(this.f$d, var2 > 1.0D ? 0.15F : 0.35F);
            boolean var5 = (Boolean)this.f$d.f$I.f$E() && CG.f$E();

            int var6;
            for(int var7 = var6 = 0; var7 < (var2 > 1.0D ? var4.length : 2); var7 = var6) {
               lc.f$B().field_71439_g.field_71174_a.func_147297_a(new Position(lc.f$h().field_71439_g.field_70165_t, lc.f$A().field_71439_g.field_70163_u + var4[var6], lc.f$K().field_71439_g.field_70161_v, true));
               if ((Boolean)this.f$d.f$I.f$E() && !var5) {
                  lc.f$a(this.f$d);
                  if (lc.f$E(this.f$d) >= 2) {
                     ((q)((Y)lc.f$e()).getTimer()).f$E(lc.f$E(this.f$d));
                     lc.f$E(this.f$d, 0);
                  }
               }

               ++var6;
            }

            lc.f$E(this.f$d, false);
         }

      }
   }
}
