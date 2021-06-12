package net.futureclient.client;

import java.util.Set;
import net.minecraft.network.play.server.SPacketPlayerPosLook;
import net.minecraft.network.play.server.SPacketPlayerPosLook.EnumFlags;
import net.minecraft.util.math.BlockPos;

public class iA extends Ha<jf> {
   // $FF: synthetic field
   public final XB f$d;

   // $FF: synthetic method
   public iA(XB var1) {
      this.f$d = var1;
   }

   // $FF: synthetic method
   public void f$E(jf var1) {
      if (var1.f$E() instanceof SPacketPlayerPosLook) {
         SPacketPlayerPosLook var2 = (SPacketPlayerPosLook)var1.f$E();
         if (!XB.f$C().field_71441_e.func_175668_a(new BlockPos(XB.f$I().field_71439_g.field_70142_S, XB.f$j().field_71439_g.field_70137_T, XB.f$M().field_71439_g.field_70136_U), false) || !XB.f$K().field_71441_e.func_175668_a(new BlockPos(XB.f$H().field_71439_g.field_70165_t, XB.f$h().field_71439_g.field_70163_u, XB.f$A().field_71439_g.field_70161_v), false)) {
            return;
         }

         XB.f$a(this.f$d, var2.func_148931_f());
         XB.f$E(this.f$d, var2.func_148930_g());
         Set var3 = var2.func_179834_f();
         if (var3.remove(EnumFlags.Y_ROT)) {
            XB.f$a(this.f$d, XB.f$a(this.f$d) + XB.f$B().field_71439_g.field_70177_z);
         }

         if (var3.remove(EnumFlags.X_ROT)) {
            XB.f$E(this.f$d, XB.f$E(this.f$d) + XB.f$e().field_71439_g.field_70125_A);
         }

         ((I)var2).setYaw(XB.f$a().field_71439_g.field_70177_z);
         ((I)var2).setPitch(XB.f$E().field_71439_g.field_70125_A);
      }

   }
}
