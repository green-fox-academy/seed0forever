package pirate;

class Pirate {

  private int rumsDrank;
  private boolean isAlive;
  private String deadMessage;

  Pirate() {
    rumsDrank = 0;
    isAlive = true;
    deadMessage = "He's dead!";
  }

  void drinkSomeRum() {
    rumsDrank++;
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

  }


}
