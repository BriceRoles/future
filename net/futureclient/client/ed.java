package net.futureclient.client;

import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.network.play.server.SPacketPlayerPosLook;

public class ed extends Ha<jf> {
   // $FF: synthetic field
   public final BB f$d;

   // $FF: synthetic method
   public ed(BB var1) {
      this.f$d = var1;
   }

   // $FF: synthetic method
   public void f$E(jf var1) {
      if (var1.f$E() instanceof SPacketPlayerPosLook && ((mc)this.f$d.f$D.f$E()).equals(mc.f$M)) {
         if (BB.f$E().field_71439_g.func_184582_a(EntityEquipmentSlot.CHEST).func_77973_b() != Items.field_185160_cR) {
            return;
         }

         BB.f$E(this.f$d, true);
      }

   }
}
