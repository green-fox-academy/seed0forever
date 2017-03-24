import java.util.Arrays;
import java.util.Scanner;

public class PalindromeBuilder {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Palindrome Builder");
    System.out.println("Enter a string to build a palindrome from:");
    String userInString = scanner.nextLine();
    String[] originalStringCharacters = userInString.split("");
    String reversedString = "";
    for (int i = originalStringCharacters.length - 1; i >= 0; i--) {
      reversedString += originalStringCharacters[i];
    }
    System.out.println(reversedString);
  }

}
