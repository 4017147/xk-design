package com.xksquare.pattern.design.proxy.sample4;

import com.xksquare.pattern.design.proxy.sample1.Animal;
import com.xksquare.pattern.design.proxy.sample1.Cat;

public class Client {
  public static void main(String[] args) {
    Animal cat = new Cat();
    JdkDynamicProxy4 jdkDynamicProxy = new JdkDynamicProxy4(cat);
    jdkDynamicProxy.add(new MethodInterceptor1());
    jdkDynamicProxy.add(new MethodInterceptor2());
    Animal proxyCat = jdkDynamicProxy.proxy();
    proxyCat.eat();
  }
}
