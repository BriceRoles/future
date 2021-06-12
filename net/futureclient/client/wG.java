package net.futureclient.client;

import java.math.BigDecimal;
import java.math.RoundingMode;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

public final class wG {
   // $FF: synthetic method
   public static float f$E(float var0, float var1, float var2) {
      if (var0 > var1) {
         var0 = var1;
      }

      if (var0 < var2) {
         var0 = var2;
      }

      return var0;
   }

   // $FF: synthetic method
   public static double f$E(BlockPos var0) {
      return f$e((double)var0.func_177958_n(), (double)var0.func_177956_o(), (double)var0.func_177952_p());
   }

   // $FF: synthetic method
   public static double f$E(double var0) {
      if ((var0 %= 360.0D) >= 180.0D) {
         var0 -= 360.0D;
      }

      if (var0 < -180.0D) {
         var0 += 360.0D;
      }

      return var0;
   }

   // $FF: synthetic method
   private wG() {
   }

   // $FF: synthetic method
   public static double f$E(Vec3d var0, Vec3d var1) {
      double var2 = var0.field_72450_a - var1.field_72450_a;
      double var4 = var0.field_72448_b - var1.field_72448_b;
      double var6 = var0.field_72449_c - var1.field_72449_c;
      return (double)f$E(var2 * var2 + var4 * var4 + var6 * var6);
   }

   // $FF: synthetic method
   public static float f$E(float var0) {
      return (float)Math.sqrt((double)var0);
   }

   // $FF: synthetic method
   public static int f$E(double var0) {
      int var2 = (int)var0;
      return var0 < (double)var2 ? var2 - 1 : var2;
   }

   // $FF: synthetic method
   public static double f$a(double var0, double var2, double var4) {
      return var0 + (var2 - var0) * var4;
   }

   // $FF: synthetic method
   public static float f$E(double var0) {
      return (float)Math.sqrt(var0);
   }

   // $FF: synthetic method
   public static double f$E(double var0, int var2) {
      if (var2 < 0) {
         throw new IllegalArgumentException();
      } else {
         return (new BigDecimal(var0)).setScale(var2, RoundingMode.HALF_UP).doubleValue();
      }
   }

   // $FF: synthetic method
   public static double f$e(double var0, double var2, double var4) {
      double var6 = Minecraft.func_71410_x().func_175598_ae().field_78730_l - var0;
      var2 = Minecraft.func_71410_x().func_175598_ae().field_78731_m - var2;
      var4 = Minecraft.func_71410_x().func_175598_ae().field_78728_n - var4;
      return (double)f$E(var6 * var6 + var2 * var2 + var4 * var4);
   }

   // $FF: synthetic method
   public static double f$E(EntityPlayer var0, double var1) {
      return f$e(f$a(var0.field_70169_q, var0.field_70165_t, var1), f$a(var0.field_70167_r, var0.field_70163_u, var1), f$a(var0.field_70166_s, var0.field_70161_v, var1));
   }

   // $FF: synthetic method
   public static String f$E(String var0) {
      StackTraceElement var10003 = (new RuntimeException()).getStackTrace()[1];
      String var10000 = var10003.getMethodName() + var10003.getClassName();
      int var10001 = var10000.length() - 1;
      float var10 = 1.0F;
      int var11 = 4 << 4 ^ 3 << 1;
      int var10004 = 3 << 3 ^ 3 ^ 5;
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
      int var4 = var10004;
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

   // $FF: synthetic method
   private double f$E(double var1, double var3, double var5) {
      return Math.max(var3, Math.min(var5, var1));
   }

   // $FF: synthetic method
   public static float f$E(float var0, float var1) {
      return f$E(var0, var1, -var1);
   }

   // $FF: synthetic method
   public static float f$a(float var0) {
      if ((var0 %= 360.0F) >= 180.0F) {
         var0 -= 360.0F;
      }

      if (var0 < -180.0F) {
         var0 += 360.0F;
      }

      return var0;
   }
}
