package com.xksquare.pattern.design.proxy.sample4;

public class MethodInterceptor1 implements TargetMethodInterceptor {

  @Override
  public Object invoke(TargetMethodInvocation invocation) throws Throwable {
    System.out.println("拦截器1 ==========>方法执行前");
    Object res = invocation.proceed();
    System.out.println("拦截器1 ==========>方法执行后");
    return res;
  }

}
