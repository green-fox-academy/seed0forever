package garden;

public class Flower extends Plant {

  public Flower(String color) {
    this.color = color;
    ratioOfWaterAbsorbance = .75f;
    thresholdNeedsWaterBelow = 5f;
    System.out
            .println(color.substring(0, 1).toUpperCase() + color.substring(1) + " flower created.");
  }
}
