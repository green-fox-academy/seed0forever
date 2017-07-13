package com.greenfox.seed0forever.interviewpractice.trickyquestions.overriding;

public class Overrider extends WhatIsOverridable {

  public Overrider() {
    System.out.println("Running Overrider constructor.");
    doSomething();
  }

  public void doSomething() {
    classLevelGreet();
  }

  static void classLevelGreet() {
    System.out.println("I am replacing the static original!");
  }
}
