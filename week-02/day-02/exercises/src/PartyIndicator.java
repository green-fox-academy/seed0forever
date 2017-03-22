import java.util.Scanner;

public class PartyIndicator {

  public static void main(String[] args) {
    // Write a program that asks for two numbers
    // Thw first number represents the number of girls that comes to a party, the
    // second the boys
    Scanner scanner = new Scanner(System.in);
    System.out.println("Party Time!");
    System.out.println("How many girls come to the party:");
    int numGirls = scanner.nextInt();
    System.out.println("And how many boys come to the party?");
    int numBoys = scanner.nextInt();
    // It should print: Sausage party
    // If no girls are coming, regardless the count of the people
    if (numGirls == 0) {
      System.out.println("Sausage party");
      // It should print: The party is exellent!
      // If the the number of girls and boys are equal and there are more people coming than 20
    } else if (numBoys == numGirls && numBoys + numGirls > 20) {
      System.out.println("The party is exellent!");
      // It should print: Quite cool party!
      // It there are more than 20 people coming but the girl - boy ratio is not 1-1
    } else if (numBoys != numGirls && numBoys + numGirls > 20) {
      System.out.println("Quite cool party!");
      // It should print: Average party...
      // If there are less people coming than 20
    } else if (numBoys + numGirls < 20) {
      System.out.println("Average party...");
    }
  /*
      Program doesn't show any response if the sum of partygoers is exactly 20 !!!
  */
  }

}
