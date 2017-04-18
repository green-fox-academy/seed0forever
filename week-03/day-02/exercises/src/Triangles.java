import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {

  public static void mainDraw(Graphics graphics){
    // reproduce this:
    // [https://github.com/greenfox-academy/teaching-materials/blob/master/exercises/drawing/triangles/r5.png]
    final int triangleSide = 10;

    int triangleHeight = getTriangleHeight(triangleSide);

    int[] triangleTopDot = {150, 0};
    int[][] triangleDotCoordinates = getTriangleOtherTwoCoordinates(triangleSide, triangleTopDot);



    graphics.drawPolyline(new int[]{50, 10, 60, 50}, new int[]{20, 60, 60, 20}, 4);
//    drawTriangle(graphics, 10, 20, 20);


  }

  private static int[][] getTriangleOtherTwoCoordinates(int triangleSide, int[] triangleTopDot) {
  return new int[][]{};
  }

  private static int getTriangleHeight(int triangleSide) {
    int triangleHeight = (int) (triangleSide * Math.sqrt(3) / 2);
    return triangleHeight;
  }

//  private static void drawTriangle(Graphics graphics, int sideLength, int x, int y) {
//    int triangleHeight = (int) (sideLength * Math.sqrt(3) / 2);
//    graphics.drawPolyline(new int[]{});
//  }

  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(300, 300));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}
