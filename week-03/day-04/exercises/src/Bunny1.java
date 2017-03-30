public class Bunny1 {
// We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears across all the bunnies recursively
// (without loops or multiplication).

  public static void main(String[] args) {
    final int NUM_BUNNY = 20;
    final int NUM_BUNNY_EARS = 2;
    int totalNumEars = 0;

    totalNumEars = getNumOfBunnyEars(NUM_BUNNY, NUM_BUNNY_EARS);
    System.out.println(totalNumEars);
  }

  private static int getNumOfBunnyEars(int num_bunny, int num_bunny_ears) {
    if (num_bunny == 1) {
      return num_bunny_ears;
    }
    return num_bunny_ears + getNumOfBunnyEars(--num_bunny, num_bunny_ears);
  }
}
