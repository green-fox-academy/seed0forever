import java.util.Scanner;

public class PrintBigger {

  public static void main(String[] args) {
    // Write a program that asks for two numbers and prints the bigger one
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter two numbers!");
    System.out.println("Enter the first number:");
    int userInputNum1 = scanner.nextInt();
    System.out.println("Enter the second number:");
    int userInputNum2 = scanner.nextInt();
    if (userInputNum1 > userInputNum2) {
      System.out.println(userInputNum1 + " is bigger.");
    } else if (userInputNum1 < userInputNum2) {
      System.out.println(userInputNum2 + " is bigger.");
    } else {
      System.out.println("The two numbers are the same.");
    }
  }

}
