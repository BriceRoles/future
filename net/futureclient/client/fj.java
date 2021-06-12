package net.futureclient.client;

import baritone.api.Settings.Setting;

public class fj<T> extends z<T> {
   // $FF: synthetic field
   private final Setting<T> f$d;

   // $FF: synthetic method
   public void f$E(T var1) {
      this.f$d.value = var1;
   }

   // $FF: synthetic method
   public T f$E() {
      return this.f$d.value;
   }

   // $FF: synthetic method
   public fj(Setting<T> var1, String... var2) {
      super((Object)null, var2);
      this.f$d = var1;
   }
}
