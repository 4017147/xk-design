package com.xksquare.pattern.design.brideg.sample2;

public class SmsGatewaySender implements MessageSender {

  @Override
  public void sender(String message) {
    // TODO Auto-generated method stub
    System.out.println("使用短信网关:" + message);
  }


}
