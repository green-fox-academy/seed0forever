package oddavg;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class OddAvgTest {

  List<Integer> testInput;

  @Test
  void oddAverage_3numbers() {
    testInput = Arrays.asList(5, 10, 15);
    assertEquals(10d, OddAvg.oddAverage(testInput));
  }

  @Test
  void oddAverage_1number() {
    testInput = Arrays.asList(17);
    assertEquals(17, OddAvg.oddAverage(testInput));
  }

  @Test
  void oddAverage_zeroLengthList() {
    testInput = new ArrayList<>();
    assertEquals(0, OddAvg.oddAverage(testInput));
  }

  @Test
  void oddAverage_nullList() {
    assertEquals(0, OddAvg.oddAverage(testInput));
  }

}