import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FibonacciTest {

  @Test
  void testWithFibonacciSequence() {
    int[] fibonacciSequence =
            new int[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584,
                    4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811};

    for (int i = 0; i < fibonacciSequence.length; i++) {
      assertEquals(fibonacciSequence[i], Fibonacci.getNthIndexValue(i));
    }
  }

  @Test
  void testMisaligned() {
    int[] fibonacciSequence =
            new int[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584,
                    4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811};

    for (int i = 0; i < fibonacciSequence.length; i++) {
      assertNotEquals(fibonacciSequence[i], Fibonacci.getNthIndexValue(i + 5));
    }
  }

  @Test
  void testValueZero() {
    assertEquals(0, Fibonacci.getNthIndexValue(0));
  }

  @Test
  void testWithNull() {
    // Don't know how to do that. Test method fails if I try to give a null Integer to
    // Fibonacci.getNthIndexValue().
  }
}