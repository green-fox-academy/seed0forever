public class Bunny2 {
  // We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
  // (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
  // have 3 ears, because they each have a raised foot. Recursively return the
  // number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).

  public static void main(String[] args) {
    final int NUM_OF_BUNNY = 3;
    final int NUM_OF_ODD_BUNNY_EARS = 2;
    final int NUM_OF_EVEN_BUNNY_EARS = 3;
    int numOfEars = 0;

    numOfEars = getSumOfBunnyEars(NUM_OF_BUNNY, NUM_OF_ODD_BUNNY_EARS, NUM_OF_EVEN_BUNNY_EARS);
    System.out.println(numOfEars);
  }

  private static int getSumOfBunnyEars(int num_of_bunny, int num_of_odd_bunny_ears,
          int num_of_even_bunny_ears) {
    int thisBunnyEars = 0;
    if (num_of_bunny == 1) {
      return num_of_odd_bunny_ears;
    }
    thisBunnyEars = (num_of_bunny % 2 == 1)
            ? num_of_odd_bunny_ears
            : num_of_even_bunny_ears;
    return thisBunnyEars + getSumOfBunnyEars(--num_of_bunny, num_of_odd_bunny_ears,
            num_of_even_bunny_ears);
  }

}
