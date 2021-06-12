package net.futureclient.client;

import java.util.StringJoiner;
import net.futureclient.loader.injector.Injector;

public final class RH extends GA {
   // $FF: synthetic method
   public String f$E() {
      return ZH.f$E("\u0004oykFn^nGf^fKyVW\u0002QLkOo\u007f");
   }

   // $FF: synthetic method
   public String f$E(String[] var1) {
      String var10000;
      Object[] var10001;
      boolean var10003;
      String var5;
      if (var1.length == 3 && var1[0].equalsIgnoreCase(ZH.f$E("CnF"))) {
         var5 = var1[1];
         String var6 = var1[2];
         if (kH.f$E().f$E().f$E(var5)) {
            return Injector.f$E(":1\u000f-N,\u001d<\u001cy\u0007*N8\u0002+\u000b8\n N8N?\u001c0\u000b7\nw");
         } else {
            kH.f$E().f$E().f$a(new eg(var5, var6));
            var10000 = ZH.f$E("cnFoF*DxKoLn\u0002}K~J*CfKkQ*\u0007y\f");
            var10001 = new Object[1];
            var10003 = true;
            var10001[0] = var6;
            return String.format(var10000, var10001);
         }
      } else {
         if (var1.length == 2) {
            if (var1[0].equalsIgnoreCase(Injector.f$E("8\n="))) {
               var5 = var1[1];
               if (kH.f$E().f$E().f$E(var5)) {
                  return ZH.f$E("^JkV*WyGx\u0002cQ*CfPoCn[*C*DxKoLn\f");
               }

               kH.f$E().f$E().f$a(new eg(var5, var5));
               var10000 = Injector.f$E("\u0018\n=\u000b=N?\u001c0\u000b7\ny\u00190\u001a1N8\u00020\u000f*N|\u001dw");
               var10001 = new Object[1];
               var10003 = true;
               var10001[0] = var5;
               return String.format(var10000, var10001);
            }

            if (var1[0].equalsIgnoreCase(ZH.f$E("FoN")) || var1[0].equalsIgnoreCase(Injector.f$E("\u001c<\u00036\u0018<")) || var1[0].equalsIgnoreCase(ZH.f$E("PoO"))) {
               var5 = var1[1];
               if (!kH.f$E().f$E().f$E(var5)) {
                  return Injector.f$E(":1\u000f-N,\u001d<\u001cy\u0007*N7\u0001-N8N?\u001c0\u000b7\nw");
               }

               eg var3;
               String var4 = (var3 = kH.f$E().f$E().f$E(var5)).f$a();
               kH.f$E().f$E().f$E((Object)var3);
               var10000 = ZH.f$E("poOeToF*DxKoLn\u0002}K~J*CfKkQ*\u0007y\f");
               var10001 = new Object[1];
               var10003 = true;
               var10001[0] = var4;
               return String.format(var10000, var10001);
            }
         }

         if (var1.length == 1 && var1[0].equalsIgnoreCase(Injector.f$E("\u00020\u001d-"))) {
            StringJoiner var2 = new StringJoiner(ZH.f$E("&\u0002"));
            kH.f$E().f$E().f$E().forEach((var1x) -> {
               var2.add(var1x.f$E());
            });
            var10000 = Injector.f$E("\u001f\u001c0\u000b7\n*NqK*GcN|\u001dw");
            var10001 = new Object[2];
            var10003 = true;
            var10001[0] = kH.f$E().f$E().f$E().size();
            var10001[1] = var2.toString();
            return String.format(var10000, var10001);
         } else {
            return null;
         }
      }
   }

   // $FF: synthetic method
   public RH() {
      String[] var10001 = new String[4];
      boolean var10003 = true;
      var10001[0] = ZH.f$E("LPcGdF");
      var10001[1] = Injector.f$E("\u001f\u001c0\u000b7\n\u0018\n=");
      var10001[2] = ZH.f$E("dxKoLnQ");
      var10001[3] = Injector.f$E("\u001f\u001c<\u0000=");
      super(var10001);
   }
}
