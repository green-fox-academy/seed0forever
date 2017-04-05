public class Fibonacci {

  public static int getNthIndexValue(int n) {
    if (n == 1) {
      return 1;
    } else if (n == 0) {
      return 0;
    }
    return getNthIndexValue(n - 1) + getNthIndexValue(n - 2);
  }

}
