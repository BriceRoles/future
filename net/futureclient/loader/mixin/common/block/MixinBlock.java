package net.futureclient.loader.mixin.common.block;

import java.util.List;
import javax.annotation.Nullable;
import net.futureclient.client.RF;
import net.futureclient.client.ba;
import net.futureclient.client.ie;
import net.futureclient.client.kH;
import net.futureclient.client.zf;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({Block.class})
public abstract class MixinBlock {
   @Shadow
   @Final
   public Material field_149764_J;
   private static final Minecraft f$d = Minecraft.func_71410_x();

   /** @deprecated */
   @Shadow
   @Deprecated
   public abstract boolean func_176225_a(IBlockState var1, IBlockAccess var2, BlockPos var3, EnumFacing var4);

   @Shadow
   public static void func_185492_a(BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, @Nullable AxisAlignedBB blockBox) {
   }

   /** @deprecated */
   @Inject(
      method = {"addCollisionBoxToList(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/AxisAlignedBB;Ljava/util/List;Lnet/minecraft/entity/Entity;Z)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   @Deprecated
   private void f$E(IBlockState var1, World var2, BlockPos var3, AxisAlignedBB var4, List<AxisAlignedBB> var5, Entity var6, boolean var7, CallbackInfo var8) {
      Block var9 = (Block)this;
      AxisAlignedBB var10 = var9.func_180646_a(var1, var2, var3);
      zf var11 = new zf(var9, var3, var6, var10);
      kH.f$E().f$E().f$E((RF)var11);
      if (var10 != var11.f$E()) {
         var10 = var11.f$E();
      }

      if (var10 != null && var4.func_72326_a(var10)) {
         var5.add(var10);
      }

      func_185492_a(var3, var4, var5, var10);
      var8.cancel();
   }

   @Inject(
      method = {"addCollisionBoxToList(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/AxisAlignedBB;Ljava/util/List;Lnet/minecraft/util/math/AxisAlignedBB;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private static void f$E(BlockPos var0, AxisAlignedBB var1, List<AxisAlignedBB> var2, AxisAlignedBB var3, CallbackInfo var4) {
      if (var3 != Block.field_185506_k) {
         AxisAlignedBB var5 = var3.func_186670_a(var0);
         zf var6 = new zf(f$d.field_71441_e != null ? f$d.field_71441_e.func_180495_p(var0).func_177230_c() : null, var0, var5);
         kH.f$E().f$E().f$E((RF)var6);
         if (var5 != var6.f$E()) {
            var5 = var6.f$E();
         }

         if (var5 != null && var1.func_72326_a(var5)) {
            var2.add(var5);
         }
      }

      var4.cancel();
   }

   @Inject(
      method = {"getAmbientOcclusionLightValue"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void f$E(CallbackInfoReturnable<Float> var1) {
      ba var2 = (ba)kH.f$E().f$E().f$E(ba.class);
      if (var2 != null && var2.f$E()) {
         var1.setReturnValue(1.0F);
      }

   }

   @Inject(
      method = {"onBlockPlacedBy"},
      at = {@At("HEAD")}
   )
   private void f$E(World var1, BlockPos var2, IBlockState var3, EntityLivingBase var4, ItemStack var5, CallbackInfo var6) {
      kH.f$E().f$E().f$E((RF)(new ie(var4, var2, var5)));
   }
}
