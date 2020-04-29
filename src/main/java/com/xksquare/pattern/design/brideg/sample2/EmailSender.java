package com.xksquare.pattern.design.brideg.sample2;

public class EmailSender implements MessageSender {

  @Override
  public void sender(String message) {
    // TODO Auto-generated method stub
    System.out.println("使用邮箱发送:" + message);
  }

}
