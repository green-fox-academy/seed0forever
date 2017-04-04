package garden;

public class Tree extends Plant {

  public Tree(String color) {
    this.color = color;
    ratioOfWaterAbsorbance = .4f;
    thresholdNeedsWaterBelow = 10f;
    System.out.println(color.substring(0, 1).toUpperCase() + color.substring(1) + " tree created.");
  }
}
