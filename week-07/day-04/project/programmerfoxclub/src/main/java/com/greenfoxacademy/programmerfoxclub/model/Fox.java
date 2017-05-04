package com.greenfoxacademy.programmerfoxclub.model;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Fox {

  private String name;
  private List<String> tricks;
  private String food;
  private String drink;

  public Fox() {
    this.name = "Foxy";
    this.tricks = new ArrayList<>();
    this.food = "rabbits";
    this.drink = "orange juice";
  }

  public void addTrick(String trick) {
    tricks.add(trick);
  }
}
