package entity;

import java.time.Instant;

public class TodoFactory {

  public static Todo createTodo(String[] todoStringArray) {
    int todoId = Integer.parseInt(todoStringArray[0]);
    Instant createdAt = Instant.parse(todoStringArray[1]);

    Instant completedAt =
            (todoStringArray[2] == null || todoStringArray[2].isEmpty())
                    ? null : Instant.parse(todoStringArray[2]);

    String todoText = todoStringArray[3];

    Todo todo = new Todo(todoId, createdAt, completedAt, todoText);
    return todo;
  }
}
