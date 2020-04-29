package com.xksquare.pattern.design.proxy.sample4;

import java.util.List;

import com.xksquare.pattern.design.proxy.sample3.TargetMethod;

public class TargetMethodInvocationImpl implements TargetMethodInvocation {

  /**
   * 拦截器链
   */
  private List<TargetMethodInterceptor> interceptors;

  /**
   * 被代理的目标方法
   */
  private TargetMethod targetMethod;

  /**
   * 当前调用的拦截器索引
   */
  private int currentInterceptorIndex = 0;


  public TargetMethodInvocationImpl(List<TargetMethodInterceptor> interceptors,
      TargetMethod targetMethod) {
    super();
    this.interceptors = interceptors;
    this.targetMethod = targetMethod;
  }


  @Override
  public Object proceed() throws Throwable {

    if (this.currentInterceptorIndex == this.interceptors.size()) {
      return targetMethod.getMethod().invoke(targetMethod.getTarget(), targetMethod.getArgs());
    }
    TargetMethodInterceptor interceptor = this.interceptors.get(this.currentInterceptorIndex++);
    
    return interceptor.invoke(this);
  }

}
