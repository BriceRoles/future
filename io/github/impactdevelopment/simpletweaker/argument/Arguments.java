package io.github.impactdevelopment.simpletweaker.argument;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class Arguments {
   public static List<Argument> parse(List<String> args) {
      List<Argument> argsOut = new ArrayList();
      String classifier = null;
      Iterator var3 = args.iterator();

      while(var3.hasNext()) {
         String arg = (String)var3.next();
         if (arg.startsWith("-")) {
            if (classifier != null) {
               argsOut.add(new ClassifiedArgument(classifier, ""));
               classifier = null;
            } else if (arg.contains("=")) {
               argsOut.add(new ClassifiedArgument(arg.substring(0, arg.indexOf(61)), arg.substring(arg.indexOf(61) + 1)));
            } else {
               classifier = arg;
            }
         } else if (classifier != null) {
            argsOut.add(new ClassifiedArgument(classifier, arg));
            classifier = null;
         } else {
            argsOut.add(new SingularArgument(arg));
         }
      }

      return argsOut;
   }

   public static List<String> join(List<Argument> args) {
      List<String> argsOut = new ArrayList();
      args.forEach((argument) -> {
         argument.addToList(argsOut);
      });
      return argsOut;
   }
}
