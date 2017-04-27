package weatherchecker;

import joptsimple.OptionParser;
import joptsimple.OptionSet;
import weatherchecker.controller.Controller;

public class ArgumentHandler {

  public void handleArguments(String[] args) {
    Controller controller = new Controller();
    OptionSet options = getOptionSetFromParser(args);

    if (args.length == 0) {
      controller.printUsage();

    } else if (options.has("h")) {
      controller.printUsage();

    } else if (options.has("c") && options.hasArgument("c")
            && options.has("compare") && options.hasArgument("compare")) {

      String countryCode1 = options.valueOf("c").toString();
      String countryCode2 = options.valueOf("compare").toString();

      controller.compareTemperatureAt(countryCode1, countryCode2);

    } else if (options.has("c") && options.hasArgument("c")) {

      String countryCode = options.valueOf("c").toString();
      controller.printWeatherAt(countryCode);
    }
  }

  private OptionSet getOptionSetFromParser(String[] args) {
    OptionParser parser = new OptionParser();
    parser.accepts("h");
    parser.accepts("c").withOptionalArg();
    parser.accepts("compare").withOptionalArg();
    return parser.parse(args);
  }
}
