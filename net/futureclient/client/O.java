package net.futureclient.client;

import java.util.ArrayList;
import java.util.List;

public abstract class O<T> extends z<List<T>> {
   // $FF: synthetic method
   public O(String[] var1, Ja var2) {
      this(var1);
   }

   // $FF: synthetic method
   private O(String... var1) {
      this((List)(new ArrayList()), (String[])var1);
   }

   // $FF: synthetic method
   public O(List var1, String[] var2, Ja var3) {
      this(var1, var2);
   }

   // $FF: synthetic method
   private O(List<T> var1, String... var2) {
      super(var1, var2);
   }
}
