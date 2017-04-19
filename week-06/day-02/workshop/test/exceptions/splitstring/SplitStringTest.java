package exceptions.splitstring;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SplitStringTest {

  @Test
  void split_RegularString() {
    String inputString = "Just something here.";
    int splitAfter = 4;
    String[] assertedOutput = {"Just", " something here."};

    assertArrayEquals(assertedOutput, SplitString.split(inputString, splitAfter));
  }

  @Test
  void split_IndexOutOfBoundsException() {
    String inputString = "Just";
    int splitAfter = 5;
    String[] assertedOutput = {"Just", ""};

    assertArrayEquals(assertedOutput, SplitString.split(inputString, splitAfter));
  }

  @Test
  void split_atZero() {
    String inputString = "Just";
    int splitAfter = 0;
    String[] assertedOutput = {"", "Just"};

    assertArrayEquals(assertedOutput, SplitString.split(inputString, splitAfter));
  }

  @Test
  void split_atNegativeIndex() {
    String inputString = "Just";
    int splitAfter = -1;
    String[] assertedOutput = {"", "Just"};

    assertArrayEquals(assertedOutput, SplitString.split(inputString, splitAfter));
  }
}