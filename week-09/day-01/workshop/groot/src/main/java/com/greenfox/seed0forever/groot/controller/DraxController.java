package com.greenfox.seed0forever.groot.controller;

import com.greenfox.seed0forever.groot.model.drax.DraxCalorieTable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DraxController {

  @GetMapping("/drax")
  public DraxCalorieTable listDraxCalorieTable() {

    return new DraxCalorieTable();
  }

}
