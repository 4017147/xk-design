package com.xksquare.pattern.design.subscriber;

import com.xksquare.pattern.design.combination.DomainEvent;

public interface DomainEventSubscriber {

  public <T extends DomainEvent> void handEvent(T t);


  public Class<?> subscribedEventType();

}
