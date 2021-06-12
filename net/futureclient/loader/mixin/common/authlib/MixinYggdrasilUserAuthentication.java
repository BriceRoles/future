package net.futureclient.loader.mixin.common.authlib;

import com.mojang.authlib.yggdrasil.YggdrasilUserAuthentication;
import java.net.MalformedURLException;
import java.net.URL;
import net.futureclient.client.JG;
import net.futureclient.client.ki;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(
   value = {YggdrasilUserAuthentication.class},
   remap = false
)
public abstract class MixinYggdrasilUserAuthentication {
   @Shadow
   @Final
   private static URL ROUTE_AUTHENTICATE;
   @Shadow
   @Final
   private static URL ROUTE_REFRESH;
   @Shadow
   @Final
   private static URL ROUTE_VALIDATE;

   private URL f$E(URL var1) throws MalformedURLException {
      return JG.f$E().equals(ki.f$M) ? new URL("http://authserver.thealtening.com" + var1.getFile()) : var1;
   }

   @Redirect(
      method = {"logInWithPassword"},
      at = @At(
   value = "FIELD",
   target = "com/mojang/authlib/yggdrasil/YggdrasilUserAuthentication.ROUTE_AUTHENTICATE:Ljava/net/URL;"
)
   )
   private URL f$B() throws MalformedURLException {
      return this.f$E(ROUTE_AUTHENTICATE);
   }

   @Redirect(
      method = {"logInWithToken"},
      at = @At(
   value = "FIELD",
   target = "com/mojang/authlib/yggdrasil/YggdrasilUserAuthentication.ROUTE_REFRESH:Ljava/net/URL;"
)
   )
   private URL f$e() throws MalformedURLException {
      return this.f$E(ROUTE_REFRESH);
   }

   @Redirect(
      method = {"selectGameProfile"},
      at = @At(
   value = "FIELD",
   target = "com/mojang/authlib/yggdrasil/YggdrasilUserAuthentication.ROUTE_REFRESH:Ljava/net/URL;"
)
   )
   private URL f$a() throws MalformedURLException {
      return this.f$E(ROUTE_REFRESH);
   }

   @Redirect(
      method = {"checkTokenValidity"},
      at = @At(
   value = "FIELD",
   target = "com/mojang/authlib/yggdrasil/YggdrasilUserAuthentication.ROUTE_VALIDATE:Ljava/net/URL;"
)
   )
   private URL f$E() throws MalformedURLException {
      return this.f$E(ROUTE_VALIDATE);
   }
}
