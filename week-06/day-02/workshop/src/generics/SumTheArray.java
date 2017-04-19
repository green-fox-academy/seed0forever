package generics;

public class SumTheArray {

  public static <T extends Number> double sum(T[] numericArray, int endIndex) {
    double sum = 0d;

    for (int i = 0; i < endIndex; i++) {
      sum += numericArray[i].doubleValue();
    }

    return sum;
  }
}
