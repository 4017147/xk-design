package com.xksquare.pattern.design.template;

public abstract class LoginTemplate {


  public abstract UserModel queryUserModel(String userName);


  public void login(String userName, String password) {
    UserModel model = this.queryUserModel(userName);
    if (model == null) {
      throw new IllegalArgumentException("用户不存在!");
    }
    if (!model.login(password)) {
      throw new IllegalArgumentException("密码错误!");
    }
  }

}
