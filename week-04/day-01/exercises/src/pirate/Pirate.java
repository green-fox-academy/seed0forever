package pirate;

class Pirate {

  private int rumsDrank, idNumber;
  private boolean isAlive, isPassedOut;
  private final String DEAD_MESSAGE;
  private final String DEAD_MESSAGE_FOR_ANOTHER;

  Pirate() {
    rumsDrank = 0;
    isAlive = true;
    isPassedOut = false;
    DEAD_MESSAGE = "He's dead!";
    DEAD_MESSAGE_FOR_ANOTHER = "The other pirate is dead!";
  }

  void drinkSomeRum() {
    rumsDrank++;
    if (rumsDrank > 5) {
      passOut();
    }
  }

  void setIdNumber(int idNumber) {
    this.idNumber = idNumber;
  }

  void howsItGoingMate() {
    String askMoreRum = "Pour me anudder!";
    String tooDrunk = "Arghh, I'ma Pirate. How d'ya d'ink its goin?";

    if (isAlive) {
      String answer = (!isPassedOut) ? askMoreRum : tooDrunk;
      System.out.println(answer);
    } else {
      System.out.println(DEAD_MESSAGE);
    }
  }

  private void die() {
    isAlive = false;
  }

  void brawl(Pirate anotherPirate) {
    if (!isAlive) {
      System.out.println(DEAD_MESSAGE);
    } else if (!anotherPirate.isAlive) {
      System.out.println(DEAD_MESSAGE_FOR_ANOTHER);
    } else {
      // outcome: what is the result of the fight
      // 1 - this Pirate dies
      // 2 - the other Pirate dies
      // 3 - both Pirates pass out
      int outcome = 1 + (int) (Math.random() * 3);
      switch (outcome) {
        case 1:
          die();
          break;
        case 2:
          anotherPirate.die();
          break;
        case 3:
          passOut();
          anotherPirate.passOut();
        default:
      }
    }
  }

  private void passOut() {
    isPassedOut = true;
  }

  int getRumsDrunk() {
    return rumsDrank;
  }

  boolean isPassedOut() {
    return isPassedOut;
  }

  boolean isAlive() {
    return isAlive;
  }
}
