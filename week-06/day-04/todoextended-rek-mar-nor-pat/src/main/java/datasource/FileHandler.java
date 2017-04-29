package datasource;

import java.util.List;

public interface FileHandler {

  List<String> readDataFromFile();

  void writeDataToFile(List<String> listToWrite);
}
