import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SudokuValidator {

  public static boolean validSolution(int[][] sudokuTable) {

    if (containsZero(sudokuTable)) {
      return false;
    }

    if (!allRowsContainAllDigits(sudokuTable)) {
      return false;
    }

    if (!allColumnsContainAllDigits(sudokuTable)) {
      return false;
    }

    return true;
  }

  private static boolean allColumnsContainAllDigits(int[][] sudokuTable) {
    for (int i = 0; i < sudokuTable.length; i++) {
      List<Integer> currentColumn = new ArrayList<>();
      for (int j = 0; j < sudokuTable[i].length; j++) {
        currentColumn.add(sudokuTable[j][i]);
      }
      for (int digit = 1; digit <= 9; digit++) {
        if (!currentColumn.contains(digit)) {
          return false;
        }
      }
    }
    return true;
  }

  private static boolean allRowsContainAllDigits(int[][] sudokuTable) {
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

  private static boolean containsZero(int[][] sudokuTable) {
    for (int i = 0; i < sudokuTable.length; i++) {
      for (int j = 0; j < sudokuTable[i].length; j++) {
        if (sudokuTable[i][j] == 0) {
          return true;
        }
      }
    }
    return false;
  }
}
