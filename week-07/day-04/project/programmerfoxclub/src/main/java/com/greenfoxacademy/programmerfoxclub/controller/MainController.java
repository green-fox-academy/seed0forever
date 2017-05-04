package com.greenfoxacademy.programmerfoxclub.controller;

import com.greenfoxacademy.programmerfoxclub.model.Fox;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

  @Autowired
  Fox fox;

  private List<String> allTricks;

  public MainController() {
    allTricks = new ArrayList<>();
    allTricks.add("write HTML");
    allTricks.add("code in Java");
    allTricks.add("jump");
    allTricks.add("swim");
    allTricks.add("fly");
    allTricks.add("teleport");
    allTricks.add("throw fireballs");
    allTricks.add("become invisible");
  }

  @GetMapping("/")
  public ModelAndView rootResponse(ModelAndView modelAndView) {
    modelAndView.setViewName("index");
    modelAndView.addObject(fox);
    return modelAndView;
  }

  @GetMapping("/trickCenter")
  public ModelAndView viewTrickCenter(ModelAndView modelAndView){
    modelAndView.setViewName("trickCenter");
    modelAndView.addObject("listOfTricks", allTricks);
    return modelAndView;
  }

  @GetMapping("/change-trick")
  public String changeTrick(@RequestParam String addTrick) {
    fox.addTrick(addTrick);
    return "redirect:";
  }
}
