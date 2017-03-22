import java.util.Scanner;

public class DrawTriangle {

  public static void main(String[] args) {
    // Write a program that reads a number from the standard input, 
    Scanner scanner = new Scanner(System.in);
    System.out.println("Triangle");
    System.out.print("Enter the number of rows for the triangle: ");
    int userInNumOfLines = scanner.nextInt();
    // then draws a triangle like this:
    //
    // *
    // **
    // ***
    // ****
    //
    // The triangle should have as many lines as the number was
    for (int i = 1; i <= userInNumOfLines; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println("");
    }
  }

}
