package net.futureclient.client;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public final class sh {
   // $FF: synthetic field
   private static final ThreadPoolExecutor f$d = (ThreadPoolExecutor)Executors.newFixedThreadPool(1);

   // $FF: synthetic method
   public static void f$E(Runnable var0) {
      f$d.execute(var0);
   }
}
