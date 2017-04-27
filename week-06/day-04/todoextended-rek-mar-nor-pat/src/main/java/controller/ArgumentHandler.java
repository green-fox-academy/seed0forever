package controller;

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

    if (options.hasArgument("r")) {
      todoController.removeTodo(Long.parseLong(options.valueOf("r").toString()));
    }

    if (options.hasArgument("c")) {
      todoController.setTodoCompleted(Long.parseLong(options.valueOf("c").toString()));
    }

    if (options.hasArgument("u")) {
      String[] optionUArgument = options.valueOf("u").toString().split(" ");
      long todoId = Long.parseLong(optionUArgument[0]);
      String todoText = "";

      for (int i = 1; i < optionUArgument.length; i++) {
        todoText += optionUArgument[i] +
                ((i != optionUArgument.length - 1)
                        ? " " : "");
      }

      todoController.changeTodoText(todoId, todoText);
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
