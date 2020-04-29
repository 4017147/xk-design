package com.xksquare.pattern.design.proxy.sample2;

import com.xksquare.pattern.design.proxy.sample1.Animal;
import com.xksquare.pattern.design.proxy.sample1.Cat;

public class Client {

  public static void main(String[] args) {
    Animal cat = new Cat();

    JdkDynamicProxy2 proxy = new JdkDynamicProxy2(cat, "代理类1");
    Animal catProxy = proxy.proxy();


    JdkDynamicProxy2 proxy2 = new JdkDynamicProxy2(catProxy, "代理类2");

    Animal catProxy2 = proxy2.proxy();

    catProxy2.eat();

  }

}
