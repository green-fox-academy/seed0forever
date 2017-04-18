package main.java.music;

public class Violin extends StringedInstrument {

  private static final String DEFAULT_NAME = "Violin";
  private static final int NUM_OF_STRINGS = 4;
  private static final String SOUND_WHEN_PLAYED = "screeches";

  public Violin() {
    this(DEFAULT_NAME, NUM_OF_STRINGS, SOUND_WHEN_PLAYED);
  }

  Violin(String name, int numberOfStrings, String soundWhenPlayed) {
    super(name, numberOfStrings, soundWhenPlayed);
  }
}
