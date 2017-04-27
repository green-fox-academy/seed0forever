package weatherchecker;

import java.io.IOException;
import joptsimple.OptionParser;
import joptsimple.OptionSet;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Retrofit;

public class Controller {

  public void handleArgs(String[] args) {
    WeatherChecker weatherService = createWeatherService();
    OptionSet options = getOptionSetFromParser(args);

    if (args.length == 0) {
      printUsage();
    } else if (options.has("h")) {
      printUsage();
    } else if (options.has("c") && options.hasArgument("c")) {
      GeolocationHandler location = new GeolocationHandler();
      GeoCoordinates coordinates = location
              .getCoordinates(options.valueOf("c").toString());

      float latitude = coordinates.getLatitude();
      float longitude = coordinates.getLongitude();

      printWeatherAtLocation(weatherService, latitude, longitude);
    }
  }

  private WeatherChecker createWeatherService() {
    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://simple-weather.p.mashape.com/")
            .build();
    return retrofit.create(WeatherChecker.class);
  }

  private OptionSet getOptionSetFromParser(String[] args) {
    OptionParser parser = new OptionParser();
    parser.accepts("h");
    parser.accepts("c").withOptionalArg();
    return parser.parse(args);
  }

  private void printWeatherAtLocation(WeatherChecker weatherChecker, float latitude, float longitude) {
    String latitudeDot1 = GeoCoordinates.toStringFormatOfFloatDot1(latitude);
    String longitudeDot1 = GeoCoordinates.toStringFormatOfFloatDot1(longitude);

    Call<ResponseBody> weatherQuery = weatherChecker.setQueryCoordinates(latitudeDot1, longitudeDot1);

    try {
      System.out.println(weatherQuery.execute().body().string());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private void printUsage() {
    System.out.println();
    System.out.println("Usage: weatherchecker [option] [argument]");
    System.out.println("Example: weatherchecker -c HU");
    System.out.println("(Prints the current weather in Hungary)");
    System.out.println();
  }
}
