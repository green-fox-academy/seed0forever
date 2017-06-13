import org.junit.*;

import static org.junit.Assert.*;

public class SudokuValidatorTest {

  private static final int[][] example1 = new int[][]{
          {5, 3, 4, 6, 7, 8, 9, 1, 2},
          {6, 7, 2, 1, 9, 5, 3, 4, 8},
          {1, 9, 8, 3, 4, 2, 5, 6, 7},
          {8, 5, 9, 7, 6, 1, 4, 2, 3},
          {4, 2, 6, 8, 5, 3, 7, 9, 1},
          {7, 1, 3, 9, 2, 4, 8, 5, 6},
          {9, 6, 1, 5, 3, 7, 2, 8, 4},
          {2, 8, 7, 4, 1, 9, 6, 3, 5},
          {3, 4, 5, 2, 8, 6, 1, 7, 9}};
  private static final int[][] example2 = new int[][]{
          {5, 3, 4, 6, 7, 8, 9, 1, 2},
          {6, 7, 2, 1, 9, 0, 3, 4, 8},
          {1, 0, 0, 3, 4, 2, 5, 6, 0},
          {8, 5, 9, 7, 6, 1, 0, 2, 0},
          {4, 2, 6, 8, 5, 3, 7, 9, 1},
          {7, 1, 3, 9, 2, 4, 8, 5, 6},
          {9, 0, 1, 5, 3, 7, 2, 1, 4},
          {2, 8, 7, 4, 1, 9, 6, 3, 5},
          {3, 0, 0, 4, 8, 1, 1, 7, 9}};
  private static final int[][] example3 = new int[][]{
          {6, 3, 4, 6, 7, 8, 9, 1, 2},
          {6, 7, 2, 1, 9, 5, 3, 4, 8},
          {1, 9, 8, 3, 4, 2, 5, 6, 7},
          {8, 5, 9, 7, 6, 1, 4, 2, 3},
          {4, 2, 6, 8, 5, 3, 7, 9, 1},
          {7, 1, 3, 9, 2, 4, 8, 5, 6},
          {9, 6, 1, 5, 3, 7, 2, 8, 4},
          {2, 8, 7, 4, 1, 9, 6, 3, 5},
          {3, 4, 5, 2, 8, 6, 1, 7, 9}};
  private static final int[][] example4 = new int[][]{
          {1, 2, 3, 4, 5, 6, 7, 8, 9},
          {1, 2, 3, 4, 5, 6, 7, 8, 9},
          {1, 2, 3, 4, 5, 6, 7, 8, 9},
          {1, 2, 3, 4, 5, 6, 7, 8, 9},
          {1, 2, 3, 4, 5, 6, 7, 8, 9},
          {1, 2, 3, 4, 5, 6, 7, 8, 9},
          {1, 2, 3, 4, 5, 6, 7, 8, 9},
          {1, 2, 3, 4, 5, 6, 7, 8, 9},
          {1, 2, 3, 4, 5, 6, 7, 8, 9}};
  private static final int[][] example5 = new int[][]{
          {1, 2, 3, 4, 5, 6, 7, 8, 9},
          {2, 3, 4, 5, 6, 7, 8, 9, 1},
          {3, 4, 5, 6, 7, 8, 9, 1, 2},
          {4, 5, 6, 7, 8, 9, 1, 2, 3},
          {5, 6, 7, 8, 9, 1, 2, 3, 4},
          {6, 7, 8, 9, 1, 2, 3, 4, 5},
          {7, 8, 9, 1, 2, 3, 4, 5, 6},
          {8, 9, 1, 2, 3, 4, 5, 6, 7},
          {9, 1, 2, 3, 4, 5, 6, 7, 8}};

  @Before
  public void setUp() throws Exception {
  }

  @Test
  public void validSolution_example1_true() throws Exception {
    assertTrue(SudokuValidator.validSolution(example1));
  }

  @Test
  public void validSolution_example2_false() throws Exception {
    assertFalse(SudokuValidator.validSolution(example2));
  }

  @Test
  public void validSolution_example3_false() throws Exception {
    assertFalse(SudokuValidator.validSolution(example3));
  }

  @Test
  public void validSolution_example4_false() throws Exception {
    assertFalse(SudokuValidator.validSolution(example4));
  }

  @Test
  public void validSolution_example5_false() throws Exception {
    assertFalse(SudokuValidator.validSolution(example5));
  }

}