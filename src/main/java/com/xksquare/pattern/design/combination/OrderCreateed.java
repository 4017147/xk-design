package com.xksquare.pattern.design.combination;


public class OrderCreateed implements DomainEvent {

  private String orderId;

  private long amount;

  public OrderCreateed(String orderId, long amount) {
    super();
    this.orderId = orderId;
    this.amount = amount;
  }

  @Override
  public String toString() {
    return "OrderCreateed [orderId=" + orderId + ", amount=" + amount + "]";
  }

}
