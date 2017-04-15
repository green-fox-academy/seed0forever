package pirate;

class Pirate {

  private int rumsDrank, idNumber;
  private boolean isAlive, isPassedOut;
  private String deadMessage;
  private String anotherDeadMessage;

  Pirate() {
    rumsDrank = 0;
    isAlive = true;
    isPassedOut = false;
    deadMessage = "He's dead!";
    anotherDeadMessage = "The other pirate is dead!";
  }

  void drinkSomeRum() {
    rumsDrank++;
  }

  void setIdNumber(int idNumber) {
    this.idNumber = idNumber;
  }

  void howsItGoingMate() {
    String askMoreRum = "Pour me anudder!";
    String tooDrunk = "Arghh, I'ma Pirate. How d'ya d'ink its goin?";

    if (isAlive) {
      String answer = (rumsDrank < 5) ? askMoreRum : tooDrunk;
      System.out.println(answer);
    } else {
      System.out.println(deadMessage);
    }
  }

  void die() {
    isAlive = false;
  }

  void brawl(Pirate anotherPirate) {
    if (!isAlive) {
      System.out.println(deadMessage);
    } else if (!anotherPirate.isAlive) {
      System.out.println(anotherDeadMessage);
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
}
