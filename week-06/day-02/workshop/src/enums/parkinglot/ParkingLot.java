package enums.parkinglot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

  List<Car> carsInside;

  public ParkingLot() {
    carsInside = new ArrayList<>();
  }

  void add(Car car) {
    carsInside.add(car);
  }

  int getAmountOfCars(CarType matchType) {
    int amountThatMatches = 0;
    for (Car car : carsInside) {
      if (car.getType().equals(matchType)) {
        amountThatMatches++;
      }
    }
    return amountThatMatches;
  }

  int getAmountOfCars(Color matchColor) {
    int amountThatMatches = 0;
    for (Car car : carsInside) {
      if (car.getColor().equals(matchColor)) {
        amountThatMatches++;
      }
    }
    return amountThatMatches;
  }
}
