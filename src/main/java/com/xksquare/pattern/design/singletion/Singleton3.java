package com.xksquare.pattern.design.singletion;

public class Singleton3 {

  private Singleton3 singleton2;

  private Singleton3() {

  }

  public synchronized Singleton3 instance() {
    if (singleton2 == null) {
      singleton2 = new Singleton3();
    }
    return singleton2;
  }

}
