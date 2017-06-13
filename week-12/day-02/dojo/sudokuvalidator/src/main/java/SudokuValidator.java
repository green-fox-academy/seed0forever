import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SudokuValidator {

  public static boolean validSolution(int[][] sudokuTable) {

    for (int i = 0; i < sudokuTable.length; i++) {
      for (int j = 0; j < sudokuTable.length; j++) {
        if (sudokuTable[i][j] == 0) {
          return false;
        }
      }
    }

    for (int i = 0; i < sudokuTable.length; i++) {

      List<Integer> currentRow = IntStream.of(sudokuTable[i]).boxed().collect(Collectors.toList());

      for (int digit = 1; digit <= 9; digit++) {
        if (!currentRow.contains(digit)) {
          return false;
        }
      }
    }

    return true;

  }
}
