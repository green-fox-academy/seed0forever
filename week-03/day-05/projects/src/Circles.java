// Reproduce this: ./assets/graphic.png

import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Circles {

  final static int WIDTH = 600;
  final static int HEIGHT = 600;

  public static void mainDraw(Graphics graphics) {
    final int LAYERS = 5;
    final int CIRCLE_DIAMETER =
            ((WIDTH > HEIGHT) ? HEIGHT : WIDTH);
    final int AREA_TOP_LEFT_X = 0;
    final int AREA_TOP_LEFT_Y = 0;
    final int CIRCLES_INSIDE = 3;
    final int ROTATION_FROM_EAST = 90;

    drawRecursiveCircles(graphics, AREA_TOP_LEFT_X, AREA_TOP_LEFT_Y, CIRCLE_DIAMETER,
            CIRCLES_INSIDE, ROTATION_FROM_EAST,
            LAYERS);
  }

  private static void drawRecursiveCircles(Graphics graphics, int topLeftX,
          int topLeftY, int diameter, int circlesInside, int rotationFromEast, int layers) {

    graphics.setColor(Color.BLACK);
    graphics.drawOval(topLeftX, topLeftY, diameter, diameter);

    if (layers <= 1) {
      return;
    }
    layers--;

    for (int i = 0; i < circlesInside; i++) {
      drawRecursiveCircles(graphics,
              getNewTopLeftX(topLeftX, diameter, circlesInside, rotationFromEast, i),
              getNewTopLeftY(topLeftY, diameter, circlesInside, rotationFromEast, i),
              (int) Math.round((double) diameter / 2d), circlesInside, rotationFromEast, layers);
    }
  }

  private static int getNewTopLeftX(int topLeftX, double diameter, int numberOfCircles,
          int rotationFromEast, int iterationNum) {
    return topLeftX + (int) Math.round(diameter / 4d * Math
            .cos(Math.toRadians(iterationNum * 360d / numberOfCircles - rotationFromEast))
            + diameter / 2d - diameter / 4d);
  }

  private static int getNewTopLeftY(int topLeftY, double diameter, int numberOfCircles,
          int rotationFromEast, int i) {
    return topLeftY + (int) Math.round(diameter / 4d * Math
            .sin(Math.toRadians(i * 360d / numberOfCircles - rotationFromEast))
            + diameter / 2d - diameter / 4d);
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
      this.setBackground(Color.WHITE);
      mainDraw(graphics);

    }
  }

}
