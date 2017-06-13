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

    if (!allBoxesContainAllDigits(sudokuTable)) {
      return false;
    }

    return true;
  }

  private static boolean allBoxesContainAllDigits(int[][] sudokuTable) {

    for (int boxRow = 0; boxRow < 3; boxRow++) {
      for (int boxColumn = 0; boxColumn < 3; boxColumn++) {

        List<Integer> currentBoxElements = new ArrayList<>();

        for (int i = boxRow * 3; i < boxRow * 3 + 3; i++) {
          for (int j = boxColumn * 3; j < boxColumn * 3 + 3; j++) {
            currentBoxElements.add(sudokuTable[i][j]);
          }
        }

        if (!containsAllDigits(currentBoxElements)) {
          return false;
        }
      }
    }

    return true;
  }

  private static boolean allColumnsContainAllDigits(int[][] sudokuTable) {
    for (int i = 0; i < sudokuTable.length; i++) {

      List<Integer> currentColumn = new ArrayList<>();

      for (int j = 0; j < sudokuTable[i].length; j++) {
        currentColumn.add(sudokuTable[j][i]);
      }

      if (!containsAllDigits(currentColumn)) {
        return false;
      }
    }

    return true;
  }

  private static boolean allRowsContainAllDigits(int[][] sudokuTable) {
    for (int i = 0; i < sudokuTable.length; i++) {

      List<Integer> currentRow = IntStream.of(sudokuTable[i]).boxed().collect(Collectors.toList());

      if (!containsAllDigits(currentRow)) {
        return false;
      }
    }

    return true;
  }

  private static boolean containsAllDigits(List<Integer> sudokuNumbers) {
    for (int digit = 1; digit <= 9; digit++) {
      if (!sudokuNumbers.contains(digit)) {
        return false;
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
