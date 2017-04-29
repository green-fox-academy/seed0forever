package datasource;

import entity.Todo;
import entity.TodoFactory;
import java.util.ArrayList;
import java.util.List;

public class TodoDataAccessObject implements DataAccessObject<Todo> {

  private final FileHandler fileHandler;

  public TodoDataAccessObject(String filePath) {
    this.fileHandler = new LocalFileHandler(filePath);
  }

  @Override
  public void saveAll(List<Todo> entities) {
    List<String> entitiesLines = new ArrayList<>();
    for (Todo todo : entities) {
      entitiesLines.add(todo.toDataFormat());
    }
    fileHandler.writeDataToFile(entitiesLines);
  }

  @Override
  public List<Todo> loadAll() {
    List<Todo> todoEntities = new ArrayList<>();
    List<String> loadedTodoLines = fileHandler.readDataFromFile();

    for (String todoLine : loadedTodoLines) {
      String[] todoData = todoLine.split(";");
      todoEntities.add(TodoFactory.createTodo(todoData));
    }

    return todoEntities;
  }
}
