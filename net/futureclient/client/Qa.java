package net.futureclient.client;

import net.minecraft.block.material.Material;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;

public class Qa extends Ha<zf> {
   // $FF: synthetic field
   public final Sa f$d;

   // $FF: synthetic method
   public Qa(Sa var1) {
      this.f$d = var1;
   }

   // $FF: synthetic method
   public void f$E(zf var1) {
      BlockPos var2 = var1.f$E();
      Material var3 = Sa.f$a().field_71441_e.func_180495_p(var2).func_185904_a();
      if ((Boolean)Sa.f$e(this.f$d).f$E() && var3.equals(Material.field_151581_o) || (Boolean)Sa.f$a(this.f$d).f$E() && var3.equals(Material.field_151570_A) || (Boolean)Sa.f$E(this.f$d).f$E() && !Sa.f$E().field_71441_e.func_175668_a(var2, false)) {
         var1.f$E(new AxisAlignedBB((double)var2.func_177958_n(), (double)var2.func_177956_o(), (double)var2.func_177952_p(), (double)(var2.func_177958_n() + 1), (double)(var2.func_177956_o() + 1), (double)(var2.func_177952_p() + 1)));
      }

   }
}
