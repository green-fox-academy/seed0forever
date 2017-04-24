package calculator;

public class Calculator {

  static <T extends Number> T add(T... numbers) {
    Double sum = Double.valueOf(0);

    for (T number : numbers) {
      sum += number.doubleValue();
    }
    return (T) sum;
  }

  static <T extends Number> T subtract(T... numbers) {
    Double lastDifference = numbers[0].doubleValue();

    for (int i = 1; i < numbers.length; i++) {
      T number = numbers[i];
      lastDifference -= number.doubleValue();
    }
    return (T) lastDifference;
  }

  static <T extends Number> T multiply(T... numbers) {
    Double product = numbers[0].doubleValue();

    for (int i = 1; i < numbers.length; i++) {
      T number = numbers[i];
      product *= number.doubleValue();
    }
    return (T) product;
  }

  static <T extends Number> T divide(T... numbers) {
    Double quotient = numbers[0].doubleValue();

    for (int i = 1; i < numbers.length; i++) {
      T number = numbers[i];
      quotient /= number.doubleValue();
    }
    return (T) quotient;
  }

}
