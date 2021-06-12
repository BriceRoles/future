package net.futureclient.loader.mixin.common;

import net.futureclient.client.AI;
import net.futureclient.client.Af;
import net.futureclient.client.FG;
import net.futureclient.client.He;
import net.futureclient.client.ME;
import net.futureclient.client.OF;
import net.futureclient.client.RF;
import net.futureclient.client.Vd;
import net.futureclient.client.Wf;
import net.futureclient.client.Y;
import net.futureclient.client.kE;
import net.futureclient.client.kH;
import net.futureclient.client.oH;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.multiplayer.PlayerControllerMP;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.util.RecipeBookClient;
import net.minecraft.stats.RecipeBook;
import net.minecraft.stats.StatisticsManager;
import net.minecraft.util.Session;
import net.minecraft.util.Timer;
import net.minecraft.world.World;
import org.lwjgl.LWJGLException;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.PixelFormat;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({Minecraft.class})
public abstract class MixinMinecraft implements Y {
   @Shadow
   public WorldClient field_71441_e;

   @Accessor
   public abstract Timer getTimer();

   @Accessor
   public abstract void setSession(Session var1);

   @Accessor
   public abstract int getRightClickDelayTimer();

   @Accessor
   public abstract void setRightClickDelayTimer(int var1);

   @Accessor
   public abstract void setLeftClickCounter(int var1);

   @Shadow
   public abstract void func_147116_af();

   @Shadow
   public abstract void func_147121_ag();

   @Shadow
   public abstract void func_147112_ai();

   @Shadow
   public abstract void func_71405_e();

   public void f$E(He var1) {
      if (var1 == He.f$i) {
         this.func_147116_af();
      } else if (var1 == He.f$M) {
         this.func_147121_ag();
      } else if (var1 == He.f$g) {
         this.func_147112_ai();
      }

   }

   @Inject(
      method = {"init"},
      at = {@At(
   value = "INVOKE",
   target = "net/minecraft/client/renderer/RenderGlobal.makeEntityOutlineShader()V"
)}
   )
   private void f$H(CallbackInfo var1) {
      new kH();
      kH.f$E().f$E().f$E((RF)(new OF()));
   }

   @Inject(
      method = {"displayGuiScreen"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void f$E(GuiScreen var1, CallbackInfo var2) {
      if (kH.f$E() != null) {
         Wf var3 = new Wf(var1);
         kH.f$E().f$E().f$E((RF)var3);
         if (var3.f$E()) {
            var2.cancel();
         }
      }

   }

   @Inject(
      method = {"runGameLoop"},
      at = {@At("HEAD")}
   )
   private void f$h(CallbackInfo var1) {
      kH.f$E().f$E().f$E((RF)(new Af()));
   }

   @Inject(
      method = {"shutdownMinecraftApplet"},
      at = {@At("HEAD")}
   )
   private void f$A(CallbackInfo var1) {
      kH.f$E().f$E().f$E((RF)(new Vd()));
   }

   @Inject(
      method = {"clickMouse"},
      at = {@At("HEAD")}
   )
   private void f$K(CallbackInfo var1) {
      kH.f$E().f$E().f$E((RF)(new kE(He.f$i)));
   }

   @Inject(
      method = {"rightClickMouse"},
      at = {@At("HEAD")}
   )
   private void f$B(CallbackInfo var1) {
      kH.f$E().f$E().f$E((RF)(new kE(He.f$M)));
   }

   @Inject(
      method = {"runTick"},
      at = {@At("HEAD")}
   )
   private void f$e(CallbackInfo var1) {
      kH.f$E().f$E().f$E((RF)(new ME()));
   }

   @Inject(
      method = {"runTickKeyboard"},
      at = {@At(
   value = "INVOKE_ASSIGN",
   target = "org/lwjgl/input/Keyboard.getEventKeyState()Z",
   remap = false
)}
   )
   private void f$a(CallbackInfo var1) {
      boolean var2 = Keyboard.getEventKeyState();
      if (var2) {
         kH.f$E().f$E().f$E((RF)(new kE(He.f$b)));
      } else {
         kH.f$E().f$E().f$E((RF)(new kE(He.f$j)));
      }

   }

   @Inject(
      method = {"middleClickMouse"},
      at = {@At("HEAD")}
   )
   private void f$E(CallbackInfo var1) {
      kH.f$E().f$E().f$E((RF)(new kE(He.f$g)));
   }

   @Redirect(
      method = {"createDisplay"},
      at = @At(
   value = "INVOKE",
   remap = false,
   target = "org/lwjgl/opengl/Display.create(Lorg/lwjgl/opengl/PixelFormat;)V"
)
   )
   private void f$E(PixelFormat var1) throws LWJGLException {
      oH.f$A();
   }

   @Redirect(
      method = {"loadWorld(Lnet/minecraft/client/multiplayer/WorldClient;Ljava/lang/String;)V"},
      at = @At(
   value = "INVOKE",
   target = "net/minecraft/client/multiplayer/PlayerControllerMP.createPlayer(Lnet/minecraft/world/World;Lnet/minecraft/stats/StatisticsManager;Lnet/minecraft/stats/RecipeBook;)Lnet/minecraft/client/entity/EntityPlayerSP;"
)
   )
   private EntityPlayerSP f$E(PlayerControllerMP var1, World var2, StatisticsManager var3, RecipeBook var4) {
      if (((FG)AI.f$E().f$g.f$E()).equals(FG.f$M)) {
      }

      return var1.func_192830_a(var2, new StatisticsManager(), (RecipeBook)(new RecipeBookClient()));
   }
}
