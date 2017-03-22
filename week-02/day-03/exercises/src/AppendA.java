/**
 * Created by marcell on 22/03/17.
 */
public class AppendA {

  public static void main(String[] args) {
// - Create a string variable named `am` and assign the value `kuty` to it
    String am = "kuty";
// - Write a function called `appendA` that gets a string as an input
//   and appends an 'a' character to its end
// - Print the result of `appendA(am)`
    System.out.println(appendA(am));
  }

  public static String appendA(String stringToAppendTo) {
    return stringToAppendTo + 'a';
  }
}
