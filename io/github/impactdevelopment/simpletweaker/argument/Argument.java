package io.github.impactdevelopment.simpletweaker.argument;

import java.util.List;

public interface Argument {
   void addToList(List<String> var1);

   boolean conflicts(Argument var1);
}
