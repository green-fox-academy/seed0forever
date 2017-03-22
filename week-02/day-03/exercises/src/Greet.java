/**
 * Created by marcell on 22/03/17.
 */
public class Greet {

  public static void main(String[] args) {

// - Create a string variable named `al` and assign the value `Greenfox` to it
    String al = "Greenfox";
// - Create a function called `greet` that greets it's input parameter
//     - Greeting is printing e.g. `Greetings dear, Greenfox`
// - Greet `al`
    greet(al);


  }

  public static void greet(String nameToGreet) {
    System.out.println("Greetings, dear " + nameToGreet + "!");

  }

}
