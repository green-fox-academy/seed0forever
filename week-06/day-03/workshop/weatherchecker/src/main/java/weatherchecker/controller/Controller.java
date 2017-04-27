package weatherchecker.controller;

import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Retrofit;
import weatherchecker.GeoCoordinates;
import weatherchecker.GeolocationHandler;
import weatherchecker.WeatherChecker;

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
    GeoCoordinates coordinates = location.getCoordinates(countryCodeIsoAlpha2);
    printWeatherAt(coordinates);
  }

  public void printWeatherAtCoordinates(float latitude, float longitude) {
    System.out.println(getWeatherResponse(latitude, longitude));
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
    GeoCoordinates country1Coordinates = location.getCoordinates(countryCode1);
    float latitude1 = country1Coordinates.getLatitude();
    float longitude1 = country1Coordinates.getLongitude();
    GeoCoordinates country2Coordinates = location.getCoordinates(countryCode2);
    float latitude2 = country2Coordinates.getLatitude();
    float longitude2 = country2Coordinates.getLongitude();

    String weatherInCountry1 = getWeatherResponse(latitude1, longitude1);
    String weatherInCountry2 = getWeatherResponse(latitude2, longitude2);

    int temperatureInCountry1 = Integer
            .parseInt(weatherInCountry1.substring(0, weatherInCountry1.indexOf(" ")));
    int temperatureInCountry2 = Integer
            .parseInt(weatherInCountry2.substring(0, weatherInCountry2.indexOf(" ")));

    int differenceInTemperature = temperatureInCountry1 - temperatureInCountry2;

    System.out.printf("%d°C\n", differenceInTemperature);
  }
}
