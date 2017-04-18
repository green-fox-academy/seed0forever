public class ArgumentContainer {

  private String[] args;

  public ArgumentContainer(String[] args) {
    this.args = args;
  }

  boolean isEmpty() {
    return args.length == 0;
  }

  int getNumOfElements() {
    return args.length;
  }

  String getArg(int index) {
    return (args.length > index) ? args[index] : "";
  }

}
