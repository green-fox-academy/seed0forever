import java.util.Arrays;

public class SumAll {

  public static void main(String[] args) {
    // - Create an array variable named `ai`
    //   with the following content: `[3, 4, 5, 6, 7]`
    int[] ai = {3, 4, 5, 6, 7};
    System.out.println("Elements of ai: " + Arrays.toString(ai));
    // - Print the sum of the elements in `ai`
    int aiSumOfElements = 0;
    for (int aiElement : ai) {
      aiSumOfElements += aiElement;
    }
    System.out.println("Sum of the elements of ai: " + aiSumOfElements);
  }
}
