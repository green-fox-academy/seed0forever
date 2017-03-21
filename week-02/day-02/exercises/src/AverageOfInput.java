import java.util.Scanner;

public class AverageOfInput {

  public static void main(String[] args) {
    // Write a program that asks for 5 integers in a row,
    // then it should print the sum and the average of these numbers like:
    //
    // Sum: 22, Average: 4.4
    Scanner scanner = new Scanner(System.in);
    int sumOfNumbers = 0;
    int howManyEnteredNumbers = 0;
    System.out.println("Please enter five whole numbers, one by one.\n");

    for (int i = 1; i <= 5; i++) {
      System.out.println("Number " + i + ":");
      int userInNumber = scanner.nextInt();
      sumOfNumbers += userInNumber;
      howManyEnteredNumbers++;
    }
    System.out.println("Sum: " + sumOfNumbers + ", Average: " + (int) (sumOfNumbers / howManyEnteredNumbers));

  }

}
