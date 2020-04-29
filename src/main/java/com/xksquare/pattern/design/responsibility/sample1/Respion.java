package com.xksquare.pattern.design.responsibility.sample1;

public class Respion {

  private String result;

  public Respion(String result) {
    super();
    this.result = result;
  }

  @Override
  public String toString() {
    return "Respion [result=" + result + "]";
  }

  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }



}
