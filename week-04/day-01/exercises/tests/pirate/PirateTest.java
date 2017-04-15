package pirate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PirateTest {

  @Test
  void constructor() {
    Pirate pirateDefault = new Pirate();

  }

  @Test
  void drinkSomeRum() {

  }

  @Test
  void howsItGoingMate() {
    Pirate pirate1 = new Pirate();

    pirate1.howsItGoingMate();
    for (int i = 0; i < 5; i++) {
      pirate1.drinkSomeRum();
    }
    pirate1.howsItGoingMate();
  }

}