package com.xksquare.pattern.design.template.sample1;

public class ManagerService extends LoginTemplate {

  @Override
  public UserModel queryUserModel(String userName) {
    System.out.println("query manager user build user model.");
    return new UserModel("2222", "manager", "123456");
  }

}
