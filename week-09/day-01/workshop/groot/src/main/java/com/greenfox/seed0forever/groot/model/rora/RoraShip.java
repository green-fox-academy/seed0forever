package com.greenfox.seed0forever.groot.model.rora;

import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
@Getter
public class RoraShip {

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
}
