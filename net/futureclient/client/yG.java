package net.futureclient.client;

import net.futureclient.loader.injector.Injector;

public class yG extends GA {
   // $FF: synthetic method
   public String f$E(String[] var1) {
      int var10000 = var1.length;
      boolean var10002 = true;
      boolean var10003 = true;
      boolean var10004 = true;
      boolean var10005 = true;
      if (var10000 == 1) {
         String[] var2 = var1[0];
         ma var3;
         if ((var3 = kH.f$E().f$E().f$E(var2)) == null) {
            return ni.f$E("u\u0011@\r\u0001\u0014N\u001dT\u0015DYE\u0016D\n\u0001\u0017N\r\u0001\u001cY\u0010R\r\u000f");
         } else if (!(var3 instanceof J)) {
            return Injector.f$E(":1\u000f-N4\u0001=\u001b5\u000by\u0007*N7\u0001-N-\u0001>\t5\u000b8\f5\u000bw");
         } else {
            String[] var4 = (Ba)var3;
            CE var5 = kH.f$E().f$E();
            String var10001 = ni.f$E("\\R-N\u001eF\u0015D");
            Object[] var8 = new Object[1];
            var10004 = true;
            var8[0] = var4.f$E();
            var5.f$E(String.format(var10001, var8)).f$E(0);
            String var6 = Injector.f$E("\f\u0000;\u0001,\u0000=N|\u001dw");
            Object[] var7 = new Object[1];
            var10003 = true;
            var7[0] = var4.f$E()[0];
            return String.format(var6, var7);
         }
      } else {
         return null;
      }
   }

   // $FF: synthetic method
   public yG() {
      String[] var10001 = new String[4];
      boolean var10003 = true;
      var10001[0] = ni.f$E(",O;H\u0017E");
      var10001[1] = Injector.f$E("<<\u00036\u0018<,0\u0000=");
      var10001[2] = ni.f$E("=D\u0015D\rD\u001bH\u0017E");
      var10001[3] = Injector.f$E("\u001d\u000b5\f0\u0000=");
      super(var10001);
   }

   // $FF: synthetic method
   public String f$E() {
      return ni.f$E("_D\"L\u0016E\fM\u001c|");
   }
}
