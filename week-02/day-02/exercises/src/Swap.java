public class Swap {

  public static void main(String[] args) {
    int a = 123;
    int b = 526;
    // Swap the values of the variables
    int aPlusB = a + b;
    a = aPlusB - a;
    b = aPlusB - b;
    // Print the new value of the variables
    System.out.println(a);
    System.out.println(b);
  }
}
