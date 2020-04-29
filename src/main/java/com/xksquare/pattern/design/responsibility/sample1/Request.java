package com.xksquare.pattern.design.responsibility.sample1;

public class Request {

  public String name;

  public Request(String name) {
    super();
    this.name = name;
  }

  @Override
  public String toString() {
    return "Request [name=" + name + "]";
  }


}
