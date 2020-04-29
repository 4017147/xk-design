package com.xksquare.pattern.design.proxy.sample3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkDynamicProxy3 implements InvocationHandler {

  private Object target;

  private MethodHandler methodHandler;

  public JdkDynamicProxy3(Object target, MethodHandler handler) {
    super();
    this.target = target;
    this.methodHandler = handler;
  }

  @SuppressWarnings("unchecked")
  public <T> T proxy() {
    return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(),
        target.getClass().getInterfaces(), this);
  }


  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    TargetMethod targetMethod = new TargetMethod(method, args, this.target);
    return methodHandler.proceed(targetMethod);
  }

}
