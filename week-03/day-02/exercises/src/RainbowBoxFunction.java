import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {

  public static void mainDraw(Graphics graphics) {
    // create a square drawing function that takes 2 parameters:
    // the square size, and the fill color,
    // and draws a square of that size and color to the center of the canvas.
    // create a loop that fills the canvas with rainbow colored squares.

    int canvasSize = 300; // Don't know yet how to get this from main

    drawSquareColorFilled(graphics, 10, new int[]{255, 0, 0, 255});

    int numOfBands = 40;
    double FrequencyOfColorCycle = .15;

    for (int i = 0; i < numOfBands; i++) {
      int redValue = (int) (Math.sin(FrequencyOfColorCycle * i + 0.) * 127) + 128;
      int greenValue = (int) (Math.sin(FrequencyOfColorCycle * i + 2. * Math.PI / 3) * 127) + 128;
      int blueValue = (int) (Math.sin(FrequencyOfColorCycle * i + 4. * Math.PI / 3) * 127) + 128;
      drawSquareColorFilled(graphics, canvasSize - (canvasSize / numOfBands) * i,
              new int[]{redValue, greenValue, blueValue, 255});
    }
  }

  private static void drawSquareColorFilled
          (Graphics graphics, int sideLength, int[] color) {
    int canvasWidth = 300; // Don't know yet how to get these from main
    int canvasHeight = 300; // Don't know yet how to get these from main
    graphics.setColor(new Color(color[0], color[1], color[2], color[3]));
    graphics.fillRect((canvasWidth - sideLength) / 2,
            (canvasHeight - sideLength) / 2,
            sideLength, sideLength);
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
