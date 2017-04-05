import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CountLettersTest {

  @Test
  void testWithString() {
    String inputText = "Hello, my name is not important! :)))";

    System.out.println(CountLetters.getLetterOccurrences(inputText).toString());

    assertEquals("{a=2, e=2, h=1, i=2, l=2, m=3, n=3, o=3, p=1, r=1, s=1, t=3, y=1}",
            CountLetters.getLetterOccurrences(inputText).toString());
  }

  @Test
  void testWithAllLowerCaseChars() {
    for (char ch = 'a'; ch <= 'z'; ch++) {
      assertEquals("{" + String.valueOf(ch).toLowerCase() + "=1}",
              CountLetters.getLetterOccurrences(String.valueOf(ch)).toString());
    }
  }

  @Test
  void testWithAllUpperCaseChars() {
    for (char ch = 'A'; ch <= 'Z'; ch++) {
      assertEquals("{" + ch + "=1}",
              CountLetters.getLetterOccurrences(String.valueOf(ch)).toString());
    }
  }
}