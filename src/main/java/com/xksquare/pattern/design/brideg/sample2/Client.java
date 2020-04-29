package com.xksquare.pattern.design.brideg.sample2;

public class Client {

  public static void main(String[] args) {

    MessageSender messageSender = new RabbitMQSender();
    Notification notification = new NormalNotification(messageSender);
    notification.notify("你好欢哥!");

    System.out.println("==========================");
    notification = new UrgentNotification(messageSender);
    notification.notify("学习设计模式学得咋样了!");

    System.out.println("==========================");
    messageSender = new SmsGatewaySender();
    notification = new UrgentNotification(messageSender);
    notification.notify("我用短信在通知一遍");


  }
}
