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

  void fill() throws Exception {
    if (ammoStorage == 0) {
      throw new Exception("Out of ammo on ship - cannot refill more aircraft.");
    }

    for (Aircraft aircraft : aircraftStorage) {
      if (aircraft instanceof F35) {
        ammoStorage = aircraft.refill(ammoStorage);
        if (ammoStorage == 0) {
          return;
        }
      }
    }
    for (Aircraft aircraft : aircraftStorage) {
      if (aircraft instanceof F16) {
        ammoStorage = aircraft.refill(ammoStorage);
        if (ammoStorage == 0) {
          return;
        }
      }
    }
  }

  void fight(AircraftCarrier enemyCarrier) {
    aircraftStorage.forEach(aircraft -> enemyCarrier.receiveDamage(aircraft.fight()));
  }

  private void receiveDamage(int damage) {
    healthPoint -= (healthPoint > damage) ? damage : healthPoint;
  }

  int getHealthPoint() {
    return healthPoint;
  }

  String getStatus() {
    String status = "";
    status += "Aircraft count: " + aircraftStorage.size()
            + ", Ammo Storage: " + ammoStorage
            + ", Total damage: " + getTotalDamage()
            + ", HP: " + healthPoint;

    for (Aircraft aircraft : aircraftStorage) {
      status += "\n" + aircraft.getStatus();
    }

    status += ((healthPoint <= 0) ? "\nIt's dead Jim :(" : "") + "\n";
    return status;
  }

  int getTotalDamage() {
    int totalDamage = 0;
    for (Aircraft aircraft : aircraftStorage) {
      totalDamage += aircraft.getAllDamage();
    }
    return totalDamage;
  }
}
