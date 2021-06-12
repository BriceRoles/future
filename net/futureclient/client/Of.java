package net.futureclient.client;

import net.minecraft.network.play.server.SPacketChat;

public class Of extends Ha<jf> {
   // $FF: synthetic field
   public final kD f$d;

   // $FF: synthetic method
   public Of(kD var1) {
      this.f$d = var1;
   }

   // $FF: synthetic method
   public void f$E(jf var1) {
      String var2;
      if (var1.f$E() instanceof SPacketChat && (var2 = ((SPacketChat)var1.f$E()).func_148915_c().func_150260_c()).contains(ph.f$E("v\u001am[l\u001eo\u000e{\bj\u001ez[j\u0014>\u000f{\u0017{\u000bq\tj[j\u0014>\u0002q\u000e0")) && (eg)kH.f$E().f$E().f$E().stream().filter((var1x) -> {
         return var2.contains(var1x.f$E());
      }).findFirst().orElse((Object)null) != null && kD.f$E(this.f$d).f$E((long)(kD.f$E(this.f$d).f$E().floatValue() * 1000.0F))) {
         kD.f$E().field_71439_g.func_71165_d(o.f$E("%;z.i,o?~"));
      }

   }
}
