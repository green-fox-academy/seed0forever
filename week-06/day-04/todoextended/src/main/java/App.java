import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

  private static final List<String> USAGE_MSG = Arrays.asList(
          "Java Todo application",
          "=======================",
          "",
          "Command line arguments:",
          "-l   Lists all the tasks",
          "-a   Adds a new task",
          "-r   Removes an task",
          "-c   Completes an task");
  private static final String TODO_STORAGE_FILE = "todo.txt";
  private static TodoList runtimeTodoList;

  public static void main(String[] args) {
    ArgumentContainer arguments = new ArgumentContainer(args);
    runtimeTodoList = loadToDoList();

    if (arguments.isVoid()) {
      printUsage();
      System.exit(0);
    }

    if (arguments.hasDashArg("l")) {
      runtimeTodoList.printLines();
    } else if (arguments.hasDashArg("a")) {
      String newToDoItem = arguments.getStringOfDashArg("a");
      runtimeTodoList.add(newToDoItem);
      runtimeTodoList.printLines();
      saveToDoList();
    } else if (arguments.hasDashArg("r")) {
      int itemIndex = -1 + arguments.getIntOfDashArg("r");
      runtimeTodoList.remove(itemIndex);
      saveToDoList();
    } else {
      System.out.println(Arrays.asList(arguments.getArgs()));
    }
  }

  private static TodoList loadToDoList() {
    List<String> loadedToDoFile = readFile(TODO_STORAGE_FILE);
    return new TodoList(loadedToDoFile);
  }

  private static void saveToDoList() {
    writeFile(TODO_STORAGE_FILE, runtimeTodoList.toListOfStrings());
  }

  private static void printUsage() {
    printListLines(USAGE_MSG);
  }

  private static void printListLines(List<String> readFileLines) {
    for (String line : readFileLines) {
      System.out.println(line);
    }
  }

  private static List<String> readFile(String filePath) {
    try {
      Path file = Paths.get(filePath);
      List<String> lines = Files.readAllLines(file);
      return lines;
    } catch (IOException e) {
      System.out.println("Could not read '" + filePath + "' file.");
      System.out.println("Creating empty todo list.");
      List<String> empty = new ArrayList<>();
      return empty;
    }
  }

  private static void writeFile(String filePath, List<String> lines) {
    try {
      Path file = Paths.get(filePath);
      Files.write(file, lines);
    } catch (IOException e) {
      System.out.println("Could not write '" + filePath + "' file.");
    }
  }

}
