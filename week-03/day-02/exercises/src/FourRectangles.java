import java.util.Arrays;
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

  public static void mainDraw(Graphics graphics) {
    // draw four different size and color rectangles.
    drawColorFilledRectangle(graphics, 25, 5, 83, 155,
            130, 25, 220, 255);
    drawColorFilledRectangle(graphics, 160, 220, 135, 70,
            255, 0, 0, 255);
    drawColorFilledRectangle(graphics, 55, 175, 100, 100,
            0, 200, 0, 255);
    drawColorFilledRectangle(graphics, 200, 80, 15, 100,
            0, 0, 255, 255);
  }

  private static void drawColorFilledRectangle(Graphics graphics, int xTopLeft, int yTopLeft,
          int xWidth, int yHeight,
          int redValue, int greenValue, int blueValue, int alphaValue) {
    Color rectFillColor = new Color(redValue, greenValue, blueValue, alphaValue);
    graphics.setColor(rectFillColor);
    graphics.fillRect(xTopLeft, yTopLeft, xWidth, yHeight);
  }

  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(300, 300));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }

  static class ImagePanel extends JPanel {

    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}
