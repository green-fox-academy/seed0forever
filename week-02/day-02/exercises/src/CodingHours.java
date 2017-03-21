public class CodingHours {
  public static void main(String[] args) {
    // An average Green Fox attendee codes 6 hours daily
    // The semester is 17 weeks long

    // Amount of hours spent with coding during a semester by an attendee,
    // if the attendee only codes on workdays:
    System.out.println("An average Green Fox attendee spends " + (6 * 5 * 17) + " hours with coding in a semester.\n");

    System.out.println("On average, attendees spend " + (int) ((6 * 5 * 17.) / (52 * 17) * 100) + "% of an 52-hour work week on coding.");
  }
}
