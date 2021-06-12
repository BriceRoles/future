package net.futureclient.client;

import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.network.play.client.CPacketTabComplete;
import net.minecraft.network.play.client.CPacketPlayer.Position;
import net.minecraft.util.EnumHand;
import net.minecraft.util.MovementInput;
import net.minecraft.util.MovementInputFromOptions;
import net.minecraft.util.math.BlockPos;

public class ee extends Ha<ME> {
   // $FF: synthetic field
   public final Gf f$d;

   // $FF: synthetic method
   public ee(Gf var1) {
      this.f$d = var1;
   }

   // $FF: synthetic method
   public void f$E(ME var1) {
      if (!(Boolean)Gf.f$I(this.f$d).f$E()) {
         Gf.f$K(this.f$d, Gf.f$B(this.f$d, Gf.f$e(this.f$d, Gf.f$a(this.f$d, (Boolean)null))));
      }

      if (!(Boolean)Gf.f$j(this.f$d).f$E()) {
         Gf.f$E(this.f$d, (Boolean)null);
      }

      Class var2;
      if ((var2 = Gf.f$l().field_71439_g.field_71158_b.getClass()) == MovementInputFromOptions.class || var2 == MovementInput.class) {
         Gf.f$B(this.f$d).f$a();
         Gf.f$h.func_78898_a();
         Gf.f$k().field_71439_g.field_71158_b = Gf.f$h;
      }

      if (Gf.f$B(this.f$d).f$a(Gf.f$E(this.f$d).f$E().floatValue() * 1000.0F)) {
         if ((Boolean)Gf.f$I(this.f$d).f$E()) {
            if (Gf.f$a(this.f$d) > 7) {
               Gf.f$E(this.f$d, -Gf.f$E(this.f$d).nextInt(20));
            }

            ee var10000;
            switch(Gf.f$a(this.f$d)) {
            case 0:
               var10000 = this;

               while(false) {
               }

               boolean var10003 = true;
               boolean var10004 = true;
               boolean var10005 = true;
               boolean var10006 = true;
               Gf.f$K(this.f$d, true);
               Gf.f$B(this.f$d, Gf.f$a(this.f$d, Gf.f$e(this.f$d, false)));
               break;
            case 1:
               var10000 = this;
               Gf.f$K(this.f$d, Gf.f$a(this.f$d, true));
               Gf.f$B(this.f$d, Gf.f$e(this.f$d, false));
               break;
            case 2:
               var10000 = this;
               Gf.f$a(this.f$d, true);
               Gf.f$K(this.f$d, Gf.f$B(this.f$d, Gf.f$e(this.f$d, false)));
               break;
            case 3:
               var10000 = this;
               Gf.f$a(this.f$d, Gf.f$B(this.f$d, true));
               Gf.f$e(this.f$d, Gf.f$K(this.f$d, false));
               break;
            case 4:
               var10000 = this;
               Gf.f$B(this.f$d, true);
               Gf.f$K(this.f$d, Gf.f$e(this.f$d, Gf.f$a(this.f$d, false)));
               break;
            case 5:
               var10000 = this;
               Gf.f$B(this.f$d, Gf.f$e(this.f$d, true));
               Gf.f$K(this.f$d, Gf.f$a(this.f$d, false));
               break;
            case 6:
               var10000 = this;
               Gf.f$e(this.f$d, true);
               Gf.f$K(this.f$d, Gf.f$B(this.f$d, Gf.f$a(this.f$d, false)));
               break;
            case 7:
               var10000 = this;
               Gf.f$K(this.f$d, Gf.f$e(this.f$d, true));
               Gf.f$B(this.f$d, Gf.f$a(this.f$d, false));
               break;
            default:
               var10000 = this;
               Gf.f$K(this.f$d, Gf.f$B(this.f$d, Gf.f$e(this.f$d, Gf.f$a(this.f$d, false))));
            }

            if (Gf.f$e(var10000.f$d).f$E((long)Gf.f$E(this.f$d).nextInt(1000)) && (Gf.f$b().field_71439_g.field_70159_w == 0.0D || Gf.f$F().field_71439_g.field_70179_y == 0.0D)) {
               Gf.f$E(this.f$d);
               Gf.f$e(this.f$d).f$a();
            }
         }

         if (!Gf.f$a(this.f$d).f$a(Gf.f$E(this.f$d).f$E().floatValue() * 1000.0F)) {
            return;
         }

         Gf.f$a(this.f$d).f$a();
         if ((Boolean)Gf.f$M(this.f$d).f$E()) {
            Gf.f$G().field_71439_g.func_184609_a(EnumHand.MAIN_HAND);
         }

         if ((Boolean)Gf.f$C(this.f$d).f$E()) {
            Gf.f$D().field_71439_g.func_71165_d((new StringBuilder()).insert(0, ni.f$E("\u000e")).append(Long.toHexString(Double.doubleToLongBits(Math.random()))).toString());
         }

         if ((Boolean)Gf.f$H(this.f$d).f$E()) {
            Gf.f$g().field_71439_g.field_71174_a.func_147297_a(new CPacketTabComplete((new StringBuilder()).insert(0, WI.f$E("\u001c")).append(Long.toHexString(Double.doubleToLongBits(Math.random()))).toString(), (BlockPos)null, false));
         }

         if ((Boolean)Gf.f$h(this.f$d).f$E()) {
            float var3 = Gf.f$E(this.f$d).nextBoolean() ? (float)Gf.f$E(this.f$d).nextInt(45) : (float)(-Gf.f$E(this.f$d).nextInt(45));
            EntityPlayerSP var4 = Gf.f$m().field_71439_g;
            var4.field_70177_z = (float)((double)var4.field_70177_z + (double)var3 + (Gf.f$E(this.f$d).nextBoolean() ? Math.random() * 45.0D : -(Math.random() * 45.0D)));
            Gf.f$f().field_71439_g.field_70125_A = var3;
         }

         if ((Boolean)Gf.f$A(this.f$d).f$E()) {
            ((Y)Gf.f$L()).f$E(He.f$M);
         }

         if ((Boolean)Gf.f$K(this.f$d).f$E()) {
            Gf.f$M().field_71439_g.field_71174_a.func_147297_a(new Position(Gf.f$i().field_71439_g.field_70165_t, Gf.f$c().field_71439_g.field_70163_u - Math.random(), Gf.f$I().field_71439_g.field_70161_v, Gf.f$j().field_71439_g.field_70122_E));
         }

         if ((Boolean)Gf.f$B(this.f$d).f$E()) {
            Gf.f$C().field_71439_g.func_70664_aZ();
         }

         if ((Boolean)Gf.f$j(this.f$d).f$E() && !Gf.f$H().field_71439_g.func_184218_aH() && !((B)Gf.f$h().field_71439_g).f$E()) {
            Gf.f$E(this.f$d, Gf.f$K(this.f$d) == null || !Gf.f$K(this.f$d));
            return;
         }
      } else {
         Gf.f$K(this.f$d, Gf.f$B(this.f$d, Gf.f$e(this.f$d, Gf.f$a(this.f$d, Gf.f$E(this.f$d, (Boolean)null)))));
      }

   }
}
