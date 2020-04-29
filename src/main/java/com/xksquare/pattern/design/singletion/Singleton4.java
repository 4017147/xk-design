package com.xksquare.pattern.design.singletion;

public class Singleton4 {

  private Singleton4 singleton2;

  private Singleton4() {

  }

  public Singleton4 instance() {
    if (singleton2 == null) {
      synchronized (this) {
        singleton2 = new Singleton4();
      }
    }
    return singleton2;
  }

}
