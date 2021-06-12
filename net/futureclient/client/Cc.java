package net.futureclient.client;

import net.minecraft.network.play.client.CPacketPlayer;

public class Cc extends Ha<ME> {
   // $FF: synthetic field
   public final uA f$d;

   // $FF: synthetic method
   public Cc(uA var1) {
      this.f$d = var1;
   }

   // $FF: synthetic method
   public void f$E(ME var1) {
      if (this.f$d.f$K.f$E() == dd.f$K && uA.f$Jd().field_71439_g.field_70123_F && uA.f$UC().field_71439_g.field_70181_x < -0.19D + Pg.f$E()) {
         if (uA.f$oC().field_71439_g.field_70122_E) {
            uA.f$yA().field_71439_g.field_71174_a.func_147297_a(new CPacketPlayer(false));
            uA.f$e(this.f$d, true);
            return;
         }

         uA.f$Sd().field_71439_g.field_70181_x = 0.42D + Pg.f$E();
         uA.f$e(this.f$d, true);
         uA.f$Ed().field_71439_g.field_71174_a.func_147297_a(new CPacketPlayer(true));
      }

   }
}
