import java.util.ArrayList;
import java.util.List;

public class TodoList {

  private String outMessageEmpty;
  private List<Todo> todoListItems;

  public TodoList() {
    this(new ArrayList<>());
  }

  public TodoList(List<String> toDoLines) {
    outMessageEmpty = "No todo items for today! :)";
    todoListItems = new ArrayList<>();

    for (String line : toDoLines) {
      Todo todoItem = new Todo(line);
      todoListItems.add(todoItem);
    }
  }

  List<String> toListOfStrings() {
    List<String> listOfStrings = new ArrayList<>();
    for (Todo todo : todoListItems) {
      listOfStrings.add(todo.toString());
    }
    return listOfStrings;
  }

  public void printLines() {
    if (isEmpty()) {
      System.out.println(outMessageEmpty);
      return;
    }
    for (int i = 0; i < todoListItems.size(); i++) {
      System.out.println((todoListItems.get(i).getId() + 1) + " - " + todoListItems.get(i).toString());
    }
  }

  public boolean isEmpty() {
    return todoListItems.size() == 0;
  }

  public void add(String item) {
    Todo todoItem = new Todo(item);
    todoListItems.add(todoItem);
  }

  public void remove(int itemIndex) {
    if (todoListItems.size() <= itemIndex + 1) {
      todoListItems.remove(itemIndex);
    }
  }
}
