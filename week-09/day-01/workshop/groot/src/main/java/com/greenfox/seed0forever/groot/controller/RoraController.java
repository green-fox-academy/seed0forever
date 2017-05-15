package com.greenfox.seed0forever.groot.controller;

import com.greenfox.seed0forever.groot.model.rora.response.RoraFillStatus;
import com.greenfox.seed0forever.groot.model.rora.RoraShip;
import com.greenfox.seed0forever.groot.service.rora.RoraFillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoraController {

  @Autowired
  RoraShip roraShip1;

  @Autowired
  RoraFillService roraFillService1;

  @GetMapping("/rocket")
  public RoraShip listCargoStatus() {
    return roraShip1;
  }

  @GetMapping("/rocket/fill")
  public RoraFillStatus fillShipAndShowStatus(
          @RequestParam String caliber,
          @RequestParam long amount) {
    return roraFillService1.fillShip(roraShip1, caliber, amount);
  }

}
