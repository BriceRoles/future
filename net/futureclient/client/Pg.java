package net.futureclient.client;

import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityBoat;
import net.minecraft.entity.passive.AbstractHorse;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAir;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemShield;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;
import net.minecraft.network.play.client.CPacketPlayerDigging;
import net.minecraft.network.play.client.CPacketPlayer.Position;
import net.minecraft.network.play.client.CPacketPlayerDigging.Action;
import net.minecraft.scoreboard.ScorePlayerTeam;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.MovementInput;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

public class Pg {
   // $FF: synthetic field
   public static Minecraft f$M = Minecraft.func_71410_x();
   // $FF: synthetic field
   private static final Comparator<Entity> f$g = Comparator.comparing((var0) -> {
      return var0.func_70032_d(f$M.field_71439_g);
   }).reversed();
   // $FF: synthetic field
   private static final Comparator<va> f$d = Comparator.comparing((var0) -> {
      return f$M.field_71439_g.func_70011_f(var0.f$a(), var0.f$E(), var0.f$e());
   }).reversed();

   // $FF: synthetic method
   public static Entity f$E() {
      return (Entity)(f$M.field_71439_g.func_184187_bx() != null && !(f$M.field_71439_g.func_184187_bx() instanceof EntityBoat) ? f$M.field_71439_g.func_184187_bx() : f$M.field_71439_g);
   }

   // $FF: synthetic method
   public static int f$a(IBlockState var0) {
      byte var1 = -1;
      float var2 = 1.0F;
      if (var0.func_185904_a() == Material.field_151579_a) {
         return -1;
      } else {
         byte var3;
         for(byte var10000 = var3 = 0; var10000 < 36; var10000 = ++var3) {
            try {
               ItemStack var4;
               if (!((var4 = f$M.field_71439_g.field_71071_by.func_70301_a(var3)).func_77973_b() instanceof ItemAir) && var4.func_150997_a(var0) > var2) {
                  var2 = var4.func_150997_a(var0);
                  var1 = var3;
               }
            } catch (Exception var5) {
               var5.printStackTrace();
            }
         }

         return var1;
      }
   }

   // $FF: synthetic method
   public static boolean f$a(Entity var0) {
      return f$E(var0) == f$E((Entity)f$M.field_71439_g);
   }

   // $FF: synthetic method
   public static void f$E(double var0) {
      if (f$M.field_71439_g.func_184187_bx() != null) {
         MovementInput var10000 = f$M.field_71439_g.field_71158_b;
         double var3 = (double)var10000.field_192832_b;
         double var5 = (double)var10000.field_78902_a;
         float var2 = f$M.field_71439_g.field_70177_z;
         if (var3 == 0.0D && var5 == 0.0D) {
            f$M.field_71439_g.func_184187_bx().field_70159_w = 0.0D;
            f$M.field_71439_g.func_184187_bx().field_70179_y = 0.0D;
            return;
         }

         if (var3 != 0.0D) {
            if (var5 > 0.0D) {
               var2 += (float)(var3 > 0.0D ? -45 : 45);
            } else if (var5 < 0.0D) {
               var2 += (float)(var3 > 0.0D ? 45 : -45);
            }

            var5 = 0.0D;
            if (var3 > 0.0D) {
               var3 = 1.0D;
            } else if (var3 < 0.0D) {
               var3 = -1.0D;
            }
         }

         f$M.field_71439_g.func_184187_bx().field_70159_w = var3 * var0 * Math.cos(Math.toRadians((double)(var2 + 90.0F))) + var5 * var0 * Math.sin(Math.toRadians((double)(var2 + 90.0F)));
         f$M.field_71439_g.func_184187_bx().field_70179_y = var3 * var0 * Math.sin(Math.toRadians((double)(var2 + 90.0F))) - var5 * var0 * Math.cos(Math.toRadians((double)(var2 + 90.0F)));
      }

   }

   // $FF: synthetic method
   public static boolean f$E(Entity var0) {
      return !var0.field_70128_L && (!(var0 instanceof EntityLivingBase) || Float.isNaN(((EntityLivingBase)var0).func_110143_aJ()) || ((EntityLivingBase)var0).func_110143_aJ() > 0.0F);
   }

   // $FF: synthetic method
   public static int f$E(IBlockState var0) {
      byte var1 = -1;
      float var2 = 1.0F;
      if (var0.func_185904_a() == Material.field_151579_a) {
         return -1;
      } else {
         byte var3;
         for(byte var10000 = var3 = 0; var10000 < 36; var10000 = ++var3) {
            try {
               ItemStack var4;
               if (!((var4 = f$M.field_71439_g.field_71071_by.func_70301_a(var3)).func_77973_b() instanceof ItemAir) && var4.func_150997_a(var0) > var2 && f$M.field_71439_g.field_71069_bz.func_75139_a(var3).func_75211_c().func_77958_k() - f$M.field_71439_g.field_71069_bz.func_75139_a(var3).func_75211_c().func_77952_i() > 5) {
                  var2 = var4.func_150997_a(var0);
                  var1 = var3;
               }
            } catch (Exception var5) {
               var5.printStackTrace();
            }
         }

         return var1;
      }
   }

   // $FF: synthetic method
   public static boolean f$a() {
      return f$M.field_71439_g.field_71158_b.field_187255_c || f$M.field_71439_g.field_71158_b.field_187256_d || f$M.field_71439_g.field_71158_b.field_187257_e || f$M.field_71439_g.field_71158_b.field_187258_f || f$M.field_71439_g.field_71158_b.field_78901_c || f$M.field_71439_g.field_71158_b.field_78899_d;
   }

   // $FF: synthetic method
   public static boolean f$e() {
      return (double)f$M.field_71439_g.field_191988_bg != 0.0D || (double)f$M.field_71439_g.field_70702_br != 0.0D;
   }

   // $FF: synthetic method
   public static double f$E() {
      double var0 = 0.0D;
      if (f$M.field_71439_g.func_70644_a(MobEffects.field_76430_j)) {
         int var2 = f$M.field_71439_g.func_70660_b(MobEffects.field_76430_j).func_76458_c();
         var0 += (double)(var2 + 1) * 0.1D;
      }

      return var0;
   }

   // $FF: synthetic method
   public static boolean f$e(Entity var0) {
      return var0.field_70165_t != var0.field_70142_S || var0.field_70163_u != var0.field_70137_T || var0.field_70161_v != var0.field_70136_U || f$a();
   }

   // $FF: synthetic method
   public static EnumHand f$E(Class<? extends Item> var0) {
      EnumHand[] var1;
      int var2 = (var1 = EnumHand.values()).length;

      int var3;
      for(int var10000 = var3 = 0; var10000 < var2; var10000 = var3) {
         EnumHand var4 = var1[var3];
         if (var0.isInstance(f$M.field_71439_g.func_184586_b(var4).func_77973_b())) {
            return var4;
         }

         ++var3;
      }

      return null;
   }

   // $FF: synthetic method
   public static ItemStack f$E(Class<? extends Item> var0) {
      return f$E((EntityLivingBase)f$M.field_71439_g, (Class)var0);
   }

   // $FF: synthetic method
   public static boolean f$E(EntityPlayer var0) {
      ItemStack var1 = (ItemStack)var0.field_71071_by.field_70460_b.get(0);
      ItemStack var2 = (ItemStack)var0.field_71071_by.field_70460_b.get(1);
      ItemStack var3 = (ItemStack)var0.field_71071_by.field_70460_b.get(2);
      ItemStack var4 = (ItemStack)var0.field_71071_by.field_70460_b.get(3);
      return !(var1.func_77973_b() instanceof ItemAir) || !(var2.func_77973_b() instanceof ItemAir) || !(var3.func_77973_b() instanceof ItemAir) || !(var4.func_77973_b() instanceof ItemAir);
   }

   // $FF: synthetic method
   public static EnumHand f$E(Item var0) {
      EnumHand[] var1;
      int var2 = (var1 = EnumHand.values()).length;

      int var3;
      for(int var10000 = var3 = 0; var10000 < var2; var10000 = var3) {
         EnumHand var4 = var1[var3];
         if (var0.equals(f$M.field_71439_g.func_184586_b(var4).func_77973_b())) {
            return var4;
         }

         ++var3;
      }

      return null;
   }

   // $FF: synthetic method
   public static EnumFacing f$E(float var0, float var1, float var2) {
      return EnumFacing.func_176737_a(var0, var1, var2);
   }

   // $FF: synthetic method
   public static boolean f$E() {
      if (f$M.field_71439_g.func_184586_b(EnumHand.MAIN_HAND).func_77973_b() instanceof ItemAir) {
         return false;
      } else {
         Item var0;
         return (var0 = f$M.field_71439_g.func_184586_b(EnumHand.MAIN_HAND).func_77973_b()) instanceof ItemTool || var0 instanceof ItemSword;
      }
   }

   // $FF: synthetic method
   public static String f$a() {
      return f$M.func_175606_aa() == null ? f$M.field_71439_g.func_174811_aO().name() : f$M.func_175606_aa().func_174811_aO().name();
   }

   // $FF: synthetic method
   public static Comparator<va> f$E() {
      return f$d;
   }

   // $FF: synthetic method
   public static boolean f$E(Entity var0, sG var1) {
      return f$M.field_71441_e.func_147447_a(new Vec3d(f$M.field_71439_g.field_70165_t, f$M.field_71439_g.field_70163_u + (double)f$M.field_71439_g.func_70047_e(), f$M.field_71439_g.field_70161_v), new Vec3d(var0.field_70165_t, var0.field_70163_u + (double)var0.func_70047_e() - (double)TH.f$E(var1), var0.field_70161_v), false, true, false) == null;
   }

   // $FF: synthetic method
   public static void f$E() {
      if (f$M.field_71439_g != null && f$M.field_71439_g.func_184592_cb().func_77973_b() instanceof ItemShield) {
         f$M.field_71439_g.field_71174_a.func_147297_a(new CPacketPlayerDigging(Action.RELEASE_USE_ITEM, new BlockPos(f$M.field_71439_g), EnumFacing.func_176737_a((float)((int)f$M.field_71439_g.field_70165_t), (float)((int)f$M.field_71439_g.field_70163_u), (float)((int)f$M.field_71439_g.field_70161_v))));
      }

   }

   // $FF: synthetic method
   public static void f$E(double[] var0, BlockPos var1, double var2) {
      double var4 = var0[0];
      double var6 = var0[1];
      double var8 = var0[2];
      double var10 = (double)var1.func_177958_n() + 0.5D;
      double var12 = (double)var1.func_177956_o() + 1.0D;
      double var14 = (double)var1.func_177952_p() + 0.5D;
      double var16 = Math.abs(var4 - var10) + Math.abs(var6 - var12) + Math.abs(var8 - var14);
      BlockPos var28 = 0;

      for(double var10000 = var16; var10000 > var2; var10000 = var16) {
         var16 = Math.abs(var4 - var10) + Math.abs(var6 - var12) + Math.abs(var8 - var14);
         if (var28 > 120) {
            return;
         }

         double var18 = var4 - var10;
         double var20 = var6 - var12;
         double var22 = var8 - var14;
         double var24 = (var28 & 1) == 0 ? 0.4D : 0.25D;
         double var26 = Math.min(Math.abs(var18), var24);
         if (var18 < 0.0D) {
            var4 += var26;
            var10000 = var20;
         } else {
            if (var18 > 0.0D) {
               var4 -= var26;
            }

            var10000 = var20;
         }

         var18 = Math.min(Math.abs(var10000), 0.25D);
         if (var20 < 0.0D) {
            var6 += var18;
            var10000 = var22;
         } else {
            if (var20 > 0.0D) {
               var6 -= var18;
            }

            var10000 = var22;
         }

         var18 = Math.min(Math.abs(var10000), var24);
         if (var22 < 0.0D) {
            var8 += var18;
         } else if (var22 > 0.0D) {
            var8 -= var18;
         }

         ++var28;
         f$M.field_71439_g.field_71174_a.func_147297_a(new Position(var4, var6, var8, true));
      }

   }

   // $FF: synthetic method
   public static boolean f$E(EntityLivingBase var0) {
      return f$M.field_71439_g.func_184191_r(var0);
   }

   // $FF: synthetic method
   public static double[] f$E(double var0) {
      return f$E(f$M.field_71439_g, var0);
   }

   // $FF: synthetic method
   public static void f$e() {
      int var0;
      for(int var10000 = var0 = 0; var10000 < 81; var10000 = var0) {
         f$M.field_71439_g.field_71174_a.func_147297_a(new Position(f$M.field_71439_g.field_70165_t, f$M.field_71439_g.field_70163_u + 0.05D, f$M.field_71439_g.field_70161_v, false));
         ++var0;
         f$M.field_71439_g.field_71174_a.func_147297_a(new Position(f$M.field_71439_g.field_70165_t, f$M.field_71439_g.field_70163_u, f$M.field_71439_g.field_70161_v, false));
      }

   }

   // $FF: synthetic method
   public static UUID f$E(Entity var0) {
      if (var0 instanceof EntityTameable) {
         return ((EntityTameable)var0).func_184753_b();
      } else {
         return var0 instanceof AbstractHorse ? ((AbstractHorse)var0).func_184780_dh() : null;
      }
   }

   // $FF: synthetic method
   public static String f$E() {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   public static double[] f$E(EntityPlayerSP var0, double var1) {
      MovementInput var10001 = var0.field_71158_b;
      double var4 = (double)var10001.field_192832_b;
      double var6 = (double)var10001.field_78902_a;
      float var3 = var0.field_70177_z;
      double var8;
      double var10;
      if (var4 == 0.0D && var6 == 0.0D) {
         var8 = 0.0D;
         var10 = 0.0D;
      } else {
         double var10000;
         label39: {
            if (var4 != 0.0D) {
               if (var6 > 0.0D) {
                  var3 += (float)(var4 > 0.0D ? -45 : 45);
               } else if (var6 < 0.0D) {
                  var3 += (float)(var4 > 0.0D ? 45 : -45);
               }

               var6 = 0.0D;
               if (var4 > 0.0D) {
                  var10000 = var4 = 1.0D;
                  break label39;
               }

               if (var4 < 0.0D) {
                  var4 = -1.0D;
               }
            }

            var10000 = var4;
         }

         var8 = var10000 * var1 * Math.cos(Math.toRadians((double)(var3 + 90.0F))) + var6 * var1 * Math.sin(Math.toRadians((double)(var3 + 90.0F)));
         var10 = var4 * var1 * Math.sin(Math.toRadians((double)(var3 + 90.0F))) - var6 * var1 * Math.cos(Math.toRadians((double)(var3 + 90.0F)));
      }

      double[] var12 = new double[2];
      boolean var10002 = true;
      var12[0] = var8;
      var12[1] = var10;
      return var12;
   }

   // $FF: synthetic method
   public static Comparator<Entity> f$a() {
      return f$g;
   }

   // $FF: synthetic method
   public static ItemStack f$E(EntityLivingBase var0, Class<? extends Item> var1) {
      EnumHand[] var2;
      int var3 = (var2 = EnumHand.values()).length;

      int var4;
      for(int var10000 = var4 = 0; var10000 < var3; var10000 = var4) {
         EnumHand var5 = var2[var4];
         ItemStack var7;
         Item var6 = (var7 = var0.func_184586_b(var5)).func_77973_b();
         if (var1.isInstance(var6)) {
            return var7;
         }

         ++var4;
      }

      return null;
   }

   // $FF: synthetic method
   public static void f$E(Ee var0, double var1) {
      double var3 = (double)f$M.field_71439_g.field_71158_b.field_192832_b;
      double var5 = (double)f$M.field_71439_g.field_71158_b.field_78902_a;
      float var7 = f$M.field_71439_g.field_70177_z;
      if (var3 == 0.0D && var5 == 0.0D) {
         var0.f$e(0.0D);
         var0.f$E(0.0D);
      } else {
         Ee var10000;
         label40: {
            if (var3 != 0.0D) {
               if (var5 > 0.0D) {
                  var7 += (float)(var3 > 0.0D ? -45 : 45);
               } else if (var5 < 0.0D) {
                  var7 += (float)(var3 > 0.0D ? 45 : -45);
               }

               var5 = 0.0D;
               if (var3 > 0.0D) {
                  var3 = 1.0D;
                  var10000 = var0;
                  break label40;
               }

               if (var3 < 0.0D) {
                  var3 = -1.0D;
               }
            }

            var10000 = var0;
         }

         var10000.f$e(var3 * var1 * Math.cos(Math.toRadians((double)(var7 + 90.0F))) + var5 * var1 * Math.sin(Math.toRadians((double)(var7 + 90.0F))));
         var0.f$E(var3 * var1 * Math.sin(Math.toRadians((double)(var7 + 90.0F))) - var5 * var1 * Math.cos(Math.toRadians((double)(var7 + 90.0F))));
      }
   }

   // $FF: synthetic method
   public static float f$E() {
      float var0 = f$M.field_71439_g.field_70177_z;
      float var1 = f$M.field_71439_g.field_191988_bg;
      float var2 = f$M.field_71439_g.field_70702_br;
      var0 += (float)(var1 < 0.0F ? 180 : 0);
      if (var2 < 0.0F) {
         var0 += var1 < 0.0F ? -45.0F : (var1 == 0.0F ? 90.0F : 45.0F);
      }

      if (var2 > 0.0F) {
         var0 -= var1 < 0.0F ? -45.0F : (var1 == 0.0F ? 90.0F : 45.0F);
      }

      return var0 * 0.017453292F;
   }

   // $FF: synthetic method
   public static double f$a() {
      double var0 = 0.2873D;
      if (f$M.field_71439_g.func_70644_a(MobEffects.field_76424_c)) {
         int var2 = f$M.field_71439_g.func_70660_b(MobEffects.field_76424_c).func_76458_c();
         var0 *= 1.0D + 0.2D * (double)(var2 + 1);
      }

      return var0;
   }

   // $FF: synthetic method
   public static boolean f$E(KeyBinding var0) {
      if (var0.func_151463_i() != 0) {
         if (var0.func_151463_i() < 0) {
            if (Mouse.isButtonDown(var0.func_151463_i() + 100)) {
               return true;
            }
         } else if (Keyboard.isKeyDown(var0.func_151463_i())) {
            return true;
         }
      }

      return false;
   }

   // $FF: synthetic method
   private static int f$E(Entity var0) {
      int var1 = 16777215;
      ScorePlayerTeam var2;
      String var3;
      if ((var2 = (ScorePlayerTeam)var0.func_96124_cp()) != null && (var3 = FontRenderer.func_78282_e(var2.func_96668_e())).length() >= 2) {
         var1 = f$M.field_71466_p.func_175064_b(var3.charAt(1));
      }

      return var1;
   }

   // $FF: synthetic method
   public static Vec3d f$E() {
      return new Vec3d(f$M.field_71439_g.field_70165_t, f$M.field_71439_g.field_70163_u, f$M.field_71439_g.field_70161_v);
   }

   // $FF: synthetic method
   public static List<EntityPlayer> f$E() {
      mF var0 = (mF)kH.f$E().f$E().f$E(mF.class);
      return (List)f$M.field_71441_e.field_73010_i.stream().filter((var1) -> {
         return var0 == null || !var0.f$E() || !var0.f$d.containsKey(var1.func_145782_y());
      }).sorted(f$a()).collect(Collectors.toList());
   }

   // $FF: synthetic method
   public static int f$E() {
      float var0 = -1.0F;
      int var1 = -1;
      Item var2 = null;

      int var10000;
      int var3;
      ItemStack var4;
      float var5;
      for(var10000 = var3 = 0; var10000 < 9; var10000 = var3) {
         if (!((var4 = (ItemStack)f$M.field_71439_g.field_71071_by.field_70462_a.get(var3)).func_77973_b() instanceof ItemAir) && var4.func_77973_b() instanceof ItemSword && (var5 = (float)var4.func_77958_k()) > var0) {
            var1 = var3;
            var0 = var5;
            var2 = var4.func_77973_b();
         }

         ++var3;
      }

      if (var2 != null) {
         return var1;
      } else {
         for(var10000 = var3 = 0; var10000 < 9; var10000 = var3) {
            if (!((var4 = (ItemStack)f$M.field_71439_g.field_71071_by.field_70462_a.get(var3)).func_77973_b() instanceof ItemAir) && var4.func_77973_b() instanceof ItemAxe && (var5 = (float)var4.func_77958_k()) > var0) {
               var1 = var3;
               var0 = var5;
            }

            ++var3;
         }

         return var1;
      }
   }

   // $FF: synthetic method
   public static double f$E(Entity var0) {
      return (double)(Math.round(Math.floor(Math.sqrt(Math.pow(var0.field_70165_t - var0.field_70142_S, 2.0D) + Math.pow(var0.field_70161_v - var0.field_70136_U, 2.0D)) * 20.0D * 60.0D * 60.0D) / 100.0D) / 10L);
   }

   // $FF: synthetic method
   public static double[] f$E() {
      double[] var10000 = new double[3];
      boolean var10002 = true;
      var10000[0] = f$M.field_71439_g.field_70165_t;
      var10000[1] = f$M.field_71439_g.field_70163_u;
      var10000[2] = f$M.field_71439_g.field_70161_v;
      return var10000;
   }

   // $FF: synthetic method
   public static List<Entity> f$a() {
      mF var0 = (mF)kH.f$E().f$E().f$E(mF.class);
      return (List)f$M.field_71441_e.field_72996_f.stream().filter((var1) -> {
         return !(var1 instanceof EntityPlayer) || var0 == null || !var0.f$E() || !var0.f$d.containsKey(var1.func_145782_y());
      }).sorted(f$a()).collect(Collectors.toList());
   }

   // $FF: synthetic method
   public static void f$a() {
      if (f$M.field_71439_g != null && f$M.field_71439_g.func_184614_ca().func_77973_b() instanceof ItemSword && f$M.field_71439_g.func_184592_cb().func_77973_b() instanceof ItemShield) {
         f$M.field_71442_b.func_187101_a(f$M.field_71439_g, f$M.field_71441_e, EnumHand.OFF_HAND);
      }

   }
}
