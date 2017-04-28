import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Retrofit;

public class Main {

  public static void main(String[] args) {
    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://yoda.p.mashape.com/")
            .build();

    YodaService yodaService = retrofit.create(YodaService.class);

    String inputSentence = "The way things are, we will someday get there.";
    Call<ResponseBody> yodaQuery = yodaService.setQuerySentence(inputSentence);

    try {
      System.out.println(yodaQuery.execute().body().string());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
