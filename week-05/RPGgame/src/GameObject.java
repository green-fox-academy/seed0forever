import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GameObject {

  BufferedImage image;
  int posColumn, posRow, size;

  public GameObject(String filename, int size, int posColumn, int posRow) {
    this.posColumn = posColumn;
    this.posRow = posRow;
    this.size = size;
    setImage(filename);
  }

  protected void setImage(String filename) {
    try {
      image = ImageIO.read(new File(filename));
      System.out.println("Success reading image file '" + filename + "'.");
    } catch (IOException e) {
      e.printStackTrace();
      System.out.println("Failed to read image file '" + filename + "'");
    }
  }

  public void draw(Graphics graphics){
    if (image != null) {
      graphics.drawImage(image, posColumn * size, posRow * size, null);
      System.out.println("Executed " + this.getClass().getSimpleName() + "'s draw method.");
    }
  }

  public BufferedImage getImage() {
    return image;
  }
}
