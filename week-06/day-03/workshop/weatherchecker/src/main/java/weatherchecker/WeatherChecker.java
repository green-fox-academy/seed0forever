package weatherchecker;

import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface WeatherChecker {

  @Headers({"X-Mashape-Key: JBlG23kdAKmsh03bIdIo7xKT2Brop143NgdjsnFCkLVMEOaZx6",
          "Accept: application/json"})

  @GET("weather/forecast/MXCE0008/c.json")
  // Call<List<WeatherChecker>> listRepos(@Path("filepath") String user);
  Call<ResponseBody> getLine(@Query("lang") String text);

}
