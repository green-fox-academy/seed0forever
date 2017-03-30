import java.util.Scanner;

public class NumberAdder {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int userInputMaxNum = getUserInputMaxNum(scanner);

    long sumOfSeq = addAllNumbersUpTo((long) userInputMaxNum);
    System.out.println(sumOfSeq);
  }

  public static long addAllNumbersUpTo(long maxNumber) {
    long numToReturn = 0;
    if (maxNumber == 0) {
      return 0;
    } else {
      try {
        numToReturn = maxNumber + addAllNumbersUpTo(maxNumber - 1);
      } catch (Throwable e) {
        exitStackOverflowError();
      }
    }
    return numToReturn;
  }

  private static int getUserInputMaxNum(Scanner scanner) {
    System.out.print("Add all natural numbers up to (max 5000): ");
    float userInputFloat = 0;
    int userInputInt = 0;
    try {
      userInputFloat = scanner.nextFloat();
    } catch (Exception ex) {
      exitInputMismatch();
    }
    if (userInputFloat == (int) userInputFloat) {
      userInputInt = (int) userInputFloat;
    } else {
      exitInputMismatch();
    }

    if (userInputInt < 0 || userInputInt > 5000) {
      exitInputMismatch();
    }
    return userInputInt;
  }

  private static void exitInputMismatch() {
    System.out.println("Please enter a whole number between 1 and 5000 and try again!");
    System.exit(0);
  }

  private static void exitStackOverflowError() {
    System.out.println("Sorry, too many numbers to add!");
    System.exit(0);
  }

}
