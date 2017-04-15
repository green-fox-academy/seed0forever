package pirate;

import java.util.ArrayList;
import java.util.List;

public class Ship {

  private static int shipCount = 0;
  private int idNumber;
  private List<Pirate> crew;
  private Captain captain;

  Ship() {
    idNumber = ++shipCount;
    crew = new ArrayList<>();
  }

  void fillShip() {
    captain = new Captain();
    int numberOfPirates = 50 + (int) (Math.random() * 51);

    for (int i = 1; i <= numberOfPirates; i++) {
      Pirate pirate = new Pirate();
      pirate.setIdNumber(i);
      crew.add(new Pirate());
    }
  }

  Captain getCaptain() {
    return captain;
  }

  void printStatus() {
    String status = "";

    status += "Ship #" + idNumber
            + " - Pirates: " + crew.size();

    status += ", Captain " + ((captain != null)
            ? "drank " + captain.getRumsDrunk() + " rums"
            : "not on board");

    System.out.println(status);
  }

}
