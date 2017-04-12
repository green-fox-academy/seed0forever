import java.awt.image.BufferedImage;

class GameCharacter extends GameObject {

  BufferedImage imageFaceDown, imageFaceUp, imageFaceLeft, imageFaceRight;
  Direction direction;

  public GameCharacter(int size, int posColumn, int posRow,
          BufferedImage imageFaceDown, BufferedImage imageFaceUp,
          BufferedImage imageFaceLeft, BufferedImage imageFaceRight) {

    super(size, posColumn, posRow, imageFaceDown); // Default direction is DOWN
    direction = Direction.DOWN; // Default direction is DOWN

    this.imageFaceDown = imageFaceDown;
    this.imageFaceUp = imageFaceUp;
    this.imageFaceLeft = imageFaceLeft;
    this.imageFaceRight = imageFaceRight;
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

  void moveUp() {
    posRow--;
  }

  void moveDown() {
    posRow++;
  }

  void moveLeft() {
    posColumn--;
  }

  void moveRight() {
    posColumn++;
  }
}
