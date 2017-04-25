package weatherchecker;

import java.io.IOException;
import joptsimple.OptionParser;
import joptsimple.OptionSet;

public class Controller {

  public void handleArgs(String[] args) {
    OptionParser parser = new OptionParser();

    parser.accepts("h");
    parser.accepts("c").withOptionalArg();
    OptionSet options = parser.parse(args);

    if (args.length == 0) {
      printUsage();
    } else if (options.has("h")) {
      printUsage();
    } else if (options.has("c") && options.hasArgument("c")) {
      try {
        GeolocationHandler location = new GeolocationHandler();
      } catch (IOException e) {
        System.out.println("Cannot load geolocation csv file");
        System.exit(0);
      }
    }
  }

  private void printUsage() {
    System.out.println();
    System.out.println("Usage: weatherchecker [option] [argument]");
    System.out.println("Example: weatherchecker -c HU");
    System.out.println("(Prints the current weather in Hungary)");
    System.out.println();
  }
}
