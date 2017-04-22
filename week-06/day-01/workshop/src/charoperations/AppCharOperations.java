package charoperations;

public class AppCharOperations {

  public static void main(String[] args) {
    String testSequence1 = "12345 abcdef";
    CharOperations testCharOperations = new CharOperations(testSequence1);

    System.out.println(testCharOperations.toString());
    System.out.println(testCharOperations.length());
    System.out.println(testCharOperations.charAt(3));
    System.out.println(testCharOperations.subSequence(3, 9));
  }
}
