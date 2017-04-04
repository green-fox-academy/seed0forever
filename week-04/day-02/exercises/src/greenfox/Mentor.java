package greenfox;

public class Mentor extends Person {

  String level; // the level of the mentor (junior / intermediate / senior)

  public Mentor() {
    this("Jane Doe", 30, "female", "intermediate");
  }

  public Mentor(String name, int age, String gender, String level) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.level = level;
  }

  void getGoal() {
    System.out.println("Educate brilliant junior software developers.");
  }

  void introduce() {
    System.out
            .println("Hi, I'm " + name + ", a " + age + " year old " + gender + " " + level
                    + " mentor.");
  }
}
