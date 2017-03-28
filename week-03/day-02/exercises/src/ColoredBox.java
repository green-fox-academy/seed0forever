import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {

  public static void mainDraw(Graphics graphics){
    // draw a box that has different colored lines on each edge.
    graphics.setColor(new Color(255,0,0,255));
    graphics.drawLine(50, 50, 250, 50);
    graphics.setColor(new Color(0,255,0,255));
    graphics.drawLine(250, 50, 250, 250);
    graphics.setColor(new Color(0,0,255,255));
    graphics.drawLine(250, 250, 50, 250);
    graphics.setColor(new Color(0,0,0,255));
    graphics.drawLine(50, 250, 50, 50);




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
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}
