import java.util.HashMap;

public class CountLetters {

  public CountLetters() {

  }

  public static HashMap<Character, Integer> getLetterOccurrences(String s) {
    HashMap<Character, Integer> letterOccurrences = new HashMap<>();
    s = s.toLowerCase();
    s = s.replaceAll("[^a-z]", "");
    for (int i = 0; i < s.length(); i++) {
      if (letterOccurrences.containsKey(s.charAt(i))) {
        letterOccurrences.put(s.charAt(i), letterOccurrences.get(s.charAt(i)) + 1);
      } else {
        letterOccurrences.put(s.charAt(i), 1);
      }
    }
    return letterOccurrences;
  }

}
