package com.greenfoxacademy.seed0forever.frontend.model;

import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public class ArrayCalculatorService {

  @Setter
  private String what;
  @Setter
  private int[] numbers;

  public RestResponseObject createResultObject() {
    if (what.equalsIgnoreCase("sum")) {
      int sumResult = 0;
      for (int numberItem : numbers) {
        sumResult += numberItem;
      }
      return new ArrayCalculatorSingleInt(sumResult);

    } else if (what.equalsIgnoreCase("multiply")) {
      int multiplicationResult = 1;
      for (int numberItem : numbers) {
        multiplicationResult *= numberItem;
      }
      return new ArrayCalculatorSingleInt(multiplicationResult);

    } else if (what.equalsIgnoreCase("double")) {
      int doubleResult[] = new int[numbers.length];
      for (int i = 0; i < numbers.length; i++) {
        doubleResult[i] = numbers[i] * 2;
      }
      return new ArrayCalculatorArrayInt(doubleResult);
    }
    return new ErrorRestResponse("Please provide what to do with the numbers!");
  }
}
