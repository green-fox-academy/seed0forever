package annotations;

@Monitor
class Screen {

  final String aspectRatio;
  final String classification;
  final Size size;

  Screen(Size size) {
    this.size = size;
    this.aspectRatio = getClass().getAnnotation(Monitor.class).aspectRatio();
    this.classification = getClass().getAnnotation(Monitor.class).classification();
  }

  @Override
  public String toString() {
    String stringFormat = "Screen size: %d, aspect ratio: %s, type: %s";
    return String.format(stringFormat, size.getInt(), aspectRatio, classification);
  }
}
