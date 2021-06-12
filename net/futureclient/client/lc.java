package net.futureclient.client;

import net.minecraft.client.Minecraft;

public class lc extends Ba {
   // $FF: synthetic field
   private int f$g;
   // $FF: synthetic field
   private float f$M;
   // $FF: synthetic field
   public z<Boolean> f$e;
   // $FF: synthetic field
   public z<Boolean> f$K;
   // $FF: synthetic field
   public ka<Bd> f$b;
   // $FF: synthetic field
   private boolean f$d;
   // $FF: synthetic field
   private s f$C;
   // $FF: synthetic field
   private double f$i;
   // $FF: synthetic field
   private Bh f$j;
   // $FF: synthetic field
   public z<Boolean> f$I;

   // $FF: synthetic method
   public static boolean f$E(lc var0) {
      return var0.f$d;
   }

   // $FF: synthetic method
   private boolean f$e() {
      uA var1;
      if ((var1 = (uA)kH.f$E().f$E().f$E(uA.class)) != null && var1.f$E() && !((dd)var1.f$K.f$E()).equals(dd.f$j) && !((dd)var1.f$K.f$E()).equals(dd.f$C) && !((dd)var1.f$K.f$E()).equals(dd.f$a) && !((dd)var1.f$K.f$E()).equals(dd.f$M) && !((dd)var1.f$K.f$E()).equals(dd.f$g)) {
         return false;
      } else {
         return !f$d.field_71439_g.func_70090_H() && f$d.field_71439_g.field_70122_E && !f$d.field_71439_g.func_70617_f_() && !f$d.field_71439_g.field_71158_b.field_78901_c && f$d.field_71439_g.field_70124_G && (double)f$d.field_71439_g.field_70143_R < 0.1D;
      }
   }

   // $FF: synthetic method
   public static float f$E(lc var0, float var1) {
      return var0.f$M = var1;
   }

   // $FF: synthetic method
   public static int f$a(lc var0) {
      return var0.f$g++;
   }

   // $FF: synthetic method
   public static int f$E(lc var0, int var1) {
      return var0.f$g = var1;
   }

   // $FF: synthetic method
   public static Minecraft f$A() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$E() {
      return f$d;
   }

   // $FF: synthetic method
   public static float f$E(lc var0) {
      return var0.f$M;
   }

   // $FF: synthetic method
   public static Minecraft f$L() {
      return f$d;
   }

   // $FF: synthetic method
   public static boolean f$a(lc var0) {
      return var0.f$e();
   }

   // $FF: synthetic method
   public static Minecraft f$f() {
      return f$d;
   }

   // $FF: synthetic method
   public static double f$E(lc var0, double var1) {
      return var0.f$i = var1;
   }

   // $FF: synthetic method
   public lc() {
      String var10001 = RG.f$E("t(B,");
      String[] var10002 = new String[3];
      boolean var10004 = true;
      var10002[0] = HH.f$E("Z\u001fl\u001b");
      var10002[1] = RG.f$E("F)S3M)J,");
      var10002[2] = HH.f$E("8e\u0002m\u000eZ\u001fl\u001b");
      super(var10001, var10002, false, -7285557, JD.f$j);
      Float var10003 = 2.0F;
      Float var4 = 0.8F;
      Float var10005 = 10.0F;
      Double var10006 = 0.1D;
      String[] var10007 = new String[4];
      boolean var10009 = true;
      var10007[0] = RG.f$E("o9N;O(");
      var10007[1] = HH.f$E("Z\u001fl\u001ba\u000e`\fa\u001f");
      var10007[2] = RG.f$E("\u000fS9Wqo9N;O(");
      var10007[3] = HH.f$E("z\u0003");
      this.f$C = new s(var10003, var4, var10005, var10006, var10007);
      Boolean var3 = true;
      String[] var6 = new String[2];
      boolean var8 = true;
      var6[0] = RG.f$E("\u000eB*B.T9");
      var6[1] = HH.f$E("\u0019l\u001d");
      this.f$e = new z(var3, var6);
      var3 = true;
      var6 = new String[4];
      var8 = true;
      var6[0] = RG.f$E("r/B\bN1B.");
      var6[1] = HH.f$E("?`\u0006l\u0019");
      var6[2] = RG.f$E("s5J9");
      var6[3] = HH.f$E("]\u0002d\u0019");
      this.f$I = new z(var3, var6);
      var3 = true;
      var6 = new String[5];
      var8 = true;
      var6[0] = RG.f$E("b2S5S%t(B,");
      var6[1] = HH.f$E("#f\u0019z\u000eZ\u001fl\u001b");
      var6[2] = RG.f$E("\fN;t(B,");
      var6[3] = HH.f$E(";`\fn\u0012Z\u001fl\u001b");
      var6[4] = RG.f$E("4T(B,");
      this.f$K = new z(var3, var6);
      Bd var5 = Bd.f$i;
      var6 = new String[3];
      var8 = true;
      var6[0] = HH.f$E("D\u0004m\u000e");
      var6[1] = RG.f$E("s%W9");
      var6[2] = HH.f$E("&f\u000f");
      this.f$b = new ka(var5, var6);
      this.f$j = new Bh();
      this.f$M = 1.0F;
      this.f$g = 0;
      z[] var1 = new z[5];
      boolean var7 = true;
      var1[0] = this.f$b;
      var1[1] = this.f$e;
      var1[2] = this.f$I;
      var1[3] = this.f$K;
      var1[4] = this.f$C;
      this.f$E((z[])var1);
      Ha[] var2 = new Ha[5];
      var7 = true;
      var2[0] = new YB(this);
      var2[1] = new Ab(this);
      var2[2] = new zb(this);
      var2[3] = new JA(this);
      var2[4] = new Sd(this);
      this.f$E((Ha[])var2);
   }

   // $FF: synthetic method
   public static Minecraft f$C() {
      return f$d;
   }

   // $FF: synthetic method
   public static Bh f$E(lc var0) {
      return var0.f$j;
   }

   // $FF: synthetic method
   public static Minecraft f$i() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$j() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$B() {
      return f$d;
   }

   // $FF: synthetic method
   public static double f$E(lc var0) {
      return var0.f$i;
   }

   // $FF: synthetic method
   public void f$B() {
      ic var1 = (ic)kH.f$E().f$E().f$E(ic.class);
      if (f$d.field_71439_g != null) {
         if (var1 != null && !var1.f$E()) {
            ((q)((Y)f$d).getTimer()).f$E(1.0F);
         }

         if (f$d.field_71439_g.func_184187_bx() != null) {
            f$d.field_71439_g.func_184187_bx().field_70138_W = 1.0F;
         }
      }

      super.f$B();
   }

   // $FF: synthetic method
   public static s f$E(lc var0) {
      return var0.f$C;
   }

   // $FF: synthetic method
   public static int f$E(lc var0) {
      return var0.f$g;
   }

   // $FF: synthetic method
   public static Minecraft f$H() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$a() {
      return f$d;
   }

   // $FF: synthetic method
   public static boolean f$E(lc var0, boolean var1) {
      return var0.f$d = var1;
   }

   // $FF: synthetic method
   public static Minecraft f$K() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$m() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$h() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$M() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$I() {
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
}
