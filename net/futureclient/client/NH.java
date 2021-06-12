package net.futureclient.client;

import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiSlot;
import net.minecraft.util.text.TextFormatting;
import org.lwjgl.opengl.GL11;

public class NH extends GuiSlot {
   // $FF: synthetic field
   public final DG f$d;
   // $FF: synthetic field
   private boolean f$g;
   // $FF: synthetic field
   public int f$M = -1;

   // $FF: synthetic method
   public NH(DG var1) {
      super(DG.f$E(this.f$d = var1), var1.field_146294_l, var1.field_146295_m, 40, var1.field_146295_m - 60, 36);
   }

   // $FF: synthetic method
   public int func_148127_b() {
      return DG.f$E(this.f$d).f$E().size();
   }

   // $FF: synthetic method
   public void func_192637_a(int var1, int var2, int var3, int var4, int var5, int var6, float var7) {
      if (var3 > 10 && var3 < this.field_148158_l - 60) {
         ph var9;
         if (!(var9 = (ph)DG.f$E(this.f$d).f$E().get(var1)).f$h().isEmpty()) {
            DG.f$E(this.f$d).f$E(var9.f$h(), var2, var3);
         }

         DG.f$C(this.f$d).func_175065_a(var9.f$A(), (float)(var2 + 36), (float)var3 + 12.5F, 16777215, false);
         float var10 = var9.f$E().f$E() + var9.f$E().f$E();
         DG.f$h(this.f$d).func_175065_a(var10, (float)(var2 + 215 - DG.f$H(this.f$d).func_78256_a(var10)), (float)var3 + 2.5F, 16777215, false);
         if (!var9.f$A().equals(var9.f$h())) {
            DG.f$A(this.f$d).func_175065_a(var9.f$h(), (float)(var2 + 36), (float)var3 + 2.5F, 16777215, false);
         }

         byte var10000;
         label126: {
            var10 = var9.f$E();
            byte var8 = -1;
            byte var12;
            switch(var10.hashCode()) {
            case -1147090062:
               while(false) {
               }

               if (var10.equals(WI.f$E("\u0017](R2Z:\u0013=A;W;]*Z?_-\u001d~z0E?_7W~F-V,]?^;\u00131A~C?@-D1A:\u001d"))) {
                  var10000 = var12 = 0;
                  break label126;
               }
               break;
            case -1116833701:
               if (var10.equals(WI.f$E("\u0017](R2Z:\u0013=A;W;]*Z?_-\u001d"))) {
                  var10000 = var12 = 2;
                  break label126;
               }
               break;
            case 459044782:
               if (var10.equals(ph.f$E("8\u007f\u0015p\u0014j[}\u0014p\u000f\u007f\u0018j[\u007f\u000ej\u0013{\u0015j\u0012}\u001aj\u0012q\u0015>\b{\th\u001el"))) {
                  var8 = 3;
               }
               break;
            case 2142553676:
               if (var10.equals(ph.f$E("W\u0015h\u001ar\u0012z[}\t{\u001f{\u0015j\u0012\u007f\u0017mU>:}\u0018q\u000ep\u000f>\u0016w\u001cl\u001aj\u001ezW>\u000em\u001e>\u001es\u001aw\u0017>\u001am[k\b{\tp\u001as\u001e0"))) {
                  var10000 = var12 = 1;
                  break label126;
               }
            }

            var10000 = var8;
         }

         NH var14;
         switch(var10000) {
         case 0:
            var14 = this;

            while(false) {
            }

            DG.f$K(this.f$d).func_175065_a(TextFormatting.RED + WI.f$E("z0E?_7W~F-V,]?^;\u00131A~C?@-D1A:\u001d"), (float)(var2 + 36), (float)var3 + 22.5F, 16777215, false);
            break;
         case 1:
            var14 = this;
            DG.f$B(this.f$d).func_175065_a(TextFormatting.RED + ph.f$E("J\u0013w\b>\u001a}\u0018q\u000ep\u000f>\u0013\u007f\b>\u0019{\u001ep[s\u0012y\t\u007f\u000f{\u001f0"), (float)(var2 + 36), (float)var3 + 22.5F, 16777215, false);
            break;
         case 2:
            var14 = this;
            DG.f$e(this.f$d).func_175065_a(TextFormatting.RED + WI.f$E("\u007f1T7]~[?@~Q;V0\u0013*V3C1A?A7_'\u0013<_1P5V:\u001d"), (float)(var2 + 36), (float)var3 + 22.5F, 16777215, false);
            break;
         case 3:
            var14 = this;
            DG.f$a(this.f$d).func_175065_a(TextFormatting.RED + ph.f$E("]\u001ap\u0015q\u000f>\u0018q\u0015j\u001a}\u000f>\u001ak\u000fv\u001ep\u000fw\u0018\u007f\u000fw\u0014p[m\u001el\r{\t0"), (float)(var2 + 36), (float)var3 + 22.5F, 16777215, false);
            break;
         default:
            var14 = this;
            DG.f$E(this.f$d).func_175065_a(TextFormatting.RED + var9.f$E(), (float)(var2 + 36), (float)var3 + 22.5F, 16777215, false);
         }

         if (var14.field_148161_k.field_71474_y.field_85185_A || this.func_148141_e(var6) && this.func_148124_c(var5, var6) == var1) {
            Gui.func_73734_a(var2, var3, var2 + 32, var3 + 32, -1601138544);
            this.field_148161_k.func_110434_K().func_110577_a(DG.f$E());
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            float var11 = this.field_148150_g - var2;
            int var13 = this.field_148162_h - var3;
            if (!DG.f$E(this.f$d).f$I) {
               Gui.func_146110_a(var2, var3, 0.0F, var11 < 32 && var11 > 16 ? 32.0F : 0.0F, 32, 32, 256.0F, 256.0F);
               if (this.f$g && var11 < 32 && var11 > 16) {
                  DG.f$E(this.f$d).f$E(var1);
                  DG.f$E(this.f$d).f$M = var1;
                  this.f$g = false;
               }
            }

            if (var1 > 0) {
               Gui.func_146110_a(var2, var3, 96.0F, var11 < 16 && var13 < 16 ? 32.0F : 0.0F, 32, 32, 256.0F, 256.0F);
               if (this.f$g && var11 < 16 && var13 < 16) {
                  DG.f$E(this.f$d).f$E().set(var1, DG.f$E(this.f$d).f$E().get(var1 - 1));
                  DG.f$E(this.f$d).f$E().set(var1 - 1, var9);
                  DG.f$E(this.f$d).f$M = var1 - 1;
                  DG.f$E(this.f$d).func_148145_f(-DG.f$E(this.f$d).func_148146_j());
                  this.f$g = false;
               }
            }

            if (var1 < DG.f$E(this.f$d).func_148127_b() - 1) {
               Gui.func_146110_a(var2, var3, 64.0F, var11 < 16 && var13 > 16 ? 32.0F : 0.0F, 32, 32, 256.0F, 256.0F);
               if (this.f$g && var11 < 16 && var13 > 16) {
                  DG.f$E(this.f$d).f$E().set(var1, DG.f$E(this.f$d).f$E().get(var1 + 1));
                  DG.f$E(this.f$d).f$E().set(var1 + 1, var9);
                  DG.f$E(this.f$d).f$M = var1 + 1;
                  DG.f$E(this.f$d).func_148145_f(DG.f$E(this.f$d).func_148146_j());
                  this.f$g = false;
               }
            }

         }
      }
   }

   // $FF: synthetic method
   public void func_148123_a() {
   }

   // $FF: synthetic method
   public void func_148144_a(int var1, boolean var2, int var3, int var4) {
      boolean var10003 = true;
      boolean var10004 = true;
      boolean var10005 = true;
      boolean var10006 = true;
      int var5 = this.field_148152_e + this.field_148155_a / 2 - this.func_148139_c() / 2 + 2;
      int var6 = this.field_148153_b + 4 - (int)this.field_148169_q;
      var3 -= var5;
      int var10000 = var4 - var6;
      if (var3 <= 32) {
         this.f$g = true;
      } else {
         DG.f$E(this.f$d).f$a(this.field_148161_k.func_110432_I().func_111285_a());
         this.f$M = var1;
         if (var2 && !DG.f$E(this.f$d).f$I) {
            DG.f$E(this.f$d).f$E(var1);
         }

      }
   }

   // $FF: synthetic method
   public boolean func_148131_a(int var1) {
      return var1 == this.f$M;
   }
}
