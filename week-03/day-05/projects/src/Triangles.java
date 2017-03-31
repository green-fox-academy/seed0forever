// Reproduce this: ./assets/graphic.png

import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {

  static int WIDTH = 600;
  static int HEIGHT = (int) Math.round((double) WIDTH * Math.sqrt(3) / 2d);

  public static void mainDraw(Graphics graphics) {
    final int LAYERS = 7;    int areaWidth =
            ((WIDTH > (int) Math.round((double) WIDTH / Math.sqrt(3) * 2d)) ? (int) Math
                    .round((double) WIDTH * Math.sqrt(3) / 2d) : WIDTH);
    int areaTopLeftX = 0;
    int areaTopLeftY = 0;

    drawRecursiveTriangles(graphics, areaTopLeftX, areaTopLeftY, areaWidth,
            LAYERS);
  }

  private static void drawRecursiveTriangles(Graphics graphics, int topLeftX,
          int topLeftY, int width, int layers) {
    double triangleHeight = (double) width * Math.sqrt(3) / 2d;
    int triangleHeightRounded = (int) Math.round(triangleHeight);


    if (layers <= 1) {
      int[] trianglePointsX = new int[]{topLeftX, topLeftX + width - 1,
              topLeftX + (int) Math.round((double) width / 2d) - 1};
      int[] trianglePointsY = new int[]{topLeftY, topLeftY,
              topLeftY + triangleHeightRounded - 1};

      graphics.setColor(Color.BLACK);
      graphics.drawPolygon(trianglePointsX, trianglePointsY,
              3);

      return;
    }

    --layers;

    drawRecursiveTriangles(graphics, topLeftX, topLeftY, (int) Math.round((double) width / 2d),
            layers);
    drawRecursiveTriangles(graphics, topLeftX + (int) Math.round((double) width / 2d), topLeftY,
            (int) Math.round((double) width / 2d),
            layers);
    drawRecursiveTriangles(graphics, topLeftX + (int) Math.round((double) width / 4d),
            topLeftY + (int) Math.round(triangleHeight / 2d),
            (int) Math.round((double) width / 2d),
            layers);
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
