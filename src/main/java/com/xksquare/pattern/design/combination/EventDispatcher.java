package com.xksquare.pattern.design.combination;

public interface EventDispatcher {

  public void dispatch(DomainEvent domainEvent);

  public void registEventDispatcher(EventDispatcher dispatcher);

  public boolean understands(DomainEvent domainEvent);

}
