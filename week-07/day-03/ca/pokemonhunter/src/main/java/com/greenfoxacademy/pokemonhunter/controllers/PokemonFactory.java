package com.greenfoxacademy.pokemonhunter.controllers;

import com.greenfoxacademy.pokemonhunter.models.Bulbasaur;
import com.greenfoxacademy.pokemonhunter.models.Charmander;
import com.greenfoxacademy.pokemonhunter.models.Pikachu;
import org.springframework.stereotype.Component;

@Component
public class PokemonFactory {

  public Pikachu getPikachu() {
    return new Pikachu();
  }

  public Bulbasaur getBulbasaur() {
    return new Bulbasaur();
  }

  public Charmander getCharmander() {
    return new Charmander();
  }

}
