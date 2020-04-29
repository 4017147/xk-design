package com.xksquare.pattern.design.proxy.sample3;

public class MethodHandler1 extends AbstractHandler {

  @Override
  public Object invoke(TargetMethod targetMethod) throws Exception {
    System.out.println("Handler1 处理开始-------------------------------");

    Object ret = super.proceed(targetMethod);

    System.out.println("Handler1 处理完成-------------------------------");
    return ret;
  }

}
