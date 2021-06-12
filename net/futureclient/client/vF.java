package net.futureclient.client;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBow;

public class vF extends Ba {
   // $FF: synthetic field
   public float f$g;
   // $FF: synthetic field
   public float f$d;
   // $FF: synthetic field
   public EntityLivingBase f$M;
   // $FF: synthetic field
   private z<Boolean> f$j;
   // $FF: synthetic field
   private z<Boolean> f$b;
   // $FF: synthetic field
   private z<Boolean> f$e;
   // $FF: synthetic field
   private z<Boolean> f$C;
   // $FF: synthetic field
   private z<Boolean> f$i;
   // $FF: synthetic field
   private z<Boolean> f$K;
   // $FF: synthetic field
   private z<Boolean> f$I;

   // $FF: synthetic method
   private float[] f$E(EntityLivingBase var1) {
      double var2 = var1.field_70165_t - f$d.field_71439_g.field_70165_t;
      double var4 = var1.field_70163_u - f$d.field_71439_g.field_70163_u + (double)(var1.func_70047_e() / 1.4F);
      double var6 = var1.field_70161_v - f$d.field_71439_g.field_70161_v;
      double var8 = Math.sqrt(var2 * var2 + var6 * var6);
      EntityLivingBase var10 = (float)(Math.atan2(var6, var2) * 180.0D / 3.141592653589793D) - 90.0F;
      float var11 = (float)(-(Math.atan2(var4, var8) * 180.0D / 3.141592653589793D));
      float[] var10000 = new float[2];
      boolean var10002 = true;
      var10000[0] = var10;
      var10000[1] = var11;
      return var10000;
   }

   // $FF: synthetic method
   public void f$K() {
      super.f$K();
      this.f$g = 0.0F;
      this.f$d = 0.0F;
   }

   // $FF: synthetic method
   public static void f$E(vF var0, Pf var1, double var2, double var4) {
      var0.f$E(var1, var2, var4);
   }

   // $FF: synthetic method
   private boolean f$E(EntityLivingBase var1) {
      if (var1 != null && Pg.f$E((Entity)var1) && f$d.field_71439_g.func_70685_l(var1)) {
         if (BI.f$M(var1)) {
            return (Boolean)this.f$e.f$E();
         } else if (BI.f$j(var1)) {
            return (Boolean)this.f$I.f$E();
         } else if (BI.f$I(var1)) {
            return (Boolean)this.f$K.f$E();
         } else if (var1 instanceof EntityPlayer && (Boolean)this.f$C.f$E()) {
            EntityPlayer var2 = (EntityPlayer)var1;
            mF var3;
            if ((var3 = (mF)kH.f$E().f$E().f$E(mF.class)).f$E() && var3.f$d.containsKey(var1.func_145782_y())) {
               return false;
            } else if (var2.func_145782_y() == -1337) {
               return false;
            } else if (!var2.equals(f$d.field_71439_g) && !var2.field_71075_bZ.field_75098_d) {
               if ((Boolean)this.f$i.f$E() && Pg.f$a((Entity)var2)) {
                  return false;
               } else if ((Boolean)this.f$j.f$E() && !Pg.f$E(var2)) {
                  return false;
               } else if (var2.func_82150_aj()) {
                  return (Boolean)this.f$b.f$E();
               } else {
                  return !kH.f$E().f$E().f$E(var2.func_70005_c_());
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   // $FF: synthetic method
   public void f$B() {
      super.f$B();
      this.f$M = null;
   }

   // $FF: synthetic method
   public static Minecraft f$a() {
      return f$d;
   }

   // $FF: synthetic method
   public vF() {
      String var10001 = Bh.f$E("\u0014\u0002!,?\u0000");
      String[] var10002 = new String[2];
      boolean var10004 = true;
      var10002[0] = RG.f$E("e3P\u001dN1");
      var10002[1] = Bh.f$E("\u0014\f");
      super(var10001, var10002, true, -3358823, JD.f$I);
      Boolean var10003 = true;
      String[] var3 = new String[4];
      boolean var10006 = true;
      var3[0] = RG.f$E("\fK=^9U/");
      var3[1] = Bh.f$E("&\u00017\u00143\u001f");
      var3[2] = RG.f$E(",");
      var3[3] = Bh.f$E("&\u00017\u00143\u001f");
      this.f$C = new z(var10003, var3);
      var10003 = false;
      var3 = new String[5];
      var10006 = true;
      var3[0] = RG.f$E("j3I/S9U/");
      var3[1] = Bh.f$E("\u00009\u0003%\u00193\u001f");
      var3[2] = RG.f$E("1H2");
      var3[3] = Bh.f$E("\u0000");
      var3[4] = RG.f$E("1H2T(");
      this.f$e = new z(var10003, var3);
      var10003 = false;
      var3 = new String[6];
      var10006 = true;
      var3[0] = Bh.f$E("\u0018\b#\u0019$\f:\u001e");
      var3[1] = RG.f$E("\fF/T5Q9");
      var3[2] = Bh.f$E("\u0006\f%\u001e?\u001b3\u001e");
      var3[3] = RG.f$E("\u0012B)S.F0");
      var3[4] = Bh.f$E("\u00033\u0018");
      var3[5] = RG.f$E("2");
      this.f$I = new z(var10003, var3);
      var10003 = false;
      var3 = new String[3];
      var10006 = true;
      var3[0] = Bh.f$E(",8\u0004;\f:\u001e");
      var3[1] = RG.f$E("=I5");
      var3[2] = Bh.f$E("7\u0003?\u00007\u0001");
      this.f$K = new z(var10003, var3);
      var10003 = true;
      var3 = new String[4];
      var10006 = true;
      var3[0] = RG.f$E("n2Q5T5E0B/");
      var3[1] = Bh.f$E("\u00048\u001b?\u001e");
      var3[2] = RG.f$E("5I*");
      var3[3] = Bh.f$E("\u00048\u001b?\u001e?\u000f:\b");
      this.f$b = new z(var10003, var3);
      var10003 = true;
      var3 = new String[3];
      var10006 = true;
      var3[0] = RG.f$E("f.J3U\u001fO9D7");
      var3[1] = Bh.f$E(",$\u00009\u001f3\t");
      var3[2] = RG.f$E("\u001dU1H.");
      this.f$j = new z(var10003, var3);
      var10003 = false;
      var3 = new String[3];
      var10006 = true;
      var3[0] = Bh.f$E("93\f;\u001e");
      var3[1] = RG.f$E("s9F1");
      var3[2] = Bh.f$E("\"\b;\u001e");
      this.f$i = new z(var10003, var3);
      z[] var1 = new z[7];
      boolean var4 = true;
      var1[0] = this.f$C;
      var1[1] = this.f$e;
      var1[2] = this.f$I;
      var1[3] = this.f$K;
      var1[4] = this.f$b;
      var1[5] = this.f$j;
      var1[6] = this.f$i;
      this.f$E((z[])var1);
      Ha[] var2 = new Ha[2];
      var4 = true;
      var2[0] = new le(this);
      var2[1] = new se(this);
      this.f$E((Ha[])var2);
   }

   // $FF: synthetic method
   private void f$E(Pf var1, double var2, double var4) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   private EntityLivingBase f$E(Pf var1, float var2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   private float f$E(double var1, double var3, double var5, double var7) {
      var7 = 2.0D * var7 * var1 * var1;
      double var9 = var3 * var5 * var5;
      var7 = var3 * (var9 + var7);
      var7 = Math.sqrt(var1 * var1 * var1 * var1 - var7);
      var9 = var1 * var1 + var7;
      var1 = var1 * var1 - var7;
      var7 = Math.atan2(var9, var3 * var5);
      var1 = Math.atan2(var1, var3 * var5);
      return (float)Math.min(var7, var1);
   }

   // $FF: synthetic method
   public boolean f$e() {
      return this.f$M != null && f$d.field_71439_g.func_184607_cu().func_77973_b() instanceof ItemBow;
   }

   // $FF: synthetic method
   public static EntityLivingBase f$E(vF var0, Pf var1, float var2) {
      return var0.f$E(var1, var2);
   }

   // $FF: synthetic method
   private float f$E(EntityLivingBase var1, double var2, double var4) {
      double var6 = var1.field_70163_u + (double)(var1.func_70047_e() / 2.0F) - (f$d.field_71439_g.field_70163_u + (double)f$d.field_71439_g.func_70047_e());
      double var8 = var1.field_70165_t - f$d.field_71439_g.field_70165_t;
      double var10 = var1.field_70161_v - f$d.field_71439_g.field_70161_v;
      var8 = Math.sqrt(var8 * var8 + var10 * var10);
      return this.f$E(var2, var4, var8, var6);
   }

   // $FF: synthetic method
   public static Minecraft f$E() {
      return f$d;
   }
}
