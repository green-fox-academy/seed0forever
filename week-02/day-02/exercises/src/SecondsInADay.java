public class SecondsInADay {

  public static void main(String[] args) {
    int currentHours = 14;
    int currentMinutes = 34;
    int currentSeconds = 42;
    int numberOfSecondsInADay = 24 * 60 * 60;
    int currentTimeInSeconds = currentHours * 60 * 60
            + currentMinutes * 60
            + currentSeconds;
    System.out.println("Current time: " + currentHours
            + ":" + currentMinutes
            + ":" + currentSeconds);
    System.out.println("Remaining seconds of the day: "
            + (numberOfSecondsInADay - currentTimeInSeconds));
  }
}
