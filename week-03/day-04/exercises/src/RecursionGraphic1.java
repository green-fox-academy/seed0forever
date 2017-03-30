// Reproduce this: ./assets/graphic.png

import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RecursionGraphic1 {

  static int WIDTH = 601;
  static int HEIGHT = 601;

  public static void mainDraw(Graphics graphics) {
    final int SQUARE_SPLIT = 3;
    int squareSide = (WIDTH > HEIGHT) ? HEIGHT - 1 : WIDTH - 1;

    drawSquaresRecursive(graphics, squareSide, SQUARE_SPLIT);


  }

  private static void drawSquaresRecursive(Graphics graphics, int squareSide, int squareSplit) {
    graphics.setColor(new Color(0, 0, 0, 200));
    graphics.drawLine(squareSide / squareSplit, 0, squareSide / squareSplit, squareSide);
    graphics.drawLine(squareSide / squareSplit * 2, 0, squareSide / squareSplit * 2, squareSide);
    graphics.drawLine(0, squareSide / squareSplit, squareSide, squareSide / squareSplit);
    graphics.drawLine(0, squareSide / squareSplit * 2, squareSide, squareSide / squareSplit * 2);
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
      this.setBackground(Color.YELLOW);
      mainDraw(graphics);

    }
  }

}
