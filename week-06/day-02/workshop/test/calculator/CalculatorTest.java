package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

  @Test
  void add_2Numbers() {
    assertEquals(7.5, Calculator.add(2, 5.5));
  }

  @Test
  void add_1Number() {
    assertEquals(Double.valueOf(7.5), Calculator.add(7.5));
  }

  @Test
  void add_0Numbers() {
    assertEquals(Double.valueOf(0), Calculator.add());
  }

  @Test
  void subtract_2Numbers() {
    assertEquals(-3.5, Calculator.subtract(2, 5.5));
  }

  @Test
  void subtract_1Number() {
    assertEquals(Double.valueOf(-3.5), Calculator.subtract(-3.5));
  }

  @Test
  void subtract_0Numbers() {
    assertEquals(Double.valueOf(0), Calculator.subtract());
  }

  @Test
  void multiply() {
  }

  @Test
  void divide() {
  }

}