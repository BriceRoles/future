package net.futureclient.client;

import net.minecraft.client.gui.GuiGameOver;
import net.minecraft.entity.Entity;

public class UB extends Ha<Wf> {
   // $FF: synthetic field
   public final yB f$d;

   // $FF: synthetic method
   public UB(yB var1) {
      this.f$d = var1;
   }

   // $FF: synthetic method
   public void f$E(Wf var1) {
      if (var1.f$E() instanceof GuiGameOver && (Boolean)yB.f$a(this.f$d).f$E()) {
         String var2 = "";
         if (yB.f$b().func_71356_B()) {
            var2 = Rg.f$E("y d.f,z%k0o;");
         } else if (yB.f$F().func_147104_D() != null) {
            var2 = yB.f$G().func_147104_D().field_78845_b.replaceAll(OI.f$E("T"), Rg.f$E("\u0016"));
         } else if (yB.f$D().func_181540_al()) {
            var2 = OI.f$E("\u0005\u000b\u0016\u0002\u001a\u001d");
         }

         Object var3 = yB.f$g().func_175606_aa() == null ? yB.f$m().field_71439_g : yB.f$f().func_175606_aa();
         double var4 = Double.parseDouble(yB.f$E(this.f$d).format(((Entity)var3).field_70165_t).replaceAll(",", "."));
         double var6 = Double.parseDouble(yB.f$E(this.f$d).format(((Entity)var3).field_70163_u).replaceAll(",", "."));
         double var8 = Double.parseDouble(yB.f$E(this.f$d).format(((Entity)var3).field_70161_v).replaceAll(",", "."));
         va var10;
         va var11;
         if ((var10 = this.f$d.f$a(Rg.f$E("\ro(~!"))) != null && ((Entity)var3).func_70011_f(var10.f$a(), var10.f$E(), var10.f$e()) > 100.0D || !var2.equalsIgnoreCase(var10.f$e())) {
            if (yB.f$E(this.f$d, var10)) {
               this.f$d.f$i.remove(var10);
            }

            var11 = new va(OI.f$E("*\u0012\u000f\u0003\u0006"), var2, var4, var6, var8, yB.f$L().field_71441_e.field_73011_w.func_186058_p().func_186065_b());
            this.f$d.f$i.add(var11);
            return;
         }

         if (this.f$d.f$a(Rg.f$E("\ro(~!")) == null) {
            var11 = new va(OI.f$E("*\u0012\u000f\u0003\u0006"), var2, var4, var6, var8, yB.f$i().field_71441_e.field_73011_w.func_186058_p().func_186065_b());
            this.f$d.f$i.add(var11);
         }
      }

   }
}
