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
    int matchingAmount = 0;
    for (Car car : carsInside) {
      if (car.getType().equals(matchType)) {
        matchingAmount++;
      }
    }
    return matchingAmount;
  }

  int getAmountOfCars(Color matchColor) {
    int matchingAmount = 0;
    for (Car car : carsInside) {
      if (car.getColor().equals(matchColor)) {
        matchingAmount++;
      }
    }
    return matchingAmount;
  }
}
