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
  private List<String> allFood;
  private List<String> allDrink;

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

    allFood = new ArrayList<>();
    allFood.add("pizza");
    allFood.add("roast chicken");
    allFood.add("ham");
    allFood.add("sausage");
    allFood.add("lamb");
    allFood.add("pork");

    allDrink = new ArrayList<>();
    allDrink.add("tea");
    allDrink.add("coffee");
    allDrink.add("orange juice");
    allDrink.add("energy drink");
    allDrink.add("water");
    allDrink.add("sake");
    allDrink.add("wine");
    allDrink.add("beer");
    allDrink.add("milk");
  }

  @GetMapping("/")
  public ModelAndView rootResponse(ModelAndView modelAndView) {
    modelAndView.setViewName("index");
    modelAndView.addObject(fox);
    return modelAndView;
  }

  @GetMapping("/nutritionStore")
  public ModelAndView viewNutritionStore(ModelAndView modelAndView){
    modelAndView.setViewName("nutritionStore");
    modelAndView.addObject("listOfFood", allFood);
    modelAndView.addObject("listOfDrinks", allDrink);
    return modelAndView;
  }

  @GetMapping("/trickCenter")
  public ModelAndView viewTrickCenter(ModelAndView modelAndView){
    modelAndView.setViewName("trickCenter");
    modelAndView.addObject("listOfTricks", allTricks);
    return modelAndView;
  }

  @GetMapping("/change-nutrition")
  public String changeNutrition(@RequestParam String changeFood, String changeDrink) {
    fox.setFood(changeFood);
    fox.setDrink(changeDrink);
    return "redirect:";
  }

  @GetMapping("/change-trick")
  public String changeTrick(@RequestParam String addTrick) {
    fox.addTrick(addTrick);
    return "redirect:";
  }
}
