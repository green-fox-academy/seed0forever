import java.awt.image.BufferedImage;

class GameCharacter extends GameObject {

  BufferedImage imageFaceDown, imageFaceUp, imageFaceLeft, imageFaceRight;
  Direction direction;

  public GameCharacter(int size, int posColumn, int posRow,
          String imageFileFaceDown, String imageFileFaceUp, String imageFileFaceLeft,
          String imageFileFaceRight) {
    super(imageFileFaceDown, size, posColumn, posRow); // Default direction is DOWN
    direction = Direction.DOWN; // Default direction is DOWN

    imageFaceDown = image;
    imageFaceUp = loadImage(imageFileFaceUp);
    imageFaceLeft = loadImage(imageFileFaceLeft);
    imageFaceRight = loadImage(imageFileFaceRight);
  }
}
