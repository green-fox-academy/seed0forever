package annotations;

public enum Size {INCH15(15), INCH17(17), INCH19(19), INCH21(21), INCH23(23), INCH25(25), INCH29(29), INCH34(34);


  private final int size;

  public int getInt() {
    return size;
  }

  Size(int size) {
    this.size = size;
  }
}
