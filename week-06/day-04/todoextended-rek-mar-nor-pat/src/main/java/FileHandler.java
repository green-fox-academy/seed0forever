import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {

  private static String todoFilePlace = "src/main/java/todo.csv";
  private static String infoFilePlace = "src/main/java/basicinfo.csv";

  public static boolean isTodoFileExist() {
    try {
      File f = new File(todoFilePlace);
      if (!f.exists()) {
        System.out.println("This todo file did not exist");
        return false;
      } else {
        System.out.println("This todo file exists already");
      }
    } catch (Exception e) {
      System.out.println("Error during testing if file exists or not...");
      e.printStackTrace();
    }
    return true;
  }

  public static void createTodoFile() {
    try {
      File f = new File(todoFilePlace);
      f.createNewFile();
      System.out.println("This todo file has just been created");
    } catch (Exception e) {
      System.out.println("Error during creating the file");
      e.printStackTrace();
    }
  }

  public static List<String[]> readDataFromFile(String fileToReadPlace){
    List<String[]> dataFromFile = new ArrayList<>();
    try {
      CSVReader reader = new CSVReader(new FileReader(fileToReadPlace), ';');
      dataFromFile = reader.readAll();
    }catch (Exception e) {
      System.out.println("Error during reading the file");
      e.printStackTrace();
    }
    return dataFromFile;
  }

  public static void writeDataToFile(String fileToWritePlace, List<String[]> dataToWrite){
    try {
      CSVWriter writer = new CSVWriter(new FileWriter(fileToWritePlace), ';',
              CSVWriter.NO_QUOTE_CHARACTER);
      writer.writeAll(dataToWrite);
      writer.close();
    }catch (Exception e) {
      System.out.println("Error during writing the file");
      e.printStackTrace();
    }
  }

  public static void showInfoMessage() {
    List<String[]> readFile = FileHandler.readDataFromFile(infoFilePlace);
    for (String[] string : readFile) {
      for (int i = 0; i < string.length; i++) {
        System.out.println(string[i]);
      }
    }
  }

  public static String getTodoFilePlace() {
    return todoFilePlace;
  }

  public static String getInfoFilePlace() {
    return infoFilePlace;
  }
}