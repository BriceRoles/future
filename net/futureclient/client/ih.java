package net.futureclient.client;

import net.futureclient.loader.injector.Injector;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.item.EntityEnderEye;

public class ih extends GA {
   // $FF: synthetic field
   private EntityEnderEye f$e;
   // $FF: synthetic field
   private boolean f$i;
   // $FF: synthetic field
   private Wi f$K;
   // $FF: synthetic field
   private EntityEnderEye f$j;
   // $FF: synthetic field
   private Wi f$g;
   // $FF: synthetic field
   private Wi f$d;
   // $FF: synthetic field
   private Wi f$M;
   // $FF: synthetic field
   private Wi f$b;
   // $FF: synthetic field
   private Bh f$C;
   // $FF: synthetic field
   private boolean f$I;

   // $FF: synthetic method
   public static Minecraft f$e(ih var0) {
      return var0.f$d;
   }

   // $FF: synthetic method
   public static Wi f$E(ih var0, Wi var1, Wi var2, Wi var3, Wi var4) {
      return var0.f$E(var1, var2, var3, var4);
   }

   // $FF: synthetic method
   public static Wi f$E(ih var0) {
      return var0.f$d;
   }

   // $FF: synthetic method
   private void f$E() {
      this.f$e = null;
      this.f$I = false;
      this.f$K = null;
      this.f$b = null;
      this.f$j = null;
      this.f$i = false;
      this.f$M = null;
      this.f$g = null;
      this.f$d = null;
      this.f$C.f$a();
   }

   // $FF: synthetic method
   public static boolean f$a(ih var0, boolean var1) {
      return var0.f$I = var1;
   }

   // $FF: synthetic method
   public static Wi f$a(ih var0) {
      return var0.f$M;
   }

   // $FF: synthetic method
   public static Wi f$K(ih var0) {
      return var0.f$b;
   }

   // $FF: synthetic method
   public static EntityEnderEye f$a(ih var0) {
      return var0.f$e;
   }

   // $FF: synthetic method
   public static Minecraft f$E(ih var0) {
      return var0.f$d;
   }

   // $FF: synthetic method
   public ih() {
      String[] var10001 = new String[4];
      boolean var10003 = true;
      var10001[0] = ni.f$E("?H\u0017E*U\u000bN\u0017F\u0011N\u0015E");
      var10001[1] = Injector.f$E("=-\u001c6\u0000>\u00066\u0002=");
      var10001[2] = ni.f$E("*U\u000bN\u0017F\u0011N\u0015E?H\u0017E\u001cS");
      var10001[3] = Injector.f$E("\b*");
      super(var10001);
      this.f$C = new Bh();
      this.f$I = false;
      this.f$i = false;
   }

   // $FF: synthetic method
   public static Wi f$e(ih var0) {
      return var0.f$g;
   }

   // $FF: synthetic method
   public static Minecraft f$a(ih var0) {
      return var0.f$d;
   }

   // $FF: synthetic method
   public String f$E() {
      return null;
   }

   // $FF: synthetic method
   public static void f$E(ih var0) {
      var0.f$E();
   }

   // $FF: synthetic method
   public static EntityEnderEye f$E(ih var0) {
      return var0.f$j;
   }

   // $FF: synthetic method
   public static Wi f$B(ih var0) {
      return var0.f$K;
   }

   // $FF: synthetic method
   public static Wi f$K(ih var0, Wi var1) {
      return var0.f$b = var1;
   }

   // $FF: synthetic method
   public static EntityEnderEye f$a(ih var0, EntityEnderEye var1) {
      return var0.f$e = var1;
   }

   // $FF: synthetic method
   public static Wi f$a(ih var0, Wi var1) {
      return var0.f$M = var1;
   }

   // $FF: synthetic method
   public static boolean f$E(ih var0) {
      return var0.f$i;
   }

   // $FF: synthetic method
   private Wi f$E(Wi var1, Wi var2, Wi var3, Wi var4) {
      double var5 = (var2.f$g - var1.f$g) / (var2.f$M - var1.f$M);
      double var7 = (var4.f$g - var3.f$g) / (var4.f$M - var3.f$M);
      double var9 = var1.f$g + var5 * (0.0D - var1.f$M);
      double var11 = var3.f$g + var7 * (0.0D - var3.f$M);
      double var10000;
      double var13;
      if (var5 != Double.POSITIVE_INFINITY && var5 != Double.NEGATIVE_INFINITY) {
         if (var7 != Double.POSITIVE_INFINITY && var7 != Double.NEGATIVE_INFINITY) {
            var13 = (var11 - var9) / (var5 - var7);
            var10000 = var5;
         } else {
            var13 = var3.f$M;
            var10000 = var5;
         }
      } else {
         var13 = var1.f$M;
         var10000 = var5;
      }

      var5 = var10000 * var13 + var9;
      return Double.isFinite(var13) && Double.isFinite(var5) ? new Wi(this, var13, var5, (gH)null) : null;
   }

   // $FF: synthetic method
   public static boolean f$a(ih var0) {
      return var0.f$I;
   }

   // $FF: synthetic method
   public static Wi f$B(ih var0, Wi var1) {
      return var0.f$K = var1;
   }

   // $FF: synthetic method
   public static EntityEnderEye f$E(ih var0, EntityEnderEye var1) {
      return var0.f$j = var1;
   }

   // $FF: synthetic method
   public static Bh f$E(ih var0) {
      return var0.f$C;
   }

   // $FF: synthetic method
   public static Wi f$e(ih var0, Wi var1) {
      return var0.f$g = var1;
   }

   // $FF: synthetic method
   public static boolean f$E(ih var0, boolean var1) {
      return var0.f$i = var1;
   }

   // $FF: synthetic method
   public static Wi f$E(ih var0, Wi var1) {
      return var0.f$d = var1;
   }

   // $FF: synthetic method
   public String f$E(String[] var1) {
      this.f$E();
      kH.f$E().f$E().f$a(new gH(this));
      return ni.f$E("-I\u000bN\u000e\u0001\u0018OYd\u0000DYN\u001f\u0001<O\u001dD\u000b\u0001\rNYC\u001cF\u0010OYR\u001c@\u000bB\u0011H\u0017FYG\u0016SY@YR\rS\u0016O\u001eI\u0016M\u001d\u000f");
   }
}
