package animals;

public class Bird extends Animal implements ChildFromEgg {

  public Bird(String name) {
    super(name);
    wantChildFrom = ChildFromEgg.CHILD_FROM;
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
