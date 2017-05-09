package com.greenfoxacademy.todoembedded.repository;

import com.greenfoxacademy.todoembedded.model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface TodoRepository extends CrudRepository<Todo, Long> {

}
