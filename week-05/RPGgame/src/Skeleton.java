import java.awt.image.BufferedImage;

class Skeleton extends Monster {

  Skeleton(int size, int posColumn, int posRow, BufferedImage imageFaceDown,
          BufferedImage imageFaceUp, BufferedImage imageFaceLeft,
          BufferedImage imageFaceRight) {
    super(size, posColumn, posRow, imageFaceDown, imageFaceUp, imageFaceLeft, imageFaceRight);
  }
}
