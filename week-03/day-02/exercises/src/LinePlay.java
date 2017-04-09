import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {

  public static void mainDraw(Graphics graphics) {
    // reproduce this:
    // [https://github.com/greenfox-academy/teaching-materials/blob/master/exercises/drawing/line-play/r1.png]
    int canvasWidth = 300; // Don't know yet how to get these from main
    int canvasHeight = 300; // Don't know yet how to get these from main

    drawLinePlay(canvasWidth, canvasHeight, graphics);
  }

  private static void drawLinePlay(int canvasWidth, int canvasHeight, Graphics graphics) {
    for (int i = 0; i < canvasWidth; i += 20) {
      graphics.setColor(new Color(176, 78, 240, 255));
      graphics.drawLine(i, 0, canvasWidth, i);
      graphics.setColor(new Color(0, 204, 0, 255));
      graphics.drawLine(0, i, i, canvasHeight);
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
