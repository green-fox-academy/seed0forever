import java.util.Arrays;

public class SwapElements {

  public static void main(String[] args) {
    // - Create an array variable named `abc`
//   with the following content: `["first", "second", "third"]`
    String[] abc = {"first", "second", "third"};
// - Swap the first and the third element of `abc`
    String swapTemp = abc[0];
    abc[0] = abc[2];
    abc[2] = swapTemp;
    System.out.println(Arrays.toString(abc));
  }
}
