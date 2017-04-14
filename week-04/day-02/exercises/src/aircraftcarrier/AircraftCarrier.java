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

  void fill() {
    if (ammoStorage == 0) {
      System.out.println("should throw an OutOfAmmo exception");
      System.exit(0);
    }

    for (Aircraft aircraft : aircraftStorage) {
      if (aircraft instanceof F35) {
        ammoStorage = aircraft.refill(ammoStorage);
      }
      if (ammoStorage == 0) {
        return;
      }
    }
    for (Aircraft aircraft : aircraftStorage) {
      if (aircraft instanceof F16) {
        ammoStorage = aircraft.refill(ammoStorage);
      }
      if (ammoStorage == 0) {
        return;
      }
    }
  }

  void fight(AircraftCarrier enemyCarrier) {
    int dealtDamage = 0;
    for (Aircraft aircraft : aircraftStorage) {
      dealtDamage += aircraft.fight();
    }
    enemyCarrier.setHealthPoint(enemyCarrier.getHealthPoint() - dealtDamage);
  }

  int getHealthPoint() {
    return healthPoint;
  }

  private void setHealthPoint(int healthPoint) {
    this.healthPoint = healthPoint;
  }
}
