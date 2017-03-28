import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {

  public static void mainDraw(Graphics graphics) {
    // fill the canvas with a checkerboard pattern.
    int canvasWidth = 300; // Don't know yet how to get these from main
    int canvasHeight = 300; // Don't know yet how to get these from main

    int tilesPerSide = 8;
    int tileSideLength = (int) (Math
            .floor(((canvasWidth > canvasHeight) ? canvasHeight : canvasWidth) / tilesPerSide));
    for (int row = 0; row < tilesPerSide; row++) {
      if (row % 2 == 0) {
        for (int column = 1; column < tilesPerSide; column += 2) {
          drawSquare(graphics, column * tileSideLength, row * tileSideLength, tileSideLength);
        }
      } else {
        for (int column = 0; column < tilesPerSide; column += 2) {
          drawSquare(graphics, column * tileSideLength, row * tileSideLength, tileSideLength);
        }
      }
    }
  }

  private static void drawSquare(Graphics graphics, int x, int y, int sideLength) {
    graphics.setColor(new Color(0, 0, 0, 255));
    graphics.fillRect(x, y, sideLength, sideLength);
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
