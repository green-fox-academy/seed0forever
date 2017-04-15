package workshop;

public class Sharpie {

  String color;
  float width;
  float inkAmount;

  public Sharpie(String color, float width) {
    this(color, width, 100f);
  }

  public Sharpie(String color, float width, float inkAmount) {
    this.color = color;
    this.width = width;
    this.inkAmount = inkAmount;
  }

  public void use() {
    this.inkAmount--;
  }

  public boolean isUsable() {
    return inkAmount > 0;
  }

}
