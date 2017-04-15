package aircraftcarrier;

public class Aircraft {

  int currentAmmo;
  int maxAmmo;
  int baseDamage;

  public Aircraft() {
    currentAmmo = 0;
  }

  int fight() {
    int dealtDamage = getAllDamage();
    currentAmmo = 0;
    return dealtDamage;
  }

  int refill(int ammoSupply) {
    int emptySlots = maxAmmo - currentAmmo;

    currentAmmo += ammoSupply;
    if (currentAmmo > maxAmmo) {
      currentAmmo = maxAmmo;
    }

    ammoSupply -= emptySlots;
    if (ammoSupply < 0) {
      ammoSupply = 0;
    }
    return ammoSupply;
  }

  int getAllDamage() {
    return currentAmmo * baseDamage;
  }

  String getType() {
    return this.getClass().getSimpleName();
  }

  String getStatus() {
    return "Type " + getType()
            + ", Ammo: " + currentAmmo
            + ", Base Damage: " + baseDamage
            + ", All Damage: " + getAllDamage();
  }
}
