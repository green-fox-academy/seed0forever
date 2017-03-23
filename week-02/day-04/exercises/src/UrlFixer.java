public class UrlFixer {

  public static void main(String... args) {
    String url = "https//www.reddit.com/r/nevertellmethebots";

    // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
    // Also, the URL is missing a crutial component, find out what it is and insert it too!
    // Try to solve it more than once using different String functions!

    url = url.replace("bots", "odds");
    url = url.substring(0, 5) + ":" + url.substring(5);
    System.out.println(url);

    // Solution 2:
    url = "https//www.reddit.com/r/nevertellmethebots";

    url = url.replace("bots", "odds");
    url = url.replace("https", "https:");
    System.out.println("\nSolution 2:\n" + url);

    // Solution 3:
    url = "https//www.reddit.com/r/nevertellmethebots";

    url = url.substring(0, url.length() - 4) + "odds";
    url = url.substring(0, url.indexOf("//")) + ":" + url.substring(url.indexOf("//"));
    System.out.println("\nSolution 3:\n" + url);
  }
}