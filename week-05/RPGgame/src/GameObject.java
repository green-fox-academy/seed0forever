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

  BufferedImage loadImage(String filename) {
    BufferedImage emptyImage = new BufferedImage(size, size, BufferedImage.TYPE_INT_RGB);
    try {
      BufferedImage readImage = ImageIO.read(new File(filename));
      System.out.println("Success reading image file '" + filename + "'.");
      return readImage;
    } catch (IOException e) {
      e.printStackTrace();
      System.out.println("Failed to read image file '" + filename + "'");
    }
    return emptyImage;
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
