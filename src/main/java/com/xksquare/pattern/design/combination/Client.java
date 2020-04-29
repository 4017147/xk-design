package com.xksquare.pattern.design.combination;

public class Client {

  public static void main(String[] args) {

    FllowerEventDispatcher eventDispatcher = new FllowerEventDispatcher();

    new ViewQueryEventDispathcher(eventDispatcher);

    new RabbitMqEventDispatcher(eventDispatcher);

    eventDispatcher.dispatch(new OrderCreateed("123123123123", 99999L));

  }

}
