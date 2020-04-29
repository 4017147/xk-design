package com.xksquare.pattern.design.singletion;

public class Singleton10 {

  private volatile Singleton10 singleton2;

  private Singleton10() {
    if (singleton2 != null) {
      throw new IllegalArgumentException("非法实例类!");
    }
  }

  public Singleton10 instance() {
    if (singleton2 == null) {
      synchronized (this) {
        if (singleton2 == null) {
          singleton2 = new Singleton10();
        }
      }
    }
    return singleton2;
  }

  public Object readResolve() {
    return singleton2;
  }


}
