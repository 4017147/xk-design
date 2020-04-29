package com.xksquare.pattern.design.brideg.sample2;

public class UrgentNotification extends Notification {

  public UrgentNotification(MessageSender messageSender) {
    super(messageSender);
  }

  @Override
  public void notify(String message) {
    System.out.println("加急通知--->>>");
    this.messageSender.sender(message);
  }


}
