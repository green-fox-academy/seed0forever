import java.awt.*;
import java.awt.image.BufferedImage;

class GameObject {

  BufferedImage image;
  int posColumn, posRow;
  private int size;

  GameObject(int size, int posColumn, int posRow, BufferedImage image) {
    this.posColumn = posColumn;
    this.posRow = posRow;
    this.size = size;
    this.image = image;
  }

  void draw(Graphics graphics) {
    if (image != null) {
      graphics.drawImage(image, posColumn * size, posRow * size, null);
      System.out.println("Executed " + this.getClass().getSimpleName() + "'s draw method.");
    }
  }

  void setImage(BufferedImage image) {
    this.image = image;
  }

  int getPosColumn() {
    return posColumn;
  }

  void setPosColumn(int posColumn) {
    this.posColumn = posColumn;
  }

  int getPosRow() {
    return posRow;
  }

  void setPosRow(int posRow) {
    this.posRow = posRow;
  }

}
