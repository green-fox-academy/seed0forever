package annotations;

@Monitor
public class Screen {

  private Size size;

  public Screen(Size size) {
    this.size = size;
  }

  @Override
  public String toString() {
    return String.format("Screen size: %d", size.getInt());
  }
}
