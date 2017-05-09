package com.greenfoxacademy.todosql.repository;

import com.greenfoxacademy.todosql.model.Todo;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface TodoRepository extends CrudRepository<Todo, Long> {

  List<Todo> findByIsDoneFalse();

  List<Todo> findByIsDoneTrue();

}
