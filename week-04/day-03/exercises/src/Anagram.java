public class Anagram {

  public static boolean areTheyAnagrams(String string1, String string2) {
    return CountLetters.getLetterOccurrences(string1)
            .equals(CountLetters.getLetterOccurrences(string2));
  }

}
