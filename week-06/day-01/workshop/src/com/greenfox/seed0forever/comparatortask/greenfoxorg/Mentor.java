package com.greenfox.seed0forever.comparatortask.greenfoxorg;

public class Mentor extends Person implements Comparable {

  private MentorLevel level; // the level of the mentor (junior / intermediate / senior)

  public Mentor() {
    this("Jane Doe", 30, "female", MentorLevel.INTERMEDIATE);
  }

  public Mentor(String name, int age, String gender, MentorLevel level) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.level = level;
  }

  public MentorLevel getLevel() {
    return level;
  }

  void getGoal() {
    System.out.println("Educate brilliant junior software developers.");
  }

  void introduce() {
    System.out
            .printf("Hi, I'm %s, a %d year old %s %s mentor.%n", name, age, gender, level);
  }

  @Override
  public int compareTo(Object anotherMentor) {
    if (anotherMentor instanceof Mentor) {
      int x = level.getLevelIntValue();
      int y = ((Mentor) anotherMentor).getLevel().getLevelIntValue();
      return (x < y) ? -1 : ((x == y) ? 0 : 1);
    }
    return 0;
  }
}
