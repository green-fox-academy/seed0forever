import java.util.Scanner;


public class Sum {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("How many numbers to add?\nEnter a positive whole number: ");
    double userInputHowManyNumbersToAdd = scanner.nextDouble();
    sum(userInputHowManyNumbersToAdd);
// - Write a function called `sum` that sum all the numbers
//   until the given parameter
  }

  public static void sum(double howManyNumbersToAdd) {
    long sumResult = 0;
    long longHowManyNumbersToAdd = (long) howManyNumbersToAdd;
    if (howManyNumbersToAdd > 0 && howManyNumbersToAdd == longHowManyNumbersToAdd) {
      for (int i = 1; i <= longHowManyNumbersToAdd; i++) {
        sumResult += i;
      }
      System.out.println("Sum of all numbers from 1 to " + longHowManyNumbersToAdd
                         + " is:\n" + sumResult);
    } else {
      System.out.println("That's not a positive whole number,\nor the number is too large!");
    }

  }
}
