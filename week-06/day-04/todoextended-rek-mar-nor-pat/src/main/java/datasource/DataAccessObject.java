package datasource;

import entity.Entity;
import java.util.List;

public interface DataAccessObject<T extends Entity> {

  void saveAll(List<T> entities);

  List<T> loadAll();
}
