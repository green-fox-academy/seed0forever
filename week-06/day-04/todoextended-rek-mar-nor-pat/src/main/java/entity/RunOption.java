package entity;

public class RunOption implements Entity {

  private final String command;
  private final String argument;
  private final String description;

  public RunOption(String command, String argument, String description) {
    this.command = command;
    this.argument = argument;
    this.description = description;
  }

  public String getCommand() {
    return command;
  }

  public String getArgument() {
    return argument;
  }

  public String getDescription() {
    return description;
  }

  @Override
  public String toString() {
    return String.format("%s%s%s %s", command,
            (argument.length() == 0) ? "" : " ",
            argument, description);
  }

  @Override
  public String toDataFormat() {
    return String.format("%s;%s;%s", command, argument, description);
  }
}
