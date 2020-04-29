package com.xksquare.pattern.design.builder.sample2;

public class Client {
  public static void main(String[] args) {
    System.out.println(ManagerUser.builder().age(12).name("sss").build());
    System.out.println(ManagerUser2.builder().name().age().build());
  }
}
