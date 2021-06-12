package net.futureclient.loader.mixin.common.gui;

import net.futureclient.client.h;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiTextField;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin({GuiTextField.class})
public abstract class MixinGuiTextField implements h {
   @Accessor
   public abstract FontRenderer getFontRenderer();

   @Accessor
   public abstract String getText();

   @Accessor
   public abstract int getCursorCounter();

   @Accessor
   public abstract boolean isEnableBackgroundDrawing();

   @Accessor
   public abstract boolean isIsEnabled();

   @Accessor
   public abstract int getLineScrollOffset();

   @Accessor
   public abstract int getEnabledColor();

   @Accessor
   public abstract int getDisabledColor();

   @Invoker
   public abstract void invokeDrawSelectionBox(int var1, int var2, int var3, int var4);

   @Accessor
   public abstract int getWidth();

   @Accessor
   public abstract int getHeight();
}
