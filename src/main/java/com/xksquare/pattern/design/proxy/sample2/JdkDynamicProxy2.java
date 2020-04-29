package com.xksquare.pattern.design.proxy.sample2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkDynamicProxy2 implements InvocationHandler {

  private Object target;

  private String tag;

  public JdkDynamicProxy2(Object target, String tag) {
    super();
    this.target = target;
    this.tag = tag;
  }

  @SuppressWarnings("unchecked")
  public <T> T proxy() {
    return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(),
        target.getClass().getInterfaces(), this);
  }


  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    if (method.getName().equals("hashCode")) {
      return hashCode();
    }
    System.out.println("方法调用前---->>>>>>>" + this.info(proxy));
    Object object = method.invoke(this.target, args);
    System.out.println("方法调用后---->>>>>>>" + this.info(proxy));
    return object;
  }


  public String info(Object proxy) {
    return proxy.getClass().getName() + ":" + proxy.hashCode() + "----------------" + this.tag;
  }

}
