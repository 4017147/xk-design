package com.xksquare.pattern.design.builder.sample;

public abstract class User {

  public String name;

  public int age;

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "User [name=" + name + ", age=" + age + "]";
  }



}
