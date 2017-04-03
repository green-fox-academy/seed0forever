public class Sharpie {

  String color;
  float width;
  float inkAmount;

  public Sharpie(String color, float width) {
    this(color, width, 100f);
  }

  public Sharpie(String color, float width, float inkAmount) {
    this.color = color;
    this.width = width;
    this.inkAmount = inkAmount;
  }

  public void use() {
    this.inkAmount--;
  }

  public static void main(String[] args) {
    Sharpie testSharpie = new Sharpie("green", 20);
    System.out.println("Created testSharpie.");
    System.out.println("testSharpie color: " + testSharpie.color + ", width: " + testSharpie.width
            + ", inkAmount: " + testSharpie.inkAmount);
    testSharpie.use();
    System.out.println("Used testSharpie once.");
    System.out.println("testSharpie color: " + testSharpie.color + ", width: " + testSharpie.width
            + ", inkAmount: " + testSharpie.inkAmount);
  }

}
