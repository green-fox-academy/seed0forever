import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
import java.awt.*;

public class Board extends JComponent implements KeyListener {

  int areaColumns, areaRows, tileSize, testBoxX, testBoxY;
  Area currentArea;
  PositionedImage i1, i2, i3;


  public Board() {
    areaRows = 10;
    areaColumns = 10;
    tileSize = 72;

    testBoxX = tileSize * 5;
    testBoxY = tileSize * 5;
    i1 = new PositionedImage("assets/boss.png", testBoxX, testBoxY);
    i2 = new PositionedImage("assets/boss.png", testBoxX + tileSize * 2, tileSize * 2);
    i3 = new PositionedImage("assets/boss.png", testBoxX + tileSize * 4, testBoxY + tileSize * 4);

    currentArea = new Area(tileSize, areaColumns, areaRows);

    // set the size of your draw board
    setPreferredSize(new Dimension(720, 720));
    setVisible(true);
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    graphics.fillRect(testBoxX, testBoxY, 72, 72);
    // here you have a 720x720 canvas
    // you can create and draw an image using the class below e.g.
    currentArea.draw(graphics);
    i1.draw(graphics);
//    i2.draw(graphics);
//    i3.draw(graphics);

  }

  public static void main(String[] args) {
    // Here is how you set up a new window and adding our board to it
    JFrame frame = new JFrame("RPG Game");
    Board board = new Board();
    frame.add(board);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.pack();
    // Here is how you can add a key event listener
    // The board object will be notified when hitting any key
    // with the system calling one of the below 3 methods
    frame.addKeyListener(board);
    // Notice (at the top) that we can only do this
    // because this Board class (the type of the board object) is also a KeyListener
  }

  // To be a KeyListener the class needs to have these 3 methods in it
  @Override
  public void keyTyped(KeyEvent e) {

  }

  @Override
  public void keyPressed(KeyEvent e) {

  }

  // But actually we can use just this one for our goals here
  @Override
  public void keyReleased(KeyEvent e) {
    // When the up or down keys hit, we change the position of our box
    if (e.getKeyCode() == KeyEvent.VK_UP) {
      int newPosY = i1.getPosY() - tileSize;
      i1.setPosY(newPosY);
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
      int newPosY = i1.getPosY() + tileSize;
      i1.setPosY(newPosY);
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
      int newPosX = i1.getPosX() - tileSize;
      i1.setPosX(newPosX);
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
      int newPosX = i1.getPosX() + tileSize;
      i1.setPosX(newPosX);
    }
    // and redraw to have a new picture with the new coordinates
    invalidate();
    repaint();
  }
}