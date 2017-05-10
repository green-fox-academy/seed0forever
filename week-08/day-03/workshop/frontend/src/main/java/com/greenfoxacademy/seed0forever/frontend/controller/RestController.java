package com.greenfoxacademy.seed0forever.frontend.controller;

import com.greenfoxacademy.seed0forever.frontend.model.AppendA;
import com.greenfoxacademy.seed0forever.frontend.model.Doubling;
import com.greenfoxacademy.seed0forever.frontend.model.Error;
import com.greenfoxacademy.seed0forever.frontend.model.Greeting;
import com.greenfoxacademy.seed0forever.frontend.model.RestResponseObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

  @GetMapping("/greeter")
  public RestResponseObject greet(@RequestParam(required = false) String name,
          @RequestParam(required = false) String title) {
    if (name == null || title == null) {
      return new Error("Please provide a name!");
    }
    return new Greeting(name, title);
  }

  @GetMapping("/appenda/{appendable}")
  public RestResponseObject appendA(@PathVariable String appendable) {
    if (appendable == null) {
    }
    return new AppendA(appendable);
  }
}
