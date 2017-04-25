package weatherchecker;

import java.io.IOException;
import joptsimple.OptionParser;
import joptsimple.OptionSet;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Retrofit;

public class Controller {

  public void handleArgs(String[] args) {
    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://simple-weather.p.mashape.com/")
            .build();
    WeatherChecker service = retrofit.create(WeatherChecker.class);

    OptionParser parser = new OptionParser();
    parser.accepts("h");
    parser.accepts("c").withOptionalArg();
    OptionSet options = parser.parse(args);

    if (args.length == 0) {
      printUsage();
    } else if (options.has("h")) {
      printUsage();
    } else if (options.has("c") && options.hasArgument("c")) {
      GeolocationHandler location = new GeolocationHandler();
      for (String[] line : location) {
        if (line[0].equalsIgnoreCase(options.valueOf("c").toString())) {
          String latitude = getFormattedCoord(line[1]);
          String longitude = getFormattedCoord(line[2]);

          printWeatherAtLocation(service, latitude, longitude);
        }
      }
    }
  }

  private void printWeatherAtLocation(WeatherChecker service, String latitude, String longitude) {
    Call<ResponseBody> response = service.getLine(latitude, longitude);
    try {
      System.out.println(response.execute().body().string());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private String getFormattedCoord(String coordAsString) {
    return String.format("%.1f",
            (float) (Math.round(Float.parseFloat(coordAsString) * 10)) / 10);
  }

  private void printUsage() {
    System.out.println();
    System.out.println("Usage: weatherchecker [option] [argument]");
    System.out.println("Example: weatherchecker -c HU");
    System.out.println("(Prints the current weather in Hungary)");
    System.out.println();
  }
}
