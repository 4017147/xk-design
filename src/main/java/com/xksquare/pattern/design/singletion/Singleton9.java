package com.xksquare.pattern.design.singletion;

public class Singleton9 {
  private volatile Singleton9 singleton2;

  private Singleton9() {
    if (singleton2 != null) {
      throw new IllegalArgumentException("非法实例类!");
    }
  }

  public Singleton9 instance() {
    if (singleton2 == null) {
      synchronized (this) {
        if (singleton2 == null) {
          singleton2 = new Singleton9();
        }
      }
    }
    return singleton2;
  }


}
