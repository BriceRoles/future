package net.futureclient.client;

import net.minecraft.item.ItemAir;
import net.minecraft.item.ItemShield;
import net.minecraft.network.play.server.SPacketEntityEquipment;

public class xe extends Ha<jf> {
   // $FF: synthetic field
   public final Ze f$d;

   // $FF: synthetic method
   public xe(Ze var1) {
      this.f$d = var1;
   }

   // $FF: synthetic method
   public void f$E(jf var1) {
      SPacketEntityEquipment var2;
      if (var1.f$E() instanceof SPacketEntityEquipment && (var2 = (SPacketEntityEquipment)var1.f$E()).func_186969_c().func_188454_b() == 1 && var2.func_149390_c().func_77973_b() instanceof ItemAir && !(Ze.f$B().field_71439_g.func_184592_cb().func_77973_b() instanceof ItemAir) && Ze.f$e().field_71439_g.func_184592_cb().func_77973_b() instanceof ItemShield && this.f$d.f$E()) {
         var1.f$E(true);
      }

   }
}
