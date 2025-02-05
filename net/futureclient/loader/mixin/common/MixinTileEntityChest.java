package net.futureclient.loader.mixin.common;

import net.futureclient.client.y;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.util.NonNullList;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin({TileEntityChest.class})
public abstract class MixinTileEntityChest implements y {
   @Invoker
   public abstract NonNullList<ItemStack> invokeGetItems();
}
