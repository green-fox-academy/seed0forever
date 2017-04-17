import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import java.awt.*;

public class Board extends JComponent implements KeyListener {

  private int mapColumns;
  private int mapRows;
  private int tileSize;
  private TileMap currentMap;
  private Hero hero1;
  private List<GameCharacter> currentCharacters;

  private Board() {
    tileSize = 72;
    mapRows = GameMap.MAP.length;
    mapColumns = GameMap.MAP[0].length;

    currentMap = new TileMap(tileSize, mapColumns, mapRows);
    currentCharacters = new ArrayList<>();

    hero1 = new Hero(tileSize, 0, 0,
            ImageLoader.getInstance().HERO_DOWN,
            ImageLoader.getInstance().HERO_UP,
            ImageLoader.getInstance().HERO_LEFT,
            ImageLoader.getInstance().HERO_RIGHT);
    currentCharacters.add(hero1);

    // set the size of your draw board
    setPreferredSize(new Dimension(
            mapColumns * tileSize,
            mapRows * tileSize));
    setVisible(true);
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    // here you have a 720x720 canvas
    // you can create and draw an image using the class below e.g.

    currentMap.draw(graphics);
    hero1.draw(graphics);
    graphics.setColor(Color.BLACK);
    graphics.fillRect(0, tileSize * (mapRows - 1), tileSize * mapColumns, tileSize);


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

      hero1.faceUp();
      if (currentMap.isFloor(
              hero1.getPosColumn(),
              hero1.getPosRow() - 1)) {
        hero1.moveUp();
      }
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {

      hero1.faceDown();
      if (currentMap.isFloor(
              hero1.getPosColumn(),
              hero1.getPosRow() + 1)) {
        hero1.moveDown();
      }
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {

      hero1.faceLeft();
      if (currentMap.isFloor(
              hero1.getPosColumn() - 1,
              hero1.getPosRow())) {
        hero1.moveLeft();
      }
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {

      hero1.faceRight();
      if (currentMap.isFloor(
              hero1.getPosColumn() + 1,
              hero1.getPosRow())) {
        hero1.moveRight();
      }
    }

    // and redraw to have a new picture with the new coordinates
    invalidate();
    repaint();
  }
}
