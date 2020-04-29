package com.xksquare.pattern.design.subscriber;

import com.xksquare.pattern.design.combination.DomainEvent;
import com.xksquare.pattern.design.combination.OrderCreateed;

public class Client {

  public static void main(String[] args) {

    DomainEventPublisher.instance().reset();

    DomainEventPublisher.instance().subscribe(new DomainEventSubscriber() {

      @Override
      public Class<?> subscribedEventType() {
        // TODO Auto-generated method stub
        return DomainEvent.class;
      }

      @Override
      public <T extends DomainEvent> void handEvent(T t) {
        System.out.println("domain:" + t.toString());
      }
    });

    DomainEventPublisher.instance().publish(new OrderCreateed("22222211111", 123456L));

  }

}
