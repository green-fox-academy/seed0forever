import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {

//  Write a program where the program chooses a number between 1 and 100. The player is then asked
//  to enter a guess. If the player guesses wrong, then the program gives feedback
//  and ask to enter another guess until the guess is correct.
//  Make the range customizable (ask for it before starting the guessing).
//  You can add lives. (optional)
//
//  Example
//  I've the number between 1-100. You have 5 lives.
//          20
//  Too high. You have 4 lives left.
//          10
//  Too low. You have 3 lives left.
//          15
//  Congratulations. You won!

  public static void main(String[] args) {
    int upperBound = 100;
    int lowerBound = 1;
    int numberToGuess = 0;
    int difficultyLevel = 3;
    int numberOfLives = 8;

    Scanner scanner = new Scanner(System.in);
    System.out.println("Guess my number!\nYou can tell me the range first.");
    System.out.println("Lowest allowed number?");
    lowerBound = scanner.nextInt();
    System.out.println("Highest allowed number?");
    upperBound = scanner.nextInt();
    if (upperBound <= lowerBound) {
      System.out.println("The second number should be bigger than the first one!");
      System.exit(0);
    }
    System.out.println("Difficulty level? (1: easy, 2: medium, 3: hard)");
    difficultyLevel = scanner.nextInt();
    if (!(difficultyLevel == 1 || difficultyLevel == 2 || difficultyLevel == 3)) {
      System.out.println("Only 1, 2 or 3 is allowed!");
      System.exit(0);
    }
    numberOfLives = (int) Math
            .floor((Math.log10(upperBound - lowerBound + 1.) / Math.log10(2.)) + 1);
    switch (difficultyLevel) {
      case 1:
        numberOfLives *= 1.5;
        break;
      case 2:
        numberOfLives *= 1.3;
        break;
    }
    Random rnd = new Random();
    numberToGuess = rnd.nextInt(upperBound - lowerBound + 1) + lowerBound;
    System.out.println("I've got the number between " + lowerBound + " and " + upperBound + "!");
//    System.out.println("[cheat: it's " + numberToGuess + "]");
    System.out.println(
            "Your guess? (You have " + numberOfLives + ((numberOfLives != 1)
                    ? " lives left)"
                    : " life left)"));
    while (scanner.hasNextInt()) {
      int userInLatestGuess = scanner.nextInt();
      numberOfLives--;
      if (userInLatestGuess == numberToGuess) {
        System.out.println("Congratulations. You won!");
        System.exit(0);
      } else if (userInLatestGuess > numberToGuess && numberOfLives > 0) {
        System.out.println(
                "Too high. Next guess? (You have " + numberOfLives + ((numberOfLives != 1)
                        ? " lives left)"
                        : " life left)"));
      } else if (userInLatestGuess < numberToGuess && numberOfLives > 0) {
        System.out.println("Too low. Next guess? (You have " + numberOfLives + ((numberOfLives != 1)
                ? " lives left)"
                : " life left)"));
      } else {
        System.out.println("Uh-oh! You are out of lives! :(");
        System.exit(0);
      }
    }

  }

}
