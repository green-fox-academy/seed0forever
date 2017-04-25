package weatherchecker;

import com.opencsv.CSVReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {

  public static List<String[]> readFile(String filePathName) {
    List<String[]> lines = new ArrayList<>();

    try {
      FileReader fileReader = new FileReader(filePathName);
      CSVReader reader = new CSVReader(fileReader, ';');
      lines = reader.readAll();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return lines;
  }
}
