package com.xksquare.pattern.design.proxy.sample4;

public interface TargetMethodInvocation {

  /**
   * 进入拦截器链中的下一个拦截器，驱动责任链模式向前运行
   */
  Object proceed() throws Throwable;


}
