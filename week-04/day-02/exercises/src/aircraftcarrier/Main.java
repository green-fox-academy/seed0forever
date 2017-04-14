package aircraftcarrier;

public class Main {

  public static void main(String[] args) {
    AircraftCarrier firstCarrier = new AircraftCarrier(1000);
    firstCarrier.addAircraft("F16");
    firstCarrier.addAircraft("F16");
    firstCarrier.addAircraft("F35");
    firstCarrier.addAircraft("F35");
    firstCarrier.addAircraft("F35");
    firstCarrier.addAircraft("F35");
    firstCarrier.fill();
    System.out.println(firstCarrier.getStatus());

    AircraftCarrier secondCarrier = new AircraftCarrier(4000);
    secondCarrier.addAircraft("F16");
    secondCarrier.addAircraft("F16");
    secondCarrier.addAircraft("F16");
    secondCarrier.addAircraft("F16");
    secondCarrier.addAircraft("F35");
    secondCarrier.addAircraft("F35");
    secondCarrier.fill();
    System.out.println(secondCarrier.getStatus());

    while (firstCarrier.getHealthPoint() > 0
            && secondCarrier.getHealthPoint() > 0) {
      firstCarrier.fight(secondCarrier);
      secondCarrier.fight(firstCarrier);
      firstCarrier.fill();
      secondCarrier.fill();
    }

    System.out.println(firstCarrier.getStatus());
    System.out.println(secondCarrier.getStatus());
  }
}
