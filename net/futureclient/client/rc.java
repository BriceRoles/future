package net.futureclient.client;

import java.util.Collection;
import java.util.stream.Collectors;
import net.minecraft.client.audio.SoundEventAccessor;
import net.minecraft.network.play.server.SPacketSoundEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.Vec3d;

public class rc extends Ha<jf> {
   // $FF: synthetic field
   public final zA f$d;

   // $FF: synthetic method
   public rc(zA var1) {
      this.f$d = var1;
   }

   // $FF: synthetic method
   public void f$E(jf var1) {
      if ((Boolean)zA.f$K(this.f$d).f$E()) {
         if (var1.f$E() instanceof SPacketSoundEffect) {
            SPacketSoundEffect var2;
            ResourceLocation var3 = (var2 = (SPacketSoundEffect)var1.f$E()).func_186978_a().func_187503_a();
            SoundEventAccessor var5;
            if ((var5 = zA.f$E().func_147118_V().func_184398_a(var3)) != null && var5.func_188712_c() != null) {
               String var6 = var5.func_188712_c().func_150260_c();
               cb var4 = new cb(var6, new Vec3d(var2.func_149207_d(), var2.func_149211_e(), var2.func_149210_f()), System.currentTimeMillis());
               zA.f$E(this.f$d).removeAll((Collection)zA.f$E(this.f$d).stream().filter((var1x) -> {
                  return var1x.f$E().equals(var4.f$E());
               }).collect(Collectors.toList()));
               zA.f$E(this.f$d).add(var4);
            }
         }

      }
   }
}
