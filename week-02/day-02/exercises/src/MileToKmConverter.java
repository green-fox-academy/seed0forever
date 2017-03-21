import java.util.Scanner;

public class MileToKmConverter {

  public static void main(String[] args) {
    // Write a program that asks for an integer that is a distance in kilometers,
    // then it converts that value to miles and prints it
    Scanner scanner = new Scanner(System.in);
    System.out.println("Convert kilometers to miles!\n");
    System.out.println("Enter kilometer value (whole number): ");
    int userInputKilometers = scanner.nextInt();
    float milesConvertedFromKilometers = (float) ((int) (userInputKilometers * 16.0934)) / 10;
    System.out.println(userInputKilometers + " km = " + milesConvertedFromKilometers + " mi");
  }
}