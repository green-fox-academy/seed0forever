package datasource;

import entity.RunOption;
import entity.RunOptionFactory;
import java.util.ArrayList;
import java.util.List;

public class RunOptionDataAccessObject implements DataAccessObject<RunOption> {

  private final FileHandler fileHandler;

  public RunOptionDataAccessObject(String filePath) {
    // Absolute file paths inside JAR files begin at archive's root ("/") directory
    this.fileHandler = new JarInternalFileHandler("/" + filePath);
  }

  @Override
  public void saveAll(List<RunOption> entities) {
    System.out.println("Cannot save run options.");
  }

  @Override
  public List<RunOption> loadAll() {
    List<RunOption> runOptionEntities = new ArrayList<>();
    List<String> loadedRunOptionLines = fileHandler.readDataFromFile();

    for (String runOptionLine : loadedRunOptionLines) {
      String[] runOptionData = runOptionLine.split(";");
      runOptionEntities.add(RunOptionFactory.createRunOption(runOptionData));
    }

    return runOptionEntities;
  }
}
