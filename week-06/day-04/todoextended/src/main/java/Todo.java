public class Todo {

  private String itemName;
  private boolean completed;

  public Todo(String itemName) {
    completed = false;
    this.itemName = itemName;
  }

  @Override
  public String toString() {
    return itemName;
  }
}
