package net.futureclient.loader.mixin.common.network.packet.serverbound;

import net.futureclient.client.l;
import net.minecraft.network.play.client.CPacketCloseWindow;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({CPacketCloseWindow.class})
public abstract class MixinCPacketCloseWindow implements l {
   @Accessor
   public abstract int getWindowId();
}
