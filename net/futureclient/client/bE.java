package net.futureclient.client;

import net.minecraft.client.Minecraft;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;

public class bE extends Ba {
   // $FF: synthetic field
   private Bh f$d;
   // $FF: synthetic field
   private ka<VF> f$j;
   // $FF: synthetic field
   private s f$M;
   // $FF: synthetic field
   private z<Boolean> f$i;
   // $FF: synthetic field
   private s f$g;

   // $FF: synthetic method
   private boolean f$e() {
      int var1;
      for(int var10000 = var1 = MathHelper.func_76128_c(f$d.field_71439_g.func_174813_aQ().field_72340_a); var10000 < MathHelper.func_76128_c(f$d.field_71439_g.func_174813_aQ().field_72336_d) + 1; var10000 = var1) {
         int var2;
         for(var10000 = var2 = MathHelper.func_76128_c(f$d.field_71439_g.func_174813_aQ().field_72338_b); var10000 < MathHelper.func_76128_c(f$d.field_71439_g.func_174813_aQ().field_72337_e) + 1; var10000 = var2) {
            int var3;
            for(var10000 = var3 = MathHelper.func_76128_c(f$d.field_71439_g.func_174813_aQ().field_72339_c); var10000 < MathHelper.func_76128_c(f$d.field_71439_g.func_174813_aQ().field_72334_f) + 1; var10000 = var3) {
               if (f$d.field_71441_e.func_180495_p(new BlockPos(var1, var2, var3)).func_185904_a().func_76230_c()) {
                  AxisAlignedBB var4 = new AxisAlignedBB((double)var1, (double)var2, (double)var3, (double)(var1 + 1), (double)(var2 + 1), (double)(var3 + 1));
                  if (f$d.field_71439_g.func_174813_aQ().func_72326_a(var4)) {
                     return true;
                  }
               }

               ++var3;
            }

            ++var2;
         }

         ++var1;
      }

      return false;
   }

   // $FF: synthetic method
   public static Minecraft f$v() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$L() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$E() {
      return f$d;
   }

   // $FF: synthetic method
   public void f$K() {
      super.f$K();
      if ((Boolean)this.f$i.f$E() && f$d.field_71439_g != null && f$d.field_71441_e != null) {
         double var1 = Math.cos(Math.toRadians((double)(f$d.field_71439_g.field_70177_z + 90.0F)));
         double var3 = Math.sin(Math.toRadians((double)(f$d.field_71439_g.field_70177_z + 90.0F)));
         f$d.field_71439_g.func_70107_b(f$d.field_71439_g.field_70165_t + 1.0D * this.f$M.f$E().doubleValue() * var1 + 0.0D * this.f$M.f$E().doubleValue() * var3, f$d.field_71439_g.field_70163_u, f$d.field_71439_g.field_70161_v + (1.0D * this.f$M.f$E().doubleValue() * var3 - 0.0D * this.f$M.f$E().doubleValue() * var1));
      }

   }

   // $FF: synthetic method
   public static Minecraft f$Q() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$c() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$d() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$J() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$x() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$V() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$h() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$K() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$o() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$f() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$P() {
      return f$d;
   }

   // $FF: synthetic method
   public void f$B() {
      super.f$B();
      f$d.field_71439_g.field_70145_X = false;
   }

   // $FF: synthetic method
   public static Minecraft f$w() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$Y() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$t() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$k() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$C() {
      return f$d;
   }

   // $FF: synthetic method
   public static s f$E(bE var0) {
      return var0.f$g;
   }

   // $FF: synthetic method
   public static Minecraft f$W() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$g() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$a() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$p() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$n() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$q() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$H() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$u() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$i() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$G() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$M() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$l() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$b() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$j() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$F() {
      return f$d;
   }

   // $FF: synthetic method
   public bE() {
      String var10001 = Rg.f$E("\u0019b(y,");
      String[] var10002 = new String[4];
      boolean var10004 = true;
      var10002[0] = vH.f$E("p^AEE");
      var10002[1] = Rg.f$E("d&i%c9");
      var10002[2] = vH.f$E("fHWE");
      var10002[3] = Rg.f$E("N&e;M |,k>k0");
      super(var10001, var10002, true, -4550444, JD.f$K);
      VF var10003 = VF.f$g;
      String[] var5 = new String[2];
      boolean var10006 = true;
      var5[0] = vH.f$E("{ORE");
      var5[1] = Rg.f$E("$");
      this.f$j = new ka(var10003, var5);
      Boolean var3 = false;
      var5 = new String[3];
      var10006 = true;
      var5[0] = vH.f$E("wUBOuL_P");
      var5[1] = Rg.f$E("k*");
      var5[2] = vH.f$E("UL_P");
      this.f$i = new z(var3, var5);
      Double var4 = 0.003D;
      Double var7 = 0.001D;
      Double var10005 = 10.0D;
      Double var8 = 0.001D;
      String[] var10007 = new String[3];
      boolean var10009 = true;
      var10007[0] = Rg.f$E("H%e*a:");
      var10007[1] = vH.f$E("BZOUK");
      var10007[2] = Rg.f$E("+");
      this.f$M = new s(var4, var7, var10005, var8, var10007);
      var4 = 0.2D;
      var7 = 0.0D;
      var10005 = 10.0D;
      var8 = 0.1D;
      var10007 = new String[1];
      var10009 = true;
      var10007[0] = vH.f$E("rIETWNUE");
      this.f$g = new s(var4, var7, var10005, var8, var10007);
      z[] var1 = new z[4];
      boolean var6 = true;
      var1[0] = this.f$M;
      var1[1] = this.f$g;
      var1[2] = this.f$i;
      var1[3] = this.f$j;
      this.f$E((z[])var1);
      this.f$d = new Bh();
      Ha[] var2 = new Ha[4];
      var6 = true;
      var2[0] = new bD(this);
      var2[1] = new aD(this);
      var2[2] = new xD(this);
      var2[3] = new de(this);
      this.f$E((Ha[])var2);
   }

   // $FF: synthetic method
   public static boolean f$E(bE var0) {
      return var0.f$e();
   }

   // $FF: synthetic method
   public static Minecraft f$D() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$B() {
      return f$d;
   }

   // $FF: synthetic method
   public static Bh f$E(bE var0) {
      return var0.f$d;
   }

   // $FF: synthetic method
   public static ka f$E(bE var0) {
      return var0.f$j;
   }

   // $FF: synthetic method
   public static Minecraft f$U() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$A() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$m() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$e() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$I() {
      return f$d;
   }
}
