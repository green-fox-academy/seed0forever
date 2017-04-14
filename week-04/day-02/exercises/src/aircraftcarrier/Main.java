package aircraftcarrier;

public class Main {

  public static void main(String[] args) {
    AircraftCarrier firstCarrier = new AircraftCarrier(110);
    firstCarrier.addAircraft("F16");
    firstCarrier.addAircraft("F16");
    firstCarrier.addAircraft("F35");
    firstCarrier.addAircraft("F35");
    firstCarrier.addAircraft("F35");
    firstCarrier.addAircraft("F35");

    try {
      firstCarrier.fill();
    } catch (Exception e) {
      System.out.println("First carrier: " + e.getMessage() + "\n");
    }
    System.out.println(firstCarrier.getStatus());

    AircraftCarrier secondCarrier = new AircraftCarrier(190);
    secondCarrier.addAircraft("F16");
    secondCarrier.addAircraft("F16");
    secondCarrier.addAircraft("F16");
    secondCarrier.addAircraft("F16");
    secondCarrier.addAircraft("F35");
    secondCarrier.addAircraft("F35");

    try {
      secondCarrier.fill();
    } catch (Exception e) {
      System.out.println("Second carrier: " + e.getMessage() + "\n");
    }
    System.out.println(secondCarrier.getStatus());

    war(firstCarrier, secondCarrier);

    System.out.println(firstCarrier.getStatus());
    System.out.println(secondCarrier.getStatus());
  }

  static void war(AircraftCarrier firstShip, AircraftCarrier secondShip) {
    System.out.println("War started!\n");
    while (firstShip.getHealthPoint() > 0
            && secondShip.getHealthPoint() > 0
            && (
            firstShip.getTotalDamage() > 0
                    || secondShip.getTotalDamage() > 0)) {
      firstShip.fight(secondShip);
      secondShip.fight(firstShip);

      try {
        firstShip.fill();
      } catch (Exception e) {
        System.out.println("First carrier: " + e.getMessage() + "\n");
      }

      try {
        secondShip.fill();
      } catch (Exception e) {
        System.out.println("Second carrier: " + e.getMessage() + "\n");
      }
    }
    System.out.println("War ended. Final stats:\n");
  }
}
