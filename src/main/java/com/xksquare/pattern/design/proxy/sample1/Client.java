package com.xksquare.pattern.design.proxy.sample1;

public class Client {

  public static void main(String[] args) {
    Animal cat = new Cat();
    JdkDynamicProxy1 proxy = new JdkDynamicProxy1(cat);
    Animal catProxy = proxy.proxy();
    catProxy.eat();
    System.out.println("=========================");
    catProxy.go();
  }
}
