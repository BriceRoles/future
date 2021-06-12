package net.futureclient.client;

import java.io.DataInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;

public enum qg {
   // $FF: synthetic field
   f$g;

   static {
      qg[] var10000 = new qg[1];
      boolean var10002 = true;
      var10000[0] = f$g;
   }

   // $FF: synthetic method
   public FH f$E() throws Exception {
      byte[] var1 = Dh.f$g.f$E(WI.f$E("j\u0001frj\u000bivm\u0000h\u0002\u001bugpku\u001d\u0001n\u0001m\u0000j\u000bkv\u001f\u0001m\u0005"));
      Path var10002 = cH.f$a();
      OpenOption[] var10003 = new OpenOption[0];
      boolean var10005 = true;
      DataInputStream var2 = new DataInputStream(Files.newInputStream(var10002, var10003));
      Object var3 = null;

      FH var16;
      try {
         try {
            byte[] var4 = this.f$E(var2);
            byte[] var5 = Oh.f$g.f$E(this.f$E(var2), var1, var4);
            byte[] var6 = Oh.f$g.f$E(this.f$E(var2), var1, var4);
            var16 = new FH(new String(var5, StandardCharsets.UTF_8), new String(var6, StandardCharsets.UTF_8));
         } catch (Throwable var13) {
            throw var13;
         }
      } catch (Throwable var15) {
         Throwable var10000;
         if (var2 != null) {
            if (var3 != null) {
               try {
                  var2.close();
               } catch (Throwable var14) {
                  var10000 = var15;
                  ((Throwable)var3).addSuppressed(var14);
                  throw var10000;
               }

               var10000 = var15;
               throw var10000;
            }

            var2.close();
         }

         var10000 = var15;
         throw var10000;
      }

      if (var2 != null) {
         if (var3 != null) {
            try {
               var2.close();
               return var16;
            } catch (Throwable var12) {
               ((Throwable)var3).addSuppressed(var12);
               return var16;
            }
         }

         var2.close();
      }

      return var16;
   }

   // $FF: synthetic method
   private byte[] f$E(DataInputStream var1) throws IOException {
      byte[] var10001 = new byte[var1.readInt()];
      boolean var10003 = true;
      byte[] var2 = var10001;
      var1.read(var10001);
      return var2;
   }
}
