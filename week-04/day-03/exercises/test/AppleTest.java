import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AppleTest {

  @Test
  void getApple() {
    Apple testApple = new Apple();
    assertEquals("apple", testApple.getApple());
  }

}