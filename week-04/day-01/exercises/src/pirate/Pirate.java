package pirate;

class Pirate {
  private int rumsDrank;
  private boolean isDead;

  Pirate() {
    rumsDrank = 0;
    isDead = false;
  }

  void drinkSomeRum() {
    rumsDrank++;
  }

  void howsItGoingMate() {
    String askMoreRum = "Pour me anudder!";
    String tooDrunk = "Arghh, I'ma Pirate. How d'ya d'ink its goin?";

    String answer = (rumsDrank < 5) ? askMoreRum : tooDrunk;
    System.out.println(answer);
  }


}
