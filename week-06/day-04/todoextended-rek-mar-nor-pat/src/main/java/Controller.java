import joptsimple.OptionParser;
import joptsimple.OptionSet;

public class Controller {

  void executeCommands(String[] args) {

    OptionSet options = parseArguments(args);
    OperationHandler todoList = new OperationHandler();

    if (!options.hasOptions()) {
      System.out.println("Usage: todo -<option> [argument]");
      return;
    }

    if (options.has("l")) {
      todoList.listTasks();
    }

    if (options.hasArgument("a")) {
      todoList.addTask(options.valueOf("a").toString());
    }

    if (options.hasArgument("r")) {
      todoList.removeTask(options.valueOf("r").toString());
    }

    if (options.hasArgument("c")) {
      todoList.checkTask(options.valueOf("c").toString());
    }

    if (options.hasArgument("u")) {
      todoList.updateTask(options.valueOf("u").toString());
    }
  }

  private OptionSet parseArguments(String[] args) {
    OptionParser parser = new OptionParser();

    parser.accepts("l");
    parser.accepts("a").withOptionalArg();
    parser.accepts("r").withOptionalArg();
    parser.accepts("c").withOptionalArg();
    parser.accepts("u").withOptionalArg();

    return parser.parse(args);
  }
}
