package com.xksquare.pattern.design.singletion;

public class Singleton1 {

  private static final Singleton1 SINGLETON = new Singleton1();

  private Singleton1() {
   
  }

  public Singleton1 instance() {
    return SINGLETON;
  }

}
