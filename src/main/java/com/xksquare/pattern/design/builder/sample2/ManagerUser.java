package com.xksquare.pattern.design.builder.sample2;

import com.xksquare.pattern.design.builder.sample.User;

public class ManagerUser extends User {


  public static Builder builder() {
    return new Builder();
  }

  static class Builder {
    ManagerUser user;

    public Builder() {
      user = new ManagerUser();
    }


    public Builder name(String name) {
      user.setName(name);
      return this;
    }

    public Builder age(int age) {
      user.setAge(age);
      return this;
    }


    public ManagerUser build() {
      return this.user;
    }

  }


}
