// Write a recursive function that takes one parameter: n and counts down from n.

public class Counter {

  public static void main(String[] args) {
    int n = 5; // n = number to count down from

    countDownFrom(n);
  }

  private static void countDownFrom(int n) {
    if (n == 0) {
      System.out.println(n);
      System.exit(0);
    }
    System.out.println(n);
    countDownFrom(--n);
  }
}
