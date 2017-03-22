import java.util.Scanner;

public class OddEven {

  public static void main(String[] args) {
    // Write a program that reads a number form the standard input,
// Than prints "Odd" if the number is odd, or "Even" it it is even.
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter an integer:");
    int userInputNum = scanner.nextInt();
    if (userInputNum % 2 == 0) {
      System.out.println("Even");
    } else {
      System.out.println("Odd");
    }
  }

}
