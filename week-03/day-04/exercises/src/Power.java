public class Power {
  // Given base and n that are both 1 or more, compute recursively (no loops)
  // the value of base to the n power, so powerN(3, 2) is 9 (3 squared).

  public static void main(String[] args) {
    int base = 2; // base to raise to the power of n
    int n = 4; // exponent (n-th power of base will be calculated)
    int baseToPower = 1; // result of the exponentiation (base to the n-th power)

    baseToPower = powerN(base, n);
    System.out.println(baseToPower);
  }

  private static int powerN(int base, int n) {
    if (n == 1) {
      return base;
    }
    return base * powerN(base, n - 1);
  }
}
