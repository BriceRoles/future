package net.futureclient.client;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.ResourceLocation;

public abstract class qC implements F {
   // $FF: synthetic field
   private int f$I;
   // $FF: synthetic field
   private boolean f$i;
   // $FF: synthetic field
   private Minecraft f$d = Minecraft.func_71410_x();
   // $FF: synthetic field
   private int f$j;
   // $FF: synthetic field
   private ArrayList<wa> f$g = new ArrayList();
   // $FF: synthetic field
   private int f$C;
   // $FF: synthetic field
   private int f$K;
   // $FF: synthetic field
   private int f$b;
   // $FF: synthetic field
   public boolean f$M;
   // $FF: synthetic field
   private String f$B;
   // $FF: synthetic field
   public int f$a;
   // $FF: synthetic field
   private int f$e;

   // $FF: synthetic method
   public void f$a(int var1) {
      this.f$C = var1;
   }

   // $FF: synthetic method
   public void f$a(int var1, int var2, int var3) {
      if (var3 == 0 && this.f$E(var1, var2)) {
         this.f$I = this.f$C - var1;
         this.f$K = this.f$e - var2;
         WB.f$E().f$E().forEach((var0) -> {
            if (var0.f$M) {
               var0.f$M = false;
            }

         });
         this.f$M = true;
      } else if (var3 == 1 && this.f$E(var1, var2)) {
         this.f$i = !this.f$i;
         this.f$d.func_147118_V().func_147682_a(PositionedSoundRecord.func_184371_a(SoundEvents.field_187909_gi, 1.0F));
      } else {
         if (this.f$i) {
            this.f$E().forEach((var3x) -> {
               var3x.f$a(var1, var2, var3);
            });
         }

      }
   }

   // $FF: synthetic method
   public int f$e() {
      return this.f$e;
   }

   // $FF: synthetic method
   public String f$E() {
      return this.f$B;
   }

   // $FF: synthetic method
   public boolean f$E() {
      return this.f$i;
   }

   // $FF: synthetic method
   public ArrayList<wa> f$E() {
      return this.f$g;
   }

   // $FF: synthetic method
   public void f$E(int var1, int var2, float var3) {
      GlStateManager.func_179094_E();
      GlStateManager.func_179139_a(WB.f$E().f$d, WB.f$E().f$d, WB.f$E().f$d);
      this.f$a(var1, var2);
      float var4 = this.f$i ? this.f$E() - 2.0F : 0.0F;
      gF var5 = (gF)kH.f$E().f$E().f$E(gF.class);
      wD var6 = (wD)kH.f$E().f$E().f$E(wD.class);
      Uh.f$a((float)this.f$C, (float)this.f$e - 1.5F, (float)(this.f$C + this.f$b), (float)(this.f$e + this.f$j - 6), var6.f$a.getRGB() + -1728053248, var6.f$a.getRGB() + -1728053248);
      Uh.f$E((float)this.f$C, (float)this.f$e + 12.5F, (float)(this.f$C + this.f$b), this.f$E() ? (float)(this.f$e + this.f$j) + var4 : (float)(this.f$e + this.f$j - 1), 1996488704);
      if ((Boolean)var5.f$c.f$E()) {
         GlStateManager.func_179147_l();
         var5.f$L.f$E(this.f$E(), (double)((float)this.f$C + 3.0F), (double)((float)this.f$e + 1.5F), 15592941);
         GlStateManager.func_179084_k();
      } else {
         this.f$d.field_71466_p.func_175063_a(this.f$E(), (float)this.f$C + 3.0F, (float)this.f$e + 1.5F, 15592941);
      }

      GlStateManager.func_179094_E();
      GlStateManager.func_179147_l();
      aj.f$E(new Color(255, 255, 255, 255));
      this.f$d.func_110434_K().func_110577_a(new ResourceLocation(mI.f$E("r|~mskcj)\u007fsmskc6gktvq7vwa")));
      GlStateManager.func_179109_b((float)(this.f$B() + this.f$a() - 7), (float)(this.f$e() + 6) - 0.3F, 0.0F);
      GlStateManager.func_179114_b(TH.f$a((float)this.f$a), 0.0F, 0.0F, 0.0F);
      aj.f$E(-5, -5, 0.0F, 0.0F, 10, 10, 10, 10, 10.0F, 10.0F);
      GlStateManager.func_179084_k();
      GlStateManager.func_179121_F();
      if (this.f$i) {
         var4 = (float)(this.f$e() + this.f$E()) - 3.0F;

         Iterator var7;
         wa var8;
         for(Iterator var10000 = var7 = this.f$E().iterator(); var10000.hasNext(); var4 += (float)var8.f$E() + 1.5F) {
            var8 = (wa)var7.next();
            var10000 = var7;
            var8.f$E((float)this.f$C + 2.0F, var4);
            var8.f$a(this.f$a() - 4);
            var8.f$E(var1, var2, var3);
         }
      }

      GlStateManager.func_179121_F();
   }

   // $FF: synthetic method
   public void f$E(int var1, int var2) {
      this.f$e += var1;
      if (this.f$e < var2) {
         this.f$e = var2;
      }

      if (this.f$e >= 4) {
         this.f$e = 4;
      }

   }

   // $FF: synthetic method
   public float f$E() {
      float var1 = 0.0F;

      Iterator var2;
      for(Iterator var10000 = var2 = this.f$E().iterator(); var10000.hasNext(); var10000 = var2) {
         wa var3 = (wa)var2.next();
         var1 += (float)var3.f$E() + 1.5F;
      }

      return var1;
   }

   // $FF: synthetic method
   public void f$E(int var1) {
      this.f$e = var1;
   }

   // $FF: synthetic method
   public qC(String var1, int var2, int var3, boolean var4) {
      this.f$B = var1;
      this.f$C = var2;
      this.f$e = var3;
      this.f$a = 180;
      this.f$b = 88;
      this.f$j = 18;
      this.f$i = var4;
      this.f$E();
   }

   // $FF: synthetic method
   public int f$E() {
      return this.f$j;
   }

   // $FF: synthetic method
   public void f$E(int var1, int var2, int var3) {
      if (var3 == 0) {
         this.f$M = false;
      }

      if (this.f$i) {
         this.f$E().forEach((var3x) -> {
            var3x.f$E(var1, var2, var3);
         });
      }

   }

   // $FF: synthetic method
   public void f$E(boolean var1) {
      this.f$i = var1;
   }

   // $FF: synthetic method
   public int f$a() {
      return this.f$b;
   }

   // $FF: synthetic method
   private void f$a(int var1, int var2) {
      if (this.f$M) {
         this.f$C = this.f$I + var1;
         this.f$e = this.f$K + var2;
      }

   }

   // $FF: synthetic method
   private boolean f$E(int var1, int var2) {
      return var1 >= this.f$B() && var1 <= this.f$B() + this.f$a() - 1 && (float)var2 >= (float)this.f$e() - 1.5F && var2 <= this.f$e() + this.f$E() - 6;
   }

   // $FF: synthetic method
   public void f$E(Qb var1) {
      this.f$g.add(var1);
   }

   // $FF: synthetic method
   public int f$B() {
      return this.f$C;
   }

   // $FF: synthetic method
   public abstract void f$E();
}
