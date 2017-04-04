package garden;

import java.util.ArrayList;

public class Garden {

  private ArrayList<Plant> plants;

  public Garden() {
    plants = new ArrayList<>();
  }

  void add(Plant plant) {
    plants.add(plant);
    System.out.println(
            plant.color.substring(0, 1).toUpperCase() + plant.color.substring(1) + " " + plant
                    .getClass().getSimpleName().toLowerCase() + " added to " + this
                    .getClass().getSimpleName().toLowerCase() + ".");
  }

  void watering(float withAmountOfWater) {
    System.out.println("Watering with " + withAmountOfWater);
    ArrayList<Plant> plantsToWater = new ArrayList<>();
    for (Plant p : plants) {
      if (p.needsWater()) {
        plantsToWater.add(p);
      }
    }
    for (Plant pToWater : plantsToWater) {
      pToWater.addWater(withAmountOfWater / (float) plantsToWater.size());
    }
    for (Plant p : plants) {
      System.out.println(
              "The " + p.color + " " + p.getClass().getSimpleName().toLowerCase() + (
                      (p.needsWater()) ? " needs water." : " doesn't need water."));
    }
  }
}
