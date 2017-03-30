public class String1 {
  // Given a string, compute recursively (no loops) a new string where all the
  // lowercase 'x' chars have been changed to 'y' chars.

  public static void main(String[] args) {
    final String MY_STRING = "Hex box Laxton, xyz! :) x";
    final String CHAR_CHANGE_FROM = "x";
    final String CHAR_CHANGE_TO = "y";
    String myNewString;

    myNewString = changeChar(MY_STRING, CHAR_CHANGE_FROM, CHAR_CHANGE_TO);
    System.out.println("Input string, output string:\n"
            + MY_STRING + "\n"
            + myNewString);
  }

  private static String changeChar(String myString, String charChangeFrom,
          String charChangeTo) {
    if (!(myString.contains(charChangeFrom))) {
      return myString;
    }
    return myString.substring(0, myString.indexOf(charChangeFrom))
            + charChangeTo
            + changeChar(myString.substring(myString.indexOf(charChangeFrom) + 1),
            charChangeFrom, charChangeTo);
  }
}
