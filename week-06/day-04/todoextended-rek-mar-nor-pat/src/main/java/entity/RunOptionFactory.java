package entity;

public class RunOptionFactory {

  public static RunOption createRunOption(String[] runOptionStringArray) {
    return new RunOption(
            runOptionStringArray[0],
            runOptionStringArray[1],
            runOptionStringArray[2]);
  }
}
