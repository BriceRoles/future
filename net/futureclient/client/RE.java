package net.futureclient.client;

import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;

public class RE extends Ha<Pf> {
   // $FF: synthetic field
   public final Le f$d;

   // $FF: synthetic method
   public RE(Le var1) {
      this.f$d = var1;
   }

   // $FF: synthetic method
   public void f$E(Pf var1) {
      if (var1.f$E() == kF.f$g) {
         ItemStack var2;
         if (!((B)Le.f$B().field_71439_g).getActiveItemStack().func_190926_b() && (var2 = Pg.f$E(ItemBow.class)) != null && (float)(var2.func_77988_m() - Le.f$e().field_71439_g.func_184605_cv()) - ((Boolean)Le.f$E(this.f$d).f$E() ? 20.0F - kH.f$E().f$E().f$E() : 0.0F) >= Le.f$E(this.f$d).f$E().floatValue()) {
            Le.f$E().field_71442_b.func_78766_c(Le.f$a().field_71439_g);
         }

      }
   }
}
