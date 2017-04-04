package garden;

public class Flower extends Plant {

  public Flower(String color) {
    this.color = color;
    System.out
            .println(color.substring(0, 1).toUpperCase() + color.substring(1) + " flower created.");
  }

  boolean needsWater() {
    return (waterAmount < 5) ? true : false;
  }
}
