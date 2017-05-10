package com.greenfoxacademy.seed0forever.frontend.model;

import lombok.Getter;
import lombok.Setter;

public class DoUntil implements RestResponseObject {

  @Getter
  private int result;
  @Setter
  private int until;
  private String whatToDo;

  public void sum() {
    int sum = 0;
    for (int i = 0; i <= until; i++) {
      sum += i;
    }
    result = sum;
  }

  public void factorial() {
    int factorialResult = 1;
    for (int i = 1; i <= until; i++) {
      factorialResult *= i;
    }
    result = factorialResult;
  }

  public boolean fieldUntilIsGreaterThanOrEquals(int upperBound) {

    return until >= upperBound;
  }

  public int privateGetUntil() {
    return until;
  }
}
