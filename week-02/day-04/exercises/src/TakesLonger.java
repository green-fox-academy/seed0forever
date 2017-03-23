public class TakesLonger {

  public static void main(String... args) {
    String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

    // When saving this quote a disk error has occured. Please fix it.
    // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
    // Using pieces of the quote variable (instead of just redefining the string)

    String whatToInsert = "always takes longer than";
    String toInsertBetween = "It you";
    String[] wordBeforeAndAfter = toInsertBetween.split(" ");

    quote = quote.substring(0, quote.indexOf(toInsertBetween)
                                            + wordBeforeAndAfter[0].length())
                            + " " + whatToInsert + " "
                            + wordBeforeAndAfter[1]
                            + quote.substring(quote.indexOf(toInsertBetween)
                                            + toInsertBetween.length());

    System.out.println(quote);
  }
}