package pirate;

public class BattleApp {

  public static void main(String[] args) {
    Ship ship1 = new Ship();
    ship1.printStatus();
    ship1.fillShip();
    ship1.printStatus();
    for (int i = 0; i < 5; i++) {
      ship1.getCaptain().drinkSomeRum();
    }

    Ship ship2 = new Ship();
    ship2.printStatus();
    ship2.fillShip();
    ship2.printStatus();
    for (int i = 0; i < 6; i++) {
      ship2.getCaptain().drinkSomeRum();
    }
    ship2.printStatus();
  }
}
