import java.util.Arrays;

public class Dice {

  //    You have a Dice class which has 6 dice
  //    You can roll all of them with roll()
  //    Check the current rolled numbers with getCurrent()
  //    You can reroll with reroll()
  //    Your task is to get where all dice is a 6
  int[] dices = new int[6];

  public static void main(String[] args) {
    final int TARGET_DICE_VALUE = 6;

    Dice myDice = new Dice();
    myDice.roll();

    System.out.println("Initial: " + Arrays.toString(myDice.getCurrent()));

    rerollUntilTarget(TARGET_DICE_VALUE, myDice);

    System.out.println("Target:  " + Arrays.toString(myDice.getCurrent()));

  }

  private static void rerollUntilTarget(int TARGET_DICE_VALUE, Dice myDice) {
    for (int i = 0; i < myDice.getCurrent().length; i++) {
      while (myDice.getCurrent(i) != TARGET_DICE_VALUE) {
        myDice.reroll(i);
      }
    }
  }

  public int[] roll() {
    for (int i = 0; i < dices.length; i++) {
      dices[i] = (int) (Math.random() * 6) + 1;
    }
    return dices;
  }

  public int[] getCurrent() {
    return dices;
  }

  public int getCurrent(int i) {
    return dices[i];
  }

  public void reroll() {
    for (int i = 0; i < dices.length; i++) {
      dices[i] = (int) (Math.random() * 6) + 1;
    }
  }

  public void reroll(int k) {
    dices[k] = (int) (Math.random() * 6) + 1;
  }
}
