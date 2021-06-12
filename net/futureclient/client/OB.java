package net.futureclient.client;

import java.awt.Color;
import java.util.Iterator;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.Vec3d;

public class OB extends Ba {
   // $FF: synthetic field
   private z<Boolean> f$g;
   // $FF: synthetic field
   private z<Boolean> f$e;
   // $FF: synthetic field
   private z<Boolean> f$I;
   // $FF: synthetic field
   private z<Boolean> f$j;
   // $FF: synthetic field
   private z<Boolean> f$K;
   // $FF: synthetic field
   private z<Boolean> f$b;
   // $FF: synthetic field
   public s f$d;
   // $FF: synthetic field
   private z<Boolean> f$M;
   // $FF: synthetic field
   private z<Boolean> f$i;

   // $FF: synthetic method
   public static Minecraft f$e() {
      return f$d;
   }

   // $FF: synthetic method
   private String f$E(EntityPlayer var1) {
      StringBuilder var2;
      (var2 = new StringBuilder()).append(kH.f$E().f$E().f$E(var1.func_70005_c_()) ? kH.f$E().f$E().f$E(var1.func_70005_c_()).f$a() : var1.func_145748_c_().func_150254_d().trim());
      boolean var3 = var2.toString().replaceAll(yH.f$E("ä:"), "").length() > 0;
      String var10001;
      Object[] var10002;
      boolean var10004;
      if ((Boolean)this.f$i.f$E()) {
         var10001 = HH.f$E(",\u0018@/3K,\u0018");
         var10002 = new Object[2];
         var10004 = true;
         var10002[0] = var3 ? yH.f$E("4") : "";
         var10002[1] = var1.func_145782_y();
         var2.append(String.format(var10001, var10002));
         var3 = true;
      }

      if ((Boolean)this.f$M.f$E()) {
         var10001 = HH.f$E(",\u0018RNz6");
         var10002 = new Object[2];
         var10004 = true;
         var10002[0] = var3 ? yH.f$E("4") : "";
         var10002[1] = var1.func_184812_l_() ? HH.f$E("(") : (var1.func_175149_v() ? yH.f$E("]") : HH.f$E("8"));
         var2.append(String.format(var10001, var10002));
         var3 = true;
      }

      if ((Boolean)this.f$g.f$E() && f$d.func_147114_u() != null && f$d.func_147114_u().func_175102_a(var1.func_110124_au()) != null) {
         var10001 = yH.f$E("fgfg.g");
         var10002 = new Object[2];
         var10004 = true;
         var10002[0] = var3 ? HH.f$E("K") : "";
         var10002[1] = f$d.func_147114_u().func_175102_a(var1.func_110124_au()).func_178853_c();
         var2.append(String.format(var10001, var10002));
         var3 = true;
      }

      if (!(Boolean)this.f$b.f$E()) {
         return var2.toString();
      } else {
         StringBuilder var10000;
         double var4;
         String var6;
         if ((var4 = Math.ceil((double)(var1.func_110143_aJ() + var1.func_110139_bj()))) > 18.0D) {
            var6 = yH.f$E("äu");
            var10000 = var2;
         } else if (var4 > 16.0D) {
            var6 = HH.f$E("®Y");
            var10000 = var2;
         } else if (var4 > 12.0D) {
            var6 = yH.f$E("äq");
            var10000 = var2;
         } else if (var4 > 8.0D) {
            var6 = HH.f$E("®]");
            var10000 = var2;
         } else if (var4 > 5.0D) {
            var6 = yH.f$E("äw");
            var10000 = var2;
         } else {
            var6 = HH.f$E("®_");
            var10000 = var2;
         }

         var10001 = yH.f$E("fgfgfg");
         var10002 = new Object[3];
         var10004 = true;
         var10002[0] = var3 ? HH.f$E("K") : "";
         var10002[1] = var6;
         var10002[2] = var4 > 0.0D ? (int)var4 : yH.f$E("$");
         var10000.append(String.format(var10001, var10002));
         return var2.toString();
      }
   }

   // $FF: synthetic method
   private void f$E(ItemStack var1, int var2, int var3) {
      GlStateManager.func_179152_a(0.5F, 0.5F, 0.5F);
      GlStateManager.func_179097_i();
      ItemStack var4 = var1.func_82833_r();
      gF var5;
      if ((var5 = (gF)kH.f$E().f$E().f$E(gF.class)) != null && (Boolean)var5.f$c.f$E()) {
         GlStateManager.func_179147_l();
         var5.f$L.f$E(var4, (double)(-var5.f$L.f$E(var4) / 2), (double)var3, -1);
         GlStateManager.func_179084_k();
      } else {
         f$d.field_71466_p.func_175063_a(var4, (float)(-f$d.field_71466_p.func_78256_a(var4) / 2), (float)var3, -1);
      }

      GlStateManager.func_179126_j();
      GlStateManager.func_179152_a(2.0F, 2.0F, 2.0F);
   }

   // $FF: synthetic method
   private void f$E(ItemStack var1, int var2, int var3, int var4) {
      GlStateManager.func_179094_E();
      GlStateManager.func_179132_a(true);
      GlStateManager.func_179086_m(256);
      RenderHelper.func_74519_b();
      f$d.func_175599_af().field_77023_b = -150.0F;
      GlStateManager.func_179118_c();
      GlStateManager.func_179126_j();
      GlStateManager.func_179129_p();
      int var5 = var4 > 4 ? (var4 - 4) * 8 / 2 : 0;
      f$d.func_175599_af().func_180450_b(var1, var2, var3 + var5);
      f$d.func_175599_af().func_175030_a(f$d.field_71466_p, var1, var2, var3 + var5);
      f$d.func_175599_af().field_77023_b = 0.0F;
      RenderHelper.func_74518_a();
      GlStateManager.func_179089_o();
      GlStateManager.func_179141_d();
      GlStateManager.func_179152_a(0.5F, 0.5F, 0.5F);
      GlStateManager.func_179097_i();
      this.f$e(var1, var2, var3 - 24);
      GlStateManager.func_179126_j();
      GlStateManager.func_179152_a(2.0F, 2.0F, 2.0F);
      GlStateManager.func_179121_F();
   }

   // $FF: synthetic method
   public static z f$E(OB var0) {
      return var0.f$j;
   }

   // $FF: synthetic method
   public OB() {
      String var10001 = yH.f$E("\ru.q7u$g");
      String[] var10002 = new String[5];
      boolean var10004 = true;
      var10002[0] = HH.f$E("G\nd\u000e}\nn\u0018");
      var10002[1] = yH.f$E("u-q.u7u$g");
      var10002[2] = HH.f$E("}\nn\u0018");
      var10002[3] = yH.f$E("`\"s");
      var10002[4] = HH.f$E("g\u001f");
      super(var10001, var10002, true, -10333473, JD.f$i);
      Boolean var10003 = true;
      String[] var3 = new String[2];
      boolean var10006 = true;
      var3[0] = yH.f$E("U1y,f");
      var3[1] = HH.f$E("\n");
      this.f$e = new z(var10003, var3);
      var10003 = true;
      var3 = new String[4];
      var10006 = true;
      var3[0] = yH.f$E("\u0007a1u!}/}7m");
      var3[1] = HH.f$E("M\u001e{\n");
      var3[2] = yH.f$E("P6f\"v*x");
      var3[3] = HH.f$E("/|\u0019");
      this.f$I = new z(var10003, var3);
      var10003 = true;
      var3 = new String[8];
      var10006 = true;
      var3[0] = yH.f$E("\n`&y\ru.q");
      var3[1] = HH.f$E("\"}\u000ed%h\u0006l\u0018");
      var3[2] = yH.f$E("]7q.g");
      var3[3] = HH.f$E("@\u001fl\u0006g\nd\u000e");
      var3[4] = yH.f$E("\n`&y\nP");
      var3[5] = HH.f$E("\"}\u000ed\"M\u0018");
      var3[6] = yH.f$E("\nq7y");
      var3[7] = HH.f$E("%h\u0006l\u0018");
      this.f$K = new z(var10003, var3);
      var10003 = true;
      var3 = new String[2];
      var10006 = true;
      var3[0] = yH.f$E("\u000bq\"x7|");
      var3[1] = HH.f$E("\u0003");
      this.f$b = new z(var10003, var3);
      var10003 = false;
      var3 = new String[4];
      var10006 = true;
      var3[0] = yH.f$E("\nz5}0}!x&g");
      var3[1] = HH.f$E("\"g\u001d`\u0018");
      var3[2] = yH.f$E("}-b*g*v/q");
      var3[3] = HH.f$E("\"g\u001d");
      this.f$j = new z(var10003, var3);
      var10003 = false;
      var3 = new String[4];
      var10006 = true;
      var3[0] = yH.f$E("\u0006z7}7m\nP");
      var3[1] = HH.f$E("L\u0005}\u0002}\u0012@/");
      var3[2] = yH.f$E("Q\nP");
      var3[3] = HH.f$E("@/");
      this.f$i = new z(var10003, var3);
      var10003 = false;
      var3 = new String[7];
      var10006 = true;
      var3[0] = yH.f$E("\u0004u.q\u000e{'q");
      var3[1] = HH.f$E("N\nd\u000e");
      var3[2] = yH.f$E("\u000e{'q");
      var3[3] = HH.f$E("N&");
      var3[4] = yH.f$E("\u0000f&u7}5q");
      var3[5] = HH.f$E("Z\u001e{\u001d`\u001dh\u0007");
      var3[6] = yH.f$E("G3q `\"`,f");
      this.f$M = new z(var10003, var3);
      var10003 = false;
      var3 = new String[4];
      var10006 = true;
      var3[0] = HH.f$E("Y\u0002g\f");
      var3[1] = yH.f$E("\u0011q0d,z0q");
      var3[2] = HH.f$E("[\u000ez\u001bf\u0005z\u000e]\u0002d\u000e");
      var3[3] = yH.f$E("\u0013q-s");
      this.f$g = new z(var10003, var3);
      Float var4 = 0.003F;
      Float var6 = 0.001F;
      Float var10005 = 0.01F;
      Double var7 = 0.001D;
      String[] var10007 = new String[3];
      boolean var10009 = true;
      var10007[0] = HH.f$E("8j\ne\u0002g\f");
      var10007[1] = yH.f$E("g u/q");
      var10007[2] = HH.f$E("\u0018");
      this.f$d = new s(var4, var6, var10005, var7, var10007);
      z[] var1 = new z[9];
      boolean var5 = true;
      var1[0] = this.f$e;
      var1[1] = this.f$I;
      var1[2] = this.f$K;
      var1[3] = this.f$b;
      var1[4] = this.f$d;
      var1[5] = this.f$j;
      var1[6] = this.f$i;
      var1[7] = this.f$M;
      var1[8] = this.f$g;
      this.f$E((z[])var1);
      Ha[] var2 = new Ha[2];
      var5 = true;
      var2[0] = new jB(this);
      var2[1] = new nc(this);
      this.f$E((Ha[])var2);
   }

   // $FF: synthetic method
   private int f$E(EntityPlayer var1) {
      int var2 = -1;
      if (kH.f$E().f$E().f$E(var1.func_70005_c_())) {
         return -10027009;
      } else if (var1.func_82150_aj()) {
         var2 = -56064;
         return -56064;
      } else if (f$d.func_147114_u() != null && f$d.func_147114_u().func_175102_a(var1.func_110124_au()) == null) {
         var2 = -1113785;
         return -1113785;
      } else {
         if (var1.func_70093_af()) {
            var2 = 16750848;
         }

         return var2;
      }
   }

   // $FF: synthetic method
   private void f$e(ItemStack var1, int var2, int var3) {
      var3 = var3;
      byte var4 = -1;
      gF var5 = (gF)kH.f$E().f$E().f$E(gF.class);
      Iterator var6;
      Iterator var10000 = var6 = EnchantmentHelper.func_82781_a(var1).keySet().iterator();

      while(var10000.hasNext()) {
         Enchantment var7;
         if ((var7 = (Enchantment)var6.next()) == null) {
            var10000 = var6;
         } else {
            if ((Boolean)var5.f$c.f$E()) {
               GlStateManager.func_179147_l();
               var5.f$L.f$E(this.f$E(var7, EnchantmentHelper.func_77506_a(var7, var1)), (double)(var2 * 2), (double)var3, var4);
               GlStateManager.func_179084_k();
            } else {
               f$d.field_71466_p.func_175063_a(this.f$E(var7, EnchantmentHelper.func_77506_a(var7, var1)), (float)(var2 * 2), (float)var3, var4);
            }

            var3 += 8;
            var10000 = var6;
         }
      }

      if (var1.func_77973_b().equals(Items.field_151153_ao) && var1.func_77962_s()) {
         if ((Boolean)var5.f$c.f$E()) {
            GlStateManager.func_179147_l();
            var5.f$L.f$E(yH.f$E("S,p"), (double)(var2 * 2), (double)var3, -3977919);
            GlStateManager.func_179084_k();
            return;
         }

         f$d.field_71466_p.func_175063_a(HH.f$E(",f\u000f"), (float)(var2 * 2), (float)var3, -3977919);
      }

   }

   // $FF: synthetic method
   public static Minecraft f$a() {
      return f$d;
   }

   // $FF: synthetic method
   private String f$E(Enchantment var1, int var2) {
      ResourceLocation var3;
      String var4 = (var3 = (ResourceLocation)Enchantment.field_185264_b.func_177774_c(var1)) == null ? var1.func_77320_a() : var3.toString();
      Enchantment var5 = var2 > 1 ? 12 : 13;
      if (var4.length() > var5) {
         var4 = var4.substring(10, var5);
      }

      var4 = (new StringBuilder()).insert(0, var4.substring(0, 1).toUpperCase()).append(var4.substring(1)).toString();
      if (var2 > 1) {
         var4 = (new StringBuilder()).insert(0, var4).append(var2).toString();
      }

      return var4;
   }

   // $FF: synthetic method
   private int f$E(int var1) {
      int var2 = (Boolean)this.f$e.f$E() ? -26 : -27;
      if (var1 > 4) {
         var2 -= (var1 - 4) * 8;
      }

      return var2;
   }

   // $FF: synthetic method
   private void f$E(EntityPlayer var1, double var2, double var4, double var6) {
      double var8 = var4 + (var1.func_70093_af() ? 0.5D : 0.7D);
      Object var10 = f$d.func_175606_aa() == null ? f$d.field_71439_g : f$d.func_175606_aa();
      double var11 = ((Entity)var10).field_70165_t;
      double var13 = ((Entity)var10).field_70163_u;
      double var15 = ((Entity)var10).field_70161_v;
      Vec3d var17;
      ((Entity)var10).field_70165_t = (var17 = Uh.f$E((Entity)var10)).field_72450_a;
      ((Entity)var10).field_70163_u = var17.field_72448_b;
      ((Entity)var10).field_70161_v = var17.field_72449_c;
      gF var28;
      gF var10000 = var28 = (gF)kH.f$E().f$E().f$E(gF.class);
      var4 = ((Entity)var10).func_70011_f(var2, var4, var6);
      int var18 = f$d.field_71466_p.func_78256_a(this.f$E(var1)) / 2;
      int var19 = var10000.f$L.f$E(this.f$E(var1)) / 2;
      double var20 = 0.0018D + (double)this.f$d.f$E().floatValue() * var4;
      if (var4 <= 8.0D) {
         var20 = 0.0245D;
      }

      GlStateManager.func_179094_E();
      RenderHelper.func_74519_b();
      GlStateManager.func_179088_q();
      GlStateManager.func_179136_a(1.0F, -1500000.0F);
      GlStateManager.func_179140_f();
      GlStateManager.func_179109_b((float)var2, (float)var8 + 1.4F, (float)var6);
      GlStateManager.func_179114_b(-f$d.func_175598_ae().field_78735_i, 0.0F, 1.0F, 0.0F);
      float var10001 = f$d.field_71474_y.field_74320_O == 2 ? -1.0F : 1.0F;
      GlStateManager.func_179114_b(f$d.func_175598_ae().field_78732_j, var10001, 0.0F, 0.0F);
      GlStateManager.func_179139_a(-var20, -var20, var20);
      GlStateManager.func_179097_i();
      GlStateManager.func_179147_l();
      EntityPlayer var27;
      if ((Boolean)var28.f$c.f$E()) {
         GlStateManager.func_179147_l();
         Uh.f$E((float)(-var19 - 1), (float)(-var28.f$L.f$E()), (float)(var19 + 2), 1.0F, 1.8F, 1426064384, 855638016);
         GlStateManager.func_179084_k();
         var27 = var1;
         var28.f$L.f$E(this.f$E(var1), (double)(-var19), (double)(-(var28.f$L.f$E() - 1)), this.f$E(var1));
      } else {
         GlStateManager.func_179147_l();
         Uh.f$E((float)(-var18 - 1), (float)(-f$d.field_71466_p.field_78288_b), (float)(var18 + 2), 1.0F, 1.8F, 1426064384, 855638016);
         GlStateManager.func_179084_k();
         f$d.field_71466_p.func_175063_a(this.f$E(var1), (float)(-var18), (float)(-(f$d.field_71466_p.field_78288_b - 1)), this.f$E(var1));
         var27 = var1;
      }

      ItemStack var31 = var27.func_184614_ca();
      ItemStack var33 = var1.func_184592_cb();
      double var22 = 0;
      boolean var3 = false;
      double var24 = 0;
      boolean var5 = false;
      GlStateManager.func_179094_E();

      ItemStack var7;
      int var25;
      int var29;
      for(var29 = var25 = 3; var29 >= 0; var29 = var25) {
         if (!(var7 = (ItemStack)var1.field_71071_by.field_70460_b.get(var25)).func_190926_b()) {
            Object var30 = this.f$I.f$E();
            var22 -= 8;
            if ((Boolean)var30) {
               var5 = true;
            }

            int var26;
            if ((Boolean)this.f$e.f$E() && (var26 = EnchantmentHelper.func_82781_a(var7).size()) > var24) {
               var24 = var26;
            }
         }

         --var25;
      }

      if (!var33.func_190926_b() && ((Boolean)this.f$e.f$E() || (Boolean)this.f$I.f$E() && var33.func_77984_f())) {
         var22 -= 8;
         if ((Boolean)this.f$I.f$E() && var33.func_77984_f()) {
            var5 = true;
         }

         if ((Boolean)this.f$e.f$E() && (var25 = EnchantmentHelper.func_82781_a(var33).size()) > var24) {
            var24 = var25;
         }
      }

      int var10003;
      int var23;
      if (!var31.func_190926_b()) {
         if ((Boolean)this.f$e.f$E() && (var25 = EnchantmentHelper.func_82781_a(var31).size()) > var24) {
            var24 = var25;
         }

         var23 = this.f$E(var24);
         if ((Boolean)this.f$e.f$E() || (Boolean)this.f$I.f$E() && var31.func_77984_f()) {
            var22 -= 8;
         }

         if ((Boolean)this.f$e.f$E()) {
            var10003 = var23;
            var23 -= 32;
            this.f$E(var31, var22, var10003, var24);
         }

         OB var32;
         if ((Boolean)this.f$I.f$E() && var31.func_77984_f()) {
            this.f$a(var31, var22, var23);
            var23 -= (Boolean)var28.f$c.f$E() ? var28.f$L.f$E() : f$d.field_71466_p.field_78288_b;
            var32 = this;
         } else {
            if (var5) {
               var23 -= (Boolean)var28.f$c.f$E() ? var28.f$L.f$E() : f$d.field_71466_p.field_78288_b;
            }

            var32 = this;
         }

         if ((Boolean)var32.f$K.f$E()) {
            this.f$E(var31, var22, var23);
         }

         if ((Boolean)this.f$e.f$E() || (Boolean)this.f$I.f$E() && var31.func_77984_f()) {
            var22 += 16;
         }
      }

      for(var29 = var25 = 3; var29 >= 0; var29 = var25) {
         if (!(var7 = (ItemStack)var1.field_71071_by.field_70460_b.get(var25)).func_190926_b()) {
            var23 = this.f$E(var24);
            if ((Boolean)this.f$e.f$E()) {
               var10003 = var23;
               var23 -= 32;
               this.f$E(var7, var22, var10003, var24);
            }

            if ((Boolean)this.f$I.f$E() && var7.func_77984_f()) {
               this.f$a(var7, var22, var23);
            }

            var22 += 16;
         }

         --var25;
      }

      if (!var33.func_190926_b()) {
         var23 = this.f$E(var24);
         if ((Boolean)this.f$e.f$E()) {
            var10003 = var23;
            var23 -= 32;
            this.f$E(var33, var22, var10003, var24);
         }

         if ((Boolean)this.f$I.f$E() && var33.func_77984_f()) {
            this.f$a(var33, var22, var23);
         }

         var22 += 16;
      }

      GlStateManager.func_179121_F();
      ((Entity)var10).field_70165_t = var11;
      ((Entity)var10).field_70163_u = var13;
      ((Entity)var10).field_70161_v = var15;
      GlStateManager.func_179126_j();
      GlStateManager.func_179084_k();
      GlStateManager.func_179113_r();
      GlStateManager.func_179136_a(1.0F, 1500000.0F);
      GlStateManager.func_179121_F();
   }

   // $FF: synthetic method
   private void f$a(ItemStack var1, int var2, int var3) {
      gF var4 = (gF)kH.f$E().f$E().f$E(gF.class);
      ItemStack var10000 = var1;
      ItemStack var6 = var1.func_77958_k();
      int var5 = var10000.func_77952_i();
      ItemStack var7 = (float)(var6 - var5) / (float)var6;
      Color var8 = (new vH(var7 * 120.0F, 100.0F, 50.0F, 1.0F)).f$E();
      GlStateManager.func_179152_a(0.5F, 0.5F, 0.5F);
      GlStateManager.func_179097_i();
      if ((Boolean)var4.f$c.f$E()) {
         GlStateManager.func_179147_l();
         var4.f$L.f$E((new StringBuilder()).insert(0, String.valueOf((int)(var7 * 100.0F))).append('%').toString(), (double)(var2 * 2), (double)var3, var8.getRGB());
         GlStateManager.func_179084_k();
      } else {
         f$d.field_71466_p.func_175063_a((new StringBuilder()).insert(0, String.valueOf((int)(var7 * 100.0F))).append('%').toString(), (float)(var2 * 2), (float)var3, var8.getRGB());
      }

      GlStateManager.func_179126_j();
      GlStateManager.func_179152_a(2.0F, 2.0F, 2.0F);
   }

   // $FF: synthetic method
   public static Minecraft f$E() {
      return f$d;
   }

   // $FF: synthetic method
   public static void f$E(OB var0, EntityPlayer var1, double var2, double var4, double var6) {
      var0.f$E(var1, var2, var4, var6);
   }
}
