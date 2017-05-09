package com.greenfoxacademy.seed0forever.frontend.model;

import lombok.Getter;

@Getter
public class Doubling implements RestResponseObject {

  private int received;
  private int result;

  public Doubling(int received) {
    this.received = received;
    result = received * 2;
  }
}
