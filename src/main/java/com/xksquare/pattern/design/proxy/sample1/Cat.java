package com.xksquare.pattern.design.proxy.sample1;

public class Cat implements Animal {

  @Override
  public void go() {
    // TODO Auto-generated method stub
    System.out.println("猫在跑!!!");
  }

  @Override
  public void eat() {
    // TODO Auto-generated method stub
    System.out.println("猫在吃鱼!!!");
  }

}
