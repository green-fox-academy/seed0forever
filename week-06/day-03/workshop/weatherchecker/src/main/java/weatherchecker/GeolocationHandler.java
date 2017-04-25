package weatherchecker;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GeolocationHandler extends ArrayList<String[]> {
  private static final String GEO_CSV_FILENAME = "src/main/resources/data.csv";
  private String filename;

  public GeolocationHandler() throws IOException {
    this.filename = GEO_CSV_FILENAME;
    loadGeoFile();
  }

  private void loadGeoFile() throws IOException {
    List<String[]> geoDatabase = FileHandler.readFile(GEO_CSV_FILENAME);

  }
}
