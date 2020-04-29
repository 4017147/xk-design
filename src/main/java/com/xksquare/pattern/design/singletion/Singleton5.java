package com.xksquare.pattern.design.singletion;

public class Singleton5 {

  private Singleton5 singleton2;

  private Singleton5() {

  }

  public Singleton5 instance() {
    if (singleton2 == null) {
      synchronized (this) {
        if (singleton2 == null) {
          singleton2 = new Singleton5();
        }
      }
    }
    return singleton2;
  }

}
