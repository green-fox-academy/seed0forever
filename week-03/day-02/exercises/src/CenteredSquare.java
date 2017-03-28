import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenteredSquare {

  public static void mainDraw(Graphics graphics) {
    // draw a green 10x10 square to the canvas' center.
    int canvasWidth = 300; // Don't know yet how to get these from main
    int canvasHeight = 300; // Don't know yet how to get these from main
    int squareSideLength = 10;
    graphics.setColor(new Color(0, 255, 0, 255));
    graphics.fillRect((canvasWidth - squareSideLength) / 2, (canvasHeight - squareSideLength) / 2,
            squareSideLength, squareSideLength);
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
