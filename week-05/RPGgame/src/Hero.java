import java.awt.image.BufferedImage;

public class Hero extends GameCharacter {

  public Hero(int size, int posColumn, int posRow,
          BufferedImage imageFaceDown, BufferedImage imageFaceUp,
          BufferedImage imageFaceLeft, BufferedImage imageFaceRight) {

    super(size, posColumn, posRow,
            imageFaceDown, imageFaceUp,
            imageFaceLeft, imageFaceRight
    );
  }
}
