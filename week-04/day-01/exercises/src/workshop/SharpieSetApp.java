package workshop;

public class SharpieSetApp {

  public static void main(String[] args) {
    SharpieSet shSet = new SharpieSet();
    shSet.sharpies.add(new Sharpie("black", 25));
    shSet.sharpies.add(new Sharpie("blue", 10, 10));
    shSet.sharpies.add(new Sharpie("purple", 20, 0));
    shSet.sharpies.add(new Sharpie("brown", 5, 0));
    shSet.sharpies.add(new Sharpie("cyan", 35, 200));
    shSet.sharpies.add(new Sharpie("red", 30, 0));

    System.out.println(shSet.sharpies.size());
    shSet.removeTrash();
    System.out.println(shSet.sharpies.size());
    shSet.add(new Sharpie("yellow", 5));
    System.out.println(shSet.countUsable());


  }


}
