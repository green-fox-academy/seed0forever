package main.java.music;

abstract class StringedInstrument extends Instrument {

  private int numberOfStrings;
  final String formatForPlay = "%s, a %d-stringed instrument that %s\n";

  StringedInstrument() {
  }

  StringedInstrument(String name, int numberOfStrings, String soundWhenPlayed) {
    this(name, soundWhenPlayed);
    this.numberOfStrings = numberOfStrings;
  }

  StringedInstrument(String name, String soundWhenPlayed) {
    super(name, soundWhenPlayed);
  }

  @Override
  public void play() {
    System.out.printf(formatForPlay, getName(), numberOfStrings, getSoundWhenPlayed());
  }
}
