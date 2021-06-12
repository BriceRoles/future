package net.futureclient.loader.mixin.forge.item;

import net.futureclient.client.RF;
import net.futureclient.client.dg;
import net.futureclient.client.kH;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Dynamic;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin({ItemBlock.class})
public abstract class MixinItemBlock {
   @Shadow
   @Dynamic
   public abstract boolean placeBlockAt(ItemStack var1, EntityPlayer var2, World var3, BlockPos var4, EnumFacing var5, float var6, float var7, float var8, IBlockState var9);

   @Redirect(
      method = {"onItemUse"},
      at = @At(
   value = "INVOKE",
   target = "net/minecraft/item/ItemBlock.placeBlockAt(Lnet/minecraft/item/ItemStack;Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;FFFLnet/minecraft/block/state/IBlockState;)Z"
)
   )
   @Dynamic
   private boolean f$E(ItemBlock var1, ItemStack var2, EntityPlayer var3, World var4, BlockPos var5, EnumFacing var6, float var7, float var8, float var9, IBlockState var10) {
      dg var11 = new dg();
      kH.f$E().f$E().f$E((RF)var11);
      return var4.field_72995_K && var11.f$E() || this.placeBlockAt(var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }
}
