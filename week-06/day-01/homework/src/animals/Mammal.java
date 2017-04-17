package animals;

public class Mammal extends Animal implements ChildFromUterus {

  public Mammal(String name) {
    super(name);
    wantChildFrom = ChildFromUterus.CHILD_FROM;
  }

  @Override
  void greet() {

  }

  @Override
  void move() {

  }

  @Override
  void eat() {

  }

  @Override
  void die() {

  }
}
