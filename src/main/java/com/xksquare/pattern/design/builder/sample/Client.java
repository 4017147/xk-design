package com.xksquare.pattern.design.builder.sample;

public class Client {

  public static void main(String[] args) {
    UserBuilder builder = new SysUserBuilder();
    UserDirector director = new UserDirector(builder);
    System.out.println(director.buildUser());
  }


}
