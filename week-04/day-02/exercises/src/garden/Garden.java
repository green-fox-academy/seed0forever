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

  }
}
