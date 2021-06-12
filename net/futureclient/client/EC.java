package net.futureclient.client;

import net.minecraft.network.play.server.SPacketPlayerPosLook;

public class EC extends Ha<jf> {
   // $FF: synthetic field
   public final jc f$d;

   // $FF: synthetic method
   public EC(jc var1) {
      this.f$d = var1;
   }

   // $FF: synthetic method
   public void f$E(jf var1) {
      if (var1.f$E() instanceof SPacketPlayerPosLook) {
         jc.f$E(this.f$d).clear();
         if (((LB)jc.f$a(this.f$d).f$E()).equals(LB.f$M)) {
            this.f$d.f$E(false);
         }
      }

   }
}
