public class String2 {
  // Given a string, compute recursively a new string where all the 'x' chars have been removed.

  public static void main(String[] args) {
    final String MY_STRING = "Hex box Laxton, xyz! :) x";
    final String CHAR_TO_REMOVE = "x";
    String myNewString;

    myNewString = removeChar(MY_STRING, CHAR_TO_REMOVE);
    System.out.println("Input string, output string:\n"
            + MY_STRING + "\n"
            + myNewString);
  }

  private static String removeChar(String myString, String charChangeFrom) {
    if (!(myString.contains(charChangeFrom))) {
      return myString;
    }
    return myString.substring(0, myString.indexOf(charChangeFrom))
            + removeChar(myString.substring(myString.indexOf(charChangeFrom) + 1),
            charChangeFrom);
  }

}
