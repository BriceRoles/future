package net.futureclient.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;

public class lH extends Ib {
   // $FF: synthetic field
   public final xI f$d;

   // $FF: synthetic method
   public void f$a(Object... var1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   public void f$E(Object... var1) {
      this.f$d.f$d.clear();

      try {
         if (!this.f$E().exists()) {
            this.f$E().createNewFile();
         }

         BufferedReader var2 = new BufferedReader(new FileReader(this.f$E()));
         this.f$d.f$E().clear();

         while(true) {
            String var3;
            while((var3 = var2.readLine()) != null) {
               String[] var4;
               switch((var4 = var3.split(Ci.f$E("["))).length) {
               case 1:
                  while(false) {
                  }

                  this.f$d.f$a(new ph(var3));
                  break;
               case 2:
                  this.f$d.f$a(new ph(var4[0], var4[1]));
                  break;
               case 3:
                  this.f$d.f$a(new ph(var4[0], var4[1], var4[2]));
               case 4:
               default:
                  break;
               case 5:
                  this.f$d.f$a(new ph(var4[0], var4[1], var4[2], var4[3], var4[4]));
               }
            }

            var2.close();
            return;
         }
      } catch (Exception var5) {
         var5.printStackTrace();
      }
   }

   // $FF: synthetic method
   public lH(xI var1, String var2) {
      super(var2);
      this.f$d = var1;
   }
}
