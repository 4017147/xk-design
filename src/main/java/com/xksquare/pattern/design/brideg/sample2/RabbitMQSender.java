package com.xksquare.pattern.design.brideg.sample2;

public class RabbitMQSender implements MessageSender {

  @Override
  public void sender(String message) {
    // TODO Auto-generated method stub
    System.out.println("使用rabbitmq发送:" + message);
  }


}
