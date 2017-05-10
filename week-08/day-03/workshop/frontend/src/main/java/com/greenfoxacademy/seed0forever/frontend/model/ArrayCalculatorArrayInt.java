package com.greenfoxacademy.seed0forever.frontend.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ArrayCalculatorArrayInt implements RestResponseObject {

  private int[] result;

  public ArrayCalculatorArrayInt(int[] result) {
    this.result = result;
  }
}
