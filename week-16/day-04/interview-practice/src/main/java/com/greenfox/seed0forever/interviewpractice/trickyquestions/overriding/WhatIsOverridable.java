package com.greenfox.seed0forever.interviewpractice.trickyquestions.overriding;

public class WhatIsOverridable {

  public WhatIsOverridable() {
    System.out.println("Running WhatIsOverridable constructor.");
    greetMe();
    classLevelGreet();
  }

  private void greetMe() {
    System.out.println("I am the original!");
  }

  static void classLevelGreet() {
    System.out.println("I am a static original!");
  }

  public class NestedClassInside{

    public void greetMe() {
      System.out.println("I am in the nested class!");
    }
  }
}
