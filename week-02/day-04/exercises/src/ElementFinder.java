import java.util.*;

public class ElementFinder {

  public static void main(String... args) {
    ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));

    // Check if the arrayList contains "7" if it contains print "Hoorray" otherwise print "Noooooo"
    // Do this again with a different solution using different list functions!

    int numberToSearchFor = 7;

    if (arrayList.contains(numberToSearchFor)) {
      System.out.println("Hooray");
    } else {
      System.out.println("Noooooo");
    }

    if (arrayList.indexOf(numberToSearchFor) != -1) {
      System.out.println("Hooray");
    } else {
      System.out.println("Noooooo");
    }

    int numOccurrences = 0;
    for (int i = 0; i < arrayList.size(); i++) {
      numOccurrences += (arrayList.get(i) == numberToSearchFor) ? 1 : 0;
    }
    if (numOccurrences != 0) {
      System.out.println("Hooray");
    } else {
      System.out.println("Noooooo");
    }

  }
}