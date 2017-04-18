package main.java.music;

abstract class Instrument {

  private String name;
  private String soundWhenPlayed;

  Instrument() {

  }

  Instrument(String name, String soundWhenPlayed) {
    this.name = name;
    this.soundWhenPlayed = soundWhenPlayed;
  }

  abstract public void play();

  String getName() {
    return name;
  }

  String getSoundWhenPlayed() {
    return soundWhenPlayed;
  }
}
