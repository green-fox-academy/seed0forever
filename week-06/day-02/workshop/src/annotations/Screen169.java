package annotations;

@Monitor(aspectRatio = "16:9", classification = "LCD")
class Screen169 extends Screen {

  public Screen169(Size size) {
    super(size);
  }
}
