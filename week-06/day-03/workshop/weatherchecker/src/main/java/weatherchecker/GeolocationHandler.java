package weatherchecker;

import java.util.ArrayList;
import java.util.List;

public class GeolocationHandler extends ArrayList<String[]> {

  private static final String GEO_CSV_FILENAME = "data.csv";
  private String filename;

  public GeolocationHandler() {
    this.filename = GEO_CSV_FILENAME;
    loadGeoFile();
  }

  private void loadGeoFile() {
    List<String[]> geoDatabase = FileHandler.readFile(GEO_CSV_FILENAME);
    this.addAll(geoDatabase);
  }
}
