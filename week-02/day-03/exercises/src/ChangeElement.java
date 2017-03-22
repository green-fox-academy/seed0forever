import java.util.Arrays;

public class ChangeElement {

  public static void main(String[] args) {
    // - Create an array variable named `s`
    //   with the following content: `[1, 2, 3, 8, 5, 6]`
    int[] s = {1, 2, 3, 8, 5, 6};
    System.out.println("Original value of the 4th element: " + s[3]);
    // - Change the 8 to 4
    int numToSearch = 8;
    int numToReplaceTo = 4;
    for (int i = 0; i < s.length; i++) {
      if (s[i] == numToSearch) {
        s[i] = numToReplaceTo;
      }
    }
  // - Print the fourth element
    System.out.println("Searched for number "+numToSearch +" in the array.");
    System.out.println("Tried to change all instances of number "+numToSearch
            +" to number "+numToReplaceTo +".");
    System.out.println("Value of the 4th element: "+s[3]);
}
}
