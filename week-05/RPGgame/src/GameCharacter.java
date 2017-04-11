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

  void faceDown() {
    direction = Direction.DOWN;
    image = imageFaceDown;
  }

  void faceUp() {
    direction = Direction.UP;
    image = imageFaceUp;
  }

  void faceRight() {
    direction = Direction.RIGHT;
    image = imageFaceRight;
  }

  void faceLeft() {
    direction = Direction.LEFT;
    image = imageFaceLeft;
  }
}
