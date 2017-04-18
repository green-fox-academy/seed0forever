package oddavg;

import java.util.List;

public class OddAvg {

  public static void main(String[] args) {
    // Create a function called `oddAverage` that takes a list of numbers as parameter
    // and returns the average value of the odd numbers in the list
    // Create basic unit tests for it with at least 3 different test cases
  }

  public static double oddAverage(List<Integer> inputNumbers) {
    int sum = 0;
    int numberOfItems = 0;

    if (inputNumbers == null) {
      return 0d;
    } else if (inputNumbers.size() == 0) {
      return 0d;
    }

    for (Integer number : inputNumbers) {
      if (number % 2 == 1) {
        sum += number;
        numberOfItems++;
      }
    }
    return (double) sum / (double) numberOfItems;
  }
}
