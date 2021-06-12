package io.github.impactdevelopment.simpletweaker.argument;

import java.util.List;

public final class SingularArgument implements Argument {
   private final String value;

   SingularArgument(String value) {
      this.value = value;
   }

   public final void addToList(List<String> arguments) {
      arguments.add(this.value);
   }

   public final boolean conflicts(Argument argument) {
      return !(argument instanceof SingularArgument) ? false : ((SingularArgument)argument).value.equals(this.value);
   }
}
