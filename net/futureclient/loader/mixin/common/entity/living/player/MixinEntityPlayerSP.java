package net.futureclient.loader.mixin.common.entity.living.player;

import net.futureclient.client.BB;
import net.futureclient.client.DA;
import net.futureclient.client.Fg;
import net.futureclient.client.KD;
import net.futureclient.client.Pf;
import net.futureclient.client.RF;
import net.futureclient.client.bg;
import net.futureclient.client.dF;
import net.futureclient.client.f;
import net.futureclient.client.iD;
import net.futureclient.client.kF;
import net.futureclient.client.kH;
import net.futureclient.client.lG;
import net.futureclient.client.mc;
import net.futureclient.client.rA;
import net.futureclient.client.ze;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.ISound;
import net.minecraft.client.audio.SoundHandler;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.math.AxisAlignedBB;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({EntityPlayerSP.class})
public abstract class MixinEntityPlayerSP extends MixinAbstractClientPlayer implements f {
   @Shadow
   public Minecraft field_71159_c;
   private KD f$g;
   private Pf f$d;

   @Accessor
   public abstract boolean isPrevOnGround();

   @Shadow
   public abstract void func_71053_j();

   @Shadow
   public abstract void func_175161_p();

   @Accessor
   public abstract void setHorseJumpPower(float var1);

   @Inject(
      method = {"onUpdate"},
      at = {@At(
   value = "FIELD",
   target = "net/minecraft/client/entity/EntityPlayerSP.connection:Lnet/minecraft/client/network/NetHandlerPlayClient;",
   ordinal = 0,
   shift = At.Shift.BEFORE
)}
   )
   private void f$K(CallbackInfo var1) {
      kH.f$E().f$E().f$E((RF)(this.f$g = new KD(Fg.f$M, this.field_70177_z, this.field_70125_A, this.field_70122_E)));
   }

   @Redirect(
      method = {"onUpdate"},
      at = @At(
   value = "FIELD",
   target = "net/minecraft/client/entity/EntityPlayerSP.rotationYaw:F"
)
   )
   private float f$B(EntityPlayerSP var1) {
      return this.f$g.f$B();
   }

   @Redirect(
      method = {"onUpdate"},
      at = @At(
   value = "FIELD",
   target = "net/minecraft/client/entity/EntityPlayerSP.rotationPitch:F"
)
   )
   private float f$e(EntityPlayerSP var1) {
      return this.f$g.f$e();
   }

   @Redirect(
      method = {"onUpdate"},
      at = @At(
   value = "FIELD",
   target = "net/minecraft/client/entity/EntityPlayerSP.onGround:Z"
)
   )
   private boolean f$e(EntityPlayerSP var1) {
      return this.f$g.f$a();
   }

   @Inject(
      method = {"onUpdate"},
      at = {@At(
   value = "INVOKE",
   target = "net/minecraft/client/network/NetHandlerPlayClient.sendPacket(Lnet/minecraft/network/Packet;)V",
   ordinal = 0,
   shift = At.Shift.AFTER
)}
   )
   private void f$B(CallbackInfo var1) {
      kH.f$E().f$E().f$E((RF)(new KD(Fg.f$g, this.f$g.f$B(), this.f$g.f$e(), this.f$g.f$a())));
   }

   @Inject(
      method = {"onUpdate"},
      at = {@At(
   value = "INVOKE",
   target = "net/minecraft/client/entity/EntityPlayerSP.onUpdateWalkingPlayer()V",
   ordinal = 0,
   shift = At.Shift.AFTER
)}
   )
   private void f$e(CallbackInfo var1) {
      ze var2 = new ze();
      kH.f$E().f$E().f$E((RF)var2);

      for(int var3 = 0; var3 < var2.f$E() - 1; ++var3) {
         EntityPlayerSP var4 = (EntityPlayerSP)this;
         int var5 = this.field_184617_aD;
         int var6 = this.field_184628_bn;
         int var7 = var4.field_70737_aN;
         float var8 = var4.field_70732_aI;
         float var9 = var4.field_70733_aJ;
         int var10 = var4.field_110158_av;
         boolean var11 = var4.field_82175_bq;
         float var12 = var4.field_70177_z;
         float var13 = var4.field_70126_B;
         float var14 = var4.field_70761_aq;
         float var15 = var4.field_70760_ar;
         float var16 = var4.field_70759_as;
         float var17 = var4.field_70758_at;
         float var18 = var4.field_71109_bG;
         float var19 = var4.field_71107_bF;
         float var20 = var4.field_71154_f;
         float var21 = var4.field_71163_h;
         float var22 = var4.field_71155_g;
         float var23 = var4.field_71164_i;
         float var24 = var4.field_70140_Q;
         float var25 = var4.field_70141_P;
         double var26 = var4.field_71094_bP;
         double var28 = var4.field_71091_bM;
         double var30 = var4.field_71095_bQ;
         double var32 = var4.field_71096_bN;
         double var34 = var4.field_71085_bR;
         double var36 = var4.field_71097_bO;
         float var38 = var4.field_70721_aZ;
         float var39 = var4.field_184618_aE;
         float var40 = var4.field_184619_aG;
         super.func_70071_h_();
         this.field_184617_aD = var5;
         this.field_184628_bn = var6;
         var4.field_70737_aN = var7;
         var4.field_70732_aI = var8;
         var4.field_70733_aJ = var9;
         var4.field_110158_av = var10;
         var4.field_82175_bq = var11;
         var4.field_70177_z = var12;
         var4.field_70126_B = var13;
         var4.field_70761_aq = var14;
         var4.field_70760_ar = var15;
         var4.field_70759_as = var16;
         var4.field_70758_at = var17;
         var4.field_71109_bG = var18;
         var4.field_71107_bF = var19;
         var4.field_71154_f = var20;
         var4.field_71163_h = var21;
         var4.field_71155_g = var22;
         var4.field_71164_i = var23;
         var4.field_70140_Q = var24;
         var4.field_70141_P = var25;
         var4.field_71094_bP = var26;
         var4.field_71091_bM = var28;
         var4.field_71095_bQ = var30;
         var4.field_71096_bN = var32;
         var4.field_71085_bR = var34;
         var4.field_71097_bO = var36;
         var4.field_70721_aZ = var38;
         var4.field_184618_aE = var39;
         var4.field_184619_aG = var40;
         this.func_175161_p();
      }

   }

   @Inject(
      method = {"onUpdateWalkingPlayer"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void f$a(CallbackInfo var1) {
      kH.f$E().f$E().f$E((RF)(this.f$d = new Pf(kF.f$M, this.field_70177_z, this.field_70125_A, this.field_70165_t, this.func_174813_aQ().field_72338_b, this.field_70161_v, this.field_70122_E)));
      if (this.f$d.f$E()) {
         var1.cancel();
      }

   }

   @Redirect(
      method = {"onUpdateWalkingPlayer"},
      at = @At(
   value = "FIELD",
   target = "net/minecraft/client/entity/EntityPlayerSP.posX:D"
)
   )
   private double f$a(EntityPlayerSP var1) {
      return this.f$d.f$K();
   }

   @Redirect(
      method = {"onUpdateWalkingPlayer"},
      at = @At(
   value = "FIELD",
   target = "net/minecraft/util/math/AxisAlignedBB.minY:D"
)
   )
   private double f$E(AxisAlignedBB var1) {
      return this.f$d.f$e();
   }

   @Redirect(
      method = {"onUpdateWalkingPlayer"},
      at = @At(
   value = "FIELD",
   target = "net/minecraft/client/entity/EntityPlayerSP.posZ:D"
)
   )
   private double f$E(EntityPlayerSP var1) {
      return this.f$d.f$E();
   }

   @Redirect(
      method = {"onUpdateWalkingPlayer"},
      at = @At(
   value = "FIELD",
   target = "net/minecraft/client/entity/EntityPlayerSP.rotationYaw:F"
)
   )
   private float f$a(EntityPlayerSP var1) {
      return this.f$d.f$B();
   }

   @Redirect(
      method = {"onUpdateWalkingPlayer"},
      at = @At(
   value = "FIELD",
   target = "net/minecraft/client/entity/EntityPlayerSP.rotationPitch:F"
)
   )
   private float f$E(EntityPlayerSP var1) {
      return this.f$d.f$e();
   }

   @Redirect(
      method = {"onUpdateWalkingPlayer"},
      at = @At(
   value = "FIELD",
   target = "net/minecraft/client/entity/EntityPlayerSP.onGround:Z"
)
   )
   private boolean f$a(EntityPlayerSP var1) {
      return this.f$d.f$a();
   }

   @Inject(
      method = {"onUpdateWalkingPlayer"},
      at = {@At("RETURN")}
   )
   private void f$E(CallbackInfo var1) {
      kH.f$E().f$E().f$E((RF)(new Pf(kF.f$g, this.f$d.f$B(), this.f$d.f$e(), this.f$d.f$K(), this.f$d.f$e(), this.f$d.f$E(), this.f$d.f$a())));
   }

   @ModifyVariable(
      method = {"setSprinting"},
      at = @At("HEAD")
   )
   private boolean f$E(boolean var1) {
      bg var2 = new bg(var1);
      kH.f$E().f$E().f$E((RF)var2);
      return var2.f$a();
   }

   @Inject(
      method = {"sendChatMessage"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void f$E(String var1, CallbackInfo var2) {
      dF var3 = new dF(var1);
      kH.f$E().f$E().f$E((RF)var3);
      if (var3.f$E()) {
         var2.cancel();
      }

   }

   @Inject(
      method = {"pushOutOfBlocks"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void f$a(CallbackInfoReturnable<Boolean> var1) {
      iD var2 = new iD();
      kH.f$E().f$E().f$E((RF)var2);
      if (var2.f$E()) {
         var1.cancel();
      }

   }

   @Redirect(
      method = {"onLivingUpdate"},
      at = @At(
   value = "INVOKE",
   target = "net/minecraft/client/entity/EntityPlayerSP.closeScreen()V"
)
   )
   private void f$E(EntityPlayerSP var1) {
      if (lG.f$E().f$E()) {
         this.func_71053_j();
      }

   }

   @Redirect(
      method = {"onLivingUpdate"},
      at = @At(
   value = "INVOKE",
   target = "net/minecraft/client/Minecraft.displayGuiScreen(Lnet/minecraft/client/gui/GuiScreen;)V"
)
   )
   private void f$E(Minecraft var1, GuiScreen var2) {
      if (lG.f$E().f$E()) {
         this.field_71159_c.func_147108_a((GuiScreen)null);
      }

   }

   @Redirect(
      method = {"onLivingUpdate"},
      at = @At(
   value = "INVOKE",
   target = "net/minecraft/client/audio/SoundHandler.playSound(Lnet/minecraft/client/audio/ISound;)V"
)
   )
   private void f$E(SoundHandler var1, ISound var2) {
      DA var3 = (DA)kH.f$E().f$E().f$E(DA.class);
      if (var3 == null || !var3.f$E() || !(Boolean)var3.f$K.f$E()) {
         this.field_71159_c.func_147118_V().func_147682_a(var2);
      }

   }

   @Redirect(
      method = {"onLivingUpdate"},
      at = @At(
   value = "INVOKE",
   target = "net/minecraft/client/entity/EntityPlayerSP.isElytraFlying()Z"
)
   )
   private boolean f$E(EntityPlayerSP var1) {
      BB var2 = (BB)kH.f$E().f$E().f$E(BB.class);
      return var2 != null && var2.f$E() && var2.f$D.f$E() == mc.f$M ? true : var1.func_184613_cA();
   }

   @Inject(
      method = {"isCurrentViewEntity"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void f$E(CallbackInfoReturnable<Boolean> var1) {
      EntityPlayerSP var2 = (EntityPlayerSP)this;
      if (var2.equals(this.field_71159_c.field_71439_g)) {
         rA var3 = (rA)kH.f$E().f$E().f$E(rA.class);
         if (var3 != null && var3.f$E()) {
            var1.setReturnValue(true);
         }
      }

   }
}
