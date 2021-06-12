package net.futureclient.loader.mixin.common.network;

import com.mojang.authlib.GameProfile;
import java.util.UUID;
import net.futureclient.client.AD;
import net.futureclient.client.OD;
import net.futureclient.client.RF;
import net.futureclient.client.VH;
import net.futureclient.client.kH;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.client.network.NetworkPlayerInfo;
import net.minecraft.util.text.ITextComponent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({NetHandlerPlayClient.class})
public abstract class MixinNetHandlerPlayClient {
   @Redirect(
      method = {"handleSpawnPlayer"},
      at = @At(
   value = "INVOKE",
   target = "net/minecraft/client/network/NetHandlerPlayClient.getPlayerInfo(Ljava/util/UUID;)Lnet/minecraft/client/network/NetworkPlayerInfo;"
)
   )
   private NetworkPlayerInfo f$E(NetHandlerPlayClient var1, UUID var2) {
      NetworkPlayerInfo var3 = var1.func_175102_a(var2);
      AD var4 = (AD)kH.f$E().f$E().f$E(AD.class);
      if (var4 != null && var4.f$E() && var3 == null) {
         var3 = new NetworkPlayerInfo(new GameProfile(var2, VH.f$B(var2)));
      }

      return var3;
   }

   @Inject(
      method = {"onDisconnect"},
      at = {@At("HEAD")}
   )
   private void f$E(ITextComponent var1, CallbackInfo var2) {
      kH.f$E().f$E().f$E((RF)(new OD(var1.func_150260_c())));
   }
}
