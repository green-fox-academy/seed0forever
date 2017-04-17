import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

class ImageLoader {

  private static ImageLoader instance;

  BufferedImage FLOOR, WALL, HERO_DOWN, HERO_UP, HERO_RIGHT, HERO_LEFT, BOSS;

  private ImageLoader() {
    try {
      FLOOR = ImageIO.read(new File("assets/floor.png"));
      WALL = ImageIO.read(new File("assets/wall.png"));
      HERO_DOWN = ImageIO.read(new File("assets/hero-down.png"));
      HERO_UP = ImageIO.read(new File("assets/hero-up.png"));
      HERO_RIGHT = ImageIO.read(new File("assets/hero-right.png"));
      HERO_LEFT = ImageIO.read(new File("assets/hero-left.png"));
      BOSS = ImageIO.read(new File("assets/boss.png"));
      System.out.println("Success reading image files.");
    } catch (IOException e) {
      e.printStackTrace();
      System.out.println("Failed to read image files.");
    }
  }

  public static ImageLoader getInstance() {
    if (instance == null) {
      instance = new ImageLoader();
    }
    return instance;
  }
}
