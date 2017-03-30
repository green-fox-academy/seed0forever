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

  private static String removeChar(String my_string, String char_change_from) {
    if (!(my_string.contains(char_change_from))) {
      return my_string;
    }
    return my_string.substring(0, my_string.indexOf(char_change_from))
            + removeChar(my_string.substring(my_string.indexOf(char_change_from) + 1),
            char_change_from);
  }

}
