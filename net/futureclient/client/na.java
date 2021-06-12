package net.futureclient.client;

import java.util.Iterator;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.init.SoundEvents;
import org.lwjgl.input.Mouse;

public class na extends wa {
   // $FF: synthetic field
   private Minecraft f$g = Minecraft.func_71410_x();
   // $FF: synthetic field
   private s f$M;
   // $FF: synthetic field
   private boolean f$d;

   // $FF: synthetic method
   public void f$E(int var1, int var2, float var3) {
      this.f$E(var1, var2);
      int var6;
      if (this.f$M.f$E().doubleValue() > this.f$M.f$B().doubleValue()) {
         var6 = this.f$a() + 7;
      } else {
         var6 = (int)(this.f$M.f$E().doubleValue() / this.f$M.f$B().doubleValue() * (double)(this.f$a() + 7));
      }

      gF var4 = (gF)kH.f$E().f$E().f$E(gF.class);
      wD var5 = (wD)kH.f$E().f$E().f$E(wD.class);
      Uh.f$E(this.f$a() + (float)this.f$g, this.f$E() + (float)this.f$d, this.f$a() + (float)var6 + (float)this.f$g, this.f$E() + (float)this.f$E() + 1.0F + (float)this.f$d, !this.f$E(var1, var2) ? var5.f$a.getRGB() + -1728053248 : var5.f$a.getRGB() + 1879048192);
      String var10001;
      Object[] var10002;
      boolean var10004;
      if ((Boolean)var4.f$c.f$E()) {
         GlStateManager.func_179147_l();
         fG var7 = var4.f$L;
         var10001 = PI.f$E("\u0011Q\u0093\u0015\u0014\u0007G");
         var10002 = new Object[2];
         var10004 = true;
         var10002[0] = this.f$E();
         var10002[1] = this.f$M.f$E();
         var7.f$E(String.format(var10001, var10002), (double)(this.f$b + 2.0F), (double)(this.f$j + 4.0F), 16777215);
         GlStateManager.func_179084_k();
      } else {
         FontRenderer var10000 = this.f$g.field_71466_p;
         var10001 = WH.f$E("cTá\u0010f\u00025");
         var10002 = new Object[2];
         var10004 = true;
         var10002[0] = this.f$E();
         var10002[1] = this.f$M.f$E();
         var10000.func_175063_a(String.format(var10001, var10002), this.f$b + 2.0F, this.f$j + 4.0F, 16777215);
      }
   }

   // $FF: synthetic method
   private void f$E(int var1, int var2) {
      if (!Mouse.isButtonDown(0)) {
         this.f$E(false);
      }

      if (this.f$E() && this.f$E(var1, var2)) {
         double var3 = (double)Math.round((double)(((float)var1 - this.f$a()) / (float)(this.f$a() + 7)) * this.f$M.f$B().doubleValue() * (1.0D / this.f$M.f$g.doubleValue())) / (1.0D / this.f$M.f$g.doubleValue());
         this.f$M.f$E((Number)var3);
         if (this.f$M.f$E().doubleValue() < this.f$M.f$e().doubleValue()) {
            this.f$M.f$E(this.f$M.f$e());
            return;
         }

         if (this.f$M.f$E().doubleValue() > this.f$M.f$B().doubleValue()) {
            this.f$M.f$E(this.f$M.f$B());
         }
      }

   }

   // $FF: synthetic method
   public na(s var1) {
      super(var1.f$E()[0]);
      this.f$M = var1;
   }

   // $FF: synthetic method
   public void f$a(int var1, int var2, int var3) {
      super.f$a(var1, var2, var3);
      if (this.f$E(var1, var2) && var3 == 0) {
         this.f$g.func_147118_V().func_147682_a(PositionedSoundRecord.func_184371_a(SoundEvents.field_187909_gi, 1.0F));
         this.f$E(true);
      }

   }

   // $FF: synthetic method
   public int f$E() {
      return 14;
   }

   // $FF: synthetic method
   private boolean f$E(int var1, int var2) {
      Iterator var3 = WB.f$E().f$E().iterator();

      do {
         if (!var3.hasNext()) {
            if ((float)var1 >= this.f$a() && (float)var1 <= this.f$a() + (float)(this.f$a() + 7) && (float)var2 >= this.f$E() && (float)var2 <= this.f$E() + (float)this.f$M) {
               return true;
            }

            return false;
         }
      } while(!((qC)var3.next()).f$M);

      return false;
   }

   // $FF: synthetic method
   private void f$E(boolean var1) {
      this.f$d = var1;
   }

   // $FF: synthetic method
   private boolean f$E() {
      return this.f$d;
   }
}
