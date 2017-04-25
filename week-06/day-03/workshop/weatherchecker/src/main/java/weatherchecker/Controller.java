package weatherchecker;

import java.io.IOException;
import java.util.Arrays;
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

    Call<ResponseBody> response = service.getLine("47.5", "19.0");
    try {
      System.out.println(response.execute().body().string());
    } catch (IOException e) {
      e.printStackTrace();
    }

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

      for (String[] strings : location) {
        System.out.println(Arrays.toString(strings));
      }
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
