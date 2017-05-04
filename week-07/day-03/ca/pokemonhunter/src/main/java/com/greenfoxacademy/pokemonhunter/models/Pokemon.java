package com.greenfoxacademy.pokemonhunter.models;

import java.time.LocalDate;
import lombok.Getter;

@Getter
public abstract class Pokemon {

  String name;
  int level;
  LocalDate dateCatched;

  public Pokemon() {
    this.name = "Pokemon";
    this.level = getRandomLevel();
    this.dateCatched = LocalDate.now();
  }

  public void setName(String name) {
    this.name = name;
  }

  private int getRandomLevel() {
    return 1 + (int) (Math.random() * 10);
  }

}
