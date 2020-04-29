package com.xksquare.pattern.design.proxy.sample4;

public interface TargetMethodInterceptor {

  Object invoke(TargetMethodInvocation invocation) throws Exception, Throwable;

}
