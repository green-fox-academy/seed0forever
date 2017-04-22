package charoperations;

public class CharOperations implements CharSequence {

  private String input;

  public CharOperations(String input) {
    this.input = input;
  }

  @Override
  public String toString() {
    return reverse(input);
  }

  private String reverse(String input) {
    StringBuilder original = new StringBuilder(input);
    return original.reverse().toString();
  }

  @Override
  public int length() {
    return input.length();
  }

  @Override
  public char charAt(int index) {
    return input.charAt(input.length() - index - 1);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    String reversed = reverse(input);
    return reversed.substring(start, end);
  }
}
