package garden;

public class GardenApp {

  public static void main(String[] args) {
    Garden exampleGarden = new Garden();
    exampleGarden.add(new Flower("yellow"));
    exampleGarden.add(new Flower("blue"));
    exampleGarden.add(new Tree("purple"));
    exampleGarden.add(new Tree("orange"));

    System.out.println();
    exampleGarden.watering(40);

    System.out.println();
    exampleGarden.watering(70);
  }
}
