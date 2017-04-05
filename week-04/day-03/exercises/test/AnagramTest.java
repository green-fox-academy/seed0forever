import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AnagramTest {

  @Test
  void testWithSimpleAnagrams1() {
    String text1 = "Anagram";
    String text2 = "Nag a ram";

    assertEquals(true,
            Anagram.areTheyAnagrams(text1, text2));
  }

  @Test
  void testWithAnagramsWithNonLetters() {
    String text1 = "William Shakespeare";
    String text2 = "I am a weakish speller...";

    assertEquals(true,
            Anagram.areTheyAnagrams(text1, text2));
  }

  @Test
  void testWithNonAnagrams() {
    String text1 = "Anagramm";
    String text2 = "Nag a ram";

    assertEquals(false,
            Anagram.areTheyAnagrams(text1, text2));
  }

}