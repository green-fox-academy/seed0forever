import java.util.Scanner;

public class DrawPyramid {

  public static void main(String[] args) {
    // Write a program that reads a number from the standard input, then draws a
    // pyramid like this:
    //
    //
    //    *
    //   ***
    //  *****
    // *******
    //
    // The pyramid should have as many lines as the number was
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number of rows for the pyramid: ");
    int rowsOfPyramid = scanner.nextInt();
/*
    // Previous solution
    for (int i = 1; i <= rowsOfPyramid; i++) {
      int numOfSpaces = rowsOfPyramid - i;
      String printPyramidRow = "";
      while (numOfSpaces > 0) {
        printPyramidRow += "\u00A0";
        numOfSpaces--;
      }
      for (int j = 1; j <= 2 * i - 1; j++) {
        printPyramidRow += "*";
      }
      System.out.println(printPyramidRow);
    }
*/
    for (int row = 1; row <= rowsOfPyramid; row++) {
      for (int spaces = 1; spaces <= rowsOfPyramid - row; spaces++) {
        System.out.print("\u00A0");
      }
      for (int pyramidBricks = 1; pyramidBricks <= 2 * row - 1; pyramidBricks++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

}
