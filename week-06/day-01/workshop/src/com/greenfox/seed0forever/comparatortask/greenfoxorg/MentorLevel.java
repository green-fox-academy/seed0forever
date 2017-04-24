package com.greenfox.seed0forever.comparatortask.greenfoxorg;

public enum MentorLevel {
  BEGINNER(1), INTERMEDIATE(2), SENIOR(3);

  private int level;

  public int getLevelIntValue() {
    return level;
  }

  MentorLevel(int level) {
    this.level = level;
  }


  @Override
  public String toString() {
    String constantName = super.toString();
    return constantName.toLowerCase();
  }
}
