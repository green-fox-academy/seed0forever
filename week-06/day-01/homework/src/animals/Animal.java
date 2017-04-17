package animals;

public abstract class Animal {

  String name, wantChildFrom;
  int age;
  double weight;
  Sex biologicalSex;
  int limbs;
  StateOfMatter respiratesIn;

  public Animal(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  abstract void greet();

  public String wantChild() {
    return "want a child from " + wantChildFrom;
  }

  abstract void move();

  abstract void eat();

  abstract void die();
}
