package com.greenfox.seed0forever.groot.model.rora;

import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
@Getter
public class RoraShip {

  private static final int MAXIMUM_TOTAL_AMMUNITION_AMOUNT = 12500;

  private int caliber25;
  private int caliber30;
  private int caliber50;
  private String shipstatus;
  private boolean ready;

  public RoraShip() {
    this.caliber25 = 0;
    this.caliber30 = 0;
    this.caliber50 = 0;
    this.shipstatus = "empty";
    this.ready = false;
  }

  public void fillWith(String caliber, long amount) {
    switch (caliber) {
      case ".25":
        this.caliber25 +=
                (getRemainingAmmunitionCapacity() >= amount)
                        ? amount
                        : getRemainingAmmunitionCapacity();
        break;
      case ".30":
        this.caliber30 +=
                (getRemainingAmmunitionCapacity() >= amount)
                        ? amount
                        : getRemainingAmmunitionCapacity();
        break;
      case ".50":
        this.caliber50 +=
                (getRemainingAmmunitionCapacity() >= amount)
                        ? amount
                        : getRemainingAmmunitionCapacity();
      default:
        break;
    }
    this.shipstatus = String.format("%d%%", getShipFillPercentage());
    this.ready = isFull();
  }

  private int getShipFillPercentage() {
    double currentSumAmmo = (double) getSumAmmunitionAmount();
    double maxTotalAmmo = (double) MAXIMUM_TOTAL_AMMUNITION_AMOUNT;

    return (int) (
            currentSumAmmo / maxTotalAmmo * 100);
  }

  private int getRemainingAmmunitionCapacity() {
    return MAXIMUM_TOTAL_AMMUNITION_AMOUNT
            - getSumAmmunitionAmount();
  }

  private boolean isFull() {
    int sumAmmunitionAmount = getSumAmmunitionAmount();

    return sumAmmunitionAmount
            >= MAXIMUM_TOTAL_AMMUNITION_AMOUNT;
  }

  private int getSumAmmunitionAmount() {
    return caliber25
            + caliber30
            + caliber50;
  }
}
