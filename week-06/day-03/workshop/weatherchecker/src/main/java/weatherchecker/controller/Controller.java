package weatherchecker.controller;

import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Retrofit;
import weatherchecker.datasource.GeolocationHandler;
import weatherchecker.datasource.WeatherChecker;
import weatherchecker.entity.GeoCoordinates;

public class Controller {

  private WeatherChecker weatherChecker;
  private GeolocationHandler location;

  public Controller() {
    weatherChecker = createWeatherService();
    location = new GeolocationHandler();
  }

  public void printUsage() {
    System.out.println();
    System.out.println("Usage: weatherchecker [option] [argument]");
    System.out.println("Example: weatherchecker -c HU");
    System.out.println("(Prints the current weather in Hungary)");
    System.out.println();
  }

  private WeatherChecker createWeatherService() {
    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://simple-weather.p.mashape.com/")
            .build();
    return retrofit.create(WeatherChecker.class);
  }

  public void printWeatherAt(GeoCoordinates coordinates) {
    float latitude = coordinates.getLatitude();
    float longitude = coordinates.getLongitude();

    printWeatherAtCoordinates(latitude, longitude);
  }

  public void printWeatherAt(String countryCodeIsoAlpha2) {
    try {
      GeoCoordinates coordinates = location.getCoordinates(countryCodeIsoAlpha2);
      printWeatherAt(coordinates);
    } catch (NullPointerException e) {
      System.out.println("Nonexistent country code: " + countryCodeIsoAlpha2.toUpperCase());
    }
  }

  public void printWeatherAtCoordinates(float latitude, float longitude) {
    String weatherResponse = getWeatherResponse(latitude, longitude);
    int temperature = Integer.parseInt(weatherResponse.substring(0, weatherResponse.indexOf(" ")));
    String weatherTextPart = weatherResponse.substring(weatherResponse.indexOf(",") + 2);

    System.out.printf("\n%d°C, %s\n\n", temperature, weatherTextPart);
  }

  private String getWeatherResponse(float latitude, float longitude) {
    String latitudeDot1 = GeoCoordinates.toStringFormatOfFloatDot1(latitude);
    String longitudeDot1 = GeoCoordinates.toStringFormatOfFloatDot1(longitude);

    Call<ResponseBody> weatherQuery = weatherChecker
            .setQueryCoordinates(latitudeDot1, longitudeDot1);

    String weatherResponse = null;

    try {
      weatherResponse = weatherQuery.execute().body().string();
    } catch (IOException e) {
      e.printStackTrace();
    }

    return weatherResponse;
  }

  public void compareTemperatureAt(String countryCode1, String countryCode2) {

    float latitude1 = 0;
    float longitude1 = 0;
    GeoCoordinates country1Coordinates = null;
    try {
      country1Coordinates = location.getCoordinates(countryCode1);
      latitude1 = country1Coordinates.getLatitude();
      longitude1 = country1Coordinates.getLongitude();
    } catch (NullPointerException e) {
      System.out.println("Nonexistent country code: " + countryCode1.toUpperCase());
    }

    float latitude2 = 0;
    float longitude2 = 0;
    GeoCoordinates country2Coordinates = null;
    try {
      country2Coordinates = location.getCoordinates(countryCode2);
      latitude2 = country2Coordinates.getLatitude();
      longitude2 = country2Coordinates.getLongitude();
    } catch (Exception e) {
      System.out.println("Nonexistent country code: " + countryCode2.toUpperCase());
    }

    String weatherInCountry1 = getWeatherResponse(latitude1, longitude1);
    String weatherInCountry2 = getWeatherResponse(latitude2, longitude2);

    try {
      int temperatureInCountry1 = Integer
              .parseInt(weatherInCountry1.substring(0, weatherInCountry1.indexOf(" ")));
      int temperatureInCountry2 = Integer
              .parseInt(weatherInCountry2.substring(0, weatherInCountry2.indexOf(" ")));

      int differenceInTemperature = temperatureInCountry1 - temperatureInCountry2;

      System.out.printf("\n%d°C\n\n", differenceInTemperature);
    } catch (NumberFormatException e) {
    }
  }
}
