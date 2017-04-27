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

  public GeoCoordinates getCoordinates(String countryCodeIso2Letter) {

    for (String[] geoEntity : this) {
      if (geoEntity[0].equalsIgnoreCase(countryCodeIso2Letter)) {
        float latitude = Float.parseFloat(geoEntity[1]);
        float longitude = Float.parseFloat(geoEntity[2]);
        return new GeoCoordinates(latitude, longitude);
      }
    }
    return null;
  }

  private void loadGeoFile() {
    List<String[]> geoDatabase = FileHandler.readFile(GEO_CSV_FILENAME);
    this.addAll(geoDatabase);
  }
}
