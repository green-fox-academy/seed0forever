public class CuboidMetrics {

  public static void main(String[] args) {
    // Write a program that stores 3 sides of a cuboid as variables (doubles)
    double cuboidLength = 15;
    double cuboidWidth = 10;
    double cuboidHeight = 25;
    // The program should write the surface area and volume of the cuboid like:
    //
    // Surface Area: 600
    // Volume: 1000
    System.out.println("Surface Area: " + (int) (2 * (cuboidHeight * cuboidLength
                                                      + cuboidHeight * cuboidWidth
                                                      + cuboidLength *  cuboidWidth)));
    System.out.println("Volume: " + (int) (cuboidHeight * cuboidLength * cuboidWidth));
  }

}
