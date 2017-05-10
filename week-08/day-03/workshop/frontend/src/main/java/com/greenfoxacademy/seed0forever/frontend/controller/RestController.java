package com.greenfoxacademy.seed0forever.frontend.controller;

import com.greenfoxacademy.seed0forever.frontend.model.AppendA;
import com.greenfoxacademy.seed0forever.frontend.model.ArrayCalculatorService;
import com.greenfoxacademy.seed0forever.frontend.model.DoUntil;
import com.greenfoxacademy.seed0forever.frontend.model.Doubling;
import com.greenfoxacademy.seed0forever.frontend.model.ErrorRestResponse;
import com.greenfoxacademy.seed0forever.frontend.model.Greeting;
import com.greenfoxacademy.seed0forever.frontend.model.RestResponseObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {

  @GetMapping("/doubling")
  public RestResponseObject doubling(@RequestParam(required = false) Integer input) {
    if (input == null) {
      return new ErrorRestResponse("Please provide an input!");
    }
    return new Doubling(input);
  }

  @GetMapping("/greeter")
  public RestResponseObject greet(@RequestParam(required = false) String name,
          @RequestParam(required = false) String title) {
    if (name == null) {
      return new ErrorRestResponse("Please provide a name!");
    } else if (title == null) {
      return new ErrorRestResponse("Please provide a title!");
    }
    return new Greeting(name, title);
  }

  @GetMapping("/appenda/{appendable}")
  public RestResponseObject appendA(@PathVariable String appendable) {
    if (appendable == null) {
    }
    return new AppendA(appendable);
  }

  @PostMapping("/dountil/{what}")
  public RestResponseObject doUntil(@RequestBody(required = false) DoUntil doUntilInstance,
          @PathVariable("what") String whatToDo) {

    if (doUntilInstance != null && doUntilInstance.fieldUntilIsGreaterThanOrEquals(0)) {
      if (whatToDo.equalsIgnoreCase("sum")) {
        doUntilInstance.sum();
      } else if (whatToDo.equalsIgnoreCase("factor")) {
        doUntilInstance.factorial();
      } else {
        return new ErrorRestResponse("Please enter \'sum\' or \'factor\' after /dountil/");
      }
    } else {
      return new ErrorRestResponse("Please provide a number!");
    }

    return doUntilInstance;
  }

  @PostMapping("/arrays")
  public RestResponseObject arrayCalculator(
          @RequestBody(required = false) ArrayCalculatorService arrayCalculatorService) {
    return arrayCalculatorService.createResultObject();
  }
}
