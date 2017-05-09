package com.greenfoxacademy.todoembedded.controller;

import com.greenfoxacademy.todoembedded.model.Todo;
import com.greenfoxacademy.todoembedded.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/todo")
public class TodoController {

  @Autowired
  TodoRepository todoRepository;

  @RequestMapping(value = {"", "/list"})
  public String list(Model model) {
    Todo todoTry1 = todoRepository.save(new Todo("Hello Todo World"));


    model.addAttribute("todos", todoRepository.findAll());
    return "todolist";
  }
}
