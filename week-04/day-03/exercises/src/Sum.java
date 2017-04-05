import java.util.ArrayList;

public class Sum {

  public Sum() {
  }

  public int sum(ArrayList<Integer> inputList) {
    int sumOfElements = 0;
    if (inputList != null && inputList.size() != 0) {
      for (Integer e : inputList) {
        sumOfElements += e;
      }
    }
    return sumOfElements;
  }
}
