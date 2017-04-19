package exceptions.splitstring;

public class SplitString {

  public static String[] split(String string, int splitAfter) {
    String[] splitString = new String[2];

    try {
      splitString[0] = string.substring(0, splitAfter);
      splitString[1] = string.substring(splitAfter);
    } catch (StringIndexOutOfBoundsException e) {
      String msg = e.getMessage();
      int invalidIndex = Integer.parseInt(msg.substring(msg.lastIndexOf(" ") + 1));

      if (invalidIndex < 0) {
        splitString[0] = "";
        splitString[1] = string;
      } else {
        splitString[0] = string;
        splitString[1] = "";
      }
    }
    return splitString;
  }
}
