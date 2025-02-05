package net.futureclient.loader.mixin.common.gui;

import net.futureclient.client.A;
import net.minecraft.client.gui.inventory.GuiChest;
import net.minecraft.inventory.IInventory;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({GuiChest.class})
public abstract class MixinGuiChest implements A {
   @Accessor
   public abstract IInventory getLowerChestInventory();
}
