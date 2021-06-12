package net.futureclient.loader.mixin.common.network.packet.serverbound;

import net.futureclient.client.D;
import net.minecraft.network.play.client.CPacketPlayer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({CPacketPlayer.class})
public abstract class MixinCPacketPlayer implements D {
   @Accessor
   public abstract void setX(double var1);

   @Accessor
   public abstract void setY(double var1);

   @Accessor
   public abstract void setZ(double var1);

   @Accessor
   public abstract void setYaw(float var1);

   @Accessor
   public abstract void setPitch(float var1);

   @Accessor
   public abstract void setOnGround(boolean var1);

   @Accessor
   public abstract void setMoving(boolean var1);

   @Accessor
   public abstract boolean isMoving();

   @Accessor
   public abstract void setRotating(boolean var1);

   @Accessor
   public abstract boolean isRotating();
}
