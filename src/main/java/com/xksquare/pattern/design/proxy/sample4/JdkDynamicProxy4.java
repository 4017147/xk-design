package com.xksquare.pattern.design.proxy.sample4;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

import com.xksquare.pattern.design.proxy.sample3.TargetMethod;

public class JdkDynamicProxy4 implements InvocationHandler {

  private Object target;

  private List<TargetMethodInterceptor> interceptors = new ArrayList<TargetMethodInterceptor>();

  public JdkDynamicProxy4(Object target) {
    super();
    this.target = target;
  }

  public void add(TargetMethodInterceptor interceptor) {
    this.interceptors.add(interceptor);
  }


  @SuppressWarnings("unchecked")
  public <T> T proxy() {
    return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(),
        target.getClass().getInterfaces(), this);
  }


  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    TargetMethod targetMethod = new TargetMethod(method, args, this.target);
    TargetMethodInvocation invocation = new TargetMethodInvocationImpl(this.interceptors, targetMethod);
    return invocation.proceed();
  }

}
