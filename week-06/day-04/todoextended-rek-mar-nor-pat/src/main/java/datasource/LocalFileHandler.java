package datasource;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LocalFileHandler implements FileHandler {

  private String filePath;

  public LocalFileHandler(String filePath) {
    this.filePath = filePath;
  }

  public boolean createIfNotExist() {
    Path filePath = Paths.get(this.filePath);
    try {
      if (!Files.exists(filePath)) {
        Files.createFile(filePath);
        return true;
      }
    } catch (IOException e) {
      System.out.println("file could not be created");
      System.out.println(e.getMessage());
    }
    return false;
  }

  @Override
  public List<String> readDataFromFile() {
    Path filePath = Paths.get(this.filePath);
    try {
      return Files.readAllLines(filePath);
    } catch (IOException e) {
      System.out.println("Cannot read file " + filePath.toString());
      System.out.println(e.getMessage());
    }
    return null;
  }

  @Override
  public void writeDataToFile(List<String> listToWrite) {
    Path filePath = Paths.get(this.filePath);
    try {
      Files.write(filePath, listToWrite);
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }
}