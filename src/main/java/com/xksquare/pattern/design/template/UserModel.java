package com.xksquare.pattern.design.template;

import java.util.Objects;

public class UserModel {

  private String userId;

  private String userName;

  private String password;

  public UserModel(String userId, String userName, String password) {
    super();
    this.userId = userId;
    this.userName = userName;
    this.password = password;
  }

  public boolean login(String password) {
    if (Objects.equals(this.password, password)) {
      return true;
    }
    return false;
  }


  public String getUserId() {
    return userId;
  }

  public String getUserName() {
    return userName;
  }

  public String getPassword() {
    return password;
  }


}
