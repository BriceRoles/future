package net.futureclient.client;

import java.util.StringJoiner;

public class Zf extends GA {
   // $FF: synthetic field
   public final AD f$d;

   // $FF: synthetic method
   public Zf(AD var1, String[] var2) {
      super(var2);
      this.f$d = var1;
   }

   // $FF: synthetic method
   public String f$E(String[] var1) {
      if (this.f$d.f$E()) {
         if (AD.f$E(this.f$d).size() > 0) {
            StringJoiner var2 = new StringJoiner(Ci.f$E("\u007fA"));
            AD.f$E(this.f$d).forEach((var1x) -> {
               var2.add(VH.f$B(var1x));
            });
            String var10000 = wH.f$E("7>\u000f6\u00127\u0004;A*\u0012:\u0013,[\u007fD,O");
            Object[] var10001 = new Object[1];
            boolean var10003 = true;
            var10001[0] = var2.toString();
            return String.format(var10000, var10001);
         } else {
            return Ci.f$E("\u0007\t6\u00136A2\u00136A=\u000es\u00172\u000f:\u0012;\u00047A&\u00126\u0013 O");
         }
      } else {
         return wH.f$E("\u001e\u000f+\b\t\u00001\b,\t\u007f\b,A1\u000e+A:\u000f>\u00033\u0004;O");
      }
   }

   // $FF: synthetic method
   public String f$E() {
      return null;
   }
}
