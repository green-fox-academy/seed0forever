package com.greenfoxacademy.pokemonhunter.controllers;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

@Component
public class ModelAndViewFactory {

  public ModelAndView getModelAndView(){
    return new ModelAndView();
  }

}
