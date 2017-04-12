import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GameObject {

  BufferedImage image;
  int posColumn, posRow, size;

  public GameObject(int size, int posColumn, int posRow, BufferedImage image) {
    this.posColumn = posColumn;
    this.posRow = posRow;
    this.size = size;
    this.image = image;
  }

  public void draw(Graphics graphics) {
    if (image != null) {
      graphics.drawImage(image, posColumn * size, posRow * size, null);
      System.out.println("Executed " + this.getClass().getSimpleName() + "'s draw method.");
    }
  }

  public BufferedImage getImage() {
    return image;
  }

  void setImage(BufferedImage image) {
    this.image = image;
  }

  public int getPosColumn() {
    return posColumn;
  }

  public void setPosColumn(int posColumn) {
    this.posColumn = posColumn;
  }

  public int getPosRow() {
    return posRow;
  }

  public void setPosRow(int posRow) {
    this.posRow = posRow;
  }

}
