package com.xksquare.pattern.design.template;


public class SysService extends LoginTemplate {

  @Override
  public UserModel queryUserModel(String userName) {
    // TODO Auto-generated method stub
    System.out.println("query sys user build user model.");
    return new UserModel("111", "sys", "123456");
  }

}
