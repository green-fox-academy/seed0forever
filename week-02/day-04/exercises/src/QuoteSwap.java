import java.util.*;

public class QuoteSwap {

  public static void main(String... args) {
    ArrayList<String> list = new ArrayList<String>(
            Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

    // Accidentally I messed up this quote from Richard Feynman.
    // Two words are out of place
    // Your task is to fix it by swapping the right words with code

    // Also, print the sentence to the output with spaces in between.

    // Quote should be: "What I cannot create, I do not understand."

    ArrayList<String> sortedList = swapTwoElementsInArrayList(list, list.indexOf("cannot"),
            list.indexOf("do"));

    list.clear();
    list.addAll(sortedList);

    for (String element : list) {
      System.out.print(element + " ");
    }
  }

  private static ArrayList<String> swapTwoElementsInArrayList(ArrayList<String> arrayWhereToSwap,
          int elementIndex1, int elementIndex2) {
    ArrayList<String> tempArrayList = new ArrayList<>();
    tempArrayList.addAll(arrayWhereToSwap);
    String stringToSwap1 = tempArrayList.get(elementIndex1);
    String stringToSwap2 = tempArrayList.get(elementIndex2);
    tempArrayList.set(elementIndex1, stringToSwap2);
    tempArrayList.set(elementIndex2, stringToSwap1);
    return tempArrayList;

  }
}