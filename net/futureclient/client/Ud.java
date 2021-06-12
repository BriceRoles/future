package net.futureclient.client;

import net.minecraft.util.math.BlockPos;

public class Ud implements Runnable {
   // $FF: synthetic field
   private Thread f$g;
   // $FF: synthetic field
   public final oE f$d;

   // $FF: synthetic method
   private Ud(oE var1) {
      this.f$d = var1;
   }

   // $FF: synthetic method
   public Ud(oE var1, dE var2) {
      this(var1);
   }

   // $FF: synthetic method
   public void run() {
      long var1 = System.currentTimeMillis();
      if (oE.f$e().field_71439_g != null && ((VD)oE.f$E(this.f$d).f$E()).equals(VD.f$M)) {
         oE.f$B(this.f$d, (int)Math.floor(oE.f$a().field_71439_g.field_70165_t));
         oE.f$a(this.f$d, (int)Math.floor(oE.f$E().field_71439_g.field_70161_v));
         int var3 = 0;

         for(int var10000 = var3; var10000 <= oE.f$e(this.f$d).f$E().intValue(); var10000 = var3) {
            int var2;
            for(var10000 = var2 = oE.f$a(this.f$d).f$E().intValue() + oE.f$E(this.f$d).f$E().intValue(); var10000 >= oE.f$a(this.f$d).f$E().intValue(); var10000 = var2) {
               int var4;
               for(var10000 = var4 = -var3; var10000 < var3; var10000 = var4) {
                  int var5;
                  for(var10000 = var5 = -var3; var10000 < var3; var10000 = var5) {
                     oE.f$e(this.f$d).add(new BlockPos(oE.f$e(this.f$d) + var4, var2, oE.f$E(this.f$d) + var5++));
                  }

                  ++var4;
               }

               --var2;
            }

            ++var3;
         }

         oE.f$E(this.f$d, oE.f$e(this.f$d).size() - 1);
      }

   }

   // $FF: synthetic method
   public void f$E() {
      if (this.f$g == null) {
         this.f$g = new Thread(this);
         this.f$g.setPriority(1);
         this.f$g.start();

         try {
            this.f$g.join(1000L);
            this.f$g.interrupt();
            return;
         } catch (Exception var2) {
            var2.printStackTrace();
         }
      }

   }
}
