import joptsimple.OptionParser;
import joptsimple.OptionSet;

public class AppMain {

  public static void main(String[] args) {
    Controller controller = new Controller();
    controller.executeCommands(args);
  }
}
