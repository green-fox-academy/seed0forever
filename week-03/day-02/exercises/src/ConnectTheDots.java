import java.util.Arrays;
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {

  public static void mainDraw(Graphics graphics) {
    // create a function that takes 1 parameter:
    // an array of {x, y} points
    // and connects them with green lines.
    // connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
    // connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
    // {120, 100}, {85, 130}, {50, 100}}

    final int[][] POLYGON1 = new int[][]{{10, 10}, {290, 10}, {290, 290},
            {10, 290}, {10, 10}};
    final int[][] POLYGON2 = new int[][]{{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
            {120, 100}, {85, 130},
            {50, 100}};

    connectDots(graphics, POLYGON1);
    connectDots(graphics, POLYGON2);
  }

  private static void connectDots(Graphics graphics, int[][] dots) {
    graphics.setColor(new Color(0, 255, 0, 255));
    for (int i = 0; i < dots.length - 1; i++) {
      graphics.drawLine(dots[i][0], dots[i][1], dots[i + 1][0], dots[i + 1][1]);
    }
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

// create a 300x300 canvas.
