import java.util.Arrays;

public class ArraysAppendA {

  public static void main(String[] args) {
    // - Create an array variable named `nimals`
//   with the following content: `["kuty", "macs", "cic"]`
    String[] nimals = {"kuty", "macs", "cic"};
// - Add all elements an `"a"` at the end
    for (int i = 0; i < nimals.length; i++) {
      nimals[i] += "a";
    }
    System.out.println(Arrays.toString(nimals));
  }

}
