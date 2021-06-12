package net.futureclient.client;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.MovementInput;
import net.minecraft.util.MovementInputFromOptions;

public class rA extends Ba {
   // $FF: synthetic field
   private Entity f$d;
   // $FF: synthetic field
   private final s f$i;
   // $FF: synthetic field
   private static final MovementInput f$j = new MovementInput();
   // $FF: synthetic field
   private final ka<pb> f$M;
   // $FF: synthetic field
   private ab f$g;

   // $FF: synthetic method
   public static Minecraft f$d() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$l() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$Q() {
      return f$d;
   }

   // $FF: synthetic method
   public ab f$E() {
      return this.f$g;
   }

   // $FF: synthetic method
   public static Entity f$E(rA var0, Entity var1) {
      boolean var10000 = true;
      boolean var10001 = true;
      boolean var10002 = true;
      boolean var10003 = true;
      return var0.f$d = var1;
   }

   // $FF: synthetic method
   public static MovementInput f$E() {
      return f$j;
   }

   // $FF: synthetic method
   public static Minecraft f$i() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$m() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$C() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$B() {
      return f$d;
   }

   // $FF: synthetic method
   public static s f$E(rA var0) {
      return var0.f$i;
   }

   // $FF: synthetic method
   public void f$K() {
      if (f$d.field_71441_e != null && f$d.field_71439_g != null) {
         ab var1;
         ab var10000 = var1 = new ab(f$d.field_71441_e, (Rb)null);
         var10000.func_70606_j(f$d.field_71439_g.func_110143_aJ());
         var10000.func_110149_m(f$d.field_71439_g.func_110139_bj());
         var10000.func_184819_a(f$d.field_71439_g.func_184591_cq());
         var10000.func_174826_a(f$d.field_71439_g.func_174813_aQ());
         var10000.field_70165_t = f$d.field_71439_g.field_70165_t;
         var10000.field_70163_u = f$d.field_71439_g.field_70163_u;
         var10000.field_70161_v = f$d.field_71439_g.field_70161_v;
         var10000.field_70169_q = f$d.field_71439_g.field_70169_q;
         var10000.field_70167_r = f$d.field_71439_g.field_70167_r;
         var10000.field_70166_s = f$d.field_71439_g.field_70166_s;
         var10000.field_70142_S = f$d.field_71439_g.field_70142_S;
         var10000.field_70137_T = f$d.field_71439_g.field_70137_T;
         var10000.field_70136_U = f$d.field_71439_g.field_70136_U;
         var10000.field_70126_B = var10000.field_70177_z = f$d.field_71439_g.field_70177_z;
         var1.field_70127_C = var1.field_70125_A = f$d.field_71439_g.field_70125_A;
         var1.field_70758_at = var1.field_70759_as = f$d.field_71439_g.field_70759_as;
         var1.field_71071_by = f$d.field_71439_g.field_71071_by;
         var1.field_71069_bz = f$d.field_71439_g.field_71069_bz;
         var1.field_71075_bZ = f$d.field_71439_g.field_71075_bZ;
         var1.field_70737_aN = f$d.field_71439_g.field_70737_aN;
         var1.field_70738_aO = f$d.field_71439_g.field_70738_aO;
         var1.field_70739_aP = f$d.field_71439_g.field_70739_aP;
         MovementInputFromOptions var10001 = new MovementInputFromOptions(f$d.field_71474_y);
         var10001.func_78898_a();
         var1.field_71158_b = var10001;
         this.f$d = f$d.func_175606_aa();
         f$d.func_175607_a(this.f$g = var1);
         super.f$K();
      } else {
         boolean var10003 = true;
         this.f$E(false);
      }
   }

   // $FF: synthetic method
   public static Minecraft f$g() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$c() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$e() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$a() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$L() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$K() {
      return f$d;
   }

   // $FF: synthetic method
   public rA() {
      String var10001 = wG.f$E(",\u0002UI\u000f~2");
      boolean var10004 = true;
      String[] var10002 = new String[3];
      var10004 = true;
      boolean var10006 = true;
      var10002[0] = tg.f$E("Nd7/m\u0018P");
      var10006 = true;
      var10002[1] = wG.f$E("\"UI\u000f~2");
      var10006 = true;
      var10002[2] = tg.f$E("u3'k\u000b\\");
      boolean var10005 = true;
      super(var10001, var10002, false, -3217280, JD.f$i);
      Double var10003 = 1.0D;
      Double var5 = 0.0D;
      Double var7 = 2.0D;
      Double var8 = 0.1D;
      boolean var10009 = true;
      String[] var10007 = new String[2];
      var10009 = true;
      boolean var10011 = true;
      var10007[0] = wG.f$E("c\\\tz;");
      var10011 = true;
      var10007[1] = tg.f$E("/i{!:k\u001cY");
      this.f$i = new s(var10003, var5, var7, var8, var10007);
      pb var3 = pb.f$M;
      var10006 = true;
      String[] var6 = new String[7];
      var10006 = true;
      boolean var10008 = true;
      var6[0] = wG.f$E("c\u0004\u0004U^\r|+");
      var10008 = true;
      var6[1] = tg.f$E("%fb78o\u001aI");
      var10008 = true;
      var6[2] = wG.f$E("D^\r|:");
      var10008 = true;
      var6[3] = tg.f$E(">io&8o\u001aX");
      var10008 = true;
      var6[4] = wG.f$E("m+");
      var10008 = true;
      var6[5] = tg.f$E("I");
      var10008 = true;
      var6[6] = wG.f$E("6");
      this.f$M = new ka(var3, var6);
      boolean var4 = true;
      z[] var1 = new z[2];
      var4 = true;
      var10005 = true;
      var1[0] = this.f$i;
      var10005 = true;
      var1[1] = this.f$M;
      this.f$E((z[])var1);
      var4 = true;
      Ha[] var2 = new Ha[8];
      var4 = true;
      var10005 = true;
      var2[0] = new Rb(this);
      var10005 = true;
      var2[1] = new bc(this);
      var10005 = true;
      var2[2] = new ub(this);
      var10005 = true;
      var2[3] = new nA(this);
      var10005 = true;
      var2[4] = new Ob(this);
      var10005 = true;
      var2[5] = new Pb(this);
      var10005 = true;
      var2[6] = new qA(this);
      var10005 = true;
      var2[7] = new MC(this);
      this.f$E((Ha[])var2);
      var4 = true;
      this.f$E(false);
   }

   // $FF: synthetic method
   public void f$B() {
      super.f$B();
      if (f$d.field_71439_g != null) {
         if (f$d.field_71439_g.field_71158_b.getClass() == f$j.getClass()) {
            MovementInputFromOptions var1;
            (var1 = new MovementInputFromOptions(f$d.field_71474_y)).func_78898_a();
            f$d.field_71439_g.field_71158_b = var1;
         }

         f$d.func_175607_a(this.f$d);
      }

      this.f$g = null;
   }

   // $FF: synthetic method
   public static Minecraft f$U() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$H() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$P() {
      return f$d;
   }

   // $FF: synthetic method
   public static ab f$E(rA var0) {
      return var0.f$g;
   }

   // $FF: synthetic method
   public static Minecraft f$D() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$A() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$k() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$E() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$M() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$j() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$f() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$J() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$I() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$b() {
      return f$d;
   }

   // $FF: synthetic method
   public static ka f$E(rA var0) {
      return var0.f$M;
   }

   // $FF: synthetic method
   public static Minecraft f$F() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$h() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$G() {
      return f$d;
   }
}
