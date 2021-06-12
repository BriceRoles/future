package net.futureclient.client;

import java.awt.Color;
import java.util.Comparator;
import net.minecraft.client.Minecraft;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.text.translation.I18n;

public class te extends Ha<Zd> {
   // $FF: synthetic field
   public final gF f$d;

   // $FF: synthetic method
   public te(gF var1) {
      this.f$d = var1;
   }

   // $FF: synthetic method
   public void f$E(Zd var1) {
      if (!gF.f$m().field_71474_y.field_74330_P) {
         var1.f$g = -((Boolean)this.f$d.f$c.f$E() ? this.f$d.f$L.f$E() : gF.f$f().field_71466_p.field_78288_b) + 2;
         var1.f$g += gF.f$e(this.f$d);
         var1.f$d = ((Boolean)this.f$d.f$c.f$E() ? this.f$d.f$L.f$E() : gF.f$L().field_71466_p.field_78288_b) - 1;
         if ((Boolean)this.f$d.f$w.f$E()) {
            gF.f$i().field_71439_g.func_70651_bq().stream().sorted(((TD)gF.f$E(this.f$d).f$E()).equals(TD.f$M) ? Comparator.comparing(PotionEffect::func_76453_d).reversed() : Comparator.comparing(PotionEffect::func_76453_d)).forEach((var2x) -> {
               Potion var3 = var2x.func_188419_a();
               PotionEffect var4 = (new StringBuilder()).insert(0, I18n.func_74838_a(var3.func_76393_a())).append(var2x.func_76458_c() > 0 ? (new StringBuilder()).insert(0, RG.f$E("|")).append(var2x.func_76458_c() + 1).toString() : "").append(mI.f$E("&¾@")).append(Potion.func_188410_a(var2x, 1.0F)).toString();
               gF.f$E(this.f$d, var1, var4, var3.func_76401_j());
            });
         }

         if ((Boolean)this.f$d.f$W.f$E()) {
            gF.f$E(this.f$d, var1, gF.f$c().func_147104_D() == null ? RG.f$E("\nF2N0K=") : gF.f$I().field_71439_g.func_142021_k(), -5592406);
         }

         if ((Boolean)this.f$d.f$Q.f$E()) {
            gF.f$A(this.f$d, var1);
         }

         if ((Boolean)this.f$d.f$T.f$E()) {
            gF.f$K(this.f$d, var1);
         }

         if ((Boolean)this.f$d.f$v.f$E()) {
            gF.f$B(this.f$d, var1);
         }

         if ((Boolean)this.f$d.f$p.f$E()) {
            gF.f$e(this.f$d, var1);
         }

         if ((Boolean)this.f$d.f$V.f$E()) {
            gF.f$a(this.f$d, var1);
         }

         gF var10000;
         String var10002;
         Object[] var10003;
         boolean var10005;
         if ((Boolean)this.f$d.f$y.f$E()) {
            var10000 = this.f$d;
            var10002 = mI.f$E("Jv|c}&¾@<urk6n");
            var10003 = new Object[1];
            var10005 = true;
            var10003[0] = (double)Math.round(gF.f$E(this.f$d) * 100.0D) / 100.0D;
            gF.f$E(var10000, var1, String.format(var10002, var10003), -5592406);
         }

         if ((Boolean)this.f$d.f$O.f$E() && gF.f$j().field_71439_g.field_71071_by.func_70448_g().func_77984_f()) {
            int var2 = gF.f$M().field_71439_g.field_71071_by.func_70448_g().func_77958_k();
            int var3 = gF.f$C().field_71439_g.field_71071_by.func_70448_g().func_77952_i();
            Color var4 = (new vH((float)(var2 - var3) / (float)var2 * 120.0F, 100.0F, 50.0F, 1.0F)).f$E();
            var10000 = this.f$d;
            var10002 = RG.f$E("û\u0010\u0018R.F>N0N(^|\u0080.\u0002/");
            var10003 = new Object[1];
            var10005 = true;
            var10003[0] = var2 - var3;
            gF.f$E(var10000, var1, String.format(var10002, var10003), var4.getRGB());
         }

         if ((Boolean)this.f$d.f$G.f$E() && !gF.f$H().func_71356_B() && gF.f$A().func_147114_u().func_175102_a(gF.f$h().field_71439_g.func_110124_au()) != null) {
            var10000 = this.f$d;
            var10002 = mI.f$E("Vph~&¾@<utu");
            var10003 = new Object[1];
            var10005 = true;
            var10003[0] = gF.f$B().func_147114_u().func_175102_a(gF.f$K().field_71439_g.func_110124_au()).func_178853_c();
            gF.f$E(var10000, var1, String.format(var10002, var10003), -5592406);
         }

         if ((Boolean)this.f$d.f$h.f$E()) {
            var10000 = this.f$d;
            var10002 = RG.f$E("s\ft|\u0080\u001a\u0002/");
            var10003 = new Object[1];
            var10005 = true;
            var10003[0] = (double)Math.round((double)kH.f$E().f$E().f$E() * 100.0D) / 100.0D;
            gF.f$E(var10000, var1, String.format(var10002, var10003), -5592406);
         }

         if ((Boolean)this.f$d.f$r.f$E()) {
            var10000 = this.f$d;
            var10002 = mI.f$E("_VJ&¾@<u");
            var10003 = new Object[1];
            var10005 = true;
            gF.f$e();
            var10003[0] = Minecraft.func_175610_ah();
            gF.f$E(var10000, var1, String.format(var10002, var10003), -5592406);
         }

         if ((Boolean)this.f$d.f$f.f$E()) {
            gF.f$E(this.f$d, var1);
         }

      }
   }
}
