package main.java.music;

public class BassGuitar extends StringedInstrument {

  private static final String DEFAULT_NAME = "Bass Guitar";
  private static final int NUM_OF_STRINGS = 4;
  private static final String SOUND_WHEN_PLAYED = "Duum-duum-duum";

  public BassGuitar() {
    this(DEFAULT_NAME, NUM_OF_STRINGS, SOUND_WHEN_PLAYED);
  }

  BassGuitar(String name, int numberOfStrings, String soundWhenPlayed) {
    super(name, numberOfStrings, soundWhenPlayed);
  }
}
