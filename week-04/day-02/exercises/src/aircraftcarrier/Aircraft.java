package aircraftcarrier;

class Aircraft {

  private int currentAmmo;
  int maxAmmo;
  int baseDamage;

  Aircraft() {
    currentAmmo = 0;
  }

  int fight() {
    int dealtDamage = getAllDamage();
    currentAmmo = 0;
    return dealtDamage;
  }

  int refill(int ammoSupply) {
    int emptySlots = maxAmmo - currentAmmo;

    currentAmmo += Math.min(ammoSupply, emptySlots);
    ammoSupply -= Math.min(ammoSupply, emptySlots);
    return ammoSupply;
  }

  int getAllDamage() {
    return currentAmmo * baseDamage;
  }

  private String getType() {
    return this.getClass().getSimpleName();
  }

  String getStatus() {
    return "Type " + getType()
            + ", Ammo: " + currentAmmo
            + ", Base Damage: " + baseDamage
            + ", All Damage: " + getAllDamage();
  }
}
