package net.futureclient.client;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.inventory.ClickType;

public class Da extends Ha<EE> {
   // $FF: synthetic field
   public final ea f$d;

   // $FF: synthetic method
   public Da(ea var1) {
      this.f$d = var1;
   }

   // $FF: synthetic method
   public void f$E(EE var1) {
      if (ea.f$a(this.f$d).f$E(100L)) {
         if (CG.f$E(1.0D).func_177230_c().equals(var1.f$E()) && (Boolean)ea.f$a(this.f$d).f$E() && ea.f$j().field_71439_g.field_70122_E) {
            --ea.f$M().field_71439_g.field_70181_x;
         }

         IBlockState var2 = ea.f$C().field_71441_e.func_180495_p(var1.f$E());
         if (ea.f$a(this.f$d).f$E().floatValue() > 0.0F && var2.func_185904_a() != Material.field_151579_a) {
            var1.f$E(var1.f$E() + var2.func_185903_a(ea.f$H().field_71439_g, ea.f$h().field_71441_e, var1.f$E()) * ea.f$a(this.f$d).f$E().floatValue());
            if (ea.f$E(this.f$d).f$a(ea.f$E(this.f$d).f$E().floatValue() * 1000.0F)) {
               var1.f$E(0);
            }
         }

         if ((Boolean)ea.f$E(this.f$d).f$E()) {
            int var3;
            if ((var3 = Pg.f$a(var2)) == -1) {
               return;
            }

            if (var3 < 9) {
               ea.f$A().field_71439_g.field_71071_by.field_70461_c = var3;
               ((M)ea.f$K().field_71442_b).invokeSyncCurrentPlayItem();
               return;
            }

            ea.f$a().field_71442_b.func_187098_a(0, var3, ea.f$B().field_71439_g.field_71071_by.field_70461_c, ClickType.SWAP, ea.f$e().field_71439_g);
         }

      }
   }
}
