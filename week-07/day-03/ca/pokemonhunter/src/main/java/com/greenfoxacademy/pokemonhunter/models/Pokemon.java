package com.greenfoxacademy.pokemonhunter.models;

import lombok.Getter;

@Getter
public abstract class Pokemon {

  String name;
  int level;

  public Pokemon() {
    this.name = "Pokemon";
    this.level = getRandomLevel();
  }

  public void setName(String name) {
    this.name = name;
  }

  private int getRandomLevel() {
    return 1 + (int) (Math.random() * 10);
  }

}
