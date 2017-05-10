package com.greenfoxacademy.seed0forever.frontend.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ErrorRestResponse implements RestResponseObject {

  private String error;
}
