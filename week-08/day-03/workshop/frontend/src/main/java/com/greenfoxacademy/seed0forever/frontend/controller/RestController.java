package com.greenfoxacademy.seed0forever.frontend.controller;

import com.greenfoxacademy.seed0forever.frontend.model.Doubling;
import com.greenfoxacademy.seed0forever.frontend.model.Error;
import com.greenfoxacademy.seed0forever.frontend.model.RestResponseObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {

  @GetMapping("/doubling")
  public RestResponseObject doubling(@RequestParam Integer input) {
    if (input == null) {
      return new Error("Please provide an input!");
    }
    return new Doubling(input);
  }
}
