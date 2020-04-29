package com.xksquare.pattern.design.brideg.sample2;

public abstract class Notification {

  protected MessageSender messageSender;

  public Notification(MessageSender messageSender) {
    super();
    this.messageSender = messageSender;
  }

  public abstract void notify(String message);

}
