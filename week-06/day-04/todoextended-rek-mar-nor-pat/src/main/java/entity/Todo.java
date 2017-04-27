package entity;

import java.time.ZonedDateTime;

public class Todo implements Entity {

  private final long todoId;
  private final ZonedDateTime createdAt;
  private final ZonedDateTime completedAt;
  private final String todoText;

  public Todo(int todoId, ZonedDateTime createdAt, ZonedDateTime completedAt,
          String todoText) {
    this.todoId = todoId;
    this.createdAt = createdAt;
    this.completedAt = completedAt;
    this.todoText = todoText;
  }

  public long getTodoId() {
    return todoId;
  }

  public ZonedDateTime getCreatedAt() {
    return createdAt;
  }

  public ZonedDateTime getCompletedAt() {
    return completedAt;
  }

  public String getTodoText() {
    return todoText;
  }

  @Override
  public String toString() {
    return "#" + todoId +
            ", createdAt=" + createdAt +
            ", completedAt=" + completedAt +
            ", taskText='" + todoText + '\'';
  }

  @Override
  public String toDataFormat() {
    String completedAt = (this.completedAt == null)
            ? ""
            : this.completedAt.toInstant().toString();
    return String.format("%s;%s;%s;%s", todoId, createdAt.toInstant().toString(),
            completedAt, todoText);
  }
}

