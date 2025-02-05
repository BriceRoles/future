package net.futureclient.loader.mixin.common.network.packet.serverbound;

import net.futureclient.client.L;
import net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock;
import net.minecraft.util.EnumFacing;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({CPacketPlayerTryUseItemOnBlock.class})
public abstract class MixinCPacketPlayerTryUseItemOnBlock implements L {
   @Accessor
   public abstract void setPlacedBlockDirection(EnumFacing var1);
}
