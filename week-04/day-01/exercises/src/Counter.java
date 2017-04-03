public class Counter {

  int counter, counterInitial;

  public Counter() {
    this(0);
  }

  public Counter(int counter) {
    this.counter = counter;
    this.counterInitial = counter;
  }

  public void add() {
    this.add(1);
  }

  public void add(int number) {
    this.counter += number;
  }

  public int get() {
    return this.counter;
  }

  public void reset() {
    this.counter = this.counterInitial;
  }

}
