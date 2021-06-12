package io.github.impactdevelopment.simpletweaker.argument;

import java.util.List;

public final class ClassifiedArgument implements Argument {
   private final String classifier;
   private final String value;

   ClassifiedArgument(String classifier, String value) {
      this.classifier = classifier;
      this.value = value;
   }

   public final void addToList(List<String> arguments) {
      arguments.add(this.classifier);
      arguments.add(this.value);
   }

   public final boolean conflicts(Argument argument) {
      return !(argument instanceof ClassifiedArgument) ? false : ((ClassifiedArgument)argument).classifier.equals(this.classifier);
   }
}
