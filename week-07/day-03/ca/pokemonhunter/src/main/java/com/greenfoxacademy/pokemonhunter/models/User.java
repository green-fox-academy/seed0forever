package com.greenfoxacademy.pokemonhunter.models;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
@Getter
public class User {

  public void setActualPokemon(Pokemon actualPokemon) {
    this.actualPokemon = actualPokemon;
  }

  String name;
  List<Pokemon> pokemons;
  Pokemon actualPokemon;

  public User() {
    this.name = "Ash Ketchum";
    pokemons = new ArrayList<>();
  }

  public void addPokemon(Pokemon pokemon){
    pokemons.add(pokemon);
  }
}
