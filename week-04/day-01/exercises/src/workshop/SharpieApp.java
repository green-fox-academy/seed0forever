package workshop;

public class SharpieApp {

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
