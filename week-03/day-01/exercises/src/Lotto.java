import com.sun.corba.se.impl.encoding.OSFCodeSetRegistry.Entry;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public class Lotto {

  public static void main(String[] args) {
    // Create a method that find the 5 most common lotto numbers assets/lotto.csv

    List<String> lines = readFileLines();

    int[] lottoNumbersStats = getLottoStats(lines);
    System.out.println(Arrays.toString(lottoNumbersStats) + "\n");
/*
    Arrays.sort(lottoNumbersStats);
    System.out.println(Arrays.toString(lottoNumbersStats));
*/
    HashMap<Integer, ArrayList<Integer>> lottoHashNumsFrequencies = new HashMap<>();
    for (int i = 0; i < lottoNumbersStats.length; i++) {
      if (lottoHashNumsFrequencies.containsKey(lottoNumbersStats[i])) {
        lottoHashNumsFrequencies.get(lottoNumbersStats[i]).add(i + 1);
      } else {
        ArrayList<Integer> eachLottoNumbers = new ArrayList<>();
        eachLottoNumbers.add(i + 1);
        lottoHashNumsFrequencies.put(lottoNumbersStats[i], eachLottoNumbers);
      }
    }

    for (Integer mapKey : lottoHashNumsFrequencies.keySet()) {
      System.out.println(mapKey + " times: " + lottoHashNumsFrequencies.get(mapKey));
    }

    System.out.println();

    TreeMap<Integer, ArrayList<Integer>> sortedlottoHashNumsFrequencies = new TreeMap<>(
            lottoHashNumsFrequencies);
//    error:
//    Set<Entry<Integer, ArrayList<Integer>>> sortedSet = sortedlottoHashNumsFrequencies.entrySet();

    for (Integer mapKey : lottoHashNumsFrequencies.keySet()) {
      System.out.println(mapKey + " times: " + lottoHashNumsFrequencies.get(mapKey));
    }



  }

  public static int[] getLottoStats(List<String> lines) {
    int[] lottoNumbersStats = new int[90];
//    Arrays.fill(lottoNumbersStats, 0, 89, 0);

//    System.out.println(Arrays.toString(lottoNumbersStats));
//    System.out.println(lottoNumbersStats.length);

    for (String line : lines) {
      List<String> singleLineAfterSplit = new ArrayList<>();
      singleLineAfterSplit.addAll(Arrays.asList(line.split(";")));
      for (int i = 11; i <= 15; i++) {
        lottoNumbersStats[Integer.parseInt(singleLineAfterSplit.get(i)) - 1]++;
      }
    }
    return lottoNumbersStats;
  }

  public static List<String> readFileLines() {
    Path filePath;
    List<String> lines = new ArrayList<>();

    try {
      filePath = Paths.get("assets/otos.csv");
      lines = Files.readAllLines(filePath);
    } catch (Exception e) {
      System.out.println("Uh-oh, an error happend: " + e.getClass());
    }
    return lines;
  }
}