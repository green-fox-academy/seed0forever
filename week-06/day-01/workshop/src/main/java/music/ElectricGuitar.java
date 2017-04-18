package main.java.music;

public class ElectricGuitar extends StringedInstrument {

  private static final String DEFAULT_NAME = "Electric Guitar";
  private static final int NUM_OF_STRINGS = 6;
  private static final String SOUND_WHEN_PLAYED = "twangs";

  public ElectricGuitar() {
    this(DEFAULT_NAME, NUM_OF_STRINGS, SOUND_WHEN_PLAYED);
  }

  public ElectricGuitar(int numberOfStrings) {
    this(DEFAULT_NAME, numberOfStrings, SOUND_WHEN_PLAYED);
  }

  ElectricGuitar(String name, int numberOfStrings, String soundWhenPlayed) {
    super(name, numberOfStrings, soundWhenPlayed);
  }
}
