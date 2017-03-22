public class Doubling {

  public static void main(String[] args) {
// - Create an integer variable named `ak` and assign the value `123` to it
    int ak = 123;
// - Create a function called `doubling` that doubles it's input parameter
    System.out.println(doubling(ak));
// - Print the result of `doubling(ak)`
  }

  public static int doubling(int numberToDouble) {
    return numberToDouble *= 2;

  }
}