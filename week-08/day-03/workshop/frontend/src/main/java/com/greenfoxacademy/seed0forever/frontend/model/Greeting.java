package com.greenfoxacademy.seed0forever.frontend.model;

import lombok.Getter;

public class Greeting implements RestResponseObject {

  private static final String formatting = "Oh, hi there %s, my dear %s!";
  private String name;
  private String title;
  @Getter
  private String welcome_message;

  public Greeting(String name, String title) {
    this.name = name;
    this.title = title;
    this.welcome_message = String.format(formatting, name, title);
  }
}
