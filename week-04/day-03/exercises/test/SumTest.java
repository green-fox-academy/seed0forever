import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SumTest {

  Sum testSumObj;
  ArrayList<Integer> listOfInts;

  @BeforeEach
  void setUp() {
    testSumObj = new Sum();
    listOfInts = new ArrayList<>();
  }

  @Test
  void sumFromOneToMax() {
    int maxValue = 10;
    listOfInts = createIntListFromOneTo(maxValue);
    int correctSum = 55;

    assertEquals(correctSum, testSumObj.sum(listOfInts));
  }

  @Test
  void sumEmptyList() {
    int correctSum = 0;

    assertEquals(correctSum, testSumObj.sum(listOfInts));
    listOfInts.add(0);
    listOfInts.clear();
    assertEquals(correctSum, testSumObj.sum(listOfInts));
  }

  @Test
  void sumOneElementList() {
    int correctSum = 17;

    listOfInts.add(17);
    assertEquals(correctSum, testSumObj.sum(listOfInts));
  }

  @Test
  void sumNull() {
    int correctSum = 0;

    assertEquals(correctSum, testSumObj.sum(listOfInts));
  }

  private ArrayList<Integer> createIntListFromOneTo(int maxValue) {
    ArrayList<Integer> listOfIncrementalInts = new ArrayList<>();

    for (int i = 1; i <= maxValue; i++) {
      listOfIncrementalInts.add(i);
    }
    return listOfIncrementalInts;
  }

}