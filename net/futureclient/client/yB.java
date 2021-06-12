package net.futureclient.client;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.Vec3d;

public class yB extends Ba {
   // $FF: synthetic field
   private va f$g;
   // $FF: synthetic field
   private z<Boolean> f$C;
   // $FF: synthetic field
   public List<va> f$i;
   // $FF: synthetic field
   private ka<KB> f$j;
   // $FF: synthetic field
   private s f$K;
   // $FF: synthetic field
   private z<Boolean> f$I;
   // $FF: synthetic field
   public List<va> f$M;
   // $FF: synthetic field
   private z<Boolean> f$e;
   // $FF: synthetic field
   private DecimalFormat f$d;
   // $FF: synthetic field
   private s f$b;

   // $FF: synthetic method
   public static Minecraft f$F() {
      return f$d;
   }

   // $FF: synthetic method
   public static va f$E(yB var0, String var1) {
      return var0.f$E(var1);
   }

   // $FF: synthetic method
   public static Minecraft f$E() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$V() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$g() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$C() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$d() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$P() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$J() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$B() {
      return f$d;
   }

   // $FF: synthetic method
   public yB() {
      String var10001 = LI.f$E("mxCiUpTmI");
      String[] var10002 = new String[5];
      boolean var10004 = true;
      var10002[0] = vH.f$E("wWYFO_NBS");
      var10002[1] = LI.f$E("iUpTmI");
      var10002[2] = vH.f$E("AP");
      var10002[3] = LI.f$E("N[`JvSwN");
      var10002[4] = vH.f$E("APYIXT");
      super(var10001, var10002, false, -16742264, JD.f$i);
      Boolean var10003 = true;
      String[] var4 = new String[5];
      boolean var10006 = true;
      var4[0] = LI.f$E("~|[mRIUpTmI");
      var4[1] = vH.f$E("rEWT^pYIXT");
      var4[2] = LI.f$E("]j");
      var4[3] = vH.f$E("}IZLePYT");
      var4[4] = LI.f$E("~p_IUpTmI");
      this.f$C = new z(var10003, var4);
      var10003 = true;
      var4 = new String[5];
      var10006 = true;
      var4[0] = vH.f$E("zOQOCTfO_NBS");
      var4[1] = LI.f$E("vv]vOmiiUmI");
      var4[2] = vH.f$E("zOQIXsFOBS");
      var4[3] = LI.f$E("vv]IUpTmI");
      var4[4] = vH.f$E("lYGePBS");
      this.f$e = new z(var10003, var4);
      var10003 = true;
      var4 = new String[5];
      var10006 = true;
      var4[0] = LI.f$E("vpT|I");
      var4[1] = vH.f$E("zIXE");
      var4[2] = LI.f$E("~k[nvp_wI");
      var4[3] = vH.f$E("dDAAl_EXS");
      var4[4] = LI.f$E("vp_wI");
      this.f$I = new z(var10003, var4);
      Float var3 = 1.8F;
      Float var8 = 0.1F;
      Float var10005 = 5.0F;
      Double var11 = 0.1D;
      String[] var10007 = new String[2];
      boolean var10009 = true;
      var10007[0] = vH.f$E("w_DBH");
      var10007[1] = LI.f$E("M");
      this.f$K = new s(var3, var8, var10005, var11, var10007);
      Double var5 = 0.003D;
      Double var10 = 0.001D;
      Double var9 = 0.01D;
      var11 = 0.001D;
      var10007 = new String[3];
      var10009 = true;
      var10007[0] = vH.f$E("sUAZIXG");
      var10007[1] = LI.f$E("Iz[u_");
      var10007[2] = vH.f$E("S");
      this.f$b = new s(var5, var10, var9, var11, var10007);
      KB var6 = KB.f$M;
      var4 = new String[3];
      var10006 = true;
      var4[0] = LI.f$E("TU}_");
      var4[1] = vH.f$E("bYFE");
      var4[2] = LI.f$E("T_mRv^");
      this.f$j = new ka(var6, var4);
      this.f$i = new ArrayList();
      this.f$M = new ArrayList();
      this.f$d = new DecimalFormat(vH.f$E("\u0010\u0018\u0003"));
      z[] var1 = new z[6];
      boolean var7 = true;
      var1[0] = this.f$C;
      var1[1] = this.f$e;
      var1[2] = this.f$I;
      var1[3] = this.f$K;
      var1[4] = this.f$b;
      var1[5] = this.f$j;
      this.f$E((z[])var1);
      AG var10000 = kH.f$E().f$E();
      var4 = new String[5];
      var10006 = true;
      var4[0] = LI.f$E("mxCiUpTmI");
      var4[1] = vH.f$E("FO_NBS");
      var4[2] = LI.f$E("nJ");
      var4[3] = vH.f$E("aAOPYIXT");
      var4[4] = LI.f$E("nJvSwN");
      var10000.f$a(new Ld(this, var4));
      var10000 = kH.f$E().f$E();
      var4 = new String[7];
      var10006 = true;
      var4[0] = vH.f$E("aAOPYIXTEaRD");
      var4[1] = LI.f$E("MxCiUpTm[}^");
      var4[2] = vH.f$E("FO_NBARD");
      var4[3] = LI.f$E("JvSwNj[}^");
      var4[4] = vH.f$E("WFARD");
      var4[5] = LI.f$E("n[}^");
      var4[6] = vH.f$E("FARD");
      var10000.f$a(new sd(this, var4));
      var10000 = kH.f$E().f$E();
      var4 = new String[8];
      var10006 = true;
      var4[0] = LI.f$E("mxCiUpTmIK_tUo_");
      var4[1] = vH.f$E("AAOPYIXTDE[O@E");
      var4[2] = LI.f$E("JvSwNk_tUo_");
      var4[3] = vH.f$E("FO_NBSDE[O@E");
      var4[4] = LI.f$E("nJk_tUo_");
      var4[5] = vH.f$E("ARSM");
      var4[6] = LI.f$E("Mk_tUo_");
      var4[7] = vH.f$E("PDE[O@E");
      var10000.f$a(new LC(this, var4));
      var10000 = kH.f$E().f$E();
      var4 = new String[4];
      var10006 = true;
      var4[0] = LI.f$E("~|ImSw[mSvT");
      var4[1] = vH.f$E("wWYFO_NBdSSBIXABIYN");
      var4[2] = LI.f$E("N[`JvSwNj~|ImSw[mSvT");
      var4[3] = vH.f$E("rEET");
      var10000.f$a(new sc(this, var4));
      var10000 = kH.f$E().f$E();
      var4 = new String[7];
      var10006 = true;
      var4[0] = LI.f$E("h|WvL|~|ImSw[mSvT");
      var4[1] = vH.f$E("dSSBIXABIYNdE[O@E");
      var4[2] = LI.f$E("K_tUo_]_jN");
      var4[3] = vH.f$E("ddE[O@E");
      var4[4] = LI.f$E("~|V|N|~|ImSw[mSvT");
      var4[5] = vH.f$E("rEZdSSBIXABIYN");
      var4[6] = LI.f$E("~|V]_jN");
      var10000.f$a(new Yb(this, var4));
      Ha[] var2 = new Ha[6];
      var7 = true;
      var2[0] = new eC(this);
      var2[1] = new UB(this);
      var2[2] = new Fd(this);
      var2[3] = new YA(this);
      var2[4] = new Mb(this);
      var2[5] = new Pd(this);
      this.f$E((Ha[])var2);
      new Uc(this, vH.f$E("WWYFO_NBS\u0018TNT"));
   }

   // $FF: synthetic method
   private void f$a(va var1, double var2, double var4, double var6, float var8, double var9, double var11) {
      Object var18 = f$d.func_175606_aa() == null ? f$d.field_71439_g : f$d.func_175606_aa();
      double var13 = ((Entity)var18).func_70011_f(var9, var1.f$E(), var11);
      String var10000 = vH.f$E("\u0005E\u0000nyl\u0000\u0013\u000e\u0007F\u0016\u0005\u0018\u0011P\u0000\u0013\u000e\u0007F");
      Object[] var10001 = new Object[4];
      boolean var10003 = true;
      var10001[0] = var1.f$E();
      var10001[1] = var9;
      var10001[2] = var1.f$E();
      var10001[3] = var11;
      String var19 = String.format(var10000, var10001);
      var9 = this.f$E(0.0018D + this.f$b.f$E().doubleValue() * var13, 0.1D, this.f$b.f$E().doubleValue() * 100.0D);
      GlStateManager.func_179094_E();
      RenderHelper.func_74519_b();
      GlStateManager.func_179088_q();
      GlStateManager.func_179136_a(1.0F, -1500000.0F);
      GlStateManager.func_179140_f();
      GlStateManager.func_179109_b((float)var2, (float)var4 + 1.4F, (float)var6);
      GlStateManager.func_179114_b(-f$d.func_175598_ae().field_78735_i, 0.0F, 1.0F, 0.0F);
      float var20 = f$d.field_71474_y.field_74320_O == 2 ? -1.0F : 1.0F;
      GlStateManager.func_179114_b(f$d.func_175598_ae().field_78732_j, var20, 0.0F, 0.0F);
      GlStateManager.func_179139_a(-var9, -var9, var9);
      GlStateManager.func_179097_i();
      GlStateManager.func_179147_l();
      gF var16 = (gF)kH.f$E().f$E().f$E(gF.class);
      String var15 = (new StringBuilder()).insert(0, var1.f$E()).append(LI.f$E("\u001a")).append(Math.round(var13)).append(vH.f$E("M")).toString();
      int var3;
      int var5;
      int var17;
      if (var16 != null && (Boolean)var16.f$c.f$E()) {
         var17 = var16.f$L.f$E(var19) / 2;
         var3 = -var16.f$L.f$E();
         var5 = var16.f$L.f$E(var15) / 2;
      } else {
         var17 = f$d.field_71466_p.func_78256_a(var19) / 2;
         var3 = -f$d.field_71466_p.field_78288_b;
         var5 = f$d.field_71466_p.func_78256_a(var15) / 2;
      }

      switch(UA.f$d[((KB)this.f$j.f$E()).ordinal()]) {
      case 1:
         GlStateManager.func_179147_l();

         while(false) {
         }

         Uh.f$E((float)(-var17 - 1), (float)var3, (float)var17 + 1.5F, 1.0F, 1.8F, 1426064384, 855638016);
         GlStateManager.func_179084_k();
         if (var16 != null && (Boolean)var16.f$c.f$E()) {
            var16.f$L.f$E(var19, (double)(-var17), (double)(-(var16.f$L.f$E() - 1)), -5592406);
         } else {
            f$d.field_71466_p.func_175063_a(var19, (float)(-var17), (float)(-(f$d.field_71466_p.field_78288_b - 1)), -5592406);
         }
         break;
      case 2:
         GlStateManager.func_179147_l();
         Uh.f$E((float)(-var5 - 1), (float)var3, (float)var5 + 1.5F, 1.0F, 1.8F, 1426064384, 855638016);
         GlStateManager.func_179084_k();
         if (var16 != null && (Boolean)var16.f$c.f$E()) {
            var16.f$L.f$E(var15, (double)(-var5), (double)(-(var16.f$L.f$E() - 1)), -5592406);
         } else {
            f$d.field_71466_p.func_175063_a(var15, (float)(-var5), (float)(-(f$d.field_71466_p.field_78288_b - 1)), -5592406);
         }
      }

      GlStateManager.func_179126_j();
      GlStateManager.func_179145_e();
      GlStateManager.func_179084_k();
      GlStateManager.func_179145_e();
      GlStateManager.func_179113_r();
      GlStateManager.func_179136_a(1.0F, 1500000.0F);
      GlStateManager.func_179121_F();
   }

   // $FF: synthetic method
   public static z f$e(yB var0) {
      return var0.f$I;
   }

   // $FF: synthetic method
   private va f$E(String var1) {
      Iterator var2 = this.f$i.iterator();

      va var3;
      do {
         do {
            if (!var2.hasNext()) {
               return null;
            }
         } while(!(var3 = (va)var2.next()).f$E().equalsIgnoreCase(var1));
      } while((!var3.f$e().equals(vH.f$E("EIXGZEFLWYSR")) || !f$d.func_71356_B()) && (f$d.func_147104_D() == null || !var3.f$e().equalsIgnoreCase(f$d.func_147104_D().field_78845_b.replaceAll(LI.f$E("\u0000"), vH.f$E("\u007f")))) && (!f$d.func_181540_al() || !var3.f$e().equals(LI.f$E("k_xVtI"))));

      return var3;
   }

   // $FF: synthetic method
   public static Minecraft f$q() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$I() {
      return f$d;
   }

   // $FF: synthetic method
   private float f$E(va var1) {
      va var10000 = var1;
      va var3 = (float)(var1.f$a() - f$d.field_71439_g.field_70165_t);
      float var2 = (float)(var10000.f$e() - f$d.field_71439_g.field_70161_v);
      return wG.f$E(var3 * var3 + var2 * var2);
   }

   // $FF: synthetic method
   private double f$E(double var1, double var3, double var5) {
      return Math.max(var3, Math.min(var5, var1));
   }

   // $FF: synthetic method
   public void f$B() {
      ArrayList var1 = new ArrayList();
      Iterator var2 = this.f$i.iterator();

      while(var2.hasNext()) {
         va var3;
         if ((var3 = (va)var2.next()) != null && var3.f$E().contains(LI.f$E("FVv]vOmejJvN"))) {
            var1.add(var3);
         }
      }

      this.f$i.removeAll(var1);
      super.f$B();
   }

   // $FF: synthetic method
   public static Minecraft f$u() {
      return f$d;
   }

   // $FF: synthetic method
   public va f$E() {
      return this.f$g;
   }

   // $FF: synthetic method
   public static z f$E(yB var0) {
      return var0.f$e;
   }

   // $FF: synthetic method
   public static Minecraft f$x() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$G() {
      return f$d;
   }

   // $FF: synthetic method
   public static float f$E(yB var0, va var1) {
      return var0.f$E(var1);
   }

   // $FF: synthetic method
   public static Minecraft f$m() {
      return f$d;
   }

   // $FF: synthetic method
   public static z f$a(yB var0) {
      return var0.f$C;
   }

   // $FF: synthetic method
   private void f$E(va var1, double var2, double var4, double var6, float var8, double var9, double var11) {
      Object var19 = f$d.func_175606_aa() == null ? f$d.field_71439_g : f$d.func_175606_aa();
      double var13 = ((Entity)var19).func_70011_f(var2 + f$d.func_175598_ae().field_78730_l, var4 + f$d.func_175598_ae().field_78731_m, var6 + f$d.func_175598_ae().field_78728_n);
      double var15 = 0.0018D + (double)this.f$b.f$E().floatValue() * var13;
      if (var13 <= 8.0D) {
         var15 = 0.0245D;
      }

      GlStateManager.func_179094_E();
      RenderHelper.func_74519_b();
      GlStateManager.func_179088_q();
      GlStateManager.func_179136_a(1.0F, -1500000.0F);
      GlStateManager.func_179140_f();
      GlStateManager.func_179109_b((float)var2, (float)var4 + 1.4F, (float)var6);
      GlStateManager.func_179114_b(-f$d.func_175598_ae().field_78735_i, 0.0F, 1.0F, 0.0F);
      float var10001 = f$d.field_71474_y.field_74320_O == 2 ? -1.0F : 1.0F;
      GlStateManager.func_179114_b(f$d.func_175598_ae().field_78732_j, var10001, 0.0F, 0.0F);
      GlStateManager.func_179139_a(-var15, -var15, var15);
      GlStateManager.func_179097_i();
      GlStateManager.func_179147_l();
      gF var20 = (gF)kH.f$E().f$E().f$E(gF.class);

      while(false) {
      }

      String var10000 = LI.f$E("\u001fj\u001aAcC\u001a<\u0014(\\9\u001f7\u000b\u007f\u001a<\u0014(\\");
      Object[] var21 = new Object[4];
      boolean var10003 = true;
      var21[0] = var1.f$E();
      var21[1] = var9;
      var21[2] = var1.f$E();
      var21[3] = var11;
      String var18 = String.format(var10000, var21);
      int var17;
      if ((Boolean)var20.f$c.f$E()) {
         var17 = var20.f$L.f$E(var18) / 2;
         GlStateManager.func_179147_l();
         Uh.f$E((float)(-var17 - 1), (float)(-var20.f$L.f$E()), (float)(var17 + 2), 1.0F, 1.8F, 1426064384, 855638016);
         GlStateManager.func_179084_k();
         var20.f$L.f$E(var18, (double)(-var17), (double)(-(var20.f$L.f$E() - 1)), -5592406);
      } else {
         Uh.f$E((float)(-(var17 = f$d.field_71466_p.func_78256_a(var18) / 2) - 1), (float)(-f$d.field_71466_p.field_78288_b), (float)(var17 + 2), 1.0F, 1.8F, 1426064384, 855638016);
         f$d.field_71466_p.func_175063_a(var18, (float)(-var17), (float)(-(f$d.field_71466_p.field_78288_b - 1)), -5592406);
      }

      GlStateManager.func_179126_j();
      GlStateManager.func_179145_e();
      GlStateManager.func_179084_k();
      GlStateManager.func_179145_e();
      GlStateManager.func_179113_r();
      GlStateManager.func_179136_a(1.0F, 1500000.0F);
      GlStateManager.func_179121_F();
   }

   // $FF: synthetic method
   public static Minecraft f$i() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$k() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$b() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$v() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$Q() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$p() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$o() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$W() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$L() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$n() {
      return f$d;
   }

   // $FF: synthetic method
   public static s f$E(yB var0) {
      return var0.f$K;
   }

   // $FF: synthetic method
   public static Minecraft f$D() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$a() {
      return f$d;
   }

   // $FF: synthetic method
   public va f$a(String var1) {
      Iterator var2 = this.f$i.iterator();

      va var3;
      do {
         if (!var2.hasNext()) {
            return null;
         }
      } while(!(var3 = (va)var2.next()).f$E().equalsIgnoreCase(var1));

      return var3;
   }

   // $FF: synthetic method
   public static Minecraft f$e() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$h() {
      return f$d;
   }

   // $FF: synthetic method
   public static va f$E(yB var0, va var1) {
      return var0.f$g = var1;
   }

   // $FF: synthetic method
   public static Minecraft f$t() {
      return f$d;
   }

   // $FF: synthetic method
   public static void f$a(yB var0, va var1, double var2, double var4, double var6, float var8, double var9, double var11) {
      var0.f$a(var1, var2, var4, var6, var8, var9, var11);
   }

   // $FF: synthetic method
   public static void f$E(yB var0, va var1, double var2, double var4, double var6, float var8, double var9, double var11) {
      var0.f$E(var1, var2, var4, var6, var8, var9, var11);
   }

   // $FF: synthetic method
   public static Minecraft f$f() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$l() {
      return f$d;
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
   public static Vec3d f$E(yB var0, double var1, double var3, double var5) {
      return var0.f$E(var1, var3, var5);
   }

   // $FF: synthetic method
   private Vec3d f$E(double var1, double var3, double var5) {
      Object var7 = f$d.func_175606_aa() == null ? f$d.field_71439_g : f$d.func_175606_aa();
      Vec3d var8 = new Vec3d(((Entity)var7).field_70165_t, ((Entity)var7).field_70163_u, ((Entity)var7).field_70161_v);
      double var9 = ((Entity)var7).func_70011_f(var1, var3, var5);
      var1 = var8.field_72450_a - 150.0D * (var8.field_72450_a - var1) / var9;
      var3 = var8.field_72448_b - 150.0D * (var8.field_72448_b - var3) / var9;
      var5 = var8.field_72449_c - 150.0D * (var8.field_72449_c - var5) / var9;
      return new Vec3d(var1, var3, var5);
   }

   // $FF: synthetic method
   public static Minecraft f$K() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$c() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$Y() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$M() {
      return f$d;
   }

   // $FF: synthetic method
   private boolean f$E(va var1) {
      Iterator var2 = this.f$i.iterator();

      va var3;
      do {
         if (!var2.hasNext()) {
            return false;
         }
      } while(!(var3 = (va)var2.next()).f$e().equalsIgnoreCase(var1.f$e()) || var3.f$a() != var1.f$a() || var3.f$E() != var1.f$E() || var3.f$e() != var1.f$e() || !var3.f$a().equalsIgnoreCase(var1.f$a()));

      return true;
   }

   // $FF: synthetic method
   public static va f$E(yB var0) {
      return var0.f$g;
   }

   // $FF: synthetic method
   public static DecimalFormat f$E(yB var0) {
      return var0.f$d;
   }

   // $FF: synthetic method
   public static boolean f$E(yB var0, va var1) {
      return var0.f$E(var1);
   }

   // $FF: synthetic method
   public static Minecraft f$A() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$j() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$w() {
      return f$d;
   }
}
