package com.xksquare.pattern.design.proxy.sample3;

import com.xksquare.pattern.design.proxy.sample1.Animal;
import com.xksquare.pattern.design.proxy.sample1.Cat;

public class Client3 {
  public static void main(String[] args) {
    Animal cat = new Cat();
    MethodHandler handler = new MethodHandler();
    MethodHandler1 handler1 = new MethodHandler1();
    handler.setNextHandler(handler1);
    MethodHandler2 handler2 = new MethodHandler2();
    handler1.setNextHandler(handler2);
    JdkDynamicProxy3 proxy3 = new JdkDynamicProxy3(cat, handler);
    Animal catProxy = proxy3.proxy();
    catProxy.eat();
  }
}
