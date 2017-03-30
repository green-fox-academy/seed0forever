public class Sumdigit {

  // Given a non-negative int n, return the sum of its digits recursively (no loops).
  // Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while
  // divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

  public static void main(String[] args) {
    int n = 123456789; // n = number whose digits are to be summed
    int nSumOfDigits = 0;

    nSumOfDigits = sumTheDigits(n);

    System.out.println(nSumOfDigits);
  }

  private static int sumTheDigits(int n) {
    if (n < 100) {
      return n % 10;
    }
    return n % 10 + sumTheDigits(n / 10);
  }

}
