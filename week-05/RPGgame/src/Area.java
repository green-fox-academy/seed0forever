import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Area {

  int columns, rows;
  int tileSize;

  List<List<Tile>> area;

  public Area(int tileSize, int columns, int rows) {
    this.columns = columns;
    this.rows = rows;
    this.tileSize = tileSize;
    area = new ArrayList<>();
    for (int row = 0; row < rows; row++) {
      List<Tile> rowList = new ArrayList<>();
      for (int column = 0; column < columns; column++) {
        Floor tileElement = new Floor("assets/floor.png", tileSize, column, row);
        rowList.add(tileElement);
      }
      area.add(rowList);
    }
  }

  void draw(Graphics graphics) {
    for (int row = 0; row < rows; row++) {
      for (int column = 0; column < columns; column++) {
        area.get(row).get(column).draw(graphics);
        System.out.println("Executed Area draw for col " + column + ", row " + row + ".");
      }

    }

  }
}
