package com.xksquare.pattern.design.proxy.sample1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkDynamicProxy1 implements InvocationHandler {

  private Object target;


  public JdkDynamicProxy1(Object target) {
    super();
    this.target = target;
  }

  @SuppressWarnings("unchecked")
  public <T> T proxy() {
    return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(),
        target.getClass().getInterfaces(), this);
  }


  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    System.out.println("方法调用前---->>>>>>>");
    Object object = method.invoke(this.target, args);
    System.out.println("方法调用后---->>>>>>>");
    return object;
  }

}
