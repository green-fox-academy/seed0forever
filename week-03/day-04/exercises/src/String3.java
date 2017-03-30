public class String3 {
  // Given a string, compute recursively a new string where all the
  // adjacent chars are now separated by a "*".

  public static void main(String[] args) {
    final String MY_STRING = "Hex box Laxton, xyz! :) x";
    final String CHAR_SEPARATOR = "*";
    String myNewString;

    myNewString = insertBetweenChars(MY_STRING, CHAR_SEPARATOR);
    System.out.println("Input string, output string:\n"
            + MY_STRING + "\n"
            + myNewString);
  }

  private static String insertBetweenChars(String myString, String charSeparator) {
    if (myString.length() == 1) {
      return myString;
    }
    return myString.substring(0, 1)
            + charSeparator
            + insertBetweenChars(myString.substring(1), charSeparator);
  }

}
