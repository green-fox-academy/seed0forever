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

  private static String changeChar(String my_string, String char_change_from,
          String char_change_to) {
    if (!(my_string.contains(char_change_from))) {
      return my_string;
    }
    return my_string.substring(0, my_string.indexOf(char_change_from))
            + char_change_to
            + changeChar(my_string.substring(my_string.indexOf(char_change_from) + 1),
            char_change_from, char_change_to);
  }
}
