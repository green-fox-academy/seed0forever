public class Reverse {

  public static void main(String... args) {
    String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

    // Create a function that can reverse a String, which is passed as the parameter
    // Use it on this reversed string to check it!
    // Try to solve this using charAt() first, and optionally anything else after.

    reversed = reverseText(reversed);

    System.out.println(reversed);
  }

  public static String reverseText(String textToReverse) {
    String returnedText = "";
    for (int i = textToReverse.length() - 1; i >= 0; i--) {
      returnedText += textToReverse.charAt(i);
    }
    return returnedText;
  }
}