package entity;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Todo implements Entity {

  private final static DateTimeFormatter TODO_DATETIME_FORMAT = DateTimeFormatter
          .ofLocalizedDateTime(FormatStyle.MEDIUM).withLocale(Locale.getDefault());
  private final long todoId;
  private final Instant createdAt;
  private final Instant completedAt;
  private final String todoText;

  public Todo(int todoId, Instant createdAt, Instant completedAt,
          String todoText) {
    this.todoId = todoId;
    this.createdAt = createdAt.truncatedTo(ChronoUnit.SECONDS);
    this.completedAt = (completedAt == null)
            ? null
            : completedAt.truncatedTo(ChronoUnit.SECONDS);
    this.todoText = todoText;
  }

  public long getTodoId() {
    return todoId;
  }

  public boolean isCompleted() {
    return (completedAt == null || completedAt.isAfter(Instant.now()))
            ? false : true;
  }

  public Instant getCreatedAt() {
    return createdAt;
  }

  public Instant getCompletedAt() {
    return completedAt;
  }

  public String getTodoText() {
    return todoText;
  }

  @Override
  public String toString() {
    return "#" + todoId +
            (isCompleted()
                    ? " [X]"
                    : " [ ]") +
            ", created: " + LocalDateTime.ofInstant(createdAt, ZoneId.systemDefault())
            .format(TODO_DATETIME_FORMAT) +
            ", task: " + todoText +
            (isCompleted()
                    ? ", completed: " + LocalDateTime.ofInstant(completedAt, ZoneId.systemDefault())
                    .format(TODO_DATETIME_FORMAT)
                    : "");
  }

  @Override
  public String toDataFormat() {
    String createdAt = this.createdAt.toString();
    String completedAt = (this.completedAt == null)
            ? "" : this.completedAt.toString();

    return String.format("%s;%s;%s;%s", todoId, createdAt, completedAt, todoText);
  }
}

