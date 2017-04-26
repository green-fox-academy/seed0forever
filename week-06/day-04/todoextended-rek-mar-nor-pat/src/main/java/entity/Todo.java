package entity;

import java.time.ZonedDateTime;

public class Todo implements Entity {

  private final int todoID;
  private final ZonedDateTime createdAt;
  private final ZonedDateTime completedAt;
  private final String taskText;

  public Todo(int todoID, ZonedDateTime createdAt, ZonedDateTime completedAt,
          String taskText) {
    this.todoID = todoID;
    this.createdAt = createdAt;
    this.completedAt = completedAt;
    this.taskText = taskText;
  }

  public int getTodoID() {
    return todoID;
  }

  public ZonedDateTime getCreatedAt() {
    return createdAt;
  }

  public ZonedDateTime getCompletedAt() {
    return completedAt;
  }

  public String getTaskText() {
    return taskText;
  }

  @Override
  public String toString() {
    return "Todo{" +
            "todoID=" + todoID +
            ", createdAt=" + createdAt +
            ", completedAt=" + completedAt +
            ", taskText='" + taskText + '\'' +
            '}';
  }

  @Override
  public String toDataFormat() {
    String completedAt = (this.completedAt == null)
            ? ""
            : this.completedAt.toInstant().toString();
    return String.format("%s;%s;%s;%s", todoID, createdAt.toInstant().toString(),
            completedAt, taskText);
  }
}

