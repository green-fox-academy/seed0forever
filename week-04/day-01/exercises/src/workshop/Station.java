package workshop;

public class Station {

  float gasAmount;

  public void refill(Car car) {
    if (gasAmount >= car.capacity - car.gasAmount) {
      gasAmount -= car.capacity - car.gasAmount;
      car.gasAmount += car.capacity - car.gasAmount;
    } else {
      car.gasAmount += gasAmount;
      gasAmount = 0f;
    }
  }

}
