package annotations;

import java.util.ArrayList;
import java.util.List;

public class ScreenApp {

  public static void main(String[] args) {
    List<Screen> ourScreens = new ArrayList<>();
    ourScreens.add(new Screen43(Size.INCH15));
    ourScreens.add(new Screen43(Size.INCH34));
    ourScreens.add(new Screen43(Size.INCH21));
    ourScreens.add(new Screen169(Size.INCH23));
    ourScreens.add(new Screen169(Size.INCH17));
    ourScreens.add(new Screen169(Size.INCH25));
    ourScreens.add(new Screen219(Size.INCH29));
    ourScreens.add(new Screen219(Size.INCH21));
    ourScreens.add(new Screen219(Size.INCH19));

    for (Screen screen : ourScreens) {
      System.out.println(screen);
    }
  }

}
