package net.futureclient.client;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;

public class xa {
   // $FF: synthetic field
   public int f$b = 0;
   // $FF: synthetic field
   public boolean f$d = true;
   // $FF: synthetic field
   private int f$i = 12;
   // $FF: synthetic field
   public int f$g = 0;
   // $FF: synthetic field
   public boolean f$K = true;
   // $FF: synthetic field
   private Minecraft f$C = Minecraft.func_71410_x();
   // $FF: synthetic field
   private float f$e = 0.7F;
   // $FF: synthetic field
   public ArrayList<sa> f$M = new ArrayList();
   // $FF: synthetic field
   public int f$j = 0;
   // $FF: synthetic field
   private int f$I = 0;

   // $FF: synthetic method
   public int f$a() {
      return this.f$i;
   }

   // $FF: synthetic method
   public int f$e() {
      return this.f$b;
   }

   // $FF: synthetic method
   public void f$E(float var1) {
      this.f$e = var1;
   }

   // $FF: synthetic method
   public float f$E() {
      return this.f$e;
   }

   // $FF: synthetic method
   public int f$E() {
      return this.f$g;
   }

   // $FF: synthetic method
   public xa() {
      Collection var1 = kH.f$E().f$E().f$E();
      JD[] var2;
      int var3 = (var2 = JD.values()).length;

      int var4;
      for(int var10000 = var4 = 0; var10000 < var3; var10000 = var4) {
         JD var5 = var2[var4];
         sa var6 = new sa(this, var5.f$E());
         var1.forEach((var2x) -> {
            Ba var3;
            if (var2x instanceof J && (var3 = (Ba)var2x).f$E().equals(var5) && !var3.getClass().equals(rC.class) && !var3.getClass().equals(pd.class)) {
               var6.f$E().add(new oa(var3));
            }

         });
         ++var4;
         this.f$M.add(var6);
      }

      this.f$M.sort(Comparator.comparing(sa::f$E));
      this.f$I = this.f$M.size() * this.f$a();
   }

   // $FF: synthetic method
   public void f$E(int var1, int var2) {
      if (this.f$d) {
         gF var3 = (gF)kH.f$E().f$E().f$E(gF.class);
         wD var4 = (wD)kH.f$E().f$E().f$E(wD.class);
         int var5 = var1 + 4;
         if (var3 != null && (Boolean)var3.f$c.f$E()) {
            var5 += var3.f$L.f$E(((sa)this.f$M.get(2)).f$E());
         } else {
            var5 += this.f$C.field_71466_p.func_78256_a(((sa)this.f$M.get(2)).f$E());
         }

         GlStateManager.func_179147_l();
         GlStateManager.func_179141_d();
         Uh.f$E((float)var1, (float)var2 - 0.4F, (float)(var1 + var5 - 2), (float)(var2 + this.f$I) + 0.4F, 1.5F, 1711276032, -2013265920);
         GlStateManager.func_179084_k();

         int var10000;
         int var6;
         int var7;
         for(var10000 = var6 = 0; var10000 < this.f$M.size(); var10000 = var6) {
            var7 = !this.f$K ? 0 : this.f$g + (this.f$j == 0 && this.f$g < 0 ? -this.f$g : 0);
            int var8 = !this.f$K ? 0 : this.f$g + (this.f$j == this.f$M.size() - 1 && this.f$g > 0 ? -this.f$g : 0);
            if (this.f$j == var6) {
               Uh.f$E((float)var1, (float)(var6 * 12 + var2 + var7) - 0.3F, (float)(var1 + var5) - 2.2F, (float)(var6 + var2 + 12 + var6 * 11 + var8) + 0.3F, 1.5F, -2013265920, var4.f$a.getRGB() + -1728053248, var4.f$a.getRGB() + -1728053248);
            }

            ++var6;
         }

         var6 = var2 + 2;

         for(var10000 = var7 = 0; var10000 < this.f$M.size(); var10000 = var7) {
            sa var9 = (sa)this.f$M.get(var7);
            xa var10;
            if (var3 != null && (Boolean)var3.f$c.f$E()) {
               GlStateManager.func_179147_l();
               GlStateManager.func_179141_d();
               var10 = this;
               var3.f$L.f$E(var9.f$E(), (double)((float)(var1 + 2)), (double)((float)var6), -5592406);
               GlStateManager.func_179084_k();
            } else {
               var10 = this;
               this.f$C.field_71466_p.func_175063_a(var9.f$E(), (float)(var1 + 2), (float)var6, -5592406);
            }

            if (var10.f$j == var7 && !this.f$K) {
               var9.f$E(this.f$C, var1 + var5, var6 - 2);
            }

            ++var7;
            var6 += this.f$a();
         }
      }

   }

   // $FF: synthetic method
   public static String f$E(String var0) {
      StackTraceElement var10003 = (new RuntimeException()).getStackTrace()[1];
      String var10000 = (new StringBuffer(var10003.getMethodName())).insert(0, var10003.getClassName()).toString();
      int var10001 = var10000.length() - 1;
      float var10 = 1.0F;
      int var11 = 2 << 3 ^ 3 ^ 5;
      int var10004 = 5 << 4 ^ 2 << 1;
      int var10005 = 5 << 4 ^ (2 ^ 5) << 1;
      int var10006 = (var0 = (String)var0).length();
      char[] var10007 = new char[var10006];
      boolean var10009 = true;
      int var14 = var10006 - 1;
      var10006 = var10005;
      int var1;
      var10005 = var1 = var14;
      char[] var3 = var10007;
      int var7 = var10006;
      int var4 = var11;
      var10 = 2.0F;
      int var2;
      int var5 = var2 = var10001;
      int var8 = var10005;

      for(String var6 = var10000; var8 >= 0; var8 = var1) {
         var11 = var1--;
         var3[var11] = (char)(var4 ^ var0.charAt(var11) ^ var6.charAt(var2));
         if (var1 < 0) {
            break;
         }

         var10001 = var1;
         char var10002 = (char)(var7 ^ var0.charAt(var1) ^ var6.charAt(var2));
         --var1;
         --var2;
         var3[var10001] = var10002;
         if (var2 < 0) {
            var2 = var5;
         }
      }

      return new String(var3);
   }
}
