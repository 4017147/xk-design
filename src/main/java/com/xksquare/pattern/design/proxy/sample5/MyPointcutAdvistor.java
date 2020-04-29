package com.xksquare.pattern.design.proxy.sample5;

import org.aopalliance.aop.Advice;
import org.springframework.aop.Pointcut;
import org.springframework.aop.PointcutAdvisor;


public class MyPointcutAdvistor implements PointcutAdvisor {

  private Pointcut pointcut = new MyPointCut();

  private Advice advice;

  public MyPointcutAdvistor(Advice advice) {
    this.advice = advice;
  }

  @Override
  public Pointcut getPointcut() {
    return this.pointcut;
  }

  @Override
  public Advice getAdvice() {
    return this.advice;
  }

  @Override
  public boolean isPerInstance() {
    return false;
  }

}
