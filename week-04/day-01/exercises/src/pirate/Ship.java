package pirate;

import java.util.ArrayList;
import java.util.List;

public class Ship {

  private List<Pirate> crew;
  private Captain captain;

  Ship() {
    crew = new ArrayList<>();
    captain = new Captain();
  }

}
