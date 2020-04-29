package com.xksquare.pattern.design.singletion;

public class Singleton2 {

  private Singleton2 singleton2;

  private Singleton2() {

  }

  public Singleton2 instance() {
    if (singleton2 == null) {
      singleton2 = new Singleton2();
    }
    return singleton2;
  }

}
