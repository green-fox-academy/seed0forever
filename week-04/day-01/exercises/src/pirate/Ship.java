package pirate;

import java.util.ArrayList;
import java.util.List;

public class Ship {

  private List<Pirate> crew;
  private Captain captain;

  Ship() {
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

}
