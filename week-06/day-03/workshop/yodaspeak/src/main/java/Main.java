import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Retrofit;

public class Main {

  public static void main(String[] args) {
    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://yoda.p.mashape.com/")
            .build();

    YodaService yodaSpeaker = retrofit.create(YodaService.class);
    Call<ResponseBody> response = yodaSpeaker.getLine(
            "I'm really happy for you, and I'm going to let you finish, but this is the best Node package of all time.");
    try {
      System.out.println(response.execute().body().string());
    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}
