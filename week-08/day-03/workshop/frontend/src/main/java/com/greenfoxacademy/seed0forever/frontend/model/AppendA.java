package com.greenfoxacademy.seed0forever.frontend.model;

import lombok.Getter;

public class AppendA implements RestResponseObject {

  private static final String TO_APPEND = "a";
  private String appendable;
  @Getter
  private String appended;

  public AppendA(String appendable) {
    this.appendable = appendable;
    this.appended = appendable.concat(TO_APPEND);
  }
}
