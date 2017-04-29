package datasource;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;

public class JarInternalFileHandler implements FileHandler {

  private String filePath;

  public JarInternalFileHandler(String filePath) {
    this.filePath = filePath;
  }

  // Implementation specific for files inside current application's JAR file
  // TODO: make it gracefully work with external file source.
  @Override
  public List<String> readDataFromFile() {
    InputStream inputFileStream = getClass().getResourceAsStream(filePath);
    BufferedReader fileReader = null;
    try {
      fileReader = new BufferedReader(new InputStreamReader(inputFileStream));
    } catch (NullPointerException e) {
      System.out.printf("Cannot find or read file '%s'", filePath);
      e.printStackTrace();
      System.exit(-1);
    }

    List<String> loadedFileLines = fileReader.lines().collect(Collectors.toList());
    return loadedFileLines;
  }

  @Override
  public void writeDataToFile(List<String> listToWrite) {
    System.out.println("Cannot write inside Jar file.");
  }
}
