package workshop;

import java.util.ArrayList;

public class SharpieSet {

  ArrayList<Sharpie> sharpies;

  public SharpieSet() {
    sharpies = new ArrayList<>();
  }

  void add(Sharpie toBeAdded) {
    sharpies.add(toBeAdded);
  }

  public int countUsable() {
    int usableSharpies = 0;
    for (Sharpie s : sharpies) {
      if (s.isUsable()) {
        usableSharpies++;
      }
    }
    return usableSharpies;
  }

  void removeTrash() {
    for (int i = 0; i < sharpies.size(); i++) {
      if (!sharpies.get(i).isUsable()) {
        sharpies.remove(i);
        i--;
      }
    }
  }

}
