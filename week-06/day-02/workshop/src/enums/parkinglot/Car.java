package enums.parkinglot;

public class Car {

  CarType type;
  Color color;

  public Car(CarType type, Color color) {
    this.type = type;
    this.color = color;
  }

  public CarType getType() {
    return type;
  }

  public Color getColor() {
    return color;
  }
}
