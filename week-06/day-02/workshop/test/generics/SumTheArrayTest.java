package generics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumTheArrayTest {

  @Test
  void sum_Integer() {
    Integer[] intArray = {1, 2, 3, 4, 5};
    double expected = 15d;

    assertEquals(expected, SumTheArray.sum(intArray, intArray.length));
  }

  @Test
  void sum_Double() {
    Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
    double expected = 11d;

    assertEquals(expected, SumTheArray.sum(doubleArray, doubleArray.length));
  }

/* // Throws exception; to be implemented:

  @Test
  void sum_Character() {
    Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
    char expected = 'Ŵ';

    assertEquals(expected, SumTheArray.sum(charArray));
  }
*/

}