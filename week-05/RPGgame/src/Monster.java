import java.awt.image.BufferedImage;

class Monster extends GameCharacter {

  Monster(int size, int posColumn, int posRow,
          BufferedImage imageFaceDown, BufferedImage imageFaceUp,
          BufferedImage imageFaceLeft, BufferedImage imageFaceRight) {

    super(size, posColumn, posRow,
            imageFaceDown, imageFaceUp,
            imageFaceLeft, imageFaceRight
    );
  }
}
