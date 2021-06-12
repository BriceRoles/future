package net.futureclient.loader.mixin.common.network.packet.clientbound;

import net.futureclient.client.e;
import net.minecraft.network.play.server.SPacketExplosion;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({SPacketExplosion.class})
public abstract class MixinSPacketExplosion implements e {
   @Accessor
   public abstract void setMotionX(float var1);

   @Accessor
   public abstract void setMotionY(float var1);

   @Accessor
   public abstract void setMotionZ(float var1);
}
