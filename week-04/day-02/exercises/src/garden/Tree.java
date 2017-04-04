package garden;

public class Tree extends Plant {

  public Tree(String color) {
    this.color = color;
    System.out.println(color.substring(0, 1).toUpperCase() + color.substring(1) + " tree created.");
  }

  boolean needsWater() {
    return (waterAmount < 10) ? true : false;
  }

}
