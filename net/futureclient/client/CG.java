package net.futureclient.client;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockAnvil;
import net.minecraft.block.BlockBed;
import net.minecraft.block.BlockButton;
import net.minecraft.block.BlockCake;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.BlockFenceGate;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.BlockNote;
import net.minecraft.block.BlockRedstoneDiode;
import net.minecraft.block.BlockTrapDoor;
import net.minecraft.block.BlockWorkbench;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.network.play.client.CPacketPlayer.Rotation;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.RayTraceResult.Type;

public class CG {
   // $FF: synthetic field
   private static Minecraft f$d = Minecraft.func_71410_x();

   // $FF: synthetic method
   public static boolean f$e(BlockPos var0) {
      return f$E(var0, false) != null;
   }

   // $FF: synthetic method
   public static boolean f$a() {
      IBlockState var0;
      return (var0 = f$E(Block.class, MathHelper.func_76128_c(Pg.f$E().func_174813_aQ().field_72338_b - 0.01D))) != null && var0.func_185904_a().func_76230_c();
   }

   // $FF: synthetic method
   public static boolean f$a(BlockPos var0) {
      return Pg.f$E().func_174813_aQ().field_72338_b >= (double)var0.func_177956_o();
   }

   // $FF: synthetic method
   public static List<BlockPos> f$E(Vec3d var0, double var1) {
      ArrayList var3 = new ArrayList();

      double var4;
      double var6;
      for(double var10000 = var4 = var0.field_72450_a - var1; var10000 <= var0.field_72450_a + var1; var10000 = ++var4) {
         double var8;
         for(var10000 = var6 = var0.field_72448_b - var1; var10000 <= var0.field_72448_b + var1; var10000 = ++var6) {
            for(var10000 = var8 = var0.field_72449_c - var1; var10000 <= var0.field_72449_c + var1; var10000 = var8) {
               var3.add(new BlockPos((int)var4, (int)var6, (int)var8));
               ++var8;
            }
         }
      }

      return var3;
   }

   // $FF: synthetic method
   public static IBlockState f$E(double var0) {
      return f$d.field_71441_e.func_180495_p(new BlockPos(f$d.field_71439_g.field_70165_t, f$d.field_71439_g.field_70163_u - var0, f$d.field_71439_g.field_70161_v));
   }

   // $FF: synthetic method
   public static boolean f$e() {
      return f$d.field_71441_e.func_184144_a(f$d.field_71439_g, f$d.field_71439_g.func_174813_aQ().func_72317_d(0.0D, 0.21D, 0.0D)).size() > 0;
   }

   // $FF: synthetic method
   private static IBlockState f$E(Class<? extends Block> var0, int var1) {
      int var2;
      for(int var10000 = var2 = MathHelper.func_76128_c(Pg.f$E().func_174813_aQ().field_72340_a); var10000 < MathHelper.func_76143_f(Pg.f$E().func_174813_aQ().field_72336_d); var10000 = var2) {
         int var3;
         for(var10000 = var3 = MathHelper.func_76128_c(Pg.f$E().func_174813_aQ().field_72339_c); var10000 < MathHelper.func_76143_f(Pg.f$E().func_174813_aQ().field_72334_f); var10000 = var3) {
            IBlockState var4 = f$d.field_71441_e.func_180495_p(new BlockPos(var2, var1, var3));
            if (var0.isInstance(var4.func_177230_c())) {
               return var4;
            }

            ++var3;
         }

         ++var2;
      }

      return null;
   }

   // $FF: synthetic method
   public static boolean f$E(boolean var0) {
      return f$E(MathHelper.func_76128_c(Pg.f$E().func_174813_aQ().field_72338_b - (var0 ? 0.03D : 0.2D)));
   }

   // $FF: synthetic method
   public static double f$E(BlockPos var0) {
      return f$d.field_71439_g.func_174818_b(var0);
   }

   // $FF: synthetic method
   private static boolean f$E(int var0) {
      return f$E(BlockLiquid.class, var0) != null;
   }

   // $FF: synthetic method
   public static IBlockState f$a(double var0) {
      return f$d.field_71441_e.func_180495_p(new BlockPos(f$d.field_71439_g.field_70165_t, f$d.field_71439_g.field_70163_u + var0, f$d.field_71439_g.field_70161_v));
   }

   // $FF: synthetic method
   public static EnumFacing f$E(BlockPos var0) {
      return f$E(var0, true);
   }

   // $FF: synthetic method
   public static boolean f$E() {
      return f$E(MathHelper.func_76128_c(Pg.f$E().func_174813_aQ().field_72338_b + 0.01D));
   }

   // $FF: synthetic method
   public static boolean f$E(BlockPos var0) {
      Block var1 = f$d.field_71441_e.func_180495_p(var0).func_177230_c();
      Object var2 = null;
      Iterator var3 = f$d.field_71441_e.field_147482_g.iterator();

      TileEntity var10000;
      while(true) {
         if (var3.hasNext()) {
            TileEntity var4;
            if (!(var4 = (TileEntity)var3.next()).func_174877_v().equals(var0)) {
               continue;
            }

            var10000 = var4;
            break;
         }

         var10000 = (TileEntity)var2;
         break;
      }

      return var10000 == null && !(var1 instanceof BlockBed) && !(var1 instanceof BlockNote) && !(var1 instanceof BlockDoor) && !(var1 instanceof BlockTrapDoor) && !(var1 instanceof BlockFenceGate) && !(var1 instanceof BlockButton) && !(var1 instanceof BlockAnvil) && !(var1 instanceof BlockWorkbench) && !(var1 instanceof BlockCake) && !(var1 instanceof BlockRedstoneDiode);
   }

   // $FF: synthetic method
   public static void f$E(BlockPos var0) {
      double var1 = (double)var0.func_177958_n() + 0.5D - f$d.field_71439_g.field_70165_t;
      double var3 = (double)var0.func_177956_o() + 0.5D - (f$d.field_71439_g.field_70163_u + (double)f$d.field_71439_g.func_70047_e());
      double var5 = (double)var0.func_177952_p() + 0.5D - f$d.field_71439_g.field_70161_v;
      double var7 = (double)MathHelper.func_76133_a(var1 * var1 + var5 * var5);
      float var9 = (float)(Math.atan2(var5, var1) * 180.0D / 3.141592653589793D) - 90.0F + (new Random()).nextFloat() * 2.0F - 1.0F;
      float var2 = (float)(-(Math.atan2(var3, var7) * 180.0D / 3.141592653589793D)) + (new Random()).nextFloat() * 2.0F - 1.0F;
      f$d.field_71439_g.field_71174_a.func_147297_a(new Rotation(f$d.field_71439_g.field_70177_z + MathHelper.func_76142_g(var9 - f$d.field_71439_g.field_70177_z), f$d.field_71439_g.field_70125_A + MathHelper.func_76142_g(var2 - f$d.field_71439_g.field_70125_A), f$d.field_71439_g.field_70122_E));
   }

   // $FF: synthetic method
   public static EnumFacing f$E(BlockPos var0, boolean var1) {
      EnumFacing[] var2;
      int var3 = (var2 = EnumFacing.values()).length;

      int var4;
      for(int var10000 = var4 = 0; var10000 < var3; var10000 = var4) {
         EnumFacing var5 = var2[var4];
         RayTraceResult var6;
         if ((var6 = f$d.field_71441_e.func_147447_a(new Vec3d(f$d.field_71439_g.field_70165_t, f$d.field_71439_g.field_70163_u + (double)f$d.field_71439_g.func_70047_e(), f$d.field_71439_g.field_70161_v), new Vec3d((double)var0.func_177958_n() + 0.5D + (double)var5.func_176730_m().func_177958_n() * 1.0D / 2.0D, (double)var0.func_177956_o() + 0.5D + (double)var5.func_176730_m().func_177956_o() * 1.0D / 2.0D, (double)var0.func_177952_p() + 0.5D + (double)var5.func_176730_m().func_177952_p() * 1.0D / 2.0D), false, true, false)) != null && var6.field_72313_a.equals(Type.BLOCK) && var6.func_178782_a().equals(var0)) {
            return var5;
         }

         ++var4;
      }

      if (var1) {
         if ((double)var0.func_177956_o() > f$d.field_71439_g.field_70163_u + (double)f$d.field_71439_g.func_70047_e()) {
            return EnumFacing.DOWN;
         } else {
            return EnumFacing.UP;
         }
      } else {
         return null;
      }
   }
}
