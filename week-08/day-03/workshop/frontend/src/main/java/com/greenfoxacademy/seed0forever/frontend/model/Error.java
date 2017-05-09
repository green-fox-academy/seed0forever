package com.greenfoxacademy.seed0forever.frontend.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Error implements RestResponseObject {

  private String error;
}
