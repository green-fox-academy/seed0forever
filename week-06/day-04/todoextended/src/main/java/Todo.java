import static java.time.temporal.ChronoUnit.MINUTES;

import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class Todo {

  private static int instanceCounter = 0;
  private int id;
  private String itemName;
  private ZonedDateTime createdAt, completedAt;

  public Todo(String itemName) {
    id = ++instanceCounter;
    createdAt = ZonedDateTime.now();
    this.itemName = itemName;
  }

  public boolean isCompleted() {
    boolean isCompleted;
    ZonedDateTime dateTimeNow = ZonedDateTime.now();

    if (completedAt == null) {
      isCompleted = false;
    } else if (completedAt.truncatedTo(MINUTES).isEqual(dateTimeNow.truncatedTo(MINUTES))
            || completedAt.truncatedTo(MINUTES).isBefore(dateTimeNow.truncatedTo(MINUTES))) {
      isCompleted = true;
    } else {
      isCompleted = false;
    }
    return isCompleted;
  }

  public ZonedDateTime getCompletedAt() {
    return completedAt;
  }

  /*
   * Project story requirement:
   * Have a complitionTime method that returns the time required to completed the to do in days
  */
  public int getDaysUntilCompleted() {
    int daysUntilCompleted = -1;
    ZonedDateTime dateTimeNow = ZonedDateTime.now();

    if (completedAt != null) {
      if (!isCompleted()) {
        daysUntilCompleted = (int) ChronoUnit.DAYS.between(dateTimeNow, completedAt);
      }
    }
    return daysUntilCompleted;
  }

  @Override
  public String toString() {
    return itemName;
  }
}
