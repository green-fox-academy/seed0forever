package annotations;

@Monitor
public class Screen {

  final String aspectRatio;
  final String classification;
  Size size;

  public Screen(Size size) {
    this.size = size;
    this.aspectRatio = this.getClass().getAnnotation(Monitor.class).aspectRatio();
    this.classification = this.getClass().getAnnotation(Monitor.class).classification();
  }

  @Override
  public String toString() {
    String stringFormat = "Screen size: %d, aspect ratio: %s, type: %s";
    return String.format(stringFormat, size.getInt(), aspectRatio, classification);
  }
}
