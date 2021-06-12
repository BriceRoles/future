package net.futureclient.client;

public class s extends z<Number> {
   // $FF: synthetic field
   public Number f$g;
   // $FF: synthetic field
   public Number f$M;
   // $FF: synthetic field
   public Number f$i;
   // $FF: synthetic field
   private boolean f$d;

   // $FF: synthetic method
   public Number f$E() {
      return (Number)super.f$E();
   }

   // $FF: synthetic method
   public Number f$a() {
      return this.f$g;
   }

   // $FF: synthetic method
   public Number f$e() {
      return this.f$i;
   }

   // $FF: synthetic method
   public s(Number var1, Number var2, Number var3, Number var4, String... var5) {
      super(var1, var5);
      this.f$d = true;
      this.f$i = var2;
      this.f$M = var3;
      this.f$g = var4;
   }

   // $FF: synthetic method
   public s(Number var1, Number var2, Number var3, String... var4) {
      super(var1, var4);
      this.f$d = false;
      this.f$i = var2;
      this.f$M = var3;
      this.f$g = 0.1D;
   }

   // $FF: synthetic method
   public void f$E(Number var1) {
      s var10000;
      label65: {
         if (this.f$d) {
            if (var1 instanceof Integer) {
               if (var1.intValue() > this.f$M.intValue()) {
                  var10000 = this;
                  var1 = this.f$M;
                  break label65;
               }

               if (var1.intValue() < this.f$i.intValue()) {
                  var10000 = this;
                  var1 = this.f$i;
                  break label65;
               }
            } else if (var1 instanceof Float) {
               if (var1.floatValue() > this.f$M.floatValue()) {
                  var10000 = this;
                  var1 = this.f$M;
                  break label65;
               }

               if (var1.floatValue() < this.f$i.floatValue()) {
                  var10000 = this;
                  var1 = this.f$i;
                  break label65;
               }
            } else if (var1 instanceof Double) {
               if (var1.doubleValue() > this.f$M.doubleValue()) {
                  var10000 = this;
                  var1 = this.f$M;
                  break label65;
               }

               if (var1.doubleValue() < this.f$i.doubleValue()) {
                  var10000 = this;
                  var1 = this.f$i;
                  break label65;
               }
            } else if (var1 instanceof Long) {
               if (var1.longValue() > this.f$M.longValue()) {
                  var10000 = this;
                  var1 = this.f$M;
                  break label65;
               }

               if (var1.longValue() < this.f$i.longValue()) {
                  var10000 = this;
                  var1 = this.f$i;
                  break label65;
               }
            } else if (var1 instanceof Short) {
               if (var1.shortValue() > this.f$M.shortValue()) {
                  var10000 = this;
                  var1 = this.f$M;
                  break label65;
               }

               if (var1.shortValue() < this.f$i.shortValue()) {
                  var10000 = this;
                  var1 = this.f$i;
                  break label65;
               }
            } else if (var1 instanceof Byte) {
               if (var1.byteValue() > this.f$M.byteValue()) {
                  var10000 = this;
                  var1 = this.f$M;
                  break label65;
               }

               if (var1.byteValue() < this.f$i.byteValue()) {
                  var1 = this.f$i;
               }
            }
         }

         var10000 = this;
      }

      var10000.f$E((Object)var1);
   }

   // $FF: synthetic method
   public Number f$B() {
      return this.f$M;
   }
}
