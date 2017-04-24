package annotations;

@Monitor(aspectRatio = "16:9", classification = "LCD")
public class Screen169 extends Screen {

  public Screen169(Size size) {
    super(size);
  }
}
