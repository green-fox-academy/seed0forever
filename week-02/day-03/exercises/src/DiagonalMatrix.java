import java.util.Arrays;

public class DiagonalMatrix {

  public static void main(String[] args) {
    // - Create (dynamically) a two dimensional array
    //   with the following matrix. Use a loop!
    //
    //   1 0 0 0
    //   0 1 0 0
    //   0 0 1 0
    //   0 0 0 1
    //
    int[][] matrix = new int[4][4];
    for (int i = 0; i < matrix.length; i++) {
      Arrays.fill(matrix[i], 0);
      matrix[i][i] = 1;
    }
    for (int[] row : matrix) {
      for (int column : row) {
        System.out.print(column + " ");

      }
      System.out.println("");
    }
  }

}
