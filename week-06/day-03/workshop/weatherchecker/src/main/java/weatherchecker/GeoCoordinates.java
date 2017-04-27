package weatherchecker;

public class GeoCoordinates {

  private final float latitude;
  private final float longitude;

  public GeoCoordinates(float latitude, float longitude) {
    this.latitude = latitude;
    this.longitude = longitude;
  }

  public static String toStringFormatOfFloatDot1(float coordinate) {
    float roundedToDot1 = (float) (Math.round(coordinate * 10)) / 10;
    return String.format("%.1f", roundedToDot1);
  }

  public float getLatitude() {
    return latitude;
  }

  public float getLongitude() {
    return longitude;
  }
}
