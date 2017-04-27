package controller;

import controller.TodoController;
import datasource.TodoDataAccessObject;
import entity.Todo;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import joptsimple.OptionParser;
import joptsimple.OptionSet;

public class ArgumentHandler {

  public void handleArguments(String[] args) {

    OptionSet options = parseArguments(args);
    TodoController todoController = new TodoController();

    if (args == null || args.length == 0) {
      todoController.printUsageInfo();
      return;
    }

    if (options.has("l")) {
      todoController.listAllTodos();
    }

    if (options.hasArgument("a")) {
      todoController.addTodo(options.valueOf("a").toString());
    }

    // if (options.hasArgument("r")) {
    //   todoList.removeTask(options.valueOf("r").toString());
    // }
    //
    // if (options.hasArgument("c")) {
    //   todoList.checkTask(options.valueOf("c").toString());
    // }
    //
    // if (options.hasArgument("u")) {
    //   todoList.updateTask(options.valueOf("u").toString());
    // }
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
