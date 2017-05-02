package com.greenfoxacademy.springstart.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public final class SayHelloEntity {

  private final String helloText;
  private final String fontColor;
  private final String fontSize;

}