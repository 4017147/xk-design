package com.xksquare.pattern.design.subscriber;

import java.util.ArrayList;
import java.util.List;

import com.xksquare.pattern.design.combination.DomainEvent;

public class DomainEventPublisher {

  private static final ThreadLocal<DomainEventPublisher> publisher =
      new ThreadLocal<DomainEventPublisher>() {
        protected DomainEventPublisher initialValue() {
          return new DomainEventPublisher();
        };
      };



  private List<DomainEventSubscriber> subscribers;

  private boolean isPublish;

  public static DomainEventPublisher instance() {
    return publisher.get();
  }


  public DomainEventPublisher() {
    super();
    this.publishing(false);
    this.esurSubscribe();
  }

  public <T extends DomainEvent> void publish(T t) {
    try {
      if (!this.isPublish() && this.hasSubscribers()) {

        this.publishing(true);

        Class<?> eventType = t.getClass();

        this.subscribers.stream().filter(s -> s.subscribedEventType() == eventType
            || s.subscribedEventType() == DomainEvent.class).forEach(s -> s.handEvent(t));

      }
    } finally {

      this.publishing(false);

    }
  }

  public void publishAll(List<? extends DomainEvent> list) {
    list.forEach(s -> this.publish(s));
  }

  public void reset() {
    if (!this.isPublish()) {
      this.flowSubscrbers(null);
    }
  }

  public void subscribe(DomainEventSubscriber subscriber) {
    if (!this.isPublish()) {
      this.esurSubscribe();
      this.subscribers.add(subscriber);
    }
  }

  private boolean hasSubscribers() {
    return this.subscribers != null;
  }

  private void esurSubscribe() {
    if (!hasSubscribers()) {
      this.flowSubscrbers(new ArrayList<>());
    }
  }

  private void flowSubscrbers(List<DomainEventSubscriber> subscribers) {
    this.subscribers = subscribers;
  }

  public void publishing(boolean flag) {
    this.isPublish = flag;
  }

  public boolean isPublish() {
    return this.isPublish;
  }
}
