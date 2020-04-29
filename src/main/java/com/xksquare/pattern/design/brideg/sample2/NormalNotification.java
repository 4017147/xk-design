package com.xksquare.pattern.design.brideg.sample2;

public class NormalNotification extends Notification {

  public NormalNotification(MessageSender messageSender) {
    super(messageSender);
  }

  @Override
  public void notify(String message) {
    System.out.println("正常通知--->>>");
    this.messageSender.sender(message);
  }


}

