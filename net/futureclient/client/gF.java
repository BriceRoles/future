package net.futureclient.client;

import java.awt.Font;
import java.text.DecimalFormat;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemAir;
import net.minecraft.item.ItemStack;
import net.minecraft.world.DimensionType;

public class gF extends ma {
   // $FF: synthetic field
   public z<Boolean> f$r;
   // $FF: synthetic field
   private Map<Ba, Integer> f$I;
   // $FF: synthetic field
   private int f$C;
   // $FF: synthetic field
   private int f$B;
   // $FF: synthetic field
   private List<Ba> f$e;
   // $FF: synthetic field
   private static final int f$M = 20;
   // $FF: synthetic field
   private int f$a;
   // $FF: synthetic field
   public z<Boolean> f$F;
   // $FF: synthetic field
   private float f$A;
   // $FF: synthetic field
   public z<Boolean> f$p;
   // $FF: synthetic field
   public z<Boolean> f$v;
   // $FF: synthetic field
   public z<Boolean> f$Q;
   // $FF: synthetic field
   private final ArrayDeque<Double> f$g;
   // $FF: synthetic field
   public int f$j;
   // $FF: synthetic field
   public z<Boolean> f$c;
   // $FF: synthetic field
   public z<Boolean> f$w;
   // $FF: synthetic field
   private ka<TD> f$H;
   // $FF: synthetic field
   public z<Boolean> f$V;
   // $FF: synthetic field
   public z<Boolean> f$O;
   // $FF: synthetic field
   public boolean f$i;
   // $FF: synthetic field
   private gG f$K;
   // $FF: synthetic field
   public z<Boolean> f$y;
   // $FF: synthetic field
   private double f$d;
   // $FF: synthetic field
   public fG f$L;
   // $FF: synthetic field
   public z<Boolean> f$T;
   // $FF: synthetic field
   public z<Boolean> f$G;
   // $FF: synthetic field
   private ka<pF> f$E;
   // $FF: synthetic field
   public Timer f$b;
   // $FF: synthetic field
   private ka<BE> f$m;
   // $FF: synthetic field
   public z<Boolean> f$f;
   // $FF: synthetic field
   private ka<yD> f$l;
   // $FF: synthetic field
   public ka<Mg> f$D;
   // $FF: synthetic field
   public z<Boolean> f$h;
   // $FF: synthetic field
   public z<Boolean> f$u;
   // $FF: synthetic field
   public z<Boolean> f$W;
   // $FF: synthetic field
   public z<Boolean> f$k;
   // $FF: synthetic field
   public z<Boolean> f$J;

   // $FF: synthetic method
   public gF() {
      String var10001 = r.f$E("GAK");
      String[] var10002 = new String[2];
      boolean var10004 = true;
      var10002[0] = aH.f$E("v\bz");
      var10002[1] = r.f$E("|zak");
      super(var10001, var10002);
      Boolean var10003 = true;
      String[] var2 = new String[2];
      boolean var10006 = true;
      var2[0] = aH.f$E("z4L8])W2P");
      var2[1] = r.f$E("k}}");
      this.f$V = new z(var10003, var2);
      var10003 = true;
      var2 = new String[2];
      var10006 = true;
      var2[0] = aH.f$E("\u007f/S2L");
      var2[1] = r.f$E("u}y`a}");
      this.f$p = new z(var10003, var2);
      var10003 = true;
      var2 = new String[4];
      var10006 = true;
      var2[0] = aH.f$E("n2J4Q3{;X8])M");
      var2[1] = r.f$E("D``f{a9Jriql`|");
      var2[2] = aH.f$E("-[");
      var2[3] = r.f$E("d``f{a");
      this.f$w = new z(var10003, var2);
      var10003 = false;
      var2 = new String[3];
      var10006 = true;
      var2[0] = aH.f$E("m8L+[/|/_3Z");
      var2[1] = r.f$E("gjfyq}");
      var2[2] = aH.f$E(".\\");
      this.f$W = new z(var10003, var2);
      var10003 = true;
      var2 = new String[2];
      var10006 = true;
      var2[0] = r.f$E("Xu{q}ynfd");
      var2[1] = aH.f$E("*S");
      this.f$Q = new z(var10003, var2);
      var10003 = true;
      var2 = new String[3];
      var10006 = true;
      var2[0] = r.f$E("Pzfnvfxf`v");
      var2[1] = aH.f$E("9K/_");
      var2[2] = r.f$E("k");
      this.f$O = new z(var10003, var2);
      var10003 = false;
      var2 = new String[3];
      var10006 = true;
      var2[0] = aH.f$E("\u001eQ2L9M");
      var2[1] = r.f$E("l{`fk");
      var2[2] = aH.f$E("]");
      this.f$v = new z(var10003, var2);
      var10003 = false;
      var2 = new String[4];
      var10006 = true;
      var2[0] = r.f$E("Zj`gq}W`{}p|");
      var2[1] = aH.f$E("p8J5[/}2Q/Z4P<J8M");
      var2[2] = r.f$E("Zj`gq}");
      var2[3] = aH.f$E("3]");
      this.f$u = new z(var10003, var2);
      var10003 = true;
      var2 = new String[4];
      var10006 = true;
      var2[0] = r.f$E("Nf}uvXfg{");
      var2[1] = aH.f$E("<R");
      var2[2] = r.f$E("nf}uv");
      var2[3] = aH.f$E("1W.J");
      this.f$T = new z(var10003, var2);
      var10003 = true;
      var2 = new String[4];
      var10006 = true;
      var2[0] = r.f$E("ID\\");
      var2[1] = aH.f$E(";N-M");
      var2[2] = r.f$E("R}ubq|");
      var2[3] = aH.f$E(";N");
      this.f$r = new z(var10003, var2);
      var10003 = true;
      var2 = new String[3];
      var10006 = true;
      var2[0] = r.f$E("\\djqk");
      var2[1] = aH.f$E("M-Q2Z");
      var2[2] = r.f$E("g\u007f");
      this.f$y = new z(var10003, var2);
      var10003 = true;
      var2 = new String[6];
      var10006 = true;
      var2[0] = aH.f$E("\rW3Y");
      var2[1] = r.f$E("\u007f}asjffz`");
      var2[2] = aH.f$E("n8P:Q");
      var2[3] = r.f$E("Djzh");
      var2[4] = aH.f$E("N4P");
      var2[5] = r.f$E("\u007fzh");
      this.f$G = new z(var10003, var2);
      var10003 = true;
      var2 = new String[4];
      var10006 = true;
      var2[0] = aH.f$E("j\rm");
      var2[1] = r.f$E("\\q}bjf[D\\");
      var2[2] = aH.f$E("j\u000en");
      var2[3] = r.f$E("v`\u007f");
      this.f$h = new z(var10003, var2);
      var10003 = true;
      var2 = new String[4];
      var10006 = true;
      var2[0] = aH.f$E("\u0011_:\u001e\u0013Q)W;W8L");
      var2[1] = r.f$E("CuhZ``frfq}");
      var2[2] = aH.f$E("r<Y\u0013Q)W;G");
      var2[3] = r.f$E("XnsA{{}i");
      this.f$f = new z(var10003, var2);
      var10003 = true;
      var2 = new String[2];
      var10006 = true;
      var2[0] = aH.f$E("\u000eV<Z2I");
      var2[1] = r.f$E("g|");
      this.f$k = new z(var10003, var2);
      var10003 = true;
      var2 = new String[3];
      var10006 = true;
      var2[0] = aH.f$E("}<N8M");
      var2[1] = r.f$E("wndj");
      var2[2] = aH.f$E("]");
      this.f$F = new z(var10003, var2);
      var10003 = true;
      var2 = new String[9];
      var10006 = true;
      var2[0] = r.f$E("C}~afp/Bfgf{a");
      var2[1] = aH.f$E("\u0011W,K4Z\u000bW.W2P");
      var2[2] = r.f$E("C}~afp|");
      var2[3] = aH.f$E("\u000e[8J5L2K:V");
      var2[4] = r.f$E("cn`jffzy}|");
      var2[5] = aH.f$E("m8[)V/Q(Y5I<J8L");
      var2[6] = r.f$E("gjq{|}{zsgxnbn");
      var2[7] = aH.f$E("1_+_+W.W2P");
      var2[8] = r.f$E("xu{q}bfgf{a");
      this.f$J = new z(var10003, var2);
      pF var3 = pF.f$g;
      var2 = new String[3];
      var10006 = true;
      var2[0] = aH.f$E("\u0012L9[/W3Y");
      var2[1] = r.f$E("`fkq}");
      var2[2] = aH.f$E("Q");
      this.f$E = new ka(var3, var2);
      TD var4 = TD.f$g;
      var2 = new String[4];
      var10006 = true;
      var2[0] = r.f$E("]qapjffzh");
      var2[1] = aH.f$E("\u001cL/_$r4M)l8P9[/W3Y");
      var2[2] = r.f$E("nx}");
      var2[3] = aH.f$E("<R");
      this.f$H = new ka(var4, var2);
      BE var5 = BE.f$M;
      var2 = new String[4];
      var10006 = true;
      var2[0] = r.f$E("W`faq}");
      var2[1] = aH.f$E("}2L9M\u001eQ/P8L");
      var2[2] = r.f$E("W`faq}");
      var2[3] = aH.f$E("\u001e}");
      this.f$m = new ka(var5, var2);
      Mg var6 = Mg.f$M;
      var2 = new String[5];
      var10006 = true;
      var2[0] = r.f$E("Jriql`GAK");
      var2[1] = aH.f$E("s\u001en2J4Q3v\bz");
      var2[2] = r.f$E("Yfzjw}ui`_{{}`zGAK");
      var2[3] = aH.f$E("0]-V");
      var2[4] = r.f$E("yldgak");
      this.f$D = new ka(var6, var2);
      yD var7 = yD.f$i;
      var2 = new String[8];
      var10006 = true;
      var2[0] = aH.f$E("\u0010Q9K1[.}2R2L");
      var2[1] = r.f$E("Nf}uvXfg{W`x`f|");
      var2[2] = aH.f$E("\u007f/L<G\u001eQ1Q/M");
      var2[3] = r.f$E("U}fnmL{c{}");
      var2[4] = aH.f$E("s2Z\u001eQ1Q/M");
      var2[5] = r.f$E("Y`pL{c{}");
      var2[6] = aH.f$E("l<W3\\2I");
      var2[7] = r.f$E("FHVB{kacq|");
      this.f$l = new ka(var7, var2);
      this.f$L = new fG(new Font(aH.f$E("h8L9_3_"), 0, 18), true, true);
      var10003 = true;
      var2 = new String[3];
      var10006 = true;
      var2[0] = r.f$E("Wzg{{bR`z{");
      var2[1] = aH.f$E("K.[>K.J2S;Q3J");
      var2[2] = r.f$E("r`z{");
      this.f$c = new z(var10003, var2);
      this.f$A = 0.0F;
      this.f$B = -12;
      this.f$a = 9;
      this.f$C = 0;
      this.f$I = new HashMap();
      this.f$K = new gG();
      this.f$b = new Timer();
      this.f$j = 0;
      this.f$i = false;
      this.f$g = new ArrayDeque(20);
      z[] var1 = new z[23];
      boolean var8 = true;
      var1[0] = this.f$c;
      var1[1] = this.f$Q;
      var1[2] = this.f$V;
      var1[3] = this.f$p;
      var1[4] = this.f$w;
      var1[5] = this.f$D;
      var1[6] = this.f$J;
      var1[7] = this.f$F;
      var1[8] = this.f$W;
      var1[9] = this.f$f;
      var1[10] = this.f$h;
      var1[11] = this.f$r;
      var1[12] = this.f$y;
      var1[13] = this.f$G;
      var1[14] = this.f$E;
      var1[15] = this.f$k;
      var1[16] = this.f$v;
      var1[17] = this.f$u;
      var1[18] = this.f$m;
      var1[19] = this.f$O;
      var1[20] = this.f$T;
      var1[21] = this.f$l;
      var1[22] = this.f$H;
      this.f$E((z[])var1);
      this.f$b.schedule(new AE(this), 0L, 16L);
      kH.f$E().f$E().f$a(new te(this));
      kH.f$E().f$E().f$a(new FF(this));
   }

   // $FF: synthetic method
   public static Minecraft f$j() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$C() {
      return f$d;
   }

   // $FF: synthetic method
   public static int f$C(gF var0) {
      return var0.f$a;
   }

   // $FF: synthetic method
   public static Minecraft f$b() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$I() {
      return f$d;
   }

   // $FF: synthetic method
   private void f$K(Zd var1) {
      if (this.f$B > -10 && !f$d.func_71356_B()) {
         String var2 = (new StringBuilder()).insert(0, aH.f$E("m8L+[/\u001e4M}P2J}L8M-Q3Z4P:\u001e")).append((new DecimalFormat(r.f$E("?:?"))).format((double)((float)kH.f$E().f$E().f$E().f$E() / 1000.0F))).append(aH.f$E("M")).toString();
         if ((Boolean)this.f$c.f$E()) {
            GlStateManager.func_179147_l();
            this.f$L.f$E(var2, (double)(var1.f$E().func_78326_a() / 2 - this.f$L.f$E(var2) / 2), (double)this.f$B, -5592406);
            GlStateManager.func_179084_k();
            return;
         }

         f$d.field_71466_p.func_175063_a(var2, (float)var1.f$E().func_78326_a() / 2.0F - (float)f$d.field_71466_p.func_78256_a(var2) / 2.0F, (float)this.f$B, -5592406);
      }

   }

   // $FF: synthetic method
   public static void f$K(gF var0, Zd var1) {
      var0.f$e(var1);
   }

   // $FF: synthetic method
   public static int f$K(gF var0) {
      return var0.f$B++;
   }

   // $FF: synthetic method
   public static Minecraft f$K() {
      return f$d;
   }

   // $FF: synthetic method
   public static void f$e(gF var0, Zd var1) {
      var0.f$B(var1);
   }

   // $FF: synthetic method
   public static Minecraft f$e() {
      return f$d;
   }

   // $FF: synthetic method
   public static int f$e(gF var0) {
      return var0.f$C;
   }

   // $FF: synthetic method
   private void f$e(Zd var1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   private void f$a(Zd var1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   public static ka f$a(gF var0) {
      return var0.f$l;
   }

   // $FF: synthetic method
   public static int f$a(gF var0) {
      return var0.f$C++;
   }

   // $FF: synthetic method
   private static int f$a(Ba var0, Ba var1) {
      return f$d.field_71466_p.func_78256_a(var1.f$a()) - f$d.field_71466_p.func_78256_a(var0.f$a());
   }

   // $FF: synthetic method
   public static Minecraft f$a() {
      return f$d;
   }

   // $FF: synthetic method
   public static void f$a(gF var0, Zd var1) {
      var0.f$E(var1);
   }

   // $FF: synthetic method
   private void f$E(Zd var1, String var2, int var3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   public static double f$E(gF var0) {
      return var0.f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$E() {
      return f$d;
   }

   // $FF: synthetic method
   public static void f$E(gF var0, Zd var1, String var2, int var3) {
      var0.f$E(var1, var2, var3);
   }

   // $FF: synthetic method
   public static ka f$E(gF var0) {
      return var0.f$H;
   }

   // $FF: synthetic method
   private int f$E(Ba var1, Ba var2) {
      return this.f$L.f$E(var2.f$a()) - this.f$L.f$E(var1.f$a());
   }

   // $FF: synthetic method
   public static ArrayDeque f$E(gF var0) {
      return var0.f$g;
   }

   // $FF: synthetic method
   public static double f$E(gF var0, double var1) {
      return var0.f$d = var1;
   }

   // $FF: synthetic method
   private void f$E(Zd var1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   public static float f$E(gF var0) {
      return var0.f$A;
   }

   // $FF: synthetic method
   public static void f$E(gF var0, Zd var1) {
      var0.f$K(var1);
   }

   // $FF: synthetic method
   public static int f$E(gF var0) {
      return var0.f$C--;
   }

   // $FF: synthetic method
   public static float f$E(gF var0, float var1) {
      return var0.f$A = var1;
   }

   // $FF: synthetic method
   public static Minecraft f$i() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$g() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$M() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$d() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$B() {
      return f$d;
   }

   // $FF: synthetic method
   public static int f$B(gF var0) {
      return var0.f$B--;
   }

   // $FF: synthetic method
   private void f$B(Zd var1) {
      if (!(f$d.field_71462_r instanceof GuiChat)) {
         int var2 = 15;
         GlStateManager.func_179094_E();
         RenderHelper.func_74520_c();

         int var3;
         for(int var10000 = var3 = 3; var10000 >= 0; var10000 = var3) {
            ItemStack var4;
            if (!((var4 = (ItemStack)f$d.field_71439_g.field_71071_by.field_70460_b.get(var3)).func_77973_b() instanceof ItemAir)) {
               int var5;
               if (f$d.field_71439_g.func_70055_a(Material.field_151586_h) && f$d.field_71439_g.func_70086_ai() > 0 && !f$d.field_71439_g.field_71075_bZ.field_75098_d) {
                  var5 = 65;
               } else if (f$d.field_71439_g.func_184187_bx() != null && !f$d.field_71439_g.field_71075_bZ.field_75098_d) {
                  if (f$d.field_71439_g.func_184187_bx() instanceof EntityLivingBase) {
                     EntityLivingBase var6 = (EntityLivingBase)f$d.field_71439_g.func_184187_bx();
                     var5 = 45 + (int)Math.ceil((double)((var6.func_110138_aP() - 1.0F) / 20.0F)) * 10;
                  } else {
                     var5 = 45;
                  }
               } else if (f$d.field_71439_g.field_71075_bZ.field_75098_d) {
                  var5 = f$d.field_71439_g.func_110317_t() ? 45 : 38;
               } else {
                  var5 = 55;
               }

               f$d.func_175599_af().func_175042_a(var4, var1.f$E().func_78326_a() / 2 + var2, var1.f$E().func_78328_b() - var5);
               RenderItem var7 = f$d.func_175599_af();
               FontRenderer var10001 = f$d.field_71466_p;
               int var10003 = var1.f$E().func_78326_a() / 2 + var2;
               int var10004 = var1.f$E().func_78328_b();
               var2 += 18;
               var7.func_175030_a(var10001, var4, var10003, var10004 - var5);
            }

            --var3;
         }

         RenderHelper.func_74518_a();
         GlStateManager.func_179121_F();
      }
   }

   // $FF: synthetic method
   public static void f$B(gF var0, Zd var1) {
      var0.f$a(var1);
   }

   // $FF: synthetic method
   public static Minecraft f$F() {
      return f$d;
   }

   // $FF: synthetic method
   public static int f$A(gF var0) {
      return var0.f$B;
   }

   // $FF: synthetic method
   public static Minecraft f$A() {
      return f$d;
   }

   // $FF: synthetic method
   public static void f$A(gF var0, Zd var1) {
      var0.f$A(var1);
   }

   // $FF: synthetic method
   private void f$A(Zd var1) {
      wD var2 = (wD)kH.f$E().f$E().f$E(wD.class);
      String var10001;
      Object[] var10002;
      boolean var10004;
      if ((Boolean)this.f$c.f$E()) {
         GlStateManager.func_179147_l();
         GlStateManager.func_179141_d();
         fG var3 = this.f$L;
         var10001 = aH.f$E("xM}HxM");
         var10002 = new Object[2];
         var10004 = true;
         var10002[0] = kH.f$m;
         var10002[1] = kH.f$D;
         var3.f$E(String.format(var10001, var10002), 0.0D, (double)var1.f$i, var2.f$a.getRGB());
         GlStateManager.func_179084_k();
         GlStateManager.func_179118_c();
      } else {
         FontRenderer var10000 = f$d.field_71466_p;
         var10001 = r.f$E("1|4y1|");
         var10002 = new Object[2];
         var10004 = true;
         var10002[0] = kH.f$m;
         var10002[1] = kH.f$D;
         var10000.func_175063_a(String.format(var10001, var10002), 2.0F, (float)var1.f$i, var2.f$a.getRGB());
      }
   }

   // $FF: synthetic method
   public static Minecraft f$c() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$J() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$Q() {
      return f$d;
   }

   // $FF: synthetic method
   public static int f$H(gF var0) {
      return var0.f$a++;
   }

   // $FF: synthetic method
   public static Minecraft f$H() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$f() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$k() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$G() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$m() {
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
   public static Minecraft f$P() {
      return f$d;
   }

   // $FF: synthetic method
   public static int f$h(gF var0) {
      return var0.f$a--;
   }

   // $FF: synthetic method
   public static Minecraft f$h() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$L() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$t() {
      return f$d;
   }

   // $FF: synthetic method
   public static Minecraft f$D() {
      return f$d;
   }
}
