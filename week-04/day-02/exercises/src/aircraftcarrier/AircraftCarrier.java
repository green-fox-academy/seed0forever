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

  void addAircraft(String aircraftType) {
    if (aircraftType.toUpperCase() == "F16") {
      aircraftStorage.add(new F16());
    } else if (aircraftType.toUpperCase() == "F35") {
      aircraftStorage.add(new F35());
    }
  }
}
