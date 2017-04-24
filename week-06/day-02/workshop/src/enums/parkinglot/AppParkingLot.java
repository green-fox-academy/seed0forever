package enums.parkinglot;

public class AppParkingLot {

  public static void main(String[] args) {
    ParkingLot streetParkingLot = new ParkingLot();

    Car tesla = new Car(CarType.PREMIUM, Color.SILVER);

    streetParkingLot.add(tesla);

    addRandomCars(streetParkingLot, 256);

    printColorStats(streetParkingLot);

    System.out.println();

    printTypeStats(streetParkingLot);
  }

  private static void printTypeStats(ParkingLot parkingLot) {
    for (CarType type : CarType.values()) {
      System.out.println(type.toString().substring(0, 1).toUpperCase()
              + type.toString().substring(1).toLowerCase()
              + " type cars: " + parkingLot.getAmountOfCars(type));
    }
  }

  private static void printColorStats(ParkingLot parkingLot) {
    for (Color color : Color.values()) {
      System.out.println(color.toString().substring(0, 1).toUpperCase()
              + color.toString().substring(1).toLowerCase()
              + " colored cars: " + parkingLot.getAmountOfCars(color) + ".");
    }
  }

  private static void addRandomCars(ParkingLot parkingLot, int numberOfCars) {
    for (int i = 0; i < numberOfCars; i++) {
      parkingLot.add(randomCar());
    }
  }

  private static Car randomCar() {
    int numOfColors = Color.values().length;
    int numOfTypes = CarType.values().length;

    int rndColorIndex = (int) (Math.random() * numOfColors);
    int rndTypeIndex = (int) (Math.random() * numOfTypes);

    Color rndColor = Color.values()[rndColorIndex];
    CarType rndType = CarType.values()[rndTypeIndex];

    return new Car(rndType, rndColor);
  }
}
