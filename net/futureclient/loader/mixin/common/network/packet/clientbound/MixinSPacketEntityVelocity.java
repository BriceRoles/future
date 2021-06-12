package net.futureclient.loader.mixin.common.network.packet.clientbound;

import net.futureclient.client.G;
import net.minecraft.network.play.server.SPacketEntityVelocity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({SPacketEntityVelocity.class})
public abstract class MixinSPacketEntityVelocity implements G {
   @Accessor
   public abstract void setMotionX(int var1);

   @Accessor
   public abstract void setMotionY(int var1);

   @Accessor
   public abstract void setMotionZ(int var1);
}
