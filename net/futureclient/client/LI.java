package net.futureclient.client;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.futureclient.loader.injector.Injector;

public class LI {
   // $FF: synthetic field
   private byte[] f$d;

   // $FF: synthetic method
   private Key f$E() throws Exception {
      return new SecretKeySpec(this.f$d, r.f$E("NQ\\"));
   }

   // $FF: synthetic method
   public LI(String var1) {
      int var10000 = 0;
      super();
      byte[] var10002 = new byte[16];
      boolean var10004 = true;
      this.f$d = var10002;

      for(int var2 = 0; var10000 < 16; var10000 = var2) {
         try {
            this.f$d[var2] = var1.getBytes()[var2];
         } catch (Exception var4) {
         }

         ++var2;
      }

   }

   // $FF: synthetic method
   public static String f$E(String var0) {
      int var10000 = (3 ^ 5) << 4;
      int var10001 = (2 ^ 5) << 3 ^ 2;
      int var10002 = 3 << 3 ^ 1;
      int var10003 = (var0 = (String)var0).length();
      char[] var10004 = new char[var10003];
      boolean var10006 = true;
      int var5 = var10003 - 1;
      var10003 = var10002;
      int var3;
      var10002 = var3 = var5;
      char[] var1 = var10004;
      int var4 = var10003;
      var10000 = var10002;

      for(int var2 = var10001; var10000 >= 0; var10000 = var3) {
         var10001 = var3;
         char var6 = var0.charAt(var3);
         --var3;
         var1[var10001] = (char)(var6 ^ var2);
         if (var3 < 0) {
            break;
         }

         var10002 = var3--;
         var1[var10002] = (char)(var0.charAt(var10002) ^ var4);
      }

      return new String(var1);
   }

   // $FF: synthetic method
   public byte[] f$E(byte[] var1) throws Exception {
      Key var2 = this.f$E();
      Cipher var3 = Cipher.getInstance(Injector.f$E("\u0018+\n"));
      var3.init(2, var2);
      return var3.doFinal(var1);
   }

   // $FF: synthetic method
   public byte[] f$a(byte[] var1) throws Exception {
      Key var2 = this.f$E();
      Cipher var3 = Cipher.getInstance(r.f$E("NQ\\"));
      var3.init(1, var2);
      return var3.doFinal(var1);
   }
}
