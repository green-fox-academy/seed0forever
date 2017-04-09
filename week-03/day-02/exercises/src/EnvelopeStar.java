import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {

  final static int WIDTH = 300;
  final static int HEIGHT = 300;

  public static void mainDraw(Graphics graphics) {
    // reproduce this:
    // [https://github.com/greenfox-academy/teaching-materials/blob/master/workshop/drawing/envelope-star/r2.png]

    int startX = 0;
    int startY = 0;

    drawLinePlay(startX, startY, WIDTH, HEIGHT, graphics);
  }

  private static void drawLinePlay(int startX, int startY, int canvasWidth, int canvasHeight,
          Graphics graphics) {
    for (int i = 10; i < canvasWidth; i += 10) {
      graphics.setColor(new Color(0, 204, 0, 255));
      graphics.drawLine(i + startX
              , startY + canvasHeight / 2
              , startX + canvasWidth / 2
              , startY + Math.abs(canvasHeight / 2 - i));
      graphics.drawLine(i + startX
              , startY + canvasHeight / 2
              , startX + canvasWidth / 2
              , startY + canvasHeight - Math.abs(canvasHeight / 2 - i));
    }
  }

  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
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
