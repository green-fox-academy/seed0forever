import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {

  public static void mainDraw(Graphics graphics) {
    // create a line drawing function that takes 2 parameters:
    // the x and y coordinates of the line's starting point
    // and draws a line from that point to the center of the canvas.
    // fill the canvas with lines from the edges, every 20 px, to the center.
    int canvasWidth = 300; // Don't know yet how to get these from main
    int canvasHeight = 300; // Don't know yet how to get these from main
    int lineSpacingAtEdges = 20;

    for (int i = 0; i <= canvasWidth; i += lineSpacingAtEdges) {
      drawLineToCenter(graphics, i, 0);
      drawLineToCenter(graphics, i, canvasHeight);
      drawLineToCenter(graphics, 0, i);
      drawLineToCenter(graphics, canvasWidth, i);
    }
  }

  public static void drawLineToCenter(Graphics graphics, int x, int y) {
    int canvasWidth = 300; // Don't know yet how to get these from main
    int canvasHeight = 300; // Don't know yet how to get these from main

    graphics.setColor(new Color(0, 0, 0, 255));
    graphics.drawLine(x, y, canvasWidth / 2, canvasHeight / 2);
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
