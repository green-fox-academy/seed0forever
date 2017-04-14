package aircraftcarrier;

public class Aircraft {

  int currentAmmo;
  int maxAmmo;
  int baseDamage;

  public Aircraft() {
    currentAmmo = 0;
  }

  int fight() {
    int causedDamage = currentAmmo * baseDamage;
    currentAmmo = 0;
    return causedDamage;
  }
}
