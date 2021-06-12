package net.futureclient.client;

import java.util.ArrayList;
import java.util.Iterator;

public class lf extends QE<lg> {
   // $FF: synthetic method
   public boolean f$E(int var1) {
      Iterator var2 = this.f$d.iterator();

      lg var3;
      do {
         if (!var2.hasNext()) {
            return false;
         }

         var3 = (lg)var2.next();
      } while(var1 != var3.f$E());

      return true;
   }

   // $FF: synthetic method
   public void f$E(int var1) {
      lg var2;
      if ((var2 = this.f$E(var1)) != null) {
         this.f$d.remove(var2);
      }

   }

   // $FF: synthetic method
   public lf() {
      this.f$d = new ArrayList();
      kH.f$E().f$E().f$a(new BD(this));
      new nf(this, PI.f$E("OUAFMG\f@Z@"));
   }

   // $FF: synthetic method
   public lg f$E(int var1) {
      Iterator var2 = this.f$d.iterator();

      lg var3;
      do {
         if (!var2.hasNext()) {
            return null;
         }

         var3 = (lg)var2.next();
      } while(var1 != var3.f$E());

      return var3;
   }
}
