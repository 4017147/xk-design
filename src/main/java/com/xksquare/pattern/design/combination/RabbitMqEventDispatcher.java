package com.xksquare.pattern.design.combination;

public class RabbitMqEventDispatcher implements EventDispatcher {

  public RabbitMqEventDispatcher(EventDispatcher eventDispatcher) {
    super();
    eventDispatcher.registEventDispatcher(this);
  }

  @Override
  public void dispatch(DomainEvent domainEvent) {
    // TODO Auto-generated method stub

    // publish event to mq

    System.out.println("publish event to mq:" + domainEvent.toString());

  }

  @Override
  public void registEventDispatcher(EventDispatcher dispatcher) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("当前事件派发者不支持注册!");
  }

  @Override
  public boolean understands(DomainEvent domainEvent) {
    if (domainEvent instanceof OrderCreateed) {
      return true;
    }
    return false;
  }

}
