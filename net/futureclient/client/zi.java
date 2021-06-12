package net.futureclient.client;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.security.KeyStore;
import java.security.KeyStore.PasswordProtection;
import java.security.KeyStore.SecretKeyEntry;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

public enum zi {
   // $FF: synthetic field
   private static final Path f$g;
   // $FF: synthetic field
   private static final Path f$M;
   // $FF: synthetic field
   f$i;

   // $FF: synthetic method
   public FH f$E() throws Exception {
      return new FH(this.f$E(f$M, o.f$E("yn\u0007O{S\u001f< {\rM<c\rx,@{B\u007ff\f@\u0006F|3<P9\\>o\u007fy\u001b]\u001a}\nx~p\nD'8vN\u007f\\\u001d8\f=%H\"H"), z.f$E("\u007f\u001fK\u0019|\u001bVGI\u0005V\u0015|Df\u0004k\u0018 \u001aKO$NP\u0005\\0P\u0012w\u0006\"8G/U<R\u0003VEd\u0018a\u0003\u007f?$2g\u0007K\u001dW5V!$:")), this.f$E(f$g, o.f$E("\b\u007fvE\u001ac7:\u0002X\u000ei\u000b}6zyp\n{\u0000|*@8]\u001fH\nF\u007fk#<-lyG\u0002~\u001bl\u001cl-?\u001fB~f\u0017X\u001b<-}\u0004i-D"), z.f$E("hCE0cCI#]\u0017U\u001a{\u000e~G($|\u0015r\u0004V''<B\u000ea;v<t8r\u0005B\u0001('!\u0018X\u0000fFB4pFg<D/v2z\u001a'&")));
   }

   static {
      zi[] var10000 = new zi[1];
      boolean var10002 = true;
      var10000[0] = f$i;
      f$M = cH.f$E().resolve(z.f$E("\u0017d\u0002y)d\u0005t\u0004\u007f\u0017|\u0013N\u001dt\u000f"));
      f$g = cH.f$E().resolve(o.f$E("k:~'U?k<y8e=n\u0010a*s"));
   }

   // $FF: synthetic method
   private String f$E(Path var1, String var2, String var3) throws Exception {
      OpenOption[] var10001 = new OpenOption[0];
      boolean var10003 = true;
      InputStream var4 = Files.newInputStream(var1, var10001);
      Object var5 = null;

      try {
         try {
            KeyStore var20 = KeyStore.getInstance(o.f$E("@\fO\u0004Y"));
            var20.load((InputStream)null, var3.toCharArray());
            PasswordProtection var7 = new PasswordProtection(var3.toCharArray());
            var20.load(var4, var3.toCharArray());
            String var19 = SecretKeyFactory.getInstance(z.f$E("&S3"));
            String var17 = (SecretKeyEntry)var20.getEntry(var2, var7);
            String var18 = (PBEKeySpec)var19.getKeySpec(var17.getSecretKey(), PBEKeySpec.class);
            var2 = new String(var18.getPassword());
         } catch (Throwable var14) {
            throw var14;
         }
      } catch (Throwable var16) {
         Throwable var10000;
         if (var4 != null) {
            if (var5 != null) {
               try {
                  var4.close();
               } catch (Throwable var15) {
                  var10000 = var16;
                  ((Throwable)var5).addSuppressed(var15);
                  throw var10000;
               }

               var10000 = var16;
               throw var10000;
            }

            var4.close();
         }

         var10000 = var16;
         throw var10000;
      }

      if (var4 != null) {
         if (var5 != null) {
            try {
               var4.close();
               return var2;
            } catch (Throwable var13) {
               ((Throwable)var5).addSuppressed(var13);
               return var2;
            }
         }

         var4.close();
      }

      return var2;
   }

   // $FF: synthetic method
   public boolean f$E() {
      Path var10000 = f$M;
      LinkOption[] var10001 = new LinkOption[0];
      boolean var10003 = true;
      if (Files.exists(var10000, var10001)) {
         var10000 = f$g;
         var10001 = new LinkOption[0];
         var10003 = true;
         if (Files.exists(var10000, var10001)) {
            return true;
         }
      }

      return false;
   }
}
