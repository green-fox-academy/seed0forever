package weatherchecker;

import com.opencsv.CSVReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class FileHandler {

  public static List<String[]> readFile(String filePathName) throws IOException {
    CSVReader reader = new CSVReader(new FileReader(filePathName), ';');
    return reader.readAll();
  }
}
