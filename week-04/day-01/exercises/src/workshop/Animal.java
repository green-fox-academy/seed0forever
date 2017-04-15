package workshop;

public class Animal {

  int hunger;
  int thirst;

  public Animal() {
    this(50, 50);
  }

  public Animal(int hunger, int thirst) {
    this.hunger = hunger;
    this.thirst = thirst;
  }

  public void eat() {
    if (this.hunger != 0) {
      this.hunger--;
    }
  }

  public void drink() {
    if (this.thirst != 0) {
      this.thirst--;
    }
  }

  public void play() {
    this.hunger++;
    this.thirst++;
  }

  public static void main(String[] args) {
    Animal myDog = new Animal();

    System.out.println("Now I have a new Animal object named myDog.");
    System.out.println("myDog's current hunger: " + myDog.hunger);
    System.out.println("myDog's current thirst: " + myDog.thirst);

    for (int i = 0; i < 4; i++) {
      myDog.play();
      System.out.println(
              "myDog plays. Then, hunger is " + myDog.hunger + " and thirst is " + myDog.thirst);
    }

    for (int i = 0; i < 10; i++) {
      myDog.drink();
    }
    System.out.println(
            "myDog drank 10 rounds. Hunger: " + myDog.hunger + ", thirst: " + myDog.thirst);

    for (int i = 0; i < 20; i++) {
      myDog.eat();
    }
    System.out.println(
            "myDog ate for 20 rounds. Hunger: " + myDog.hunger + ", thirst: " + myDog.thirst);

    while (myDog.thirst > 0) {
      myDog.drink();
    }
    System.out.println("myDog drank until he wasn't thirsty. Hunger: " + myDog.hunger + ", thirst: "
            + myDog.thirst);

    while (myDog.hunger > 0) {
      myDog.eat();
    }
    System.out.println("myDog ate until he wasn't hungry. Hunger: " + myDog.hunger + ", thirst: "
            + myDog.thirst);

  }

}
