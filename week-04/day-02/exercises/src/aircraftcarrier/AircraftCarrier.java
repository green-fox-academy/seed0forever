package aircraftcarrier;

import java.util.ArrayList;
import java.util.List;

public class AircraftCarrier {
  List<Aircraft> aircraftStorage;
  int ammoStorage;
  int healthPoint;

  public AircraftCarrier(int ammoStorage) {
    aircraftStorage = new ArrayList<>();
    this.ammoStorage = ammoStorage;
    healthPoint = 5000;
  }
}
