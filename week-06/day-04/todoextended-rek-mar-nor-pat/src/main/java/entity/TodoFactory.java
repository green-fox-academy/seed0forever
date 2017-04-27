package entity;

import java.time.ZonedDateTime;

public class TodoFactory {

  public static Todo createTodo(String[] todoStringArray) {
    int todoId = Integer.parseInt(todoStringArray[0]);
    ZonedDateTime createdAt = ZonedDateTime.parse(todoStringArray[1]);

    ZonedDateTime completedAt =
            (todoStringArray[2] == null || todoStringArray[2].isEmpty())
                    ? null
                    : ZonedDateTime.parse(todoStringArray[2]);

    String taskText = todoStringArray[3];

    Todo todo = new Todo(todoId, createdAt, completedAt, taskText);
    return todo;
  }
}
