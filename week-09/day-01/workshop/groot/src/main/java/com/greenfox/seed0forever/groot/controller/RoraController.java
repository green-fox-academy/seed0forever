package com.greenfox.seed0forever.groot.controller;

import com.greenfox.seed0forever.groot.model.rora.RoraShip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoraController {

  @Autowired
  RoraShip roraShip1;

  @GetMapping("/rocket")
  public RoraShip listCargoStatus() {
    return roraShip1;
  }

}
