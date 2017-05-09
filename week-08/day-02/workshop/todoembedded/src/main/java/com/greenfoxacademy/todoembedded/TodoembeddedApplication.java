package com.greenfoxacademy.todoembedded;

import com.greenfoxacademy.todoembedded.model.Todo;
import com.greenfoxacademy.todoembedded.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoembeddedApplication implements CommandLineRunner {

  @Autowired
  TodoRepository todoRepository;

  public static void main(String[] args) {
    SpringApplication.run(TodoembeddedApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    todoRepository.save(new Todo("I have to learn Object Relational Mapping"));
    todoRepository.save(new Todo("Start Exercise 2"));
    todoRepository.save(new Todo("Go swimming"));
  }
}
