package weatherchecker.datasource;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface WeatherChecker {

  @Headers({"X-Mashape-Key: JBlG23kdAKmsh03bIdIo7xKT2Brop143NgdjsnFCkLVMEOaZx6",
          "Accept: text/plain"})

  @GET("weather")
  Call<ResponseBody> setQueryCoordinates(
          @Query("lat") String latitude,
          @Query("lng") String longitude);
}
