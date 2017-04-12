import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class TileMap {

  int tileSize, columns, rows;

  List<List<Tile>> area;

  public TileMap(int tileSize, int columns, int rows) {
    this.tileSize = tileSize;
    this.columns = columns;
    this.rows = rows;

    area = new ArrayList<>();
    for (int row = 0; row < rows; row++) {
      List<Tile> rowList = new ArrayList<>();
      for (int column = 0; column < columns; column++) {
        Floor tileElement = new Floor(
                tileSize, column, row, ImageLoader.getInstance().FLOOR);
        rowList.add(tileElement);
      }
      area.add(rowList);
    }
  }

  void draw(Graphics graphics) {
    for (int row = 0; row < rows; row++) {
      for (int column = 0; column < columns; column++) {
        area.get(row).get(column).draw(graphics);
        System.out.println("Executed TileMap draw for col " + column + ", row " + row + ".");
      }
    }
  }
}
