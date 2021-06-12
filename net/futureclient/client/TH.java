package net.futureclient.client;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class TH {
   // $FF: synthetic field
   private static final Minecraft f$d = Minecraft.func_71410_x();

   // $FF: synthetic method
   public static float[] f$E(double var0, double var2, double var4) {
      double var6 = var0 - f$d.field_71439_g.field_70165_t;
      var2 -= f$d.field_71439_g.field_70163_u + (double)f$d.field_71439_g.func_70047_e();
      var4 -= f$d.field_71439_g.field_70161_v;
      double var8 = (double)MathHelper.func_76133_a(var6 * var6 + var4 * var4);
      float var1 = (float)(Math.atan2(var4, var6) * 180.0D / 3.141592653589793D) - 90.0F;
      double var11 = (float)(-(Math.atan2(var2, var8) * 180.0D / 3.141592653589793D));
      float var10;
      if ((var10 = var1 - f$d.field_71439_g.field_70177_z) < -180.0F || var10 > 180.0F) {
         float var3 = (float)Math.round(Math.abs(var10 / 360.0F));
         if (var10 < 0.0F) {
            var10 += 360.0F * var3;
         } else {
            var10 -= 360.0F * var3;
         }
      }

      float[] var10000 = new float[2];
      boolean var10002 = true;
      var10000[0] = f$d.field_71439_g.field_70177_z + var10;
      var10000[1] = var11;
      return var10000;
   }

   // $FF: synthetic method
   public static float f$E(float var0, float var1) {
      return Math.abs(((var0 - var1 + 180.0F) % 360.0F + 360.0F) % 360.0F - 180.0F);
   }

   // $FF: synthetic method
   public static boolean f$E(Entity var0, float var1, sG var2) {
      float var3 = Math.abs(f$E(var0, var2)[0] - f$d.field_71439_g.field_70177_z) % 360.0F > 180.0F ? 360.0F - Math.abs(f$E(var0, var2)[0] - f$d.field_71439_g.field_70177_z) % 360.0F : Math.abs(f$E(var0, var2)[0] - f$d.field_71439_g.field_70177_z) % 360.0F;
      float var4 = Math.abs(f$E(var0, var2)[1] - f$d.field_71439_g.field_70125_A) % 360.0F > 180.0F ? 360.0F - Math.abs(f$E(var0, var2)[1] - f$d.field_71439_g.field_70125_A) % 360.0F : Math.abs(f$E(var0, var2)[1] - f$d.field_71439_g.field_70125_A) % 360.0F;
      return Math.sqrt((double)(var4 * var4 + var3 * var3)) <= (double)(var1 == 180.0F ? 360.0F : var1);
   }

   // $FF: synthetic method
   public static float f$E(float var0) {
      if (var0 > 90.0F) {
         var0 = 90.0F;
         return 90.0F;
      } else {
         if (var0 < -90.0F) {
            var0 = -90.0F;
         }

         return var0;
      }
   }

   // $FF: synthetic method
   public static float[] f$E(Entity var0) {
      double var1 = var0.field_70165_t - f$d.field_71439_g.field_70165_t;
      double var3 = var0.field_70163_u - (f$d.field_71439_g.field_70163_u + (double)f$d.field_71439_g.func_70047_e());
      double var5 = var0.field_70161_v - f$d.field_71439_g.field_70161_v;
      double var7 = (double)MathHelper.func_76133_a(var1 * var1 + var5 * var5);
      float var10 = (float)(Math.atan2(var5, var1) * 180.0D / 3.141592653589793D) - 90.0F;
      float var2 = (float)(-(Math.atan2(var3, var7) * 180.0D / 3.141592653589793D));
      float var9;
      if ((var9 = var10 - f$d.field_71439_g.field_70177_z) < -180.0F || var9 > 180.0F) {
         float var11 = (float)Math.round(Math.abs(var9 / 360.0F));
         if (var9 < 0.0F) {
            var9 += 360.0F * var11;
         } else {
            var9 -= 360.0F * var11;
         }
      }

      float[] var10000 = new float[2];
      boolean var10002 = true;
      var10000[0] = f$d.field_71439_g.field_70177_z + var9;
      var10000[1] = var2;
      return var10000;
   }

   // $FF: synthetic method
   public static float[] f$a(Entity var0) {
      double var1 = var0.field_70165_t - f$d.field_71439_g.field_70165_t;
      double var3 = var0.field_70163_u + (double)(var0.func_70047_e() / 2.0F) - 0.5D - f$d.field_71439_g.field_70163_u - 0.6D;
      double var5 = var0.field_70161_v - f$d.field_71439_g.field_70161_v;
      double var7 = (double)MathHelper.func_76133_a(var1 * var1 + var5 * var5);
      float var9 = (float)(Math.atan2(var5, var1) * 180.0D / 3.141592653589793D) - 90.0F;
      float var2 = (float)(-(Math.atan2(var3, var7) * 180.0D / 3.141592653589793D));
      float[] var10000 = new float[2];
      boolean var10002 = true;
      var10000[0] = var9;
      var10000[1] = var2;
      return var10000;
   }

   // $FF: synthetic method
   public static double f$E(Entity var0) {
      return (double)(f$E(var0)[0] - f$d.field_71439_g.field_70177_z);
   }

   // $FF: synthetic method
   public static float f$a(float var0, float var1) {
      if ((var1 = Math.abs(var0 - var1) % 360.0F) > 180.0F) {
         var1 = 360.0F - var1;
      }

      return var1;
   }

   // $FF: synthetic method
   public static float f$E(float var0, float var1, float var2) {
      if ((var1 = f$a(var1 - var0)) > var2) {
         var1 = var2;
      }

      if (var1 < -var2) {
         var1 = -var2;
      }

      return var1;
   }

   // $FF: synthetic method
   public static float[] f$E(Entity var0, sG var1) {
      double var2 = var0.field_70165_t - f$d.field_71439_g.field_70165_t;
      double var4 = var0.field_70163_u + (double)var0.func_70047_e() - (f$d.field_71439_g.field_70163_u + (double)f$d.field_71439_g.func_70047_e()) - (double)(var1 == null ? var0.field_70131_O / 2.0F : f$E(var1));
      double var6 = var0.field_70161_v - f$d.field_71439_g.field_70161_v;
      double var8 = (double)MathHelper.func_76133_a(var2 * var2 + var6 * var6);
      sG var10 = (float)(Math.atan2(var6, var2) * 180.0D / 3.141592653589793D) - 90.0F;
      float var11 = (float)(-(Math.atan2(var4, var8) * 180.0D / 3.141592653589793D));
      if ((var10 -= f$d.field_71439_g.field_70177_z) < -180.0F || var10 > 180.0F) {
         float var3 = (float)Math.round(Math.abs(var10 / 360.0F));
         if (var10 < 0.0F) {
            var10 += 360.0F * var3;
         } else {
            var10 -= 360.0F * var3;
         }
      }

      float[] var10000 = new float[2];
      boolean var10002 = true;
      var10000[0] = f$d.field_71439_g.field_70177_z + var10;
      var10000[1] = var11;
      return var10000;
   }

   // $FF: synthetic method
   public static double f$E(Entity var0, sG var1) {
      return (new Vec3d(f$d.field_71439_g.field_70165_t, f$d.field_71439_g.field_70163_u + (double)f$d.field_71439_g.func_70047_e(), f$d.field_71439_g.field_70161_v)).func_72438_d(var0.func_174791_d());
   }

   // $FF: synthetic method
   public static float[] f$E(BlockPos var0, EnumFacing var1) {
      AxisAlignedBB var2 = f$d.field_71441_e.func_180495_p(var0).func_185900_c(f$d.field_71441_e, var0);
      double var3 = (double)var0.func_177958_n() + (var2.field_72340_a + var2.field_72336_d) / 2.0D;
      double var5 = (double)var0.func_177956_o() + (var2.field_72338_b + var2.field_72337_e) / 2.0D;
      double var7 = (double)var0.func_177952_p() + (var2.field_72339_c + var2.field_72334_f) / 2.0D;
      if (var1 != null) {
         var3 += (double)var1.func_176730_m().func_177958_n() * ((var2.field_72340_a + var2.field_72336_d) / 2.0D);
         var5 += (double)var1.func_176730_m().func_177956_o() * ((var2.field_72338_b + var2.field_72337_e) / 2.0D);
         var7 += (double)var1.func_176730_m().func_177952_p() * ((var2.field_72339_c + var2.field_72334_f) / 2.0D);
      }

      return f$E(var3, var5, var7);
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

   // $FF: synthetic method
   public static float f$E(sG var0) {
      // $FF: Couldn't be decompiled
   }
}
