// Reproduce this: ./assets/graphic.png

import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RecursionGraphic1 {

  static int WIDTH = 600;
  static int HEIGHT = 600;

  public static void mainDraw(Graphics graphics) {
    final int SQUARE_SPLIT = 3;

    final int LAYERS = 5;
    int squareSide = (WIDTH > HEIGHT) ? HEIGHT : WIDTH;
    int squareTopLeftX = 0;
    int squareTopLeftY = 0;
    graphics.setColor(new Color(0, 0, 0, 200));
    graphics.drawRect(squareTopLeftX, squareTopLeftY, squareSide - 1, squareSide - 1);

    drawRecursiveSquares(graphics, squareTopLeftX, squareTopLeftY, squareSide, SQUARE_SPLIT,
            LAYERS);
  }

  private static void drawRecursiveSquares(Graphics graphics, int topLeftX,
          int topLeftY, int side, int split, int layers) {
    drawSquaresSplitters(graphics, topLeftX, topLeftY, side, split);
    if (layers <= 1) {
      return;
    }
    --layers;
    drawRecursiveSquares(graphics, topLeftX + side / split, topLeftY, side / split, split,
            layers);
    drawRecursiveSquares(graphics, topLeftX, topLeftY + side / split, side / split, split,
            layers);
    drawRecursiveSquares(graphics, topLeftX + side / split * 2, topLeftY + side / split,
            side / split, split,
            layers);
    drawRecursiveSquares(graphics, topLeftX + side / split, topLeftY + side / split * 2,
            side / split, split,
            layers);
  }

  private static void drawSquaresSplitters(Graphics graphics, int topLeftX, int topLeftY,
          int side, int split) {
    graphics.setColor(new Color(0, 0, 0, 200));
    graphics.drawLine(topLeftX + side / split, topLeftY, topLeftX + side / split, topLeftY + side);
    graphics.drawLine(topLeftX + side / split * 2, topLeftY, topLeftX + side / split * 2,
            topLeftY + side);
    graphics.drawLine(topLeftX, topLeftY + side / split, topLeftX + side, topLeftY + side / split);
    graphics.drawLine(topLeftX, topLeftY + side / split * 2, topLeftX + side,
            topLeftY + side / split * 2);
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
