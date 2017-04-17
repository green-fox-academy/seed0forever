package animals;

import static animals.ChildFromEgg.CHILD_FROM;

public class Reptile extends Animal implements ChildFromEgg {

  public Reptile(String name) {
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
