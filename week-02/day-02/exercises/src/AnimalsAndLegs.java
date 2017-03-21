import java.util.Scanner;

public class AnimalsAndLegs {

  public static void main(String[] args) {
    // Write a program that asks for two integers
    // The first represents the number of chickens the farmer has
    // The seconf represents the number of pigs the farmer has
    // It should print how many legs all the animals have
    Scanner scanner = new Scanner(System.in);
    System.out.println("How many chickens does the farmer have?");
    int userInAmountChickens = scanner.nextInt();
    System.out.println("And how many pigs does the farmer have?");
    int userInAmountPigs = scanner.nextInt();
    System.out.println("All the animals have "
            + (userInAmountChickens * 2
            + userInAmountPigs * 4)
            + " legs!");
  }
}