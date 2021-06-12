package net.futureclient.client;

import net.minecraft.entity.Entity;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.item.EntityBoat;
import net.minecraft.entity.item.EntityEnderCrystal;
import net.minecraft.entity.item.EntityEnderEye;
import net.minecraft.entity.item.EntityEnderPearl;
import net.minecraft.entity.item.EntityFallingBlock;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityEndermite;
import net.minecraft.entity.monster.EntityEvoker;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityGiantZombie;
import net.minecraft.entity.monster.EntityGuardian;
import net.minecraft.entity.monster.EntityIllusionIllager;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.EntityPolarBear;
import net.minecraft.entity.monster.EntityShulker;
import net.minecraft.entity.monster.EntitySilverfish;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntitySnowman;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityStray;
import net.minecraft.entity.monster.EntityVex;
import net.minecraft.entity.monster.EntityVindicator;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.monster.EntityWitherSkeleton;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityDonkey;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityLlama;
import net.minecraft.entity.passive.EntityMule;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.passive.EntityParrot;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntitySkeletonHorse;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.passive.EntityZombieHorse;
import net.minecraft.entity.projectile.EntityEvokerFangs;
import net.minecraft.entity.projectile.EntityFireball;
import net.minecraft.entity.projectile.EntityShulkerBullet;

public class BI {
   // $FF: synthetic method
   public static boolean f$j(Entity var0) {
      return var0 instanceof EntityWolf && f$A(var0) || var0 instanceof EntityPolarBear && f$E(var0) || var0 instanceof EntityIronGolem && f$B(var0) || var0 instanceof EntityEnderman && f$e(var0) || var0 instanceof EntityPigZombie && f$K(var0);
   }

   // $FF: synthetic method
   public static boolean f$H(Entity var0) {
      return var0 instanceof EntityBoat || var0 instanceof EntityMinecart;
   }

   // $FF: synthetic method
   public static boolean f$I(Entity var0) {
      return var0 instanceof EntityPig || var0 instanceof EntityParrot || var0 instanceof EntityCow || var0 instanceof EntitySheep || var0 instanceof EntityChicken || var0 instanceof EntitySquid || var0 instanceof EntityBat || var0 instanceof EntityVillager || var0 instanceof EntityOcelot || var0 instanceof EntityHorse || var0 instanceof EntityLlama || var0 instanceof EntityMule || var0 instanceof EntityDonkey || var0 instanceof EntitySkeletonHorse || var0 instanceof EntityZombieHorse || var0 instanceof EntitySnowman || var0 instanceof EntityRabbit && f$a(var0);
   }

   // $FF: synthetic method
   public static boolean f$h(Entity var0) {
      return var0 instanceof EntityEnderCrystal || var0 instanceof EntityEvokerFangs || var0 instanceof EntityShulkerBullet || var0 instanceof EntityFallingBlock || var0 instanceof EntityFireball || var0 instanceof EntityEnderEye || var0 instanceof EntityEnderPearl;
   }

   // $FF: synthetic method
   public static String f$E(String var0) {
      StackTraceElement var10003 = (new RuntimeException()).getStackTrace()[1];
      String var10000 = var10003.getMethodName() + var10003.getClassName();
      int var10001 = var10000.length() - 1;
      float var10 = 1.0F;
      int var11 = 5 << 4 ^ 2 ^ 5;
      int var10004 = (2 ^ 5) << 4 ^ 2 << 2 ^ 3;
      int var10005 = (3 ^ 5) << 3 ^ 3;
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
   public static boolean f$B(Entity var0) {
      return var0 instanceof EntityIronGolem && ((EntityIronGolem)var0).field_70125_A == 0.0F;
   }

   // $FF: synthetic method
   public static boolean f$C(Entity var0) {
      return var0 instanceof EntityDragon || var0 instanceof EntityWither || var0 instanceof EntityGiantZombie;
   }

   // $FF: synthetic method
   private BI() {
   }

   // $FF: synthetic method
   public static boolean f$K(Entity var0) {
      return var0 instanceof EntityPigZombie && ((EntityPigZombie)var0).field_70125_A == 0.0F && ((EntityPigZombie)var0).func_142015_aE() <= 0;
   }

   // $FF: synthetic method
   public static boolean f$a(Entity var0) {
      return var0 instanceof EntityRabbit && ((EntityRabbit)var0).func_175531_cl() != 99;
   }

   // $FF: synthetic method
   public static boolean f$E(Entity var0) {
      return var0 instanceof EntityPolarBear && ((EntityPolarBear)var0).field_70125_A == 0.0F && ((EntityPolarBear)var0).func_142015_aE() <= 0;
   }

   // $FF: synthetic method
   public static boolean f$M(Entity var0) {
      return var0 instanceof EntityCreeper || var0 instanceof EntityIllusionIllager || var0 instanceof EntitySkeleton || var0 instanceof EntityZombie && !(var0 instanceof EntityPigZombie) || var0 instanceof EntityBlaze || var0 instanceof EntitySpider || var0 instanceof EntityWitch || var0 instanceof EntitySlime || var0 instanceof EntitySilverfish || var0 instanceof EntityGuardian || var0 instanceof EntityEndermite || var0 instanceof EntityGhast || var0 instanceof EntityEvoker || var0 instanceof EntityShulker || var0 instanceof EntityWitherSkeleton || var0 instanceof EntityStray || var0 instanceof EntityVex || var0 instanceof EntityVindicator || var0 instanceof EntityPolarBear && !f$E(var0) || var0 instanceof EntityWolf && !f$A(var0) || var0 instanceof EntityPigZombie && !f$K(var0) || var0 instanceof EntityEnderman && !f$e(var0) || var0 instanceof EntityRabbit && !f$a(var0) || var0 instanceof EntityIronGolem && !f$B(var0);
   }

   // $FF: synthetic method
   public static boolean f$A(Entity var0) {
      return var0 instanceof EntityWolf && !((EntityWolf)var0).func_70919_bu();
   }

   // $FF: synthetic method
   public static boolean f$e(Entity var0) {
      return var0 instanceof EntityEnderman && !((EntityEnderman)var0).func_70823_r();
   }
}
