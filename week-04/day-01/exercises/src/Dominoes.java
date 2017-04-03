import java.util.ArrayList;
import java.util.List;

public class Dominoes {

  public static void main(String[] args) {
    List<Domino> dominoes = initializeDominoes();
    // You have the list of Dominoes
    // Order them into one snake where the adjacent dominoes have the same numbers
    // on their adjacent sides
    // eg: [2, 4], [4, 3], [3, 5] ...

    List<Domino> dominoesSorted = sortDominoes(dominoes);

    System.out.println(dominoes);
    System.out.println(dominoesSorted);
  }

  public static List<Domino> sortDominoes(List<Domino> dominoList) {
    List<Domino> dominoesSorted = new ArrayList<>();

    dominoesSorted.add(dominoList.get(0));
    dominoList.remove(0);

    while (dominoList.size() > 0) {
      for (int i = 0; i < dominoList.size(); i++) {
        if (dominoesSorted.get(dominoesSorted.size() - 1).getValues()[1] == dominoList.get(i)
                .getValues()[0]) {
          dominoesSorted.add(dominoList.get(i));
          dominoList.remove(i);
          continue;
        }
      }
    }
    return dominoesSorted;

  }

  static List<Domino> initializeDominoes() {
    List<Domino> dominoes = new ArrayList<>();
    dominoes.add(new Domino(5, 2));
    dominoes.add(new Domino(4, 6));
    dominoes.add(new Domino(1, 5));
    dominoes.add(new Domino(6, 7));
    dominoes.add(new Domino(2, 4));
    dominoes.add(new Domino(7, 1));
    return dominoes;
  }
}
