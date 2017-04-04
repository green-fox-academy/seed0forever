package garden;

public class Plant {

  String color;
  float waterAmount;
  float ratioOfWaterAbsorbance;
  float thresholdNeedsWaterBelow;

  public Plant() {
    waterAmount = 0f;
    ratioOfWaterAbsorbance = 1f;
    thresholdNeedsWaterBelow = 1f;
    System.out.println("Plant created.");
  }

  boolean needsWater() {
    boolean thisNeedsWater = waterAmount < thresholdNeedsWaterBelow;

/*
// Diagnostic output:
    System.out.println(
            "The " + color + " " + this.getClass().getSimpleName().toLowerCase() + ((thisNeedsWater)
                    ? " needs"
                    : " doesn't need") + " water." + " [waterAmount before: " + waterAmount + "]");
*/
    return thisNeedsWater;
  }

  void addWater(float waterAmount) {
    this.waterAmount += waterAmount * ratioOfWaterAbsorbance;
/*
// Diagnostic output:

    System.out.println(
            "[received: " + waterAmount + "; absorbed: " + waterAmount * ratioOfWaterAbsorbance
                    + "; waterAmount after: " + this.waterAmount + "]");
*/
  }
}
