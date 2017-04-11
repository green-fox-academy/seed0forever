import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
import java.awt.*;

public class Board extends JComponent implements KeyListener {

  int areaColumns, areaRows, tileSize, testBoxX, testBoxY;
  Area currentArea;
  PositionedImage i1, i2, i3;
  Hero hero1;

  public Board() {
    areaRows = 10;
    areaColumns = 10;
    tileSize = 72;

    currentArea = new Area(tileSize, areaColumns, areaRows);
    hero1 = new Hero("assets/hero-down.png", tileSize, 0, 0);

    // set the size of your draw board
    setPreferredSize(new Dimension(720, 720));
    setVisible(true);
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    // here you have a 720x720 canvas
    // you can create and draw an image using the class below e.g.
    currentArea.draw(graphics);
    hero1.draw(graphics);
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
      int newPosY = hero1.getPosRow() - 1;
      hero1.setPosRow(newPosY);
      hero1.setImage("assets/hero-up.png");
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
      int newPosY = hero1.getPosRow() + 1;
      hero1.setPosRow(newPosY);
      hero1.setImage("assets/hero-down.png");
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
      int newPosX = hero1.getPosColumn() - 1;
      hero1.setPosColumn(newPosX);
      hero1.setImage("assets/hero-left.png");
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
      int newPosX = hero1.getPosColumn() + 1;
      hero1.setPosColumn(newPosX);
      hero1.setImage("assets/hero-right.png");
    }
    // and redraw to have a new picture with the new coordinates
    invalidate();
    repaint();
  }
}