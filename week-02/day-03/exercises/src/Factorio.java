/**
 * Created by marcell on 22/03/17.
 */
public class Factorio {

  public static void main(String[] args) {
// - Create a function called `factorio`
//   that returns it's input's factorial
    int toFactorial = 5;
    System.out.println(toFactorial + "! = " + factorio(toFactorial));
  }

  public static long factorio(int numberToCalcFactorial) {
    long calculatedFactorial = 1;
    for (int i = 1; i <= numberToCalcFactorial; i++) {
          calculatedFactorial *= i;
    }
    return calculatedFactorial;
  }

}
