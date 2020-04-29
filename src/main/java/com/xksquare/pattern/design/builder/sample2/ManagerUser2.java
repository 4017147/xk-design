package com.xksquare.pattern.design.builder.sample2;

import com.xksquare.pattern.design.builder.sample.User;
import com.xksquare.pattern.design.builder.sample.UserBuilder;

public class ManagerUser2 extends User {


  public static ManagerBuilder builder() {
    ManagerUser user = new ManagerUser();
    return new ManagerBuilder(user);
  }

  static class ManagerBuilder implements UserBuilder {

    public ManagerBuilder(ManagerUser user) {
      super();
      this.user = user;
    }

    private ManagerUser user;

    @Override
    public ManagerBuilder name() {
      // TODO Auto-generated method stub
      user.setName("marker.li 2");
      return this;
    }

    @Override
    public ManagerBuilder age() {
      // TODO Auto-generated method stub
      user.setAge(2);
      return this;
    }

    @Override
    public ManagerUser build() {
      // TODO Auto-generated method stub
      return user;
    }
    // ManagerUser2 user;
    //
    // public Builder() {
    // user = new ManagerUser2();
    // }
    //
    //
    // public Builder name(String name) {
    // user.setName(name);
    // return this;
    // }
    //
    // public Builder age(int age) {
    // user.setAge(age);
    // return this;
    // }
    //
    //
    // public ManagerUser2 build() {
    // return this.user;
    // }

  }


}
