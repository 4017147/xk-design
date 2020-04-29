package com.xksquare.pattern.design.singletion;

public class Singleton7 {

  private Singleton7() {

  }

  public static Singleton7 instance() {
    return innerSingletonHandler.instances;
  }

  private static class innerSingletonHandler {
    private static final Singleton7 instances = new Singleton7();
  }

}
