package net.futureclient.loader.mixin.common.gui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import net.futureclient.client.aH;
import net.futureclient.client.lG;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.BossInfoClient;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiBossOverlay;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.network.play.server.SPacketUpdateBossInfo;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.BossInfo;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({GuiBossOverlay.class})
public abstract class MixinGuiBossOverlay extends Gui {
   private final ArrayList<aH> f$g = new ArrayList();
   private ResourceLocation f$d = new ResourceLocation("textures/gui/bars.png");
   @Shadow
   @Final
   private Map<UUID, BossInfoClient> field_184060_g;
   @Shadow
   @Final
   private Minecraft field_184059_f;

   @Shadow
   public abstract void func_184052_a(int var1, int var2, BossInfo var3);

   @Inject(
      method = {"renderBossHealth"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void f$E(CallbackInfo var1) {
      if (!this.field_184060_g.isEmpty() && !lG.f$E().f$E()) {
         ScaledResolution var2 = new ScaledResolution(this.field_184059_f);
         int var3 = var2.func_78326_a();
         int var4 = 12;
         Iterator var5 = this.f$g.iterator();

         while(var5.hasNext()) {
            aH var6 = (aH)var5.next();
            int var7 = var3 / 2 - 91;
            GlStateManager.func_179131_c(1.0F, 1.0F, 1.0F, 1.0F);
            this.field_184059_f.func_110434_K().func_110577_a(this.f$d);
            this.func_184052_a(var7, var4, var6.f$g);
            String var8 = var6.f$g.func_186744_e().func_150254_d() + (var6.f$d > 1 ? " (x" + var6.f$d + ")" : "");
            this.field_184059_f.field_71466_p.func_175063_a(var8, (float)(var3 / 2 - this.field_184059_f.field_71466_p.func_78256_a(var8) / 2), (float)(var4 - 9), 16777215);
            var4 += 10 + this.field_184059_f.field_71466_p.field_78288_b;
            if (var4 >= var2.func_78328_b() / 3) {
               break;
            }
         }

         var1.cancel();
      }

   }

   @Inject(
      method = {"read"},
      at = {@At("HEAD")}
   )
   private void f$E(SPacketUpdateBossInfo var1, CallbackInfo var2) {
      if (!lG.f$E().f$E()) {
         this.f$E();
      }

   }

   private void f$E() {
      this.f$g.clear();
      ArrayList var1 = new ArrayList();
      Iterator var2 = this.field_184060_g.values().iterator();

      while(true) {
         BossInfoClient var3;
         do {
            if (!var2.hasNext()) {
               return;
            }

            var3 = (BossInfoClient)var2.next();
         } while(var1.contains(var3.func_186744_e().func_150254_d()));

         String var4 = var3.func_186744_e().func_150254_d();
         aH var5 = new aH();
         var5.f$g = var3;
         Iterator var6 = this.field_184060_g.values().iterator();

         while(var6.hasNext()) {
            BossInfoClient var7 = (BossInfoClient)var6.next();
            if (var7.func_186744_e().func_150254_d().equals(var4)) {
               ++var5.f$d;
            }
         }

         var1.add(var4);
         this.f$g.add(var5);
      }
   }
}
