package com.xksquare.pattern.design.proxy.sample3;

import java.lang.reflect.Method;


public class TargetMethod {

  private Method method;

  private Object[] args;

  private Object target;

  public TargetMethod(Method method, Object[] args, Object target) {
    super();
    this.method = method;
    this.args = args;
    this.target = target;
  }

  public Method getMethod() {
    return method;
  }

  public Object[] getArgs() {
    return args;
  }

  public Object getTarget() {
    return target;
  }



}
