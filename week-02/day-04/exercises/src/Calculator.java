import java.util.Scanner;

public class Calculator {

  public static void main(String... args) {
    // Create a simple calculator application which reads the parameters from the prompt
    // and prints the result to the prompt.
    // It should support the following operations:
    // +, -, *, /, % and it should support two operands.
    // The format of the expressions must be: {operation} {operand} {operand}.
    // Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

    // You can use the Scanner class
    // It should work like this:

    // Start the program
    // It prints: "Please type in the expression:"
    // Waits for the user input
    // Print the result to the prompt
    // Exit

    Scanner scanner = new Scanner(System.in);
    System.out.println("Please type in the expression:");
    String userInExpression = scanner.nextLine();
    String[] splitExpression = userInExpression.split(" ");
    switch (splitExpression[0]) {
      case "+":
        System.out.println(splitExpression[1] + " + " + splitExpression[2] + " = "
                + (Integer.parseInt(splitExpression[1]) + Integer.parseInt(splitExpression[2])));
        break;
      case "-":
        System.out.println(splitExpression[1] + " - " + splitExpression[2] + " = "
                + (Integer.parseInt(splitExpression[1]) - Integer.parseInt(splitExpression[2])));
        break;
      case "*":
        System.out.println(splitExpression[1] + " * " + splitExpression[2] + " = "
                + (Integer.parseInt(splitExpression[1]) * Integer.parseInt(splitExpression[2])));
        break;
      case "/":
        System.out.println(splitExpression[1] + " / " + splitExpression[2] + " = "
                + (Integer.parseInt(splitExpression[1]) / Integer.parseInt(splitExpression[2])));
        break;
      case "%":
        System.out.println(splitExpression[1] + " % " + splitExpression[2] + " = "
                + (Integer.parseInt(splitExpression[1]) % Integer.parseInt(splitExpression[2])));
        break;
    }
  }
}