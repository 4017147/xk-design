package com.xksquare.pattern.design.singletion;

public class Singleton6 {

  private volatile Singleton6 singleton2;

  private Singleton6() {

  }

  public Singleton6 instance() {
    if (singleton2 == null) {
      synchronized (this) {
        if (singleton2 == null) {
          singleton2 = new Singleton6();
        }
      }
    }
    return singleton2;
  }

}
