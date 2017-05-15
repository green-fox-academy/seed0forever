package com.greenfox.seed0forever.groot.controller;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class YonduController {

  @GetMapping("/yondu")
  public Map<String, Double> respondYondu(@RequestParam double distance,
          @RequestParam double time) {
    Map<String, Double> response = new HashMap<>();

    double speed = distance / time;
    speed = (double) Math.round(speed * 10.0) / 10;

    response.put("distance", distance);
    response.put("time", time);
    response.put("speed", speed);

    return response;
  }
}
