import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

class TileMap {

  private int tileSize;
  private int columns;
  private int rows;

  private List<List<Tile>> tileMap;

  TileMap(int tileSize, int columns, int rows) {
    this.tileSize = tileSize;
    this.columns = columns;
    this.rows = rows;

    tileMap = new ArrayList<>();

    fillMap(columns, rows);
  }

  private void fillMap(int columns, int rows) {
    for (int row = 0; row < rows; row++) {
      List<Tile> rowList = new ArrayList<>();
      for (int col = 0; col < columns; col++) {
        switch (GameMap.MAP[row][col]) {
          case 0:
            Floor floor = new Floor(
                    tileSize, col, row, ImageLoader.getInstance().FLOOR);
            rowList.add(floor);
            break;
          case 1:
            Wall wall = new Wall(
                    tileSize, col, row, ImageLoader.getInstance().WALL);
            rowList.add(wall);
            break;
          default:
            break;
        }
      }
      tileMap.add(rowList);
    }
  }
  void draw(Graphics graphics) {
    for (int row = 0; row < rows; row++) {
      for (int col = 0; col < columns; col++) {
        tileMap.get(row).get(col).draw(graphics);
        System.out.println("Executed TileMap draw for col " + col + ", row " + row + ".");
      }
    }
  }

  boolean isFloor(int column, int row) {
    if (row >= 0
            && row < tileMap.size()
            && column >= 0
            && column < tileMap.get(0).size()
            ) {
      return (tileMap.get(row).get(column) instanceof Floor);
    }
    return false;
  }
}
