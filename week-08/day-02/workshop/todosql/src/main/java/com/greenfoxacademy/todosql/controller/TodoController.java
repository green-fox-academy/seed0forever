package com.greenfoxacademy.todosql.controller;

import com.greenfoxacademy.todosql.model.Todo;
import com.greenfoxacademy.todosql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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

  @GetMapping(value = "/add")
  public String add(Model model) {
    model.addAttribute("todo", new Todo());
    return "todo-add";
  }

  @PostMapping("/add")
  public String saveAdded(Todo todo) {
    todoRepository.save(todo);
    return "redirect:/todo";
  }

  @GetMapping("/{id}/delete")
  public String deleteTodo(@PathVariable("id") int id) {
    todoRepository.delete(id);
    return "redirect:/todo";
  }

  @GetMapping("/{id}/update")
  public String updateTodo(Model model, @PathVariable("id") int id) {
    model.addAttribute("todo", todoRepository.findOne(id));
    return "todo-update";
  }

  @PostMapping("/update")
  public String saveUpdatedTodo(Todo todo) {
    todoRepository.save(todo);
    return "redirect:/todo";
  }
}
