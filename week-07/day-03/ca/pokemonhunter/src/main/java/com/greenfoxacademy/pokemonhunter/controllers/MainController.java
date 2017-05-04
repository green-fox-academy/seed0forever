package com.greenfoxacademy.pokemonhunter.controllers;

import com.greenfoxacademy.pokemonhunter.models.Pokemon;
import com.greenfoxacademy.pokemonhunter.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

  @Autowired
  User user;

  @Autowired
  PokemonFactory pokemonFactory;

  @Autowired
  ModelAndViewFactory modelAndViewFactory;

  @RequestMapping("/")
  public ModelAndView index() {
    ModelAndView modelAndView = modelAndViewFactory.getModelAndView();
    modelAndView.setViewName("index");
    user.addPokemon(pokemonFactory.getPikachu());
    modelAndView.addObject("user", user);

    return modelAndView;
  }

  @RequestMapping("/hunt")
  public ModelAndView hunt() {
    ModelAndView modelAndView = modelAndViewFactory.getModelAndView();
    modelAndView.setViewName("hunt");
    Pokemon actualPokemon = getRandomPokemon();
    user.setActualPokemon(actualPokemon);
    modelAndView.addObject("pokemon", actualPokemon);
    return modelAndView;
  }

  @RequestMapping("/catchpokemon")
  public String catchPokemon(){
    ModelAndView modelAndView = modelAndViewFactory.getModelAndView();
    user.addPokemon(user.getActualPokemon());
    return "redirect:/";
  }

  @RequestMapping("/pokemonprofile")
  public ModelAndView pokemonProfile(@RequestParam int id){
    ModelAndView modelAndView = modelAndViewFactory.getModelAndView();
    modelAndView.setViewName("pokemonprofile");
    modelAndView.addObject("pokemon", user.getPokemons().get(id));

    return modelAndView;
  }

  private Pokemon getRandomPokemon() {
    int rnd = (int) (Math.random() * 3);

    switch (rnd) {
      case 0:
        return pokemonFactory.getPikachu();
      case 1:
        return pokemonFactory.getCharmander();
      case 2:
        return pokemonFactory.getBulbasaur();
    }
    return null;
  }
}
