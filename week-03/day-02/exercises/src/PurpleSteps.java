import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps {

  public static void mainDraw(Graphics graphics) {
    // reproduce this:
    // [https://github.com/greenfox-academy/teaching-materials/blob/master/exercises/drawing/purple-steps/r3.png]

    for (int i = 0; i < 19; i++) {
      drawSquare(graphics, 10 + i * 10, 10 + i * 10, 10);
    }
  }

  private static void drawSquare(Graphics graphics, int x, int y, int sideLength) {
    graphics.setColor(new Color(0, 0, 0, 180));
    graphics.drawRect(x, y, sideLength, sideLength);
    graphics.setColor(new Color(176, 78, 240, 255));
    graphics.fillRect(x + 1, y + 1, sideLength - 1, sideLength - 1);
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
