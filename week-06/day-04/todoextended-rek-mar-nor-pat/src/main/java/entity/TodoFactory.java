package entity;

import entity.Todo;
import java.time.ZonedDateTime;
import org.apache.commons.lang3.StringUtils;

public class TodoFactory {

  public static Todo createTodo(String[] todoStringArray) {
    int todoId = Integer.parseInt(todoStringArray[0]);
    ZonedDateTime createdAt = ZonedDateTime.parse(todoStringArray[1]);
    ZonedDateTime completedAt =
            StringUtils.isEmpty(todoStringArray[2])
                    ? null
                    : ZonedDateTime.parse(todoStringArray[2]);
    String taskText = todoStringArray[3];

    Todo todo = new Todo(todoId, createdAt, completedAt, taskText);
    return todo;
  }
}
