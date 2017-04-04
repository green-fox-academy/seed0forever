package garden;

public class Plant {

  String color;
  float waterAmount;

  public Plant() {
    waterAmount = 0;
    System.out.println("Plant created.");
  }

  boolean needsWater() {
    return (waterAmount <= 0) ? true : false;
  }
}
