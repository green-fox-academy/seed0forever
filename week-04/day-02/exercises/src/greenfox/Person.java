package greenfox;

public class Person {
  String name;
  int age;
  String gender;

  public Person() {
    this("Jane Doe", 30, "female");
  }

  public Person(String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  void introduce() {
    System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + ".");
  }

  void getGoal() {
    System.out.println("My goal is: Live for the moment!");
  }
}
