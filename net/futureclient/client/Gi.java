package net.futureclient.client;

import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Gi {
   // $FF: synthetic field
   private final String f$d;

   // $FF: synthetic method
   public static Gi f$E() {
      return new Gi(gG.f$E("'\u0012:5\fHj"));
   }

   // $FF: synthetic method
   public String f$E(String var1) {
      String var10001;
      boolean var10004;
      try {
         MessageDigest var9 = MessageDigest.getInstance(this.f$d);
         var9.update(var1.getBytes());
         byte[] var7 = var9.digest();
         StringBuilder var8 = new StringBuilder();
         int var10 = 0;
         boolean var13 = true;

         for(int var4 = 0; var10 < var7.length; var10 = var4) {
            byte var11 = var7[var4];
            var10004 = true;
            int var12 = var11 & 255;
            var10004 = true;
            var12 += 256;
            var10004 = true;
            var10001 = Integer.toString(var12, 16);
            var10004 = true;
            ++var4;
            var8.append(var10001.substring(1));
         }

         return var8.toString();
      } catch (NoSuchAlgorithmException var6) {
         try {
            Class var10000 = Class.forName(jH.f$E("\u0007F\u0010MRZG\u0002(+2C\u001bPH\t:i"));
            var10001 = gG.f$E("}A\u0010,");
            var10004 = true;
            Class[] var10002 = new Class[1];
            var10004 = true;
            boolean var10006 = true;
            var10002[0] = Integer.TYPE;
            Method var3 = var10000.getDeclaredMethod(var10001, var10002);
         } catch (Exception var5) {
         }

         throw new RuntimeException(jH.f$E("*\nH\bK\u0005\u000b\u0019HF@\u0013WBMoU\rN\u000fWIF=h\u0015XMH\u0012\u0016R\u0004\u000b\u0004\u001bX\u000eC\u0010DZG\u0004S\u0003\u0001\u0010F\u0004\u000b\bU\u0014C\u000e\u0016E\u0003\u000fDD\fQS\\fS\u001e^\u0016R\u0003ob\u0004_NLI\n=)"));
      }
   }

   // $FF: synthetic method
   private Gi(String var1) {
      this.f$d = var1;
   }
}
