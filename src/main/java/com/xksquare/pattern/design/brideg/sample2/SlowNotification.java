package com.xksquare.pattern.design.brideg.sample2;

public class SlowNotification extends Notification {

  public SlowNotification(MessageSender messageSender) {
    super(messageSender);
  }

  @Override
  public void notify(String message) {
    System.out.println("缓慢通知--->>>");
    this.messageSender.sender(message);
  }


}
