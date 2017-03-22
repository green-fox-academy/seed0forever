import java.util.Scanner;

public class OneTwoALot {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number:");
    int userInputNum = scanner.nextInt();
    if (userInputNum <= 0) {
      System.out.println("Not enough");
    } else if (userInputNum == 1) {
      System.out.println("One");
    } else if (userInputNum == 2) {
      System.out.println("Two");
    } else {
      System.out.println("A lot");
    }
  }

}
