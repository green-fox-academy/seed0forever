package greenfox;

public class Sponsor extends Person {

  String company;
  int hiredStudents;

  public Sponsor() {
    this("Jane Doe", 30, "female", "Google");
  }

  public Sponsor(String name, int age, String gender, String company) {
    hiredStudents = 0;
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.company = company;
  }

  void introduce() {
    System.out.println(
            "Hi, I'm " + name + ", a " + age + " year old + " + gender + " who represents "
                    + company + " and hired " + hiredStudents + " students so far.");
  }

  void hire() {
    hiredStudents++;
  }

  void getGoal() {
    System.out.println("Hire brilliant junior software developers.");
  }

}
