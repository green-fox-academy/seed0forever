package com.greenfoxacademy.todosql.controller;

import com.greenfoxacademy.todosql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/todo")
public class TodoController {

  @Autowired
  TodoRepository todoRepository;

  @RequestMapping(value = {"", "/", "/list"})
  public String list(Model model,
          @RequestParam(required = false) String isActive) {

    if (isActive != null && isActive.equalsIgnoreCase("false")) {
      model.addAttribute("todos", todoRepository.findByIsDoneTrue());
    } else if (isActive != null && isActive.equalsIgnoreCase("true")) {
      model.addAttribute("todos", todoRepository.findByIsDoneFalse());
    } else {
      model.addAttribute("todos", todoRepository.findAll());
    }
    return "todolist";
  }

  @RequestMapping(value = "/add")
  public String add(Model model) {
    return "todo-add";
  }
}
