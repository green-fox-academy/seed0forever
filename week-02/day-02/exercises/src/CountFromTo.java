import java.util.Scanner;

public class CountFromTo {

  public static void main(String[] args) {
    // Create a program that asks for two numbers
    Scanner scanner = new Scanner(System.in);
    System.out.println("I will count from a number to another!");
    System.out.println("Enter the first number:");
    int userInLowerNum = scanner.nextInt();
    System.out.println("Enter the second number:");
    int userInUpperNum = scanner.nextInt();
    // If the second number is not bigger than the first one it should print:
    // "The second number should be bigger"
    if (userInLowerNum >= userInUpperNum) {
      System.out.println("The second number should be bigger");
      // If it is bigger it should count from the first number to the second by one
      //
      // example:
      //
      // first number: 3, second number: 6, should print:
      //
      // 3
      // 4
      // 5
    } else {
      for (int i = userInLowerNum; i <= userInUpperNum; i++) {
        System.out.println(i);
      }
    }
    //
  }

}
