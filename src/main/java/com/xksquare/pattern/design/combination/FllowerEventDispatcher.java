package com.xksquare.pattern.design.combination;

import java.util.ArrayList;
import java.util.List;

public class FllowerEventDispatcher implements EventDispatcher {

  private List<EventDispatcher> dispatchers;

  public FllowerEventDispatcher() {
    super();
    this.dispatchers = new ArrayList<EventDispatcher>();
  }

  @Override
  public void dispatch(DomainEvent domainEvent) {
    // TODO Auto-generated method stub
    this.dispatchers.stream().forEach(s -> s.dispatch(domainEvent));
  }

  @Override
  public void registEventDispatcher(EventDispatcher dispatcher) {
    // TODO Auto-generated method stub
    dispatchers.add(dispatcher);
  }

  @Override
  public boolean understands(DomainEvent domainEvent) {
    // TODO Auto-generated method stub
    return false;
  }

}
