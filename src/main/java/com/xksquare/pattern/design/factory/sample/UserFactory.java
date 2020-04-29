package com.xksquare.pattern.design.factory.sample;

public class UserFactory {

  public User createUser(String type) {
    if ("sys" == type) {
      return new SysUser();
    }
    if ("manager" == type) {
      return new ManagerUser();
    }
    return null;
  }


}
