package net.futureclient.client;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Aj implements JsonDeserializer<Map<String, String>> {
   // $FF: synthetic method
   public Map<String, String> f$E(JsonElement var1, Type var2, JsonDeserializationContext var3) {
      Type var5 = new HashMap();
      Iterator var6 = var1.getAsJsonArray().iterator();

      while(var6.hasNext()) {
         Iterator var4;
         if ((var4 = ((JsonElement)var6.next()).getAsJsonObject().entrySet().iterator()).hasNext()) {
            Entry var7 = (Entry)var4.next();
            var5.put(var7.getKey(), ((JsonElement)var7.getValue()).getAsString());
         }
      }

      return var5;
   }

   // $FF: synthetic method
   public Aj(lH var1) {
      this();
   }

   // $FF: synthetic method
   private Aj() {
   }
}
