package io.github.impactdevelopment.simpletweaker;

import io.github.impactdevelopment.simpletweaker.argument.Argument;
import io.github.impactdevelopment.simpletweaker.argument.Arguments;
import io.github.impactdevelopment.simpletweaker.transform.SimpleTransformer;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.launchwrapper.ITweaker;
import net.minecraft.launchwrapper.Launch;
import net.minecraft.launchwrapper.LaunchClassLoader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SimpleTweaker implements ITweaker {
   public static final Logger LOGGER = LogManager.getLogger("SimpleTweaker");
   private static boolean setupTransformer = false;
   private List<String> args;

   public void acceptOptions(List<String> args, File gameDir, File assetsDir, String profile) {
      (this.args = new ArrayList()).addAll(args);
      this.addArg("gameDir", gameDir);
      this.addArg("assetsDir", assetsDir);
      this.addArg("version", profile);
   }

   public void injectIntoClassLoader(LaunchClassLoader classLoader) {
      doInitialSetup(classLoader);
   }

   public String getLaunchTarget() {
      return "net.minecraft.client.main.Main";
   }

   public String[] getLaunchArguments() {
      List<Argument> parsed = Arguments.parse(this.args);
      List<Argument> existing = Arguments.parse((List)Launch.blackboard.get("ArgumentList"));
      parsed.removeIf((argument) -> {
         return existing.stream().anyMatch((a) -> {
            return a.conflicts(argument);
         });
      });
      return (String[])Arguments.join(parsed).toArray(new String[0]);
   }

   private void addArg(String label, File file) {
      if (file != null) {
         this.addArg(label, file.getAbsolutePath());
      }

   }

   private void addArg(String label, String value) {
      if (!this.args.contains("--" + label) && value != null) {
         this.args.add("--" + label);
         this.args.add(value);
      }

   }

   private static void doInitialSetup(LaunchClassLoader classLoader) {
      if (!setupTransformer) {
         classLoader.addClassLoaderExclusion("io.github.impactdevelopment.simpletweaker.");
         classLoader.registerTransformer(SimpleTransformer.class.getName());
         setupTransformer = true;
      }

   }
}
