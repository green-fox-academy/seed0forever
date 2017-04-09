import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {

  final static int WIDTH = 300;
  final static int HEIGHT = 300;

  public static void mainDraw(Graphics graphics) {
    // divide the canvas into 4 parts
    // and repeat this pattern in each quarter:
    // [https://github.com/greenfox-academy/teaching-materials/blob/master/workshop/drawing/line-play/r1.png]    int canvasWidth = 300; // Don't know yet how to get these from main

    int startX = 0;
    int startY = 0;
    int divideXY = 2;

    drawDivideAndRepeat(divideXY, startX, startY, WIDTH, HEIGHT, graphics);
  }

  private static void drawDivideAndRepeat(int divideXY, int startX, int startY, int width,
          int height, Graphics graphics) {
    int shapeWidth = width / 2;
    int shapeHeight = height / 2;

    for (int row = 0; row < divideXY; row++) {
      for (int column = 0; column < divideXY; column++) {
        drawLinePlay(startX + column * shapeWidth,
                startY + row * shapeHeight,
                shapeWidth, shapeHeight, graphics);
      }
    }
  }

  private static void drawLinePlay(int startX, int startY, int canvasWidth, int canvasHeight,
          Graphics graphics) {
    for (int i = 20; i < canvasWidth; i += 20) {
      graphics.setColor(new Color(176, 78, 240, 255));
      graphics.drawLine(i + startX, startY, canvasWidth + startX, i + startY);
      graphics.setColor(new Color(0, 204, 0, 255));
      graphics.drawLine(startX, i + startY, i + startX, canvasHeight + startY);
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
