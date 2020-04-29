package com.xksquare.pattern.design.proxy.sample3;

public abstract class AbstractHandler {

  private AbstractHandler nextHandler;


  public void setNextHandler(AbstractHandler nextHandler) {
    this.nextHandler = nextHandler;
  }

  public boolean hasNextHandler() {
    return this.nextHandler != null;
  }

  abstract public Object invoke(TargetMethod targetMethod) throws Exception;


  public Object proceed(TargetMethod targetMethod) throws Exception {
    if (!this.hasNextHandler()) {
      return targetMethod.getMethod().invoke(targetMethod.getTarget(), targetMethod.getArgs());
    }
    return this.nextHandler.invoke(targetMethod);
  }



}
