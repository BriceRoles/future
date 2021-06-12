package net.futureclient.loader.mixin.common.network;

import io.netty.channel.ChannelHandlerContext;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import net.futureclient.client.Ke;
import net.futureclient.client.RF;
import net.futureclient.client.Ye;
import net.futureclient.client.ce;
import net.futureclient.client.jf;
import net.futureclient.client.kH;
import net.futureclient.client.ve;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({NetworkManager.class})
public abstract class MixinNetworkManager {
   @Inject(
      method = {"channelRead0"},
      at = {@At(
   value = "INVOKE",
   target = "net/minecraft/network/Packet.processPacket(Lnet/minecraft/network/INetHandler;)V"
)},
      cancellable = true
   )
   private void f$a(ChannelHandlerContext var1, Packet<?> var2, CallbackInfo var3) {
      Ye var4 = new jf(var2);
      kH.f$E().f$E().f$E((RF)var4);
      if (var4.f$E()) {
         var3.cancel();
      }

   }

   @Inject(
      method = {"channelRead0"},
      at = {@At("RETURN")}
   )
   private void f$E(ChannelHandlerContext var1, Packet<?> var2, CallbackInfo var3) {
      if (var1.channel().isOpen()) {
         Ye var4 = new ce(var2);
         kH.f$E().f$E().f$E((RF)var4);
      }

   }

   @Inject(
      method = {"dispatchPacket"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void f$a(Packet<?> var1, GenericFutureListener<? extends Future<? super Void>>[] var2, CallbackInfo var3) {
      Ye var4 = new ve(var1);
      kH.f$E().f$E().f$E((RF)var4);
      if (var4.f$E()) {
         var3.cancel();
      }

   }

   @Inject(
      method = {"dispatchPacket"},
      at = {@At("RETURN")}
   )
   private void f$E(Packet<?> var1, GenericFutureListener<? extends Future<? super Void>>[] var2, CallbackInfo var3) {
      Ye var4 = new Ke(var1);
      kH.f$E().f$E().f$E((RF)var4);
   }
}
