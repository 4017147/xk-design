package com.xksquare.pattern.design.proxy.sample0;

public class Client {
  public static void main(String[] args) {
    Service service = new Service();
    CglibDynamicProxy proxy = new CglibDynamicProxy(service);
    Service service2 = proxy.proxy();
    service2.doKKK();
  }
}
