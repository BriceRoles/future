package net.futureclient.client;

import net.minecraft.network.play.server.SPacketChat;

public class fD extends Ha<jf> {
   // $FF: synthetic field
   public final Gf f$d;

   // $FF: synthetic method
   public void f$E(jf var1) {
      String var2;
      if (var1.f$E() instanceof SPacketChat && Gf.f$B(this.f$d).f$a(Gf.f$E(this.f$d).f$E().floatValue() * 1000.0F) && (Boolean)Gf.f$e(this.f$d).f$E() && (var2 = ((SPacketChat)var1.f$E()).func_148915_c().func_150254_d()).contains(ke.f$E("Æ\u0019")) && var2.contains(hI.f$E("\u0016}^cEzSxE0\u0016")) && Gf.f$E(this.f$d).f$E(10000L)) {
         Gf.f$A().field_71439_g.func_71165_d((String)Gf.f$a(this.f$d).f$E());
         Gf.f$E(this.f$d).f$a();
      }

   }

   // $FF: synthetic method
   public fD(Gf var1) {
      this.f$d = var1;
   }
}
